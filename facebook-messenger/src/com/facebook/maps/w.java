// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.content.res.Resources;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.maps:
//            q, s, t

class w extends d
{

    final s a;

    private w(s s)
    {
        a = s;
        super();
    }

    w(s s, t t)
    {
        this(s);
    }

    public q a()
    {
        return new q(((Resources)a(android/content/res/Resources)).getDisplayMetrics());
    }

    public Object b()
    {
        return a();
    }
}
