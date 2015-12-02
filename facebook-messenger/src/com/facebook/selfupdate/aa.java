// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Context;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.selfupdate:
//            i, u, v

class aa extends d
{

    final u a;

    private aa(u u)
    {
        a = u;
        super();
    }

    aa(u u, v v)
    {
        this(u);
    }

    public i a()
    {
        return new i((Context)a(android/content/Context), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.common.process.d)a(com/facebook/common/process/d));
    }

    public Object b()
    {
        return a();
    }
}
