// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.util.concurrent.Executor;

public final class cku extends ckt
{

    private cla c;

    public cku(ckh ckh1, Executor executor)
    {
        this(ckh1, executor, null);
    }

    private cku(ckh ckh1, Executor executor, cla cla1)
    {
        super(ckh1, executor, (byte)0);
        c = null;
    }

    public final ckq a(MediaFormat mediaformat)
    {
        if (!c.a(mediaformat))
        {
            mediaformat = String.valueOf(mediaformat);
            throw b.a((new StringBuilder(String.valueOf(mediaformat).length() + 47)).append("invalid media format for audio decoder factory ").append(mediaformat).toString());
        }
        if (c == null)
        {
            c = clc.a(a.B_());
        }
        return cks.a(c.a(mediaformat), b);
    }
}
