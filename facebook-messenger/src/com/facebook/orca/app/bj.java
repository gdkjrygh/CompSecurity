// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.contacts.data.k;
import com.facebook.inject.d;
import com.facebook.orca.e.b;
import com.facebook.push.mqtt.v;

// Referenced classes of package com.facebook.orca.app:
//            i

class bj extends d
{

    private bj()
    {
    }

    bj(i i)
    {
        this();
    }

    public b a()
    {
        return new b((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (k)a(com/facebook/contacts/data/k), (v)a(com/facebook/push/mqtt/v));
    }

    public Object b()
    {
        return a();
    }
}
