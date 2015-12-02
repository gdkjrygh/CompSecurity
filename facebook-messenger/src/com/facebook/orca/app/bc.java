// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.inject.d;
import com.facebook.orca.threadview.s;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bc extends d
{

    final h a;

    private bc(h h)
    {
        a = h;
        super();
    }

    bc(h h, i i)
    {
        this(h);
    }

    public s a()
    {
        return new s((Context)a(android/content/Context), (LayoutInflater)a(android/view/LayoutInflater));
    }

    public Object b()
    {
        return a();
    }
}
