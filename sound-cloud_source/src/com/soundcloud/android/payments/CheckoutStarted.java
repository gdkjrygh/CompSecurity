// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b.f;

class CheckoutStarted
{

    public static final f TOKEN = new _cls1();
    public final String token;

    public CheckoutStarted(String s)
    {
        token = s;
    }


    private class _cls1
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((CheckoutStarted)obj);
        }

        public final String call(CheckoutStarted checkoutstarted)
        {
            return checkoutstarted.token;
        }

        _cls1()
        {
        }
    }

}
