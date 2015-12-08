// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;


// Referenced classes of package ar.com.hjg.pngj:
//            p, m, n, v, 
//            j

public final class o
{

    static int a(int i)
    {
        if (i == 4)
        {
            return 240;
        }
        return i != 2 ? 128 : 192;
    }

    public static int a(j j, int i)
    {
        if (j instanceof p)
        {
            i *= ((p)j).a.d;
            j = ((p)j).a();
            return j[i + 3] << 24 | j[i] << 16 | j[i + 1] << 8 | j[i + 2];
        }
        if (j instanceof n)
        {
            i *= ((n)j).a.d;
            j = ((n)j).b;
            return (j[i + 3] & 0xff) << 24 | (j[i] & 0xff) << 16 | (j[i + 1] & 0xff) << 8 | j[i + 2] & 0xff;
        } else
        {
            throw new v((new StringBuilder("Not supported ")).append(j.getClass()).toString());
        }
    }
}
