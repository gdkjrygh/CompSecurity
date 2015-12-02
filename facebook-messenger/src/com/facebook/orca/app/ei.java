// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.orca.activity.l;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class ei extends d
{

    final dv a;

    private ei(dv dv)
    {
        a = dv;
        super();
    }

    ei(dv dv, dw dw)
    {
        this(dv);
    }

    public l a()
    {
        return new l((Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
