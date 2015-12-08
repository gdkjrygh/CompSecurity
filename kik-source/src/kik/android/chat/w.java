// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import kik.android.util.ce;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class w extends Thread
{

    final KikApplication a;

    w(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void run()
    {
        KikApplication.y(a).f();
    }
}
