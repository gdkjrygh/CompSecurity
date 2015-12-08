// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.accountswitcher;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b;
import dfr;
import dfs;
import dft;
import egf;
import enc;
import mmr;
import mry;
import msm;
import olm;
import pwv;

public class AccountSwitcherView extends FrameLayout
    implements android.view.View.OnClickListener
{

    public final mmr a;
    public final enc b;
    public final egf c;
    public ImageView d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public dfs h;
    public boolean i;
    public dft j;
    private View k;
    private View l;
    private View m;
    private View n;

    public AccountSwitcherView(Context context)
    {
        this(context, null, 0);
    }

    public AccountSwitcherView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AccountSwitcherView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        inflate(context, b.iA, this);
        e = (ImageView)findViewById(b.it);
        f = (TextView)findViewById(b.iw);
        g = (TextView)findViewById(b.is);
        d = (ImageView)findViewById(b.iu);
        k = findViewById(b.iv);
        n = findViewById(b.iz);
        n.setOnClickListener(this);
        b.a(n, new msm(pwv.f));
        l = findViewById(b.iy);
        m = findViewById(b.ix);
        a(dft.a);
        a = (mmr)olm.a(context, mmr);
        b = (enc)olm.a(context, enc);
        c = (egf)olm.a(context, egf);
    }

    public void a()
    {
        switch (dfr.a[j.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (i)
            {
                l.setVisibility(0);
            } else
            {
                l.setVisibility(8);
            }
            m.setVisibility(8);
            return;

        case 2: // '\002'
            l.setVisibility(8);
            m.setVisibility(0);
            return;
        }
    }

    public final void a(dft dft1)
    {
        if (j != dft1)
        {
            j = dft1;
            a();
            if (h != null)
            {
                h.a(this);
            }
        }
    }

    public void onClick(View view)
    {
        switch (dfr.a[j.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(dft.b);
            mry.a(view, 4);
            return;

        case 2: // '\002'
            a(dft.a);
            break;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        Parcelable parcelable1 = parcelable;
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            a(dft.valueOf(parcelable.getString("savedNavigationMode")));
            parcelable1 = parcelable.getParcelable("accountSwitcherState");
        }
        super.onRestoreInstanceState(parcelable1);
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("accountSwitcherState", super.onSaveInstanceState());
        bundle.putString("savedNavigationMode", j.name());
        return bundle;
    }

    public void setPadding(int i1, int j1, int k1, int l1)
    {
        if (k == null)
        {
            return;
        } else
        {
            k.getLayoutParams().height = getResources().getDimensionPixelSize(b.ir) + j1;
            ((android.view.ViewGroup.MarginLayoutParams)e.getLayoutParams()).topMargin = getResources().getDimensionPixelSize(b.iq) + j1;
            return;
        }
    }
}
