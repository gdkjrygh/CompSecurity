// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.res.Resources;
import android.view.LayoutInflater;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.d:
//            aw, s, t

class aa extends d
{

    final s a;

    private aa(s s)
    {
        a = s;
        super();
    }

    aa(s s, t t)
    {
        this(s);
    }

    public aw a()
    {
        return new aw((LayoutInflater)a(android/view/LayoutInflater), (Resources)a(android/content/res/Resources));
    }

    public Object b()
    {
        return a();
    }
}
