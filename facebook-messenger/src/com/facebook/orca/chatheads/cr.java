// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.os.Handler;
import com.facebook.common.e.h;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.chatheads.b.f;
import com.facebook.orca.chatheads.b.k;

// Referenced classes of package com.facebook.orca.chatheads:
//            co

class cr extends d
{

    private cr()
    {
    }

    cr(co co)
    {
        this();
    }

    public k a()
    {
        return new k((Context)a(android/content/Context), b(com/facebook/orca/chatheads/b/f), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (Handler)a(android/os/Handler), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
