// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.libraries.social.settings.LabelPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;

public class mwl extends omp
    implements nzu
{

    public final nzt a;
    public oac b;
    Intent c;
    Intent d;
    Intent e;
    boolean f;
    private LabelPreference g;
    private mwn h;

    public mwl()
    {
        a = new nzt(this, af);
    }

    static mwn a(mwl mwl1)
    {
        return mwl1.h;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            if (bundle.getParcelable("state_account_status_intent") != null)
            {
                c = (Intent)bundle.getParcelable("state_account_status_intent");
            }
            if (bundle.getParcelable("state_browse_experiments_intent") != null)
            {
                d = (Intent)bundle.getParcelable("state_browse_experiments_intent");
            }
            if (bundle.getParcelable("state_tracing_pref_intent") != null)
            {
                e = (Intent)bundle.getParcelable("state_tracing_pref_intent");
            }
            f = bundle.getBoolean("state_show_override_experiments_pref");
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        h = (mwn)ae.b(mwn);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("state_account_status_intent", c);
        bundle.putParcelable("state_browse_experiments_intent", d);
        bundle.putParcelable("state_tracing_pref_intent", e);
        bundle.putBoolean("state_show_override_experiments_pref", f);
    }

    public final void l()
    {
        super.l();
        if (g != null)
        {
            String s;
            if (oam.b(ad).getBoolean("debug.plus.frontend.tracing", false))
            {
                s = "ON";
            } else
            {
                s = "OFF";
            }
            g.a(s);
        }
    }

    public void r()
    {
        Object obj;
label0:
        {
            b = new oac(ad);
            PreferenceCategory preferencecategory = b.a(a(b.EI));
            preferencecategory.c(false);
            a.a(preferencecategory);
            if (e != null)
            {
                g = b.b(a(b.EZ), null);
                g.o = e;
                g.d("tracing_preferences");
                if (preferencecategory != null)
                {
                    preferencecategory.b(g);
                } else
                {
                    a.a(g);
                }
            }
            if (c != null)
            {
                obj = b.a(a(b.EH), a(b.EG), c);
                ((nzw) (obj)).d("account_status_key");
                if (preferencecategory != null)
                {
                    preferencecategory.b(((nzw) (obj)));
                } else
                {
                    a.a(((nzw) (obj)));
                }
            }
            if (d != null)
            {
                obj = b.a(a(b.EK), a(b.EJ), d);
                ((nzw) (obj)).d("experiments_key");
                if (preferencecategory != null)
                {
                    preferencecategory.b(((nzw) (obj)));
                } else
                {
                    a.a(((nzw) (obj)));
                }
            }
            if (f)
            {
                obj = b.d(a(b.EF), a(b.EE));
                ((nzm) (obj)).d("experiment_override_key");
                obj.d = c.fI;
                if (preferencecategory != null)
                {
                    preferencecategory.b(((nzw) (obj)));
                } else
                {
                    a.a(((nzw) (obj)));
                }
            }
            if (h != null)
            {
                obj = b.a(a(b.EM), a(b.EL));
                ((nzw) (obj)).d("debug.plus.force_sync");
                obj.k = new mwm(this);
                if (preferencecategory == null)
                {
                    break label0;
                }
                preferencecategory.b(((nzw) (obj)));
            }
            return;
        }
        a.a(((nzw) (obj)));
    }
}
