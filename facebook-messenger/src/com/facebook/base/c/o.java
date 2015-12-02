// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.ContentResolver;
import android.content.Context;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class o extends d
{

    final a a;

    private o(a a1)
    {
        a = a1;
        super();
    }

    o(a a1, b b1)
    {
        this(a1);
    }

    public ContentResolver a()
    {
        return ((Context)a(android/content/Context)).getContentResolver();
    }

    public Object b()
    {
        return a();
    }
}
