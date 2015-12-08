// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.UUID;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            a

public class AudioUtils
{

    private static final UUID a = UUID.fromString("58b4b260-8e06-11e0-aa8e-0002a5d5c51b");
    private static Constructor b;

    private AudioUtils()
    {
    }

    public static int a()
    {
        return Integer.bitCount(16);
    }

    public static int a(int i)
    {
        if (i == 3)
        {
            return 8000;
        }
        if (i == 9)
        {
            return 16000;
        } else
        {
            throw new RuntimeException((new StringBuilder(37)).append("Unsupported AMR encoding: ").append(i).toString());
        }
    }

    public static int a(int i, int j, int k)
    {
        return ((j * 2) / 1000) * i * k;
    }

    private static InputStream a(InputStream inputstream)
    {
        com/google/android/apps/gsa/speech/audio/AudioUtils;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = Class.forName("android.media.AmrInputStream").getConstructor(new Class[] {
                java/io/InputStream
            });
        }
        inputstream = (InputStream)b.newInstance(new Object[] {
            inputstream
        });
        com/google/android/apps/gsa/speech/audio/AudioUtils;
        JVM INSTR monitorexit ;
        return inputstream;
        inputstream;
        com/google/android/apps/gsa/speech/audio/AudioUtils;
        JVM INSTR monitorexit ;
        try
        {
            throw inputstream;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new RuntimeException("Exception while instantiating AmrInputStream", inputstream);
        }
    }

    public static InputStream a(InputStream inputstream, int i)
    {
        if (i == 0)
        {
            return inputstream;
        }
        if (i == 3)
        {
            return a(inputstream);
        }
        if (i == 9)
        {
            return new a(inputstream, "audio/amr-wb");
        } else
        {
            throw new RuntimeException((new StringBuilder(32)).append("unsupported encoding:").append(i).toString());
        }
    }

    public static int b(int i)
    {
        if (i == 3)
        {
            return 1;
        }
        if (i == 9)
        {
            return 20;
        } else
        {
            throw new RuntimeException((new StringBuilder(37)).append("Unsupported AMR encoding: ").append(i).toString());
        }
    }

}
