// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.res.Resources;
import com.facebook.inject.d;
import com.facebook.orca.threads.s;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dd extends d
{

    final h a;

    private dd(h h)
    {
        a = h;
        super();
    }

    dd(h h, i i)
    {
        this(h);
    }

    public s a()
    {
        return new s((Resources)a(android/content/res/Resources));
    }

    public Object b()
    {
        return a();
    }
}
