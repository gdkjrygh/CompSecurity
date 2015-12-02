// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.common.e.h;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class aj extends d
{

    final com.facebook.orca.app.h a;

    private aj(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    aj(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public com.facebook.ui.d.d a()
    {
        return new com.facebook.ui.d.d((Context)a(android/content/Context), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
