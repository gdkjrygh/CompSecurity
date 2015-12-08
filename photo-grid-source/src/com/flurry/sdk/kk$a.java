// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.TimerTask;

// Referenced classes of package com.flurry.sdk:
//            kk, kc, kl

class <init> extends TimerTask
{

    final kk a;

    public void run()
    {
        kc.a(3, kk.c(), "HttpRequest timed out. Cancelling.");
        kk.a(a).k();
    }

    private (kk kk1)
    {
        a = kk1;
        super();
    }

    <init>(kk kk1, <init> <init>1)
    {
        this(kk1);
    }
}
