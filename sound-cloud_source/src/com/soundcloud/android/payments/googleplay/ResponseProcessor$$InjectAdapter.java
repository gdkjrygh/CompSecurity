// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments.googleplay:
//            ResponseProcessor

public final class Q extends b
    implements Provider
{

    public final ResponseProcessor get()
    {
        return new ResponseProcessor();
    }

    public final volatile Object get()
    {
        return get();
    }

    public Q()
    {
        super("com.soundcloud.android.payments.googleplay.ResponseProcessor", "members/com.soundcloud.android.payments.googleplay.ResponseProcessor", false, com/soundcloud/android/payments/googleplay/ResponseProcessor);
    }
}
