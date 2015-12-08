// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;

public final class htl
    implements omb, oov, ops, opt, opv
{

    ArrayList a;
    private final am b;
    private final int c;
    private fnp d;
    private TextView e;
    private mtj f;
    private noz g;
    private htb h;

    public htl(am am1, opd opd1, int i)
    {
        b = am1;
        c = i;
        opd1.a(this);
    }

    public final void X_()
    {
        if (a == null)
        {
            f.a(new htk());
        }
    }

    void a()
    {
        Object obj;
        if (Locale.getDefault() != null)
        {
            obj = Locale.getDefault().getCountry();
        } else
        {
            obj = null;
        }
        if (obj == null || a == null || e == null)
        {
            if (e != null)
            {
                e.setVisibility(8);
            }
            return;
        }
        boolean flag = a.contains(obj);
        if (flag)
        {
            PreferenceManager.getDefaultSharedPreferences(h.a).edit().putBoolean("com.google.android.apps.photos.search.peoplegroupingonboarding.PGOM.new_user_onboarding", true).apply();
        }
        obj = e;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((TextView) (obj)).setVisibility(i);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = noz.a(context, 3, "NUPGOM", new String[0]);
        d = (fnp)olm1.a(fnp);
        h = (htb)olm1.a(htb);
        f = ((mtj)olm1.a(mtj)).a("com.google.android.apps.photos.earch.peoplegroupingonboarding.newuser.CountryCodes", new htm(this));
        if (bundle != null)
        {
            a = bundle.getStringArrayList("state_country_codes");
        }
    }

    public final void a(View view, Bundle bundle)
    {
        e = (TextView)view.findViewById(c);
        d.a(e, b.a(b.xH), fnl.k);
        a();
    }

    public final void e(Bundle bundle)
    {
        bundle.putStringArrayList("state_country_codes", a);
    }
}
