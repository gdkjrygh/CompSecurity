// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.util.concurrent.Executor;

public final class ckw extends ckt
{

    private final chq c;
    private cla d;

    public ckw(chq chq1, ckh ckh1, Executor executor)
    {
        this(chq1, ckh1, executor, null);
    }

    private ckw(chq chq1, ckh ckh1, Executor executor, cla cla1)
    {
        super(ckh1, executor, (byte)0);
        c = (chq)b.a(chq1, "renderContext", null);
        d = null;
    }

    public final ckq a(MediaFormat mediaformat)
    {
        if (!c.b(mediaformat))
        {
            mediaformat = String.valueOf(mediaformat);
            throw b.a((new StringBuilder(String.valueOf(mediaformat).length() + 47)).append("invalid media format for video decoder factory ").append(mediaformat).toString());
        }
        if (d == null)
        {
            cla cla1;
            if (a.j())
            {
                cla1 = clc.a();
            } else
            {
                cla1 = clc.c();
            }
            d = cla1;
        }
        return clk.a(d.a(mediaformat), c.d(), mediaformat, b);
    }
}
