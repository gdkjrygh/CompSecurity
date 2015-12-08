// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

public class gfv
    implements mti, omb, opv
{

    public mtj a;
    private final am b;
    private Context c;
    private noe d;
    private nfw e;
    private npk f;
    private jdr g;
    private egp h;

    public gfv(am am1, opd opd1)
    {
        b = am1;
        opd1.a(this);
    }

    private nog a(ekp ekp1)
    {
        String s = ((hpg)ekp1.a(hpg)).b().c;
        Object obj = e;
        b.u();
        int i = ((nfw) (obj)).b;
        obj = (new jed((jdy)ekp1.a(jdy), f, g)).a();
        ekp1 = null;
        if (obj != null)
        {
            ekp1 = ((jea) (obj)).a;
        }
        return (new nog(c)).a().a(s).a(ekp1).b(i);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        e = (nfw)olm1.a(nfw);
        a = ((mtj)olm1.a(mtj)).a(this);
        d = (noe)olm1.a(noe);
        f = (npk)olm1.a(npk);
        g = (jdr)olm1.a(jdr);
        h = (egp)olm1.a(egp);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        boolean flag1;
        for (flag1 = false; mue1 == null || s == null || !"GetMovieMediaTask".equals(s);)
        {
            return;
        }

        if (mue1.c())
        {
            s = c.getResources().getString(b.rs);
            Toast.makeText(c, s, 0).show();
            return;
        }
        mua = (ekp)mue1.a().getParcelable("extra_movie_media");
        s = (ekq)mue1.a().getParcelable("extra_movie_collection");
        boolean flag2 = mue1.a().getBoolean("extra_doorstep");
        boolean flag = flag1;
        if (d.b())
        {
            flag = flag1;
            if (d.a())
            {
                flag = flag1;
                if (!h.b())
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            if (flag2)
            {
                mue1 = a(((ekp) (mua))).a(b.rq).b("Photos assistant");
                ((nog) (mue1)).a.putExtra("aam_media_collection", s);
                s = mue1.b();
            } else
            {
                s = a(((ekp) (mua))).a(b.rr).b("Photos collections").b();
            }
            b.O_().startActivity(s);
            return;
        } else
        {
            mue1 = e;
            b.u();
            int i = ((nfw) (mue1)).b;
            s = (new gne(c, i)).a(mua).a(s).h(true);
            ((gne) (s)).a.putExtra("com.google.android.apps.photos.pager.allow_save", flag2);
            s = s.c(true).a;
            b.O_().startActivity(s);
            return;
        }
    }
}
