// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.upsell.MarketingOptInActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public final class fyz extends fze
{

    public static final gip a = gip.b("requires_marketing_opt_in");
    public static final gip b = gip.b("marketing_opt_in_contact_us_url");
    private boolean Z;
    private Intent aa;
    private int ab;
    private an ac;

    public fyz()
    {
        ac = new an() {

            private fyz a;

            public final da a(Bundle bundle)
            {
                return new cn(a.k()) {

                    public final Object d()
                    {
                        fza fza1 = new fza((byte)0);
                        fza1.a = ((giq)dmz.a(giq)).b(i()).a(fyz.a, false);
                        fza1.b = ((giq)dmz.a(giq)).b(i()).a(fyz.b, null);
                        return fza1;
                    }

                };
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                obj = (fza)obj;
                fyz.a(a, ((fza) (obj)));
            }

            
            {
                a = fyz.this;
                super();
            }
        };
    }

    static void a(fyz fyz1, fza fza1)
    {
        if (fza1.a && !fyz1.Z)
        {
            fyz1.Z = true;
            fyz1.aa = MarketingOptInActivity.a(fyz1.k(), fza1.b);
            if (fyz1.Y != null)
            {
                fyz1.Y.a(fyz1);
            }
        }
    }

    protected final void F()
    {
        ab = Y.b(this);
    }

    public final void a()
    {
        Assertion.b(Integer.valueOf(ab), Integer.valueOf(0));
        if (Z)
        {
            a(aa, ab);
            return;
        } else
        {
            Assertion.a("Unexpected onShow(). Did not expect to show a dialog when nothing queued");
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            ab = bundle.getInt("request_code_key", 0);
            Z = bundle.getBoolean("dialog_queued", false);
        }
        u().a(0x7f110084, null, ac).n();
    }

    public final void a(DialogPresenter dialogpresenter)
    {
        super.a(dialogpresenter);
        if (Z)
        {
            Y.a(this);
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("request_code_key", ab);
        bundle.putBoolean("dialog_queued", Z);
    }

}
