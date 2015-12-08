// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.libraries.social.settings.LabelPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class mwo extends omp
    implements nzu
{

    boolean a;
    boolean b;
    Intent c;
    Intent d;
    Intent e;
    private nzt f;
    private oac g;
    private LabelPreference h;

    public mwo()
    {
        f = new nzt(this, af);
    }

    static olq a(mwo mwo1)
    {
        return mwo1.ad;
    }

    static olq b(mwo mwo1)
    {
        return mwo1.ad;
    }

    static olq c(mwo mwo1)
    {
        return mwo1.ad;
    }

    static LabelPreference d(mwo mwo1)
    {
        return mwo1.h;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            a = bundle.getBoolean("state_network_netlogs_pref");
            b = bundle.getBoolean("state_network_defaults_pref");
            if (bundle.getParcelable("state_network_requests_intent") != null)
            {
                c = (Intent)bundle.getParcelable("state_network_requests_intent");
            }
            if (bundle.getParcelable("state_network_stats_intent") != null)
            {
                d = (Intent)bundle.getParcelable("state_network_stats_intent");
            }
            if (bundle.getParcelable("state_media_upload_stats_intent") != null)
            {
                e = (Intent)bundle.getParcelable("state_media_upload_stats_intent");
            }
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("state_network_netlogs_pref", a);
        bundle.putBoolean("state_network_defaults_pref", b);
        bundle.putParcelable("state_network_requests_intent", c);
        bundle.putParcelable("state_network_stats_intent", d);
        bundle.putParcelable("state_media_upload_stats_intent", e);
    }

    public final void l()
    {
        super.l();
        if (h != null)
        {
            boolean flag = oam.b(ad).getBoolean("net_netlogs_key", false);
            LabelPreference labelpreference = h;
            String s;
            if (flag)
            {
                s = "ON";
            } else
            {
                s = "OFF";
            }
            labelpreference.a(s);
        }
    }

    public final void r()
    {
        nzw nzw1;
label0:
        {
            g = new oac(ad);
            PreferenceCategory preferencecategory = g.a(a(b.ER));
            f.a(preferencecategory);
            if (a)
            {
                h = g.b(a(b.EO), a(b.EN));
                h.d("net_netlogs_key");
                h.a(Boolean.valueOf(false));
                h.k = new mwp(this);
                if (preferencecategory != null)
                {
                    preferencecategory.b(h);
                } else
                {
                    f.a(h);
                }
            }
            if (b)
            {
                if (c != null)
                {
                    nzw1 = g.a(a(b.ET), a(b.ES), c);
                    nzw1.d("net_transactions_key");
                    if (preferencecategory != null)
                    {
                        preferencecategory.b(nzw1);
                    } else
                    {
                        f.a(nzw1);
                    }
                }
                if (d != null)
                {
                    nzw1 = g.a(a(b.EQ), a(b.EP), d);
                    nzw1.d("net_stats_key");
                    if (preferencecategory != null)
                    {
                        preferencecategory.b(nzw1);
                    } else
                    {
                        f.a(nzw1);
                    }
                }
                if (e != null)
                {
                    nzw1 = g.a(a(b.EW), a(b.EV), e);
                    nzw1.d("media_uploads_stats_key");
                    if (preferencecategory == null)
                    {
                        break label0;
                    }
                    preferencecategory.b(nzw1);
                }
            }
            return;
        }
        f.a(nzw1);
    }
}
