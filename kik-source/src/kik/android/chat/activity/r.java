// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;


// Referenced classes of package kik.android.chat.activity:
//            q, KikApiLandingActivity

final class r
    implements Runnable
{

    final q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public final void run()
    {
        a.b.a();
    }
}
