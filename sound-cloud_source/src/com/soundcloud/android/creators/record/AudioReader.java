// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.creators.record.reader.EmptyReader;
import com.soundcloud.android.creators.record.reader.VorbisReader;
import com.soundcloud.android.creators.record.reader.WavReader;
import com.soundcloud.android.utils.IOUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AudioConfig

public abstract class AudioReader
    implements Closeable
{

    public static final AudioReader EMPTY = new EmptyReader();
    public static final int EOF = -1;

    public AudioReader()
    {
    }

    public static AudioReader guess(File file)
        throws IOException
    {
        if (file == null || !file.exists())
        {
            return EMPTY;
        }
        String s = IOUtils.extension(file);
        if (s == null)
        {
            return EMPTY;
        }
        if (s.equals("wav"))
        {
            return new WavReader(file);
        }
        if (s.equals("ogg"))
        {
            return new VorbisReader(file);
        } else
        {
            return EMPTY;
        }
    }

    public static transient AudioReader guessMultiple(File afile[])
        throws IOException
    {
        if (afile != null) goto _L2; else goto _L1
_L1:
        AudioReader audioreader = EMPTY;
_L4:
        return audioreader;
_L2:
        int j = afile.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                AudioReader audioreader1 = guess(afile[i]);
                audioreader = audioreader1;
                if (!(audioreader1 instanceof EmptyReader))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return EMPTY;
    }

    public abstract AudioConfig getConfig();

    public abstract long getDuration();

    public abstract File getFile();

    public abstract long getPosition();

    public abstract int read(ByteBuffer bytebuffer, int i)
        throws IOException;

    public abstract void reopen()
        throws IOException;

    public abstract void seek(long l)
        throws IOException;

}
