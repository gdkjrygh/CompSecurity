// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sms;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.sms:
//            d, a, b

class c extends d
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super();
    }

    c(a a1, b b1)
    {
        this(a1);
    }

    public com.facebook.sms.d a()
    {
        return new com.facebook.sms.d((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
