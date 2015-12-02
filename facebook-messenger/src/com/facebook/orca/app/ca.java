// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.ContentResolver;
import com.facebook.contacts.e.e;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.user.i;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ca extends d
{

    final h a;

    private ca(h h)
    {
        a = h;
        super();
    }

    ca(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public e a()
    {
        return new e((ContentResolver)e().a(android/content/ContentResolver), (i)a(com/facebook/user/i));
    }

    public Object b()
    {
        return a();
    }
}
