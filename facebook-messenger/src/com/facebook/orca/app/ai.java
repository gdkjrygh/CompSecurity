// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.o;
import com.facebook.ui.d.a;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ai extends d
{

    final h a;

    private ai(h h)
    {
        a = h;
        super();
    }

    ai(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        return com.facebook.ui.d.a.a((Context)a(android/content/Context)).a(o.app_error_dialog_title);
    }

    public Object b()
    {
        return a();
    }
}
