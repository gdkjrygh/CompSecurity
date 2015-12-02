// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.orca.nux.h;
import com.facebook.orca.nux.u;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class da extends d
{

    final com.facebook.orca.app.h a;

    private da(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    da(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public u a()
    {
        return new u((Context)a(android/content/Context), (h)a(com/facebook/orca/nux/h));
    }

    public Object b()
    {
        return a();
    }
}
