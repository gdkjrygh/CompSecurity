// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.internal.ApplicationStatus;

final class jwm
    implements Runnable
{

    private jwh a;
    private ApplicationStatus b;

    jwm(jwj jwj, jwh jwh1, ApplicationStatus applicationstatus)
    {
        a = jwh1;
        b = applicationstatus;
        super();
    }

    public final void run()
    {
        jwh.a(a, b);
    }
}
