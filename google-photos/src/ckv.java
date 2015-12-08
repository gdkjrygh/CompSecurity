// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.util.concurrent.Executor;

public final class ckv extends ckt
{

    private final chq c;
    private cla d;

    public ckv(chq chq1, ckh ckh1, Executor executor)
    {
        super(ckh1, executor, (byte)0);
        c = (chq)b.a(chq1, "renderContext", null);
    }

    public final ckq a(MediaFormat mediaformat)
    {
        if (!c.b(mediaformat))
        {
            mediaformat = String.valueOf(mediaformat);
            throw b.a((new StringBuilder(String.valueOf(mediaformat).length() + 53)).append("invalid media format for clip editor decoder factory ").append(mediaformat).toString());
        }
        if (d == null)
        {
            if (!a.h())
            {
                d = clc.b();
            } else
            if (a.j())
            {
                d = clc.a();
            } else
            {
                d = clc.c();
            }
        }
        return clk.a(d.a(mediaformat), c.d(), mediaformat, b);
    }
}
