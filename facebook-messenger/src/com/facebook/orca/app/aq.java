// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.c.s;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.compose.ao;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class aq extends d
{

    final h a;

    private aq(h h)
    {
        a = h;
        super();
    }

    aq(h h, i i)
    {
        this(h);
    }

    public ao a()
    {
        return new ao((Context)e().a(android/content/Context), (s)a(com/facebook/c/s));
    }

    public Object b()
    {
        return a();
    }
}
