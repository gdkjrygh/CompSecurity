// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.a;

import android.content.Context;
import com.facebook.d.b.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.d.a:
//            b

class c extends d
{

    private c()
    {
    }

    c(b b1)
    {
        this();
    }

    public a a()
    {
        return new a(((Context)a(android/content/Context)).getPackageName(), (com.facebook.common.process.c)a(com/facebook/common/process/c));
    }

    public Object b()
    {
        return a();
    }
}
