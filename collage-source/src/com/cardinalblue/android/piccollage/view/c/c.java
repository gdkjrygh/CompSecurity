// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.c;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import com.androidquery.a;
import com.cardinalblue.android.piccollage.auth.a.e;

// Referenced classes of package com.cardinalblue.android.piccollage.view.c:
//            a

public class c extends com.cardinalblue.android.piccollage.view.c.a
{

    public c(Fragment fragment, a a1, int i)
    {
        super(fragment, new e(), a1, i);
        ((a)a1.a(0x7f1000b2)).d(0x7f02020d);
        ((a)a1.a(0x7f1000b5)).c(0x7f0702ad);
    }

    protected void a()
    {
    }

    protected void b()
    {
    }

    protected String e()
    {
        return "pref_tumblr_user_name";
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
    }
}
