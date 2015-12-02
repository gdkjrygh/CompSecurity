// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.login.bk;
import com.facebook.inject.d;
import com.facebook.prefs.shared.ac;
import com.facebook.prefs.shared.ad;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class j extends d
{

    final b a;

    private j(b b1)
    {
        a = b1;
        super();
    }

    j(b b1, c c)
    {
        this(b1);
    }

    public bk a()
    {
        return new bk((com.facebook.prefs.shared.j)a(com/facebook/prefs/shared/j), c(com/facebook/prefs/shared/ad), c(com/facebook/prefs/shared/ac));
    }

    public Object b()
    {
        return a();
    }
}
