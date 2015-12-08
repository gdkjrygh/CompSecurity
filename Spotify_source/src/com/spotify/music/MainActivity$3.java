// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.spotify.mobile.android.ui.ActionBarManager;
import fog;
import fol;
import gmp;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class a
    implements fol
{

    private MainActivity a;

    public final void a(Fragment fragment)
    {
        MainActivity.k(a).a(MainActivity.m(a).a());
        a.q_();
        fragment = a;
        ((InputMethodManager)fragment.getSystemService("input_method")).hideSoftInputFromWindow(fragment.getWindow().getDecorView().getWindowToken(), 0);
        MainActivity.g(a).post(MainActivity.n(a));
    }

    hodManager(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }
}
