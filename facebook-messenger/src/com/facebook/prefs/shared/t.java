// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.SharedPreferences;
import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.d.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.prefs.shared:
//            DefaultSharedPreferences, v, j, q, 
//            d, h, ah, ai, 
//            aa, ab, r, s, 
//            w, x, y, z, 
//            ad, ac

public class t extends c
{

    private final String a;
    private final String b;
    private final String c;

    public t(String s1, String s2)
    {
        this(s1, s2, "com.facebook.orca_preferences");
    }

    public t(String s1, String s2, String s3)
    {
        a = s1;
        b = s2;
        c = s3;
    }

    static String a(t t1)
    {
        return t1.c;
    }

    protected void a()
    {
        f(com/facebook/d/a/a);
        a(android/content/SharedPreferences).a(com/facebook/prefs/shared/DefaultSharedPreferences).a(new v(this, null)).a();
        a(com/facebook/prefs/shared/j).a(new q()).a();
        a(com/facebook/prefs/shared/d).b(com/facebook/prefs/shared/j);
        a(com/facebook/prefs/shared/h).a(new h(a, b));
        a(com/facebook/prefs/shared/ah).a(new ai());
        a(com/facebook/prefs/shared/aa).a(new ab());
        a(com/facebook/prefs/shared/r).a(new s());
        a(com/facebook/prefs/shared/w).a(new x()).a();
        a(com/facebook/prefs/shared/y).a(new z());
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/prefs/shared/r);
        c(com/facebook/prefs/shared/ad);
        c(com/facebook/prefs/shared/ac);
    }
}
