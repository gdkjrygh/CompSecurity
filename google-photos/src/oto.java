// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;

final class oto extends org.chromium.net.UrlRequest.StatusListener
{

    private ConditionVariable a;
    private otn b;

    oto(otn otn1, ConditionVariable conditionvariable)
    {
        b = otn1;
        a = conditionvariable;
        super();
    }

    public final void a(int i)
    {
        otn.a(b, i);
        a.open();
    }
}
