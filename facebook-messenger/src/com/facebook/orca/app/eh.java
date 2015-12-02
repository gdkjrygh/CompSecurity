// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.notify.an;
import com.facebook.orca.notify.au;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class eh extends d
{

    final dv a;

    private eh(dv dv)
    {
        a = dv;
        super();
    }

    eh(dv dv, dw dw)
    {
        this(dv);
    }

    public an a()
    {
        return new au((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
