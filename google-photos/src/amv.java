// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public class amv
{

    public final aqm a;
    public final aqh b;

    public amv(aqm aqm1, aqh aqh1)
    {
        a = aqm1;
        b = aqh1;
    }

    public Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        return a.b(i, j, config);
    }

    public void a(Bitmap bitmap)
    {
        a.a(bitmap);
    }

    public void a(byte abyte0[])
    {
        if (b == null)
        {
            return;
        } else
        {
            b.a(abyte0, [B);
            return;
        }
    }

    public void a(int ai[])
    {
        if (b == null)
        {
            return;
        } else
        {
            b.a(ai, [I);
            return;
        }
    }

    public byte[] a(int i)
    {
        if (b == null)
        {
            return new byte[i];
        } else
        {
            return (byte[])b.a(i, [B);
        }
    }

    public int[] b(int i)
    {
        if (b == null)
        {
            return new int[i];
        } else
        {
            return (int[])b.a(i, [I);
        }
    }
}
