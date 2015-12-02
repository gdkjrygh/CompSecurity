// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.bugreporter.annotations.IsRageShakeAvailable;
import com.facebook.inject.d;
import com.facebook.ui.i.g;

// Referenced classes of package com.facebook.bugreporter:
//            ab, g, o, p

class w extends d
{

    final o a;

    private w(o o)
    {
        a = o;
        super();
    }

    w(o o, p p)
    {
        this(o);
    }

    public ab a()
    {
        return new ab((com.facebook.bugreporter.g)a(com/facebook/bugreporter/g), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), b(java/lang/Boolean, com/facebook/bugreporter/annotations/IsRageShakeAvailable), (g)a(com/facebook/ui/i/g));
    }

    public Object b()
    {
        return a();
    }
}
