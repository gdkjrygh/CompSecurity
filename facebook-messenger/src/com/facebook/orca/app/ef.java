// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.ui.media.cache.k;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class ef extends d
{

    final dv a;

    private ef(dv dv)
    {
        a = dv;
        super();
    }

    ef(dv dv, dw dw)
    {
        this(dv);
    }

    public k a()
    {
        return new k((Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
