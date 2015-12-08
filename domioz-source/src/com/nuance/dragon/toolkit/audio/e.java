// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;

import com.nuance.dragon.toolkit.d.a;
import java.util.Arrays;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.audio:
//            f

public final class e
    implements a
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public final int l;
    public final f m;
    public final byte n[];

    public e(f f1, int i1)
    {
        this(f1, i1, (byte)0);
    }

    private e(f f1, int i1, byte byte0)
    {
        l = i1;
        m = f1;
        n = null;
    }

    public final int a(int i1)
    {
        if (m == com.nuance.dragon.toolkit.audio.f.a)
        {
            return (int)(((long)i1 * 1000L) / (long)l);
        } else
        {
            com.nuance.dragon.toolkit.d.e.d(this, (new StringBuilder("Unable to detect duration for encoding ")).append(m.name()).toString());
            return 0;
        }
    }

    public final JSONObject c()
    {
        com.nuance.dragon.toolkit.d.a.a a1 = new com.nuance.dragon.toolkit.d.a.a();
        a1.a("freq", Integer.valueOf(l));
        a1.a("enc", m.name());
        return a1;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (e)obj;
            if (m != ((e) (obj)).m)
            {
                return false;
            }
            if (l != ((e) (obj)).l)
            {
                return false;
            }
            if (!Arrays.equals(n, ((e) (obj)).n))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1;
        if (m == null)
        {
            i1 = 0;
        } else
        {
            i1 = m.hashCode();
        }
        return ((i1 + 31) * 31 + l) * 31 + Arrays.hashCode(n);
    }

    public final String toString()
    {
        return (new StringBuilder("AudioType [frequency=")).append(l).append(", encoding=").append(m).append(", sse=").append(Arrays.toString(n)).append("]").toString();
    }

    static 
    {
        a = new e(com.nuance.dragon.toolkit.audio.f.a, 48000);
        b = new e(com.nuance.dragon.toolkit.audio.f.a, 44100);
        c = new e(com.nuance.dragon.toolkit.audio.f.a, 22050);
        d = new e(com.nuance.dragon.toolkit.audio.f.a, 16000);
        e = new e(com.nuance.dragon.toolkit.audio.f.a, 11025);
        f = new e(com.nuance.dragon.toolkit.audio.f.a, 8000);
        g = new e(f.b, 16000);
        h = new e(f.b, 8000);
        i = new e(f.c, 16000);
        j = new e(f.c, 8000);
        k = new e(f.d, 0);
    }
}
