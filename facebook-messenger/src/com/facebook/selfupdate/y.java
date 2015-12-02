// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Context;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.selfupdate:
//            g, ai, o, u, 
//            v

class y extends d
{

    final u a;

    private y(u u)
    {
        a = u;
        super();
    }

    y(u u, v v)
    {
        this(u);
    }

    public g a()
    {
        return new g((Context)a(android/content/Context), (ai)a(com/facebook/selfupdate/ai), (o)a(com/facebook/selfupdate/o));
    }

    public Object b()
    {
        return a();
    }
}
