// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.app.NotificationManager;
import android.content.Context;
import com.facebook.common.e.h;
import com.facebook.http.protocol.aq;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.bugreporter:
//            f, d, m, o, 
//            p

class r extends d
{

    final o a;

    private r(o o)
    {
        a = o;
        super();
    }

    r(o o, p p)
    {
        this(o);
    }

    public f a()
    {
        return new f((Context)e().a(android/content/Context), (aq)a(com/facebook/http/protocol/aq), (com.facebook.bugreporter.d)a(com/facebook/bugreporter/d), (h)a(com/facebook/common/e/h), (NotificationManager)e().a(android/app/NotificationManager), (m)a(com/facebook/bugreporter/m));
    }

    public Object b()
    {
        return a();
    }
}
