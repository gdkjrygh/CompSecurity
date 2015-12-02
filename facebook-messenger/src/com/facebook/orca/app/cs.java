// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.threads.n;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cs extends d
{

    final h a;

    private cs(h h)
    {
        a = h;
        super();
    }

    cs(h h, i i)
    {
        this(h);
    }

    public n a()
    {
        return new n((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
