// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;

public final class akp
{

    public ahv a;
    public ajl b;
    public final boolean c;

    public akp(boolean flag)
    {
        a = null;
        c = flag;
        if (c)
        {
            b = ajl.a();
        }
    }

    public static int[] a(int ai[], ako ako1)
    {
        return (new int[] {
            (int)Math.ceil(ako1.c().length() * (float)ai[0]), (int)Math.ceil(ako1.d().length() * (float)ai[1])
        });
    }
}
