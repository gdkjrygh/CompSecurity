// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.util.concurrent.Executor;

public abstract class ckt
{

    public final ckh a;
    public final Executor b;

    private ckt(ckh ckh1, Executor executor)
    {
        a = (ckh)b.a(ckh1, "decodingSettings", null);
        b = (Executor)b.a(executor, "backgroundExecutuor", null);
    }

    ckt(ckh ckh1, Executor executor, byte byte0)
    {
        this(ckh1, executor);
    }

    public abstract ckq a(MediaFormat mediaformat);
}
