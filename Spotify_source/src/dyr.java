// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.concurrent.TimeUnit;

public class dyr extends dxx
{

    private String Y;
    private boolean Z;
    private Button a;
    private boolean aa;
    private int ab;
    private dva ac;
    private ggl ad;
    private String b;

    public dyr()
    {
    }

    private dys F()
    {
        return (dys)H().a(this);
    }

    public static dyr a(String s, String s1, dva dva1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("username", s);
        bundle.putString("password", s1);
        bundle.putBoolean("with_radio", dva1.a);
        bundle.putBoolean("shuffle_restricted", dva1.b);
        s = new dyr();
        s.f(bundle);
        return s;
    }

    private void a()
    {
        if (!Z)
        {
            aa = true;
            a.setEnabled(false);
            a.setText(0x7f08032f);
            View view = y();
            if (view != null)
            {
                view.findViewById(0x7f110377).setVisibility(0);
            }
            return;
        } else
        {
            F().b();
            return;
        }
    }

    static void a(dyr dyr1)
    {
        dyr1.a();
    }

    public final void A()
    {
        super.A();
        ad.b();
    }

    public final boolean G()
    {
        a();
        return true;
    }

    public final boolean J()
    {
        return false;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i = 0;
        if (ac.b && !ac.a)
        {
            layoutinflater = layoutinflater.inflate(0x7f03009e, viewgroup, false);
        } else
        {
            layoutinflater = layoutinflater.inflate(0x7f030085, viewgroup, false);
            viewgroup = (TextView)layoutinflater.findViewById(0x7f110378);
            if (!ac.a)
            {
                i = 8;
            }
            viewgroup.setVisibility(i);
        }
        a = (Button)layoutinflater.findViewById(0x7f110022);
        return layoutinflater;
    }

    public final void a(int i, int j, Intent intent)
    {
        if (1 == i)
        {
            if (j == 0)
            {
                F().a(b);
                return;
            }
            if (j == -1)
            {
                dmz.a(for);
                for.a(k(), ad.c(), false);
                if (ab < 10)
                {
                    F().a(b, Y);
                    ab = ab + 1;
                    return;
                }
            } else
            {
                Assertion.a((new StringBuilder("Unhandled resultCode from ")).append(com/spotify/mobile/android/ui/activity/DisableOfflineModeActivity.getSimpleName()).append(" in ").append(dyr.getSimpleName()).toString());
                return;
            }
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Bundle bundle1 = g();
        ac = new dva(bundle1);
        if (bundle != null)
        {
            b = bundle.getString("username");
            Y = bundle.getString("password");
        } else
        {
            b = bundle1.getString("username");
            Y = bundle1.getString("password");
        }
        ctz.a(b);
        ctz.a(Y);
        F().a(b, Y);
        ab = 1;
        ad = ggn.a(k(), ViewUri.au, b);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        a.setOnClickListener(new android.view.View.OnClickListener() {

            private dyr a;

            public final void onClick(View view1)
            {
                dyr.a(a);
            }

            
            {
                a = dyr.this;
                super();
            }
        });
    }

    protected final void a(SpotifyError spotifyerror)
    {
        if (SpotifyError.c.equals(spotifyerror))
        {
            a(new Intent(k(), com/spotify/mobile/android/ui/activity/DisableOfflineModeActivity), 1);
            return;
        }
        if (ab < 10)
        {
            F().a(b, Y);
            ab = ab + 1;
            return;
        } else
        {
            Toast.makeText(k(), spotifyerror.a(k()), 1).show();
            F().a();
            return;
        }
    }

    public final void a(dxy dxy1)
    {
        if (Z || !dxy1.a) goto _L2; else goto _L1
_L1:
        (new gfl(k())).a(0);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("should_show_trial_start_notice", Boolean.valueOf(false));
        k().getContentResolver().update(dtx.a, contentvalues, null, null);
        Z = true;
        if (!dxy1.c) goto _L4; else goto _L3
_L3:
        F().b();
_L6:
        if (aa)
        {
            F().b();
        }
_L2:
        return;
_L4:
        int i;
        u u1 = k();
        u1.findViewById(0x7f110376).setVisibility(0);
        i = dxy1.d;
        if (!ac.b)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = (int)TimeUnit.HOURS.toDays(i);
        int k = j / 30;
        if (k > 0)
        {
            dxy1 = l().getQuantityString(0x7f090029, k, new Object[] {
                Integer.valueOf(k)
            });
        } else
        if (i >= 48)
        {
            dxy1 = l().getQuantityString(0x7f090027, j, new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            dxy1 = l().getQuantityString(0x7f090028, i, new Object[] {
                Integer.valueOf(i)
            });
        }
_L7:
        ((TextView)u1.findViewById(0x7f1102f9)).setText(dxy1);
        u1.findViewById(0x7f110375).setVisibility(8);
        if (true) goto _L6; else goto _L5
_L5:
        if (i <= 48)
        {
            dxy1 = l().getQuantityString(0x7f09000d, i, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            i = (int)TimeUnit.HOURS.toDays(i);
            dxy1 = l().getQuantityString(0x7f09000c, i, new Object[] {
                Integer.valueOf(i)
            });
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public final void e(Bundle bundle)
    {
        bundle.putString("username", b);
        bundle.putString("password", Y);
        super.e(bundle);
    }

    public final void z()
    {
        super.z();
        ad.a();
    }
}
