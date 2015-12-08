// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;
import java.util.Map;

public final class mwr extends omp
    implements nzu
{

    boolean a;
    boolean b;
    private nzt c;
    private oac d;

    public mwr()
    {
        c = new nzt(this, af);
    }

    static olq a(mwr mwr1)
    {
        return mwr1.ad;
    }

    private void a(ArrayList arraylist, nzp nzp1, String s)
    {
        int i = 0;
        int k = arraylist.size();
        String as[] = new String[k];
        String as1[] = new String[k];
        String s1 = oam.b(ad).getString(s, null);
        int j = 0;
        for (; i < k; i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)arraylist.get(i);
            as[i] = (CharSequence)entry.getKey();
            as1[i] = (CharSequence)entry.getValue();
            if (TextUtils.equals(s1, as1[i]))
            {
                j = i;
            }
        }

        nzp1.e = as;
        nzp1.f = as1;
        if (nzp1.f != null)
        {
            nzp1.b(nzp1.f[j].toString());
        }
        nzp1.a_(as[j]);
        nzp1.j = new mws(this, s, nzp1);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            a = bundle.getBoolean("state_show_apiary_pref");
            b = bundle.getBoolean("state_show_datamixer_pref");
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("state_show_apiary_pref", a);
        bundle.putBoolean("state_show_datamixer_pref", b);
    }

    public final void r()
    {
        d = new oac(ad);
        PreferenceCategory preferencecategory = d.a(a(b.EU));
        c.a(preferencecategory);
        Object obj;
        if (a)
        {
            nzp nzp1 = d.e(a(b.ED), a(b.EC));
            nzp1.d("debug.plus.frontend.config");
            nzp1.a("");
            ArrayList arraylist = new ArrayList(mwq.a().entrySet());
            Object obj1 = (nyf)olm.a(ad, nyf);
            obj = obj1;
            if (obj1 instanceof mwi)
            {
                obj = ((mwi)obj1).b;
            }
            obj1 = ((nyf) (obj)).a("plusi");
            obj = String.valueOf("ADB Default - ");
            obj1 = String.valueOf(obj1);
            if (((String) (obj1)).length() != 0)
            {
                obj = ((String) (obj)).concat(((String) (obj1)));
            } else
            {
                obj = new String(((String) (obj)));
            }
            arraylist.add(0, new java.util.AbstractMap.SimpleEntry(obj, ""));
            a(arraylist, nzp1, "debug.plus.frontend.config");
            if (preferencecategory != null)
            {
                preferencecategory.b(nzp1);
            } else
            {
                c.a(nzp1);
            }
        }
        if (b)
        {
            obj = d.e(a(b.EB), a(b.EA));
            ((nzp) (obj)).d("debug.plus.datamixer.config");
            ((nzp) (obj)).a("www.googleapis.com/plusdatamixer/v1/");
            obj1 = new ArrayList(mwh.a().entrySet());
            if (preferencecategory != null)
            {
                preferencecategory.b(((nzw) (obj)));
            } else
            {
                c.a(((nzw) (obj)));
            }
            a(((ArrayList) (obj1)), ((nzp) (obj)), "debug.plus.datamixer.config");
        }
    }
}
