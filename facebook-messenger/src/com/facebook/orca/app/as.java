// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.inject.d;
import com.facebook.orca.images.i;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class as extends d
{

    final h a;

    private as(h h)
    {
        a = h;
        super();
    }

    as(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public i a()
    {
        return new i((Context)a(android/content/Context), (LayoutInflater)a(android/view/LayoutInflater));
    }

    public Object b()
    {
        return a();
    }
}
