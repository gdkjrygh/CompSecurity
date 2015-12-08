// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.TimerTask;

final class ais extends TimerTask
{

    private aif a;

    ais(aif aif1)
    {
        a = aif1;
        super();
    }

    public final void run()
    {
        a.p();
    }
}
