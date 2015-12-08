// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.d;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class ap extends aa
{

    final MainPage a;

    ap(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void b(int i, Exception exception)
    {
        super.b(i, exception);
        if (!a.isFinishing())
        {
            a.j();
            PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putBoolean("QPicFailed", true).apply();
            an.a(aj.a(), "Invitation code get failed.");
            MainPage.w(a);
        }
    }

    public final void c(Object obj)
    {
        obj = (String)obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            b(0, null);
        } else
        {
            super.c(obj);
            if (!a.isFinishing())
            {
                a.j();
                PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().remove("QPicFailed").apply();
                PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putString("QPicCode", ((String) (obj))).apply();
                PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putLong("QPicCodeTime", System.currentTimeMillis()).apply();
                if (!d.a(a.getSupportFragmentManager(), "QPicCode"))
                {
                    MainPage.v(a);
                    return;
                }
            }
        }
    }
}
