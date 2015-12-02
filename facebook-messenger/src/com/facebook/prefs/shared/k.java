// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.SharedPreferences;

// Referenced classes of package com.facebook.prefs.shared:
//            j

class k
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        j.a(a, s);
    }
}
