// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;


// Referenced classes of package kik.android.chat.activity:
//            KikIqActivityBase

final class ai
    implements Runnable
{

    final KikIqActivityBase a;

    ai(KikIqActivityBase kikiqactivitybase)
    {
        a = kikiqactivitybase;
        super();
    }

    public final void run()
    {
        KikIqActivityBase.a(a, a.h, a.i);
    }
}
