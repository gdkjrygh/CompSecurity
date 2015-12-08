// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public final class hum extends omp
    implements TextWatcher, android.widget.TextView.OnEditorActionListener, dhc, fpl, htu, huh, mti, nwn
{

    private EditText a;
    private hrr ag;
    private ImageView b;
    private View c;
    private String d;
    private mmr e;
    private mtj f;
    private final hqv g;
    private hub h;

    public hum()
    {
        g = (new hqv(this, af)).a(ae);
        new fpk(af, this);
        (new dhj(this, Integer.valueOf(c.ew), au.I)).a(ae);
        (new msi(pwy.n)).a(ae);
    }

    static EditText a(hum hum1)
    {
        return hum1.a;
    }

    private void r()
    {
        if (d != null)
        {
            hub hub1 = h;
            String s = d.trim();
            hub1.a.a(hub1);
            hub1.c.c = (String)s;
            hub1.a.a(s.toString(), 30, 4);
            if (hub1.c.d)
            {
                hub1.b.a(hub1.c.c);
            }
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.xP, null);
        viewgroup = h();
        h = (hub)viewgroup.a(au.x);
        if (h == null)
        {
            Object obj = new huc();
            obj.a = ag.ar_();
            bundle = new Bundle();
            bundle.putLong("com.google.android.apps.photos.search.core.suggestions.subjectid", ((huc) (obj)).a);
            obj = new hub();
            ((hub) (obj)).f(bundle);
            h = ((hub) (obj));
            viewgroup.a().a(au.x, h).b();
        }
        g.d = true;
        return layoutinflater;
    }

    public final void a(fpj fpj, Rect rect)
    {
        super.R.setPadding(0, 0, 0, rect.bottom);
    }

    public final void a(hrr hrr1)
    {
        hrr1 = new huw(e.d(), ag, hrr1, new hru(ad));
        f.b.a(null, "com.goog.android.apps.photos.search.peoplelabeling-tag");
        f.a(hrr1);
    }

    public final void a(String s, mue mue1, mua mua1)
    {
label0:
        {
            if ("com.goog.android.apps.photos.search.peoplelabeling-tag".equals(s))
            {
                if (mue1 != null && !mue1.c())
                {
                    break label0;
                }
                s = ad.getString(b.xS);
                Toast.makeText(ad, s, 1).show();
            }
            return;
        }
        long l = mue1.a().getLong("com.google.android.apps.photos.search.core.suggestions.subjectid");
        int i = mue1.a().getInt("com.google.android.apps.photos.search.core.suggestions.clusterid");
        s = mue1.a().getString("com.google.android.apps.photos.search.core.suggestions.displaytext");
        mue1 = mue1.a().getString("com.google.android.apps.photos.search.core.suggestions.imageurl");
        ag.a(l);
        ag.a(i);
        ag.b(s);
        if (mue1 != null && !TextUtils.isEmpty(mue1))
        {
            ag.a(mue1);
        }
        s = new Intent();
        s.putExtra("com.google.android.apps.photos.search.core.suggestions.autocompletesuggestion", ag);
        O_().setResult(-1, s);
        O_().finish();
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        if (a == null)
        {
            c = View.inflate(ad, b.xR, null);
            a = (EditText)c.findViewById(au.A);
            a.addTextChangedListener(this);
            a.setOnEditorActionListener(this);
            if (!TextUtils.isEmpty(ag.c()))
            {
                a.setText(ag.c());
            }
            b = (ImageView)c.findViewById(au.t);
            b.setOnClickListener(new hun(this));
            rv1.a(c, new rw(-1, -1));
            rv1.d(true);
            rv1.c(false);
        }
        rv1.b(true);
        rv1.c(0);
        a.requestFocus();
        d = a.getText().toString();
        r();
    }

    public final void afterTextChanged(Editable editable)
    {
        d = editable.toString();
        r();
        if (b != null)
        {
            editable = b;
            byte byte0;
            if (TextUtils.isEmpty(d))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            editable.setVisibility(byte0);
        }
    }

    public final void b(hrr hrr1)
    {
        if (hrr1.ar_() != -1L)
        {
            htv.a(ag, hrr1, e.d()).a(h(), "peoplelabeling_merge_dialog");
            return;
        } else
        {
            a(hrr1);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        bundle = ae;
        bundle.b(dhc, this);
        bundle.a(htu, this);
        bundle.a(huh, this);
        ag = (hrr)super.q.getParcelable("com.google.android.apps.photos.search.core.suggestions.autocompletesuggestion");
        e = (mmr)ae.a(mmr);
        f = (mtj)ae.a(mtj);
        f.a(this);
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (!TextUtils.isEmpty(d))
        {
            a(new hse(d, d));
        }
        return true;
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final am u()
    {
        am am1 = h().a(au.x);
        if (am1 == null)
        {
            return this;
        } else
        {
            return am1;
        }
    }
}
