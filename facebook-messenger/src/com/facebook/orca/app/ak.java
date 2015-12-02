// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.ui.d.e;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ak extends d
{

    final h a;

    private ak(h h)
    {
        a = h;
        super();
    }

    ak(h h, i i)
    {
        this(h);
    }

    public e a()
    {
        return new e((Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
