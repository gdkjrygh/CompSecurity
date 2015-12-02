// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.inject.d;
import com.facebook.orca.common.ui.widgets.a;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class k extends d
{

    final h a;

    private k(h h)
    {
        a = h;
        super();
    }

    k(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        return new a((Context)a(android/content/Context), (LayoutInflater)a(android/view/LayoutInflater));
    }

    public Object b()
    {
        return a();
    }
}
