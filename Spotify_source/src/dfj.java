// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;

public final class dfj
{

    android.content.DialogInterface.OnClickListener a;
    android.content.DialogInterface.OnClickListener b;
    private Context c;
    private int d;
    private CharSequence e;
    private CharSequence f;
    private View g;
    private CharSequence h;
    private CharSequence i;
    private android.content.DialogInterface.OnCancelListener j;
    private android.content.DialogInterface.OnDismissListener k;
    private boolean l;
    private boolean m;

    public dfj(Context context, int i1)
    {
        l = true;
        m = false;
        c = context;
        d = i1;
    }

    public final dfj a()
    {
        m = true;
        return this;
    }

    public final dfj a(int i1)
    {
        e = c.getResources().getText(i1);
        return this;
    }

    public final dfj a(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a(c.getResources().getText(i1), onclicklistener);
        return this;
    }

    public final dfj a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        j = oncancellistener;
        return this;
    }

    public final dfj a(android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        k = ondismisslistener;
        return this;
    }

    public final dfj a(View view)
    {
        g = view;
        return this;
    }

    public final dfj a(CharSequence charsequence)
    {
        e = charsequence;
        return this;
    }

    public final dfj a(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        h = charsequence;
        a = onclicklistener;
        return this;
    }

    public final dfj a(boolean flag)
    {
        l = flag;
        return this;
    }

    public final dfi b()
    {
        dfi dfi1 = new dfi(c, d);
        dfi1.setCancelable(l);
        dfi1.setOnCancelListener(j);
        dfi1.setOnDismissListener(k);
        DialogLayout dialoglayout = new DialogLayout(dfi1.getContext(), m);
        if (h != null)
        {
            dialoglayout.a(h, new android.view.View.OnClickListener(dfi1) {

                private dfi a;
                private dfj b;

                public final void onClick(View view)
                {
                    if (b.a != null)
                    {
                        b.a.onClick(a, -1);
                    }
                    a.dismiss();
                }

            
            {
                b = dfj.this;
                a = dfi1;
                super();
            }
            });
        }
        if (i != null)
        {
            dialoglayout.b(i, new android.view.View.OnClickListener(dfi1) {

                private dfi a;
                private dfj b;

                public final void onClick(View view)
                {
                    if (b.b != null)
                    {
                        b.b.onClick(a, -2);
                    }
                    a.dismiss();
                }

            
            {
                b = dfj.this;
                a = dfi1;
                super();
            }
            });
        }
        if (e != null)
        {
            dialoglayout.a(e);
        }
        if (f != null)
        {
            dialoglayout.b(f);
        }
        if (g != null)
        {
            dialoglayout.a(g);
        }
        dfi.a(dfi1, dialoglayout.a);
        dfi1.setContentView(dialoglayout);
        return dfi1;
    }

    public final dfj b(int i1)
    {
        f = c.getResources().getText(i1);
        return this;
    }

    public final dfj b(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        b(c.getResources().getText(i1), onclicklistener);
        return this;
    }

    public final dfj b(CharSequence charsequence)
    {
        f = charsequence;
        return this;
    }

    public final dfj b(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        i = charsequence;
        b = onclicklistener;
        return this;
    }
}
