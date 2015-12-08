// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class jse
    implements Callable
{

    private jsc a;

    jse(jsc jsc1)
    {
        a = jsc1;
        super();
    }

    public final Object call()
    {
        return a.e();
    }
}
