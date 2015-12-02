// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import android.view.WindowManager;
import com.facebook.e.a.e;
import com.facebook.e.a.g;
import com.facebook.e.a.h;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.e:
//            c, h, i

class p extends d
{

    final com.facebook.e.h a;

    private p(com.facebook.e.h h1)
    {
        a = h1;
        super();
    }

    p(com.facebook.e.h h1, i i)
    {
        this(h1);
    }

    public e a()
    {
        return new e((h)a(com/facebook/e/a/h), (g)a(com/facebook/e/a/g), Runtime.getRuntime(), (c)a(com/facebook/e/c), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (WindowManager)a(android/view/WindowManager), (com.facebook.base.activity.g)a(com/facebook/base/activity/g), (com.facebook.common.e.h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
