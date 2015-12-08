// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MediaCodecBridge
{
    private static class CodecInfo
    {

        private final String mCodecName;
        private final String mCodecType;
        private final int mDirection;

        private String codecName()
        {
            return mCodecName;
        }

        private String codecType()
        {
            return mCodecType;
        }

        private int direction()
        {
            return mDirection;
        }

        private CodecInfo(String s, String s1, int i)
        {
            mCodecType = s;
            mCodecName = s1;
            mDirection = i;
        }

    }

    private static class DequeueInputResult
    {

        private final int mIndex;
        private final int mStatus;

        private int index()
        {
            return mIndex;
        }

        private int status()
        {
            return mStatus;
        }

        private DequeueInputResult(int i, int j)
        {
            mStatus = i;
            mIndex = j;
        }

    }

    private static class DequeueOutputResult
    {

        private final int mFlags;
        private final int mIndex;
        private final int mNumBytes;
        private final int mOffset;
        private final long mPresentationTimeMicroseconds;
        private final int mStatus;

        private int flags()
        {
            return mFlags;
        }

        private int index()
        {
            return mIndex;
        }

        private int numBytes()
        {
            return mNumBytes;
        }

        private int offset()
        {
            return mOffset;
        }

        private long presentationTimeMicroseconds()
        {
            return mPresentationTimeMicroseconds;
        }

        private int status()
        {
            return mStatus;
        }

        private DequeueOutputResult(int i, int j, int k, int l, long l1, int i1)
        {
            mStatus = i;
            mIndex = j;
            mFlags = k;
            mOffset = l;
            mPresentationTimeMicroseconds = l1;
            mNumBytes = i1;
        }

        DequeueOutputResult(int i, int j, int k, int l, long l1, int i1, 
                _cls1 _pcls1)
        {
            this(i, j, k, l, l1, i1);
        }
    }


    static final boolean $assertionsDisabled;
    private static final int MAX_ADAPTIVE_PLAYBACK_HEIGHT = 1080;
    private static final int MAX_ADAPTIVE_PLAYBACK_WIDTH = 1920;
    private static final long MAX_PRESENTATION_TIMESTAMP_SHIFT_US = 0x186a0L;
    private static final int MEDIA_CODEC_DECODER = 0;
    private static final int MEDIA_CODEC_DEQUEUE_INPUT_AGAIN_LATER = 1;
    private static final int MEDIA_CODEC_DEQUEUE_OUTPUT_AGAIN_LATER = 2;
    private static final int MEDIA_CODEC_ENCODER = 1;
    private static final int MEDIA_CODEC_ERROR = 9;
    private static final int MEDIA_CODEC_INPUT_END_OF_STREAM = 5;
    private static final int MEDIA_CODEC_NO_KEY = 7;
    private static final int MEDIA_CODEC_OK = 0;
    private static final int MEDIA_CODEC_OUTPUT_BUFFERS_CHANGED = 3;
    private static final int MEDIA_CODEC_OUTPUT_END_OF_STREAM = 6;
    private static final int MEDIA_CODEC_OUTPUT_FORMAT_CHANGED = 4;
    private static final int MEDIA_CODEC_STOPPED = 8;
    private static final String TAG = "MediaCodecBridge";
    private boolean mAdaptivePlaybackSupported;
    private AudioTrack mAudioTrack;
    private boolean mFlushed;
    private ByteBuffer mInputBuffers[];
    private long mLastPresentationTimeUs;
    private MediaCodec mMediaCodec;
    private String mMime;
    private ByteBuffer mOutputBuffers[];

    private MediaCodecBridge(MediaCodec mediacodec, String s, boolean flag)
    {
        if (!$assertionsDisabled && mediacodec == null)
        {
            throw new AssertionError();
        } else
        {
            mMediaCodec = mediacodec;
            mMime = s;
            mLastPresentationTimeUs = 0L;
            mFlushed = true;
            mAdaptivePlaybackSupported = flag;
            return;
        }
    }

    private static boolean codecSupportsAdaptivePlayback(MediaCodec mediacodec, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19 && mediacodec != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!(mediacodec = mediacodec.getCodecInfo()).isEncoder() && (mediacodec = mediacodec.getCapabilitiesForType(s)) != null)
        {
            boolean flag;
            try
            {
                flag = mediacodec.isFeatureSupported("adaptive-playback");
            }
            // Misplaced declaration of an exception variable
            catch (MediaCodec mediacodec)
            {
                Log.e("MediaCodecBridge", "Cannot retrieve codec information", mediacodec);
                return false;
            }
            if (flag)
            {
                return true;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private boolean configureAudio(MediaFormat mediaformat, MediaCrypto mediacrypto, int i, boolean flag)
    {
        int j;
        try
        {
            mMediaCodec.configure(mediaformat, null, mediacrypto, i);
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            Log.e("MediaCodecBridge", "Cannot configure the audio codec", mediaformat);
            return false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        i = mediaformat.getInteger("sample-rate");
        j = getAudioFormat(mediaformat.getInteger("channel-count"));
        mAudioTrack = new AudioTrack(3, i, j, 2, AudioTrack.getMinBufferSize(i, j, 2), 1);
        if (mAudioTrack.getState() != 0)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        mAudioTrack = null;
        return false;
        return true;
    }

    private boolean configureVideo(MediaFormat mediaformat, Surface surface, MediaCrypto mediacrypto, int i)
    {
        try
        {
            if (mAdaptivePlaybackSupported)
            {
                mediaformat.setInteger("max-width", 1920);
                mediaformat.setInteger("max-height", 1080);
            }
            mMediaCodec.configure(mediaformat, surface, mediacrypto, i);
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            Log.e("MediaCodecBridge", "Cannot configure the video codec", mediaformat);
            return false;
        }
        return true;
    }

    private static MediaCodecBridge create(String s, boolean flag, int i)
    {
        if (!flag || android.os.Build.VERSION.SDK_INT >= 18) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        MediaCodec mediacodec;
        MediaCodec mediacodec1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        mediacodec1 = null;
        flag4 = false;
        flag3 = false;
        flag2 = false;
        flag1 = flag3;
        mediacodec = mediacodec1;
        if (!s.startsWith("video") || !flag || i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag3;
        mediacodec = mediacodec1;
        String s1 = getDecoderNameForMime(s);
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = flag3;
        mediacodec = mediacodec1;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        flag1 = flag3;
        mediacodec = mediacodec1;
        MediaCodec mediacodec2 = MediaCodec.createByCodecName(s1);
        flag1 = flag3;
        mediacodec = mediacodec1;
        flag2 = codecSupportsAdaptivePlayback(mediacodec2, s);
        flag1 = flag2;
        mediacodec = mediacodec1;
        mediacodec2.release();
        flag1 = flag2;
        mediacodec = mediacodec1;
        mediacodec1 = MediaCodec.createByCodecName((new StringBuilder()).append(s1).append(".secure").toString());
        mediacodec = mediacodec1;
        flag1 = flag2;
_L4:
        if (mediacodec != null)
        {
            return new MediaCodecBridge(mediacodec, s, flag1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        flag1 = flag3;
        mediacodec = mediacodec1;
        mediacodec1 = MediaCodec.createEncoderByType(s);
        flag1 = flag4;
        mediacodec = mediacodec1;
          goto _L4
        flag1 = flag3;
        mediacodec = mediacodec1;
        mediacodec1 = MediaCodec.createDecoderByType(s);
        flag1 = flag3;
        mediacodec = mediacodec1;
        flag2 = codecSupportsAdaptivePlayback(mediacodec1, s);
        flag1 = flag2;
        mediacodec = mediacodec1;
          goto _L4
        Exception exception;
        exception;
        Log.e("MediaCodecBridge", (new StringBuilder()).append("Failed to create MediaCodec: ").append(s).append(", isSecure: ").append(flag).append(", direction: ").append(i).toString(), exception);
          goto _L4
    }

    private static MediaFormat createAudioFormat(String s, int i, int j)
    {
        return MediaFormat.createAudioFormat(s, i, j);
    }

    private static MediaFormat createVideoDecoderFormat(String s, int i, int j)
    {
        return MediaFormat.createVideoFormat(s, i, j);
    }

    private static MediaFormat createVideoEncoderFormat(String s, int i, int j, int k, int l, int i1, int j1)
    {
        s = MediaFormat.createVideoFormat(s, i, j);
        s.setInteger("bitrate", k);
        s.setInteger("frame-rate", l);
        s.setInteger("i-frame-interval", i1);
        s.setInteger("color-format", j1);
        return s;
    }

    private DequeueInputResult dequeueInputBuffer(long l)
    {
        byte byte0;
        byte byte1;
        byte1 = 9;
        byte0 = -1;
        int j = mMediaCodec.dequeueInputBuffer(l);
        if (j < 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return new DequeueInputResult(i, j);
_L2:
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Log.e("MediaCodecBridge", "dequeueInputBuffer: MediaCodec.INFO_TRY_AGAIN_LATER");
        i = 1;
        j = byte0;
        continue; /* Loop/switch isn't completed */
        Log.e("MediaCodecBridge", (new StringBuilder()).append("Unexpected index_or_status: ").append(j).toString());
        j = byte0;
        i = byte1;
        try
        {
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
        }
        catch (Exception exception)
        {
            Log.e("MediaCodecBridge", "Failed to dequeue input buffer", exception);
            j = byte0;
            i = byte1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private DequeueOutputResult dequeueOutputBuffer(long l)
    {
        android.media.MediaCodec.BufferInfo bufferinfo;
        byte byte0;
        byte byte1;
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        byte1 = 9;
        byte0 = -1;
        int j;
        j = mMediaCodec.dequeueOutputBuffer(bufferinfo, l);
        if (bufferinfo.presentationTimeUs < mLastPresentationTimeUs)
        {
            bufferinfo.presentationTimeUs = mLastPresentationTimeUs;
        }
        mLastPresentationTimeUs = bufferinfo.presentationTimeUs;
        if (j < 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return new DequeueOutputResult(i, j, bufferinfo.flags, bufferinfo.offset, bufferinfo.presentationTimeUs, bufferinfo.size);
_L2:
        if (j == -3)
        {
            i = 3;
            j = byte0;
            continue; /* Loop/switch isn't completed */
        }
        if (j == -2)
        {
            i = 4;
            j = byte0;
            continue; /* Loop/switch isn't completed */
        }
        if (j == -1)
        {
            i = 2;
            j = byte0;
            continue; /* Loop/switch isn't completed */
        }
        Log.e("MediaCodecBridge", (new StringBuilder()).append("Unexpected index_or_status: ").append(j).toString());
        i = byte1;
        j = byte0;
        try
        {
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("MediaCodecBridge", "Failed to dequeue output buffer", illegalstateexception);
            i = byte1;
            j = byte0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int flush()
    {
        try
        {
            mFlushed = true;
            if (mAudioTrack != null)
            {
                mAudioTrack.pause();
                mAudioTrack.flush();
            }
            mMediaCodec.flush();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("MediaCodecBridge", "Failed to flush MediaCodec", illegalstateexception);
            return 9;
        }
        return 0;
    }

    private int getAudioFormat(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 1;

        case 1: // '\001'
            return 4;

        case 2: // '\002'
            return 12;

        case 4: // '\004'
            return 204;

        case 6: // '\006'
            return 252;

        case 8: // '\b'
            return 1020;
        }
    }

    private static CodecInfo[] getCodecsInfo()
    {
        HashMap hashmap1 = new HashMap();
        HashMap hashmap2 = new HashMap();
        int l = MediaCodecList.getCodecCount();
        for (int i = 0; i < l; i++)
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            String s;
            String as[];
            int j;
            int k;
            if (mediacodecinfo.isEncoder())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            s = mediacodecinfo.getName();
            as = mediacodecinfo.getSupportedTypes();
            k = 0;
            while (k < as.length) 
            {
                HashMap hashmap;
                if (mediacodecinfo.isEncoder())
                {
                    hashmap = hashmap1;
                } else
                {
                    hashmap = hashmap2;
                }
                if (!hashmap.containsKey(as[k]))
                {
                    hashmap.put(as[k], new CodecInfo(as[k], s, j));
                }
                k++;
            }
        }

        ArrayList arraylist = new ArrayList(hashmap2.size() + hashmap1.size());
        arraylist.addAll(hashmap1.values());
        arraylist.addAll(hashmap2.values());
        return (CodecInfo[])arraylist.toArray(new CodecInfo[arraylist.size()]);
    }

    private static String getDecoderNameForMime(String s)
    {
        int k = MediaCodecList.getCodecCount();
        int i = 0;
        while (i < k) 
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            if (!mediacodecinfo.isEncoder())
            {
                String as[] = mediacodecinfo.getSupportedTypes();
                int j = 0;
                while (j < as.length) 
                {
                    if (as[j].equalsIgnoreCase(s))
                    {
                        return mediacodecinfo.getName();
                    }
                    j++;
                }
            }
            i++;
        }
        return null;
    }

    private static String getDefaultCodecName(String s, int i)
    {
        String s1;
        String s2;
        s2 = "";
        s1 = s2;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (i != 1) goto _L2; else goto _L1
_L1:
        s1 = s2;
        MediaCodec mediacodec = MediaCodec.createEncoderByType(s);
_L4:
        s1 = s2;
        s2 = mediacodec.getName();
        s1 = s2;
        mediacodec.release();
        return s2;
_L2:
        s1 = s2;
        mediacodec = MediaCodec.createDecoderByType(s);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        Log.w("MediaCodecBridge", (new StringBuilder()).append("getDefaultCodecName: Failed to create MediaCodec: ").append(s).append(", direction: ").append(i).toString(), exception);
        return s1;
    }

    private ByteBuffer getInputBuffer(int i)
    {
        return mInputBuffers[i];
    }

    private int getInputBuffersCount()
    {
        return mInputBuffers.length;
    }

    private ByteBuffer getOutputBuffer(int i)
    {
        return mOutputBuffers[i];
    }

    private boolean getOutputBuffers()
    {
        try
        {
            mOutputBuffers = mMediaCodec.getOutputBuffers();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("MediaCodecBridge", "Cannot get output buffers", illegalstateexception);
            return false;
        }
        return true;
    }

    private int getOutputBuffersCapacity()
    {
        if (mOutputBuffers != null)
        {
            return mOutputBuffers[0].capacity();
        } else
        {
            return -1;
        }
    }

    private int getOutputBuffersCount()
    {
        if (mOutputBuffers != null)
        {
            return mOutputBuffers.length;
        } else
        {
            return -1;
        }
    }

    private int getOutputHeight()
    {
        return mMediaCodec.getOutputFormat().getInteger("height");
    }

    private int getOutputWidth()
    {
        return mMediaCodec.getOutputFormat().getInteger("width");
    }

    private boolean isAdaptivePlaybackSupported(int i, int j)
    {
        while (!mAdaptivePlaybackSupported || i > 1920 || j > 1080) 
        {
            return false;
        }
        return true;
    }

    private long playOutputBuffer(byte abyte0[])
    {
        if (mAudioTrack == null)
        {
            return 0L;
        }
        if (3 != mAudioTrack.getPlayState())
        {
            mAudioTrack.play();
        }
        int i = mAudioTrack.write(abyte0, 0, abyte0.length);
        if (abyte0.length != i)
        {
            Log.i("MediaCodecBridge", (new StringBuilder()).append("Failed to send all data to audio output, expected size: ").append(abyte0.length).append(", actual size: ").append(i).toString());
        }
        return (long)mAudioTrack.getPlaybackHeadPosition();
    }

    private int queueInputBuffer(int i, int j, int k, long l, int i1)
    {
        resetLastPresentationTimeIfNeeded(l);
        try
        {
            mMediaCodec.queueInputBuffer(i, j, k, l, i1);
        }
        catch (Exception exception)
        {
            Log.e("MediaCodecBridge", "Failed to queue input buffer", exception);
            return 9;
        }
        return 0;
    }

    private int queueSecureInputBuffer(int i, int j, byte abyte0[], byte abyte1[], int ai[], int ai1[], int k, 
            long l)
    {
        resetLastPresentationTimeIfNeeded(l);
        try
        {
            android.media.MediaCodec.CryptoInfo cryptoinfo = new android.media.MediaCodec.CryptoInfo();
            cryptoinfo.set(k, ai, ai1, abyte1, abyte0, 1);
            mMediaCodec.queueSecureInputBuffer(i, j, cryptoinfo, l, 0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("MediaCodecBridge", "Failed to queue secure input buffer", abyte0);
            if (abyte0.getErrorCode() == 1)
            {
                Log.e("MediaCodecBridge", "MediaCodec.CryptoException.ERROR_NO_KEY");
                return 7;
            } else
            {
                Log.e("MediaCodecBridge", (new StringBuilder()).append("MediaCodec.CryptoException with error code ").append(abyte0.getErrorCode()).toString());
                return 9;
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("MediaCodecBridge", "Failed to queue secure input buffer", abyte0);
            return 9;
        }
        return 0;
    }

    private void release()
    {
        try
        {
            mMediaCodec.release();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("MediaCodecBridge", "Cannot release media codec", illegalstateexception);
        }
        mMediaCodec = null;
        if (mAudioTrack != null)
        {
            mAudioTrack.release();
        }
    }

    private void releaseOutputBuffer(int i, boolean flag)
    {
        try
        {
            mMediaCodec.releaseOutputBuffer(i, flag);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("MediaCodecBridge", "Failed to release output buffer", illegalstateexception);
        }
    }

    private void requestKeyFrameSoon()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        mMediaCodec.setParameters(bundle);
    }

    private void resetLastPresentationTimeIfNeeded(long l)
    {
        if (mFlushed)
        {
            mLastPresentationTimeUs = Math.max(l - 0x186a0L, 0L);
            mFlushed = false;
        }
    }

    private static void setCodecSpecificData(MediaFormat mediaformat, int i, byte abyte0[])
    {
        String s = null;
        if (i != 0) goto _L2; else goto _L1
_L1:
        s = "csd-0";
_L4:
        if (s != null)
        {
            mediaformat.setByteBuffer(s, ByteBuffer.wrap(abyte0));
        }
        return;
_L2:
        if (i == 1)
        {
            s = "csd-1";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void setFrameHasADTSHeader(MediaFormat mediaformat)
    {
        mediaformat.setInteger("is-adts", 1);
    }

    private void setVideoBitrate(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("video-bitrate", i);
        mMediaCodec.setParameters(bundle);
    }

    private void setVolume(double d)
    {
        if (mAudioTrack != null)
        {
            mAudioTrack.setStereoVolume((float)d, (float)d);
        }
    }

    private boolean start()
    {
        try
        {
            mMediaCodec.start();
            mInputBuffers = mMediaCodec.getInputBuffers();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("MediaCodecBridge", "Cannot start the media codec", illegalstateexception);
            return false;
        }
        return true;
    }

    private void stop()
    {
        mMediaCodec.stop();
        if (mAudioTrack != null)
        {
            mAudioTrack.pause();
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/media/MediaCodecBridge.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
