// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import java.util.LinkedList;

public final class fgu extends gbr
{

    public final drc a;
    public final drc b;
    public final drf c;
    public final drf d;
    public final LinkedList e = new LinkedList();
    public final fyx f;
    public boolean g;

    public fgu(Context context, fyx fyx1, fgv fgv)
    {
        super(PorcelainAdapter.e().a(context));
        context = new fgw(context);
        fgx fgx1 = new fgx(context);
        fgx1.a = SpotifyIcon.s;
        fgx1.c = Integer.valueOf(0x7f08025c);
        a = drc.a("info-no-results", fgx1.a());
        fgx1 = new fgx(context);
        fgx1.a = SpotifyIcon.N;
        b = drc.a("info-start", fgx1.a());
        f = (fyx)ctz.a(fyx1);
        fyx1 = new android.view.View.OnClickListener(fgv) {

            private fgv a;

            public final void onClick(View view)
            {
                a.d();
            }

            
            {
                a = fgv1;
                super();
            }
        };
        fgx1 = new fgx(context);
        fgx1.a = SpotifyIcon.aI;
        fgx1.b = Integer.valueOf(0x7f080258);
        c = drc.a("info-error", fgx1.a(0x7f080259, fyx1).a());
        fyx1 = new android.view.View.OnClickListener(fgv) {

            private fgv a;

            public final void onClick(View view)
            {
                a.e();
            }

            
            {
                a = fgv1;
                super();
            }
        };
        context = new fgx(context);
        context.c = Integer.valueOf(0x7f08025f);
        d = drc.a("info-go-online", context.a(0x7f08025e, fyx1).a());
        e.add(b);
        ((PorcelainAdapter)super.h).a(new dpw("info", e));
    }

    public final void a(drf drf, RecyclerView recyclerview)
    {
        b(recyclerview);
        if (e.getFirst() != drf)
        {
            e.set(0, drf);
            ((PorcelainAdapter)super.h).c();
        }
    }

    final boolean a(dol dol)
    {
        return !e.isEmpty() && e.getFirst() == dol;
    }
}
