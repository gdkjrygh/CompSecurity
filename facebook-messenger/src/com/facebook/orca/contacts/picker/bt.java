// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.res.Resources;
import com.facebook.analytics.av;
import com.facebook.base.broadcast.LocalBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.c.s;
import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.orca.contacts.annotations.IsGroupsMegaphoneEnabled;
import com.facebook.orca.contacts.divebar.aa;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bj

class bt extends d
{

    private bt()
    {
    }

    bt(bj bj)
    {
        this();
    }

    public aa a()
    {
        return new aa((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), b(java/lang/Boolean, com/facebook/orca/contacts/annotations/IsGroupsMegaphoneEnabled), (av)a(com/facebook/analytics/av), (j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/LocalBroadcast), (s)a(com/facebook/c/s), (Resources)a(android/content/res/Resources), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
