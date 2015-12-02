// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.inject.d;
import com.facebook.orca.f.b;
import com.facebook.orca.f.x;
import com.facebook.orca.photos.a.e;
import com.facebook.orca.threadlist.af;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cv extends d
{

    final h a;

    private cv(h h)
    {
        a = h;
        super();
    }

    cv(h h, i i)
    {
        this(h);
    }

    public af a()
    {
        return new af((Context)a(android/content/Context), (b)a(com/facebook/orca/f/b), (x)a(com/facebook/orca/f/x), (e)a(com/facebook/orca/photos/a/e), (LayoutInflater)a(android/view/LayoutInflater));
    }

    public Object b()
    {
        return a();
    }
}
