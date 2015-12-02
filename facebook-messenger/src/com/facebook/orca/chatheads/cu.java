// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.analytics.av;
import com.facebook.inject.d;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;
import com.facebook.orca.chatheads.annotations.IsChatHeadsPermitted;

// Referenced classes of package com.facebook.orca.chatheads:
//            by, cn, co

class cu extends d
{

    final cn a;

    private cu(cn cn)
    {
        a = cn;
        super();
    }

    cu(cn cn, co co)
    {
        this(cn);
    }

    public by a()
    {
        return new by((av)a(com/facebook/analytics/av), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsPermitted), b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled));
    }

    public Object b()
    {
        return a();
    }
}
