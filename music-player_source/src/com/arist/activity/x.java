// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;


// Referenced classes of package com.arist.activity:
//            MyApplication, MainActivity

final class x
    implements Runnable
{

    final MainActivity a;

    x(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void run()
    {
        MyApplication.d.h();
    }
}
