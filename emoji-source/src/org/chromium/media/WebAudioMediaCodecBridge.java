// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

class WebAudioMediaCodecBridge
{

    static final String LOG_TAG = "WebAudioMediaCodec";
    static final long TIMEOUT_MICROSECONDS = 500L;

    WebAudioMediaCodecBridge()
    {
    }

    private static String createTempFile(Context context)
        throws IOException
    {
        return File.createTempFile("webaudio", ".dat", context.getCacheDir()).getAbsolutePath();
    }

    private static boolean decodeAudioFile(Context context, long l, int i, long l1)
    {
        if (l1 < 0L || l1 > 0x7fffffffL)
        {
            return false;
        }
        MediaExtractor mediaextractor = new MediaExtractor();
        ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.adoptFd(i);
        try
        {
            mediaextractor.setDataSource(parcelfiledescriptor.getFileDescriptor(), 0L, l1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            parcelfiledescriptor.detachFd();
            return false;
        }
        if (mediaextractor.getTrackCount() <= 0)
        {
            parcelfiledescriptor.detachFd();
            return false;
        }
        context = mediaextractor.getTrackFormat(0);
        int j1 = context.getInteger("channel-count");
        int k = j1;
        int j = context.getInteger("sample-rate");
        String s = context.getString("mime");
        long l2 = 0L;
        l1 = l2;
        Object obj;
        ByteBuffer abytebuffer[];
        boolean flag;
        boolean flag1;
        if (context.containsKey("durationUs"))
        {
            try
            {
                l1 = context.getLong("durationUs");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.d("WebAudioMediaCodec", "Cannot get duration");
                l1 = l2;
            }
        }
        l2 = l1;
        if (l1 > 0x7fffffffL)
        {
            l2 = 0L;
        }
        Log.d("WebAudioMediaCodec", (new StringBuilder()).append("Initial: Tracks: ").append(mediaextractor.getTrackCount()).append(" Format: ").append(context).toString());
        try
        {
            obj = MediaCodec.createDecoderByType(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("WebAudioMediaCodec", (new StringBuilder()).append("Failed to create MediaCodec for mime type: ").append(s).toString());
            parcelfiledescriptor.detachFd();
            return false;
        }
        ((MediaCodec) (obj)).configure(context, null, null, 0);
        ((MediaCodec) (obj)).start();
        abytebuffer = ((MediaCodec) (obj)).getInputBuffers();
        context = ((MediaCodec) (obj)).getOutputBuffers();
        mediaextractor.selectTrack(0);
        i = 0;
        flag = false;
        flag1 = false;
        do
        {
            if (flag)
            {
                break;
            }
            int i1 = i;
            int k1;
            if (i == 0)
            {
                k1 = ((MediaCodec) (obj)).dequeueInputBuffer(500L);
                i1 = i;
                if (k1 >= 0)
                {
                    i1 = mediaextractor.readSampleData(abytebuffer[k1], 0);
                    l1 = 0L;
                    android.media.MediaCodec.BufferInfo bufferinfo;
                    ByteBuffer bytebuffer;
                    byte byte0;
                    if (i1 < 0)
                    {
                        i = 1;
                        i1 = 0;
                    } else
                    {
                        l1 = mediaextractor.getSampleTime();
                    }
                    if (i != 0)
                    {
                        byte0 = 4;
                    } else
                    {
                        byte0 = 0;
                    }
                    ((MediaCodec) (obj)).queueInputBuffer(k1, 0, i1, l1, byte0);
                    i1 = i;
                    if (i == 0)
                    {
                        mediaextractor.advance();
                        i1 = i;
                    }
                }
            }
            bufferinfo = new android.media.MediaCodec.BufferInfo();
            k1 = ((MediaCodec) (obj)).dequeueOutputBuffer(bufferinfo, 500L);
            if (k1 >= 0)
            {
                bytebuffer = context[k1];
                byte0 = flag1;
                if (!flag1)
                {
                    Log.d("WebAudioMediaCodec", (new StringBuilder()).append("Final:  Rate: ").append(j).append(" Channels: ").append(j1).append(" Mime: ").append(s).append(" Duration: ").append(l2).append(" microsec").toString());
                    nativeInitializeDestination(l, j1, j, l2);
                    byte0 = 1;
                }
                if (byte0 != 0 && bufferinfo.size > 0)
                {
                    nativeOnChunkDecoded(l, bytebuffer, bufferinfo.size, j1, k);
                }
                bytebuffer.clear();
                ((MediaCodec) (obj)).releaseOutputBuffer(k1, false);
                flag1 = byte0;
                i = i1;
                if ((bufferinfo.flags & 4) != 0)
                {
                    flag = true;
                    flag1 = byte0;
                    i = i1;
                }
            } else
            if (k1 == -3)
            {
                context = ((MediaCodec) (obj)).getOutputBuffers();
                i = i1;
            } else
            {
                i = i1;
                if (k1 == -2)
                {
                    MediaFormat mediaformat = ((MediaCodec) (obj)).getOutputFormat();
                    k = mediaformat.getInteger("channel-count");
                    j = mediaformat.getInteger("sample-rate");
                    Log.d("WebAudioMediaCodec", (new StringBuilder()).append("output format changed to ").append(mediaformat).toString());
                    i = i1;
                }
            }
        } while (true);
        parcelfiledescriptor.detachFd();
        ((MediaCodec) (obj)).stop();
        ((MediaCodec) (obj)).release();
        return true;
    }

    private static native void nativeInitializeDestination(long l, int i, int j, long l1);

    private static native void nativeOnChunkDecoded(long l, ByteBuffer bytebuffer, int i, int j, int k);
}
