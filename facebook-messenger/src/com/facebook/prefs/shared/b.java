// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.SharedPreferences;
import android.preference.Preference;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.prefs.shared:
//            c, ae, d, e

public class b
{

    private final Preference a;
    private final SharedPreferences b;
    private final d c;

    public b(Preference preference, d d1)
    {
        a = preference;
        b = new c(d1);
        c = d1;
    }

    public SharedPreferences a()
    {
        return b;
    }

    public String a(String s)
    {
        return c.a(new ae(a.getKey()), s);
    }

    public void a(ae ae1)
    {
        a.setKey(ae1.a());
    }

    public boolean a(boolean flag)
    {
        return c.a(new ae(a.getKey()), flag);
    }

    public boolean b(String s)
    {
        if (!Objects.equal(s, a(((String) (null)))))
        {
            e e1 = c.b();
            e1.a(new ae(a.getKey()), s);
            e1.a();
        }
        return true;
    }

    public boolean b(boolean flag)
    {
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != a(flag1))
        {
            e e1 = c.b();
            e1.a(new ae(a.getKey()), flag);
            e1.a();
        }
        return true;
    }
}
