// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.ContentResolver;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.p.a;
import com.facebook.user.i;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class n extends d
{

    final h a;

    private n(h h)
    {
        a = h;
        super();
    }

    n(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public a a()
    {
        return new a((ContentResolver)e().a(android/content/ContentResolver), (i)a(com/facebook/user/i));
    }

    public Object b()
    {
        return a();
    }
}
