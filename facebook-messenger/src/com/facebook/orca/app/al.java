// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.pm.PackageInfo;
import com.facebook.common.annotations.IsDebugLogsEnabled;
import com.facebook.common.c.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class al extends d
{

    final h a;

    private al(h h)
    {
        a = h;
        super();
    }

    al(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        return new a((PackageInfo)a(android/content/pm/PackageInfo), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), b(java/lang/Boolean, com/facebook/common/annotations/IsDebugLogsEnabled));
    }

    public Object b()
    {
        return a();
    }
}
