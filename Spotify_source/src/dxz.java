// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public class dxz extends dxx
{

    private Button Y;
    private EditText Z;
    private ggl a;
    private EditText aa;
    private TextView ab;
    private String ac;
    private android.widget.TextView.OnEditorActionListener ad;
    private TextWatcher ae;
    private View b;

    public dxz()
    {
        dmz.a(for);
        ad = new android.widget.TextView.OnEditorActionListener() {

            private dxz a;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6 || keyevent != null && keyevent.getKeyCode() == 66)
                {
                    dxz.a(a);
                }
                return false;
            }

            
            {
                a = dxz.this;
                super();
            }
        };
        ae = new gbp() {

            private dxz a;

            public final void afterTextChanged(Editable editable)
            {
                super.afterTextChanged(editable);
                if (editable.toString().trim().length() > 0)
                {
                    dxz.b(a).setError(null);
                    dxz.c(a).setEnabled(true);
                    return;
                } else
                {
                    dxz.c(a).setEnabled(false);
                    return;
                }
            }

            
            {
                a = dxz.this;
                super();
            }
        };
    }

    private void I()
    {
        dyb dyb1 = new dyb((byte)0);
        dyb1.a = gfy.a(Z);
        dyb1.b = gfy.a(aa);
        String s = dyb1.a.trim();
        if (s.length() == 0)
        {
            Z.setError(b(0x7f080335));
            return;
        }
        if (dyb1.b.length() == 0)
        {
            aa.setError(b(0x7f08032d));
            return;
        } else
        {
            d(0x7f08032f);
            F().a(s, dyb1.b);
            return;
        }
    }

    public static dxz a()
    {
        return new dxz();
    }

    public static dxz a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("userName", s);
        s = new dxz();
        s.f(bundle);
        return s;
    }

    static void a(dxz dxz1)
    {
        dxz1.I();
    }

    static EditText b(dxz dxz1)
    {
        return dxz1.Z;
    }

    static Button c(dxz dxz1)
    {
        return dxz1.Y;
    }

    private void d(int i)
    {
        if (Y != null)
        {
            String s = Y.getContext().getString(i);
            if (Y != null)
            {
                Y.setText(s);
                return;
            }
        }
    }

    public final void A()
    {
        super.A();
        Z.removeTextChangedListener(ae);
        a.b();
        ((InputMethodManager)k().getSystemService("input_method")).hideSoftInputFromWindow(aa.getWindowToken(), 0);
    }

    public final dya F()
    {
        return (dya)H().a(this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (View)ctz.a(layoutinflater.inflate(0x7f030083, viewgroup, false));
        b = (View)ctz.a(layoutinflater.findViewById(0x7f11036e));
        Y = (Button)ctz.a(layoutinflater.findViewById(0x7f110372));
        Z = (EditText)ctz.a(layoutinflater.findViewById(0x7f110370));
        aa = (EditText)ctz.a(layoutinflater.findViewById(0x7f110371));
        ab = (TextView)ctz.a(layoutinflater.findViewById(0x7f110373));
        return layoutinflater;
    }

    public final void a(int i, int j, Intent intent)
    {
        if (1 == i && j == -1)
        {
            for.a(k(), a.c(), false);
            I();
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = ggn.b(k(), ViewUri.ay);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private dxz a;

            public final void onClick(View view1)
            {
                a.F().a();
            }

            
            {
                a = dxz.this;
                super();
            }
        });
        aa.setOnEditorActionListener(ad);
        Y.setOnClickListener(new android.view.View.OnClickListener() {

            private dxz a;

            public final void onClick(View view1)
            {
                dxz.a(a);
            }

            
            {
                a = dxz.this;
                super();
            }
        });
        ab.setOnClickListener(new android.view.View.OnClickListener() {

            private dxz a;

            public final void onClick(View view1)
            {
                a.F().b();
            }

            
            {
                a = dxz.this;
                super();
            }
        });
        view = g();
        if (view != null)
        {
            Z.setText(view.getString("userName"));
        }
    }

    protected final void a(SpotifyError spotifyerror)
    {
        super.a(spotifyerror);
        d(0x7f080330);
        if (SpotifyError.c.equals(spotifyerror))
        {
            a(new Intent(k(), com/spotify/mobile/android/ui/activity/DisableOfflineModeActivity), 1);
            return;
        } else
        {
            ac = spotifyerror.a(k());
            Toast.makeText(k(), ac, 1).show();
            return;
        }
    }

    public final void a(dxy dxy1)
    {
        super.a(dxy1);
        if (Y == null || b == null)
        {
            return;
        }
        View view;
        int i;
        boolean flag;
        if (dxy1.a())
        {
            i = 0x7f08032f;
        } else
        {
            i = 0x7f080330;
        }
        d(i);
        view = b;
        if (!dxy1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
    }

    public final void z()
    {
        super.z();
        Z.addTextChangedListener(ae);
        a.a();
    }
}
