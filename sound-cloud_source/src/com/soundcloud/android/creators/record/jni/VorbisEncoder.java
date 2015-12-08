// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;

import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.PlaybackFilter;
import com.soundcloud.android.creators.record.WavHeader;
import com.soundcloud.android.utils.BufferUtils;
import com.soundcloud.android.utils.IOUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record.jni:
//            EncoderException, DecoderException, VorbisDecoder, EncoderOptions, 
//            VorbisInfo, ProgressListener

public class VorbisEncoder
{

    public static final int STATE_CLOSED = 2;
    public static final int STATE_PAUSED = 1;
    public static final int STATE_READY = 0;
    public static final String TAG = "VorbisEncoder";
    public final long channels;
    private int encoder_state;
    public final File file;
    public final float quality;
    public final long rate;

    public VorbisEncoder(File file1, String s, long l, long l1, float f)
        throws EncoderException
    {
        int i = init(file1.getAbsolutePath(), s, l, l1, f);
        if (i != 0)
        {
            throw new EncoderException("Error initialising encoder", i);
        } else
        {
            file = file1;
            channels = l;
            rate = l1;
            quality = f;
            return;
        }
    }

    private static native int chop(String s, String s1, double d, double d1);

    private native int closeStream();

    public static int encodeFile(File file1, File file2, EncoderOptions encoderoptions)
        throws IOException
    {
        String s = IOUtils.extension(file1);
        if ("wav".equals(s))
        {
            return encodeWav(file1, file2, encoderoptions);
        }
        if ("ogg".equals(s))
        {
            return encodeVorbis(file1, file2, encoderoptions);
        }
        int i;
        WavHeader.fromFile(file1);
        i = encodeWav(file1, file2, encoderoptions);
        return i;
        IOException ioexception;
        ioexception;
        Object obj = null;
        VorbisDecoder vorbisdecoder = new VorbisDecoder(file1);
        i = encodeVorbis(file1, file2, encoderoptions);
        vorbisdecoder.release();
        return i;
        file2;
        file2 = obj;
_L4:
        if (file2 != null)
        {
            file2.release();
        }
        throw new IOException((new StringBuilder("File format of ")).append(file1).append(" is not supported").toString());
        file1;
        vorbisdecoder = null;
_L2:
        if (vorbisdecoder != null)
        {
            vorbisdecoder.release();
        }
        throw file1;
        file1;
        if (true) goto _L2; else goto _L1
_L1:
        file2;
        file2 = vorbisdecoder;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int encodeVorbis(File file1, File file2, EncoderOptions encoderoptions)
        throws IOException
    {
        VorbisInfo vorbisinfo;
        PlaybackFilter playbackfilter;
        ProgressListener progresslistener;
        ByteBuffer bytebuffer;
        int j;
        file1 = new VorbisDecoder(file1);
        vorbisinfo = file1.getInfo();
        playbackfilter = encoderoptions.filter;
        progresslistener = encoderoptions.listener;
        file2 = new VorbisEncoder(file2, "w", vorbisinfo.channels, vorbisinfo.sampleRate, encoderoptions.quality);
        if (encoderoptions.start != 0L)
        {
            int i = file1.timeSeek((double)encoderoptions.start / 1000D);
            if (i != 0)
            {
                throw new EncoderException("Could not seek", i);
            }
        }
        bytebuffer = BufferUtils.allocateAudioBuffer(16384);
        j = 0;
_L2:
        int k = file1.decode(bytebuffer, bytebuffer.capacity());
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if (encoderoptions.end != -1L && file1.timeTell() >= (double)encoderoptions.end / 1000D)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if (playbackfilter == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        playbackfilter.apply(bytebuffer, j, k);
        file2.write(bytebuffer, k);
        k = j + k;
        j = k;
        if (progresslistener == null) goto _L2; else goto _L1
_L1:
        progresslistener.onProgress((long)file1.timeTell(), (long)vorbisinfo.duration);
        j = k;
          goto _L2
        encoderoptions;
        file2.release();
        file1.release();
        throw encoderoptions;
        file2.closeStream();
        file2.release();
        file1.release();
        if (k < 0)
        {
            throw new EncoderException("Error encoding", k);
        } else
        {
            return 0;
        }
    }

    public static int encodeWav(File file1, File file2, EncoderOptions encoderoptions)
        throws IOException
    {
        return encodeWav(((InputStream) (new BufferedInputStream(new FileInputStream(file1)))), file2, encoderoptions);
    }

    public static int encodeWav(InputStream inputstream, File file1, EncoderOptions encoderoptions)
        throws IOException
    {
        Object obj;
        obj = new WavHeader(inputstream);
        file1 = new VorbisEncoder(file1, "w", ((WavHeader) (obj)).getNumChannels(), ((WavHeader) (obj)).getSampleRate(), encoderoptions.quality);
        obj = ((WavHeader) (obj)).getAudioData(encoderoptions.start, encoderoptions.end);
        file1.encodeStream(((com.soundcloud.android.creators.record.WavHeader.AudioData) (obj)).stream, ((com.soundcloud.android.creators.record.WavHeader.AudioData) (obj)).length, encoderoptions);
        file1.closeStream();
        file1.release();
        IOUtils.close(inputstream);
        return 0;
        encoderoptions;
        file1.release();
        throw encoderoptions;
        file1;
        IOUtils.close(inputstream);
        throw file1;
    }

    public static void extract(File file1, File file2, double d, double d1)
        throws EncoderException
    {
        int i = chop(file1.getAbsolutePath(), file2.getAbsolutePath(), d, d1);
        if (i != 0)
        {
            throw new EncoderException("Eror extracting ogg", i);
        } else
        {
            return;
        }
    }

    private native int init(String s, String s1, long l, long l1, float f);

    private static native int validate(String s);

    public static boolean validate(File file1)
    {
        return validate(file1.getAbsolutePath()) == 0;
    }

    public void encodeStream(InputStream inputstream)
        throws IOException
    {
        encodeStream(inputstream, -1L, EncoderOptions.DEFAULT);
    }

    public void encodeStream(InputStream inputstream, long l, EncoderOptions encoderoptions)
        throws IOException
    {
        (new StringBuilder("encodeStream(length=")).append(l).append(", ").append(encoderoptions).append(")");
        PlaybackFilter playbackfilter = encoderoptions.filter;
        encoderoptions = encoderoptions.listener;
        ByteBuffer bytebuffer = BufferUtils.allocateAudioBuffer(AudioConfig.DEFAULT.bytesPerSecond * 2);
        byte abyte0[] = new byte[bytebuffer.capacity()];
        long l1 = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                break;
            }
            bytebuffer.rewind();
            bytebuffer.put(abyte0, 0, i);
            bytebuffer.flip();
            if (playbackfilter != null)
            {
                playbackfilter.apply(bytebuffer, l1, l);
            }
            int j = write(bytebuffer, i);
            if (j < 0)
            {
                throw new EncoderException("addSamples returned error", j);
            }
            long l2 = l1 + (long)i;
            l1 = l2;
            if (encoderoptions != null)
            {
                encoderoptions.onProgress(l2, l);
                l1 = l2;
            }
        } while (true);
    }

    protected void finalize()
        throws Throwable
    {
        super.finalize();
        if (getState() >= 0)
        {
            release();
        }
    }

    public native int getState();

    public native int pause();

    public native void release();

    public boolean startNewStream(double d)
        throws IOException
    {
        (new StringBuilder("startNewStream(")).append(d).append(")");
        if (getState() == 1)
        {
            closeStream();
            if (d != -1D)
            {
                File file1 = IOUtils.appendToFilename(file, "_temp");
                extract(file, file1, 0.0D, d);
                if (!file1.renameTo(file))
                {
                    throw new EncoderException("could not rename file", -1);
                } else
                {
                    return true;
                }
            } else
            {
                return false;
            }
        } else
        {
            throw new IllegalStateException("cannot move head when not paused");
        }
    }

    public native int write(ByteBuffer bytebuffer, long l);

    static 
    {
        System.loadLibrary("soundcloud_vorbis_encoder");
_L1:
        return;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        if ("Dalvik".equals(System.getProperty("java.vm.name")))
        {
            throw unsatisfiedlinkerror;
        }
          goto _L1
    }
}
