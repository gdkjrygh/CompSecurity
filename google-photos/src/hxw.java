// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.LinkedList;

public class hxw
    implements TextWatcher, android.view.View.OnFocusChangeListener, android.widget.TextView.OnEditorActionListener, dhc, ftx, nug, omb, opl, opn, opr, ops, opt, opv
{

    private static final msm d;
    public EditText a;
    TextView b;
    ImageButton c;
    private final hqv e;
    private am f;
    private hxn g;
    private hsq h;
    private Context i;
    private String j;
    private View k;

    public hxw(opd opd1, am am1, hqv hqv1)
    {
        opd1.a(this);
        f = am1;
        e = hqv1;
    }

    static EditText a(hxw hxw1)
    {
        return hxw1.a;
    }

    private void a(int l)
    {
        mry.a(i, l, (new msn()).a(d).a(i));
    }

    private void a(String s, boolean flag)
    {
        if (flag && s != null)
        {
            hxn hxn1 = g;
            s = s.trim();
            hxn1.a.a(hxn1);
            hxn1.a.a(s.toString(), 30, 0);
            return;
        } else
        {
            g.r();
            return;
        }
    }

    static am b(hxw hxw1)
    {
        return hxw1.f;
    }

    public final void X_()
    {
        e();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        i = context;
        h = (hsq)olm1.a(hsq);
        h.a.a(this, false);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            j = bundle.getString("search_query_key", "");
        }
        g = (hxn)f.h().a(c.eS);
        if (g == null)
        {
            g = new hxn();
            f.h().a().a(c.eS, g).b();
        }
    }

    public final void a(RecyclerView recyclerview, int l)
    {
    }

    public final void a(String s)
    {
        if (a == null || !TextUtils.isEmpty(s) && s.startsWith("#"))
        {
            return;
        } else
        {
            j = s;
            a.setText(s);
            return;
        }
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        if (a == null)
        {
            k = View.inflate(i, b.yk, null);
            a = (EditText)k.findViewById(c.eW);
            if (!TextUtils.isEmpty(j))
            {
                a.setText(j);
            }
            a.setOnEditorActionListener(this);
            a.addTextChangedListener(this);
            a.setOnFocusChangeListener(this);
            b = (TextView)k.findViewById(c.eX);
            c = (ImageButton)k.findViewById(c.eF);
            c.setOnClickListener(new hxx(this));
            rv1.a(k, new rw(-1, -1));
            rv1.d(true);
            rv1.c(false);
        }
        rv1.b(true);
        rv1.c(0);
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag = false;
        j = editable.toString();
        if (c != null)
        {
            editable = c;
            byte byte0;
            if (TextUtils.isEmpty(j))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            editable.setVisibility(byte0);
        }
        if (a.findFocus() != null)
        {
            flag = true;
        }
        a(j, flag);
    }

    public final void al_()
    {
        a(j);
    }

    public final void b(RecyclerView recyclerview, int l)
    {
        if (a != null && a.hasFocus())
        {
            a.clearFocus();
        }
    }

    public final void b_(Object obj)
    {
        obj = ((hsq)obj).b();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            e();
            p.a(obj);
            if (!((CharSequence) (obj)).toString().trim().startsWith("#"))
            {
                hwy hwy1 = g.a.a;
                String s = ((CharSequence) (obj)).toString().trim().replaceAll("\\s+", " ");
                if (s.length() <= 1000)
                {
                    hwy1.d.add(0, s);
                    for (; hwy1.d.size() > 200; hwy1.d.removeLast()) { }
                    hwy1.b.a(new hxa(hwy1, hwy1.c, "file_write"));
                }
            }
            a(((String) (obj)));
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int l, int i1, int j1)
    {
    }

    public final void c()
    {
        h.a.a(this);
    }

    public final void d()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.setVisibility(0);
            c.setVisibility(0);
            b.setVisibility(8);
            return;
        }
    }

    public void e()
    {
        f.R.requestFocus();
    }

    public final void e(Bundle bundle)
    {
        bundle.putString("search_query_key", j);
    }

    public boolean onEditorAction(TextView textview, int l, KeyEvent keyevent)
    {
        a(5);
        if (!TextUtils.isEmpty(j))
        {
            textview = h;
            textview.b = j;
            textview.c = null;
            ((hsq) (textview)).a.b();
        }
        return true;
    }

    public void onFocusChange(View view, boolean flag)
    {
        a(a.getText().toString(), flag);
        view = e;
        if (((hqv) (view)).e != flag)
        {
            view.e = flag;
            if (((hqv) (view)).f)
            {
                if (((hqv) (view)).e)
                {
                    view.g();
                } else
                {
                    view.h();
                }
            }
        }
        if (flag)
        {
            a(4);
            return;
        } else
        {
            b.f(a);
            g.r();
            return;
        }
    }

    public void onTextChanged(CharSequence charsequence, int l, int i1, int j1)
    {
    }

    static 
    {
        d = new msm(pwr.u);
    }
}
