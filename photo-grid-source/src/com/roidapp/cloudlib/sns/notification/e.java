// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.d;
import com.roidapp.cloudlib.sns.main.a;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            b

final class e extends aa
{

    final b a;

    e(b b1)
    {
        a = b1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        super.b(i, exception);
        if (com.roidapp.cloudlib.sns.notification.b.p(a) != null && a.getActivity() != null && !a.getActivity().isFinishing())
        {
            com.roidapp.cloudlib.sns.notification.b.q(a).j();
            PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putBoolean("QPicFailed", true).apply();
            an.a(aj.a(), "Invitation code get failed.");
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
            if (com.roidapp.cloudlib.sns.notification.b.m(a) != null && a.getActivity() != null && !a.getActivity().isFinishing())
            {
                com.roidapp.cloudlib.sns.notification.b.n(a).j();
                PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().remove("QPicFailed").apply();
                PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putString("QPicCode", ((String) (obj))).apply();
                PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putLong("QPicCodeTime", System.currentTimeMillis()).apply();
                com.roidapp.cloudlib.sns.notification.b.o(a);
                d.a(a.getActivity().getSupportFragmentManager(), "QPicCode");
                return;
            }
        }
    }
}
