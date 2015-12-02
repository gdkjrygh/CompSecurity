// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.support.v4.a.e;
import com.facebook.http.protocol.aq;
import com.facebook.inject.d;
import com.facebook.orca.phonenumber.identification.a;
import com.facebook.orca.phonenumber.identification.f;
import com.facebook.orca.protocol.methods.ag;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bz extends d
{

    final h a;

    private bz(h h)
    {
        a = h;
        super();
    }

    bz(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        return new a((e)a(android/support/v4/a/e), b(com/facebook/http/protocol/aq), (ag)a(com/facebook/orca/protocol/methods/ag), (f)a(com/facebook/orca/phonenumber/identification/f));
    }

    public Object b()
    {
        return a();
    }
}
