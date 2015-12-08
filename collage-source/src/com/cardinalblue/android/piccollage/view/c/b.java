// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.c;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import com.androidquery.a;
import com.cardinalblue.android.piccollage.auth.a.c;

// Referenced classes of package com.cardinalblue.android.piccollage.view.c:
//            a

public class b extends com.cardinalblue.android.piccollage.view.c.a
{

    public b(Fragment fragment, a a1, int i)
    {
        super(fragment, new c(), a1, i);
        ((a)a1.a(0x7f1000b2)).d(0x7f020207);
        ((a)a1.a(0x7f1000b5)).c(0x7f070143);
    }

    protected void a()
    {
        com.cardinalblue.android.piccollage.a.b.bd();
    }

    protected void b()
    {
        com.cardinalblue.android.piccollage.a.b.ak("settings");
        com.cardinalblue.android.piccollage.a.b.bc();
    }

    protected String e()
    {
        return "facebook_user_name";
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s.equals("facebook_user_name"))
        {
            d();
        }
    }
}
