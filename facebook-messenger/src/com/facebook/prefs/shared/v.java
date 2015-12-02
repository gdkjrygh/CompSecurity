// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.common.process.c;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.prefs.shared:
//            a, t, u

class v extends d
{

    final t a;

    private v(t t1)
    {
        a = t1;
        super();
    }

    v(t t1, u u)
    {
        this(t1);
    }

    public SharedPreferences a()
    {
        a a1 = new a((Context)e().a(android/content/Context));
        c c1 = ((com.facebook.common.process.d)a(com/facebook/common/process/d)).b();
        Object obj;
        String s;
        if (c1.d())
        {
            obj = null;
        } else
        {
            s = c1.c();
            obj = s;
            if (s == null)
            {
                obj = c1.b();
            }
        }
        s = t.a(a);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = (new StringBuilder()).append(s).append("_").append(((String) (obj))).toString();
        } else
        {
            obj = s;
        }
        return a1.a(((String) (obj)), 0);
    }

    public Object b()
    {
        return a();
    }
}
