// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a

class bc extends d
{

    final a a;
    private final String b;

    bc(a a1, String s)
    {
        a = a1;
        super();
        b = s;
    }

    public Object b()
    {
        return ((Context)a(android/content/Context)).getSystemService(b);
    }
}
