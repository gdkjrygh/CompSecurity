// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push;

import android.content.ContentResolver;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.push:
//            h, c, d

class f extends d
{

    final c a;

    private f(c c)
    {
        a = c;
        super();
    }

    f(c c, com.facebook.orca.push.d d1)
    {
        this(c);
    }

    public h a()
    {
        return new h((ContentResolver)e().a(android/content/ContentResolver));
    }

    public Object b()
    {
        return a();
    }
}
