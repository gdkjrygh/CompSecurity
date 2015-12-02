// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.http.c.i;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.attachments.a;
import com.facebook.orca.j.c;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class m extends d
{

    final h a;

    private m(h h)
    {
        a = h;
        super();
    }

    m(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public a a()
    {
        return new a(b(com/facebook/http/c/i), e(com/facebook/auth/viewercontext/ViewerContext), (Context)e().a(android/content/Context), (c)a(com/facebook/orca/j/c));
    }

    public Object b()
    {
        return a();
    }
}
