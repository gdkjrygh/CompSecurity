// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.b.a;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.enums.Blend;
import com.tinder.enums.PaywallPerk;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.z;
import com.tinder.views.CustomTextView;

public class ActivityBlend extends ActivitySignedInBase
    implements android.view.View.OnClickListener
{

    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private boolean I;
    private String J;
    private int K;
    private int L;
    private int M;
    ae a;
    ad b;
    aa c;
    z d;
    d e;
    private CheckBox f;
    private CheckBox g;
    private CheckBox h;
    private CheckBox i;
    private TextView j;
    private TextView k;

    public ActivityBlend()
    {
    }

    private void a(Blend blend)
    {
        if (I)
        {
            J = blend.name;
            b(blend);
            return;
        } else
        {
            b(Blend.OPTIMAL);
            launchPlusSubscriptionPaywall(6, PaywallPerk.SUPER_LIKE);
            return;
        }
    }

    private void b(Blend blend)
    {
        f.setChecked(blend.equals(Blend.OPTIMAL));
        g.setChecked(blend.equals(Blend.POPULARITY));
        h.setChecked(blend.equals(Blend.DISTANCE));
        i.setChecked(blend.equals(Blend.RECENT_ACTIVITY));
        TextView textview = j;
        int l;
        if (blend.equals(Blend.OPTIMAL))
        {
            l = K;
        } else
        {
            l = L;
        }
        textview.setTextColor(l);
        textview = k;
        if (blend.equals(Blend.OPTIMAL))
        {
            l = K;
        } else
        {
            l = M;
        }
        textview.setTextColor(l);
        textview = C;
        if (blend.equals(Blend.POPULARITY))
        {
            l = K;
        } else
        {
            l = L;
        }
        textview.setTextColor(l);
        textview = D;
        if (blend.equals(Blend.POPULARITY))
        {
            l = K;
        } else
        {
            l = M;
        }
        textview.setTextColor(l);
        textview = E;
        if (blend.equals(Blend.DISTANCE))
        {
            l = K;
        } else
        {
            l = L;
        }
        textview.setTextColor(l);
        textview = F;
        if (blend.equals(Blend.DISTANCE))
        {
            l = K;
        } else
        {
            l = M;
        }
        textview.setTextColor(l);
        textview = G;
        if (blend.equals(Blend.RECENT_ACTIVITY))
        {
            l = K;
        } else
        {
            l = L;
        }
        textview.setTextColor(l);
        textview = H;
        if (blend.equals(Blend.RECENT_ACTIVITY))
        {
            l = K;
        } else
        {
            l = M;
        }
        textview.setTextColor(l);
    }

    public void onBackPressed()
    {
        Intent intent = new Intent();
        if (J != null)
        {
            intent.putExtra("blend", J);
            setResult(-1, intent);
        } else
        {
            setResult(0, intent);
        }
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131624075: 
        case 2131624077: 
        case 2131624079: 
        case 2131624081: 
        case 2131624082: 
        case 2131624084: 
        case 2131624086: 
        case 2131624088: 
        case 2131624090: 
        case 2131624092: 
        case 2131624094: 
        case 2131624095: 
        default:
            return;

        case 2131624078: 
        case 2131624080: 
            J = Blend.OPTIMAL.name;
            b(Blend.OPTIMAL);
            return;

        case 2131624083: 
        case 2131624085: 
            a(Blend.POPULARITY);
            return;

        case 2131624087: 
        case 2131624089: 
            a(Blend.DISTANCE);
            return;

        case 2131624091: 
        case 2131624093: 
            a(Blend.RECENT_ACTIVITY);
            return;

        case 2131624096: 
            launchPlusSubscriptionPaywall(6, PaywallPerk.SUPER_LIKE);
            return;

        case 2131624074: 
        case 2131624076: 
            onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        ManagerApp.h().a(this);
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        f = (CheckBox)findViewById(0x7f0e0090);
        g = (CheckBox)findViewById(0x7f0e0095);
        h = (CheckBox)findViewById(0x7f0e0099);
        i = (CheckBox)findViewById(0x7f0e009d);
        j = (CustomTextView)findViewById(0x7f0e008f);
        k = (CustomTextView)findViewById(0x7f0e0091);
        C = (CustomTextView)findViewById(0x7f0e0094);
        D = (CustomTextView)findViewById(0x7f0e0096);
        E = (CustomTextView)findViewById(0x7f0e0098);
        F = (CustomTextView)findViewById(0x7f0e009a);
        G = (CustomTextView)findViewById(0x7f0e009c);
        H = (CustomTextView)findViewById(0x7f0e009e);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        findViewById(0x7f0e008c).setOnClickListener(this);
        findViewById(0x7f0e008a).setOnClickListener(this);
        findViewById(0x7f0e008e).setOnClickListener(this);
        findViewById(0x7f0e0093).setOnClickListener(this);
        findViewById(0x7f0e0097).setOnClickListener(this);
        findViewById(0x7f0e009b).setOnClickListener(this);
        findViewById(0x7f0e00a0).setOnClickListener(this);
        if (getIntent() != null && getIntent().getExtras().get("blend") != null)
        {
            J = getIntent().getStringExtra("blend");
        }
        K = android.support.v4.b.a.b(this, 0x7f0d0101);
        L = android.support.v4.b.a.b(this, 0x7f0d000f);
        M = android.support.v4.b.a.b(this, 0x7f0d00fb);
        if (!ae.a())
        {
            e.e();
        }
    }

    public void onResume()
    {
        super.onResume();
        b(ab.c(J));
        boolean flag;
        if (ae.s() && ae.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = flag;
        if (I)
        {
            findViewById(0x7f0e00a0).setVisibility(8);
            findViewById(0x7f0e009f).setVisibility(8);
            return;
        } else
        {
            b(Blend.OPTIMAL);
            findViewById(0x7f0e009f).setVisibility(0);
            return;
        }
    }
}
