// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.e:
//            r, h, i

class n extends d
{

    final h a;

    private n(h h)
    {
        a = h;
        super();
    }

    n(h h, i i)
    {
        this(h);
    }

    public r a()
    {
        return new r((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
