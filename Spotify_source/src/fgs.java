// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Observable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SpotifyIconView;

final class fgs extends aav
{

    private static final Object f = new Object();
    private final Context c;
    private final fgk d;
    private final fgt e;

    public fgs(Context context, fgk fgk1, fgt fgt1)
    {
        e = (fgt)ctz.a(fgt1);
        c = (Context)ctz.a(context);
        d = (fgk)ctz.a(fgk1);
        d.d().registerObserver(new fgl() {

            private fgs a;

            public final void a(int i, int j)
            {
                int k = j;
                if (i == 0)
                {
                    k = j;
                    if (j == fgs.a(a).b())
                    {
                        k = j + 1;
                    }
                }
                a.b(i, k);
            }

            public final void b(int i, int j)
            {
                int k = j;
                if (fgs.a(a).b() == 0)
                {
                    k = j + 1;
                }
                a.c(i, k);
            }

            
            {
                a = fgs.this;
                super();
            }
        });
    }

    static fgk a(fgs fgs1)
    {
        return fgs1.d;
    }

    static fgt b(fgs fgs1)
    {
        return fgs1.e;
    }

    public final int a(int i)
    {
        return i != d.b() ? 0x7f110101 : 0x7f110100;
    }

    public final abo a(ViewGroup viewgroup, int i)
    {
        i;
        JVM INSTR tableswitch 2131820800 2131820801: default 24
    //                   2131820800 162
    //                   2131820801 34;
           goto _L1 _L2 _L3
_L1:
        throw new AssertionError("Unrecognized view type");
_L3:
        viewgroup = dhv.b(c, viewgroup);
        Object obj = dgp.g(c, (ViewGroup)viewgroup.v());
        i = c.getResources().getDimensionPixelSize(0x7f0c007d);
        dfz dfz1 = new dfz(c, SpotifyIcon.ai, i);
        dfz1.a(gcg.b(c, 0x7f0f0162));
        ((SpotifyIconView) (obj)).setImageDrawable(dfz1);
        viewgroup.a(((View) (obj)));
        obj = new android.view.View.OnClickListener(viewgroup) {

            private dhu a;
            private fgs b;

            public final void onClick(View view)
            {
                int j = a.d();
                if (view == a.v())
                {
                    fgs.b(b).b(j);
                    return;
                }
                if (view == a.x())
                {
                    fgs.b(b).a(j);
                    return;
                } else
                {
                    throw new AssertionError("Unrecognized view!");
                }
            }

            
            {
                b = fgs.this;
                a = dhu1;
                super();
            }
        };
        viewgroup.x().setOnClickListener(((android.view.View.OnClickListener) (obj)));
        viewgroup.v().setOnClickListener(((android.view.View.OnClickListener) (obj)));
        viewgroup.e(true);
_L5:
        dgo.a(viewgroup.v());
        viewgroup.v().setFocusable(true);
        return viewgroup;
_L2:
        viewgroup = dhv.b(c, viewgroup);
        ((dhw)viewgroup.u()).a(c.getString(0x7f080257));
        ((dhw)viewgroup.u()).a().setTextColor(dgo.b(c, 0x7f0101d2));
        viewgroup.v().setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            private dhu a;
            private fgs b;

            public final void onClick(View view)
            {
                view = fgs.b(b);
                a.d();
                view.f();
            }

            
            {
                b = fgs.this;
                a = dhu1;
                super();
            }
        });
        viewgroup.b(f);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(abo abo, int i)
    {
        abo = (dhu)abo;
        if (abo.w() != f)
        {
            ((dhw)abo.u()).a(d.a(i));
        }
    }

    public final int b()
    {
        int i = d.b();
        if (i > 0)
        {
            return i + 1;
        } else
        {
            return 0;
        }
    }

    public final long b(int i)
    {
        String s;
        if (i == d.b())
        {
            s = "";
        } else
        {
            s = d.a(i);
        }
        return (long)s.hashCode();
    }

}
