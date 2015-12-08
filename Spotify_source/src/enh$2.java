// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver;

final class ang.Object
    implements an
{

    private enh a;

    public final da a(Bundle bundle)
    {
        bundle = dti.a(enh.l(a));
        return new cu(a.k(), bundle, enh.H(), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Cursor cursor = (Cursor)obj;
        enh.u(a).a(Integer.valueOf(0), cursor);
        if (!cursor.moveToFirst() || !duc.a(cursor))
        {
            return;
        }
        enh.a(a, cursor);
        boolean flag = TextUtils.isEmpty(enh.i(a));
        enh.a(a, gcw.a(cursor, 0, enh.d(a)));
        enh.b(a, cursor.getString(1));
        enh.c(a, cursor.getString(8));
        if (enh.a(a) != null)
        {
            android.net.Uri uri = dto.a(enh.v(a));
            dmz.a(gjj);
            gji gji1 = gjj.a(a.k());
            gji1.a(enh.a(a).d(), uri);
            ImageView imageview = enh.a(a).c();
            gve gve = enh.a(a).g();
            if (dgn.a(imageview.getContext()))
            {
                obj = null;
            } else
            {
                obj = dfo.a();
            }
            gji1.a(imageview, uri, dff.a(gji1.a), ((dfv) (obj)), gve);
            enh.a(a).c().setScaleType(android.widget.iew.ScaleType.CENTER_CROP);
        }
        if (flag)
        {
            enh.w(a);
        }
        enh.a(a, cursor.getInt(2));
        enh.b(a, cursor.getInt(3));
        enh.c(cursor.getInt(6));
        enh.c(a, cursor.getInt(7));
        enh.x(a);
        enh.b(a, gcw.a(cursor, 5));
        a.g().putString("title", enh.d(a));
        if (enh.a(a) == null)
        {
            ((fpe)a.k()).a(a, enh.d(a));
        } else
        {
            obj = enh.d(a);
            ((djr)enh.a(a).a()).a(((CharSequence) (obj)));
        }
        enh.a(a, a.b.a(enh.i(a)));
        if (enh.y(a) != null)
        {
            enh.c(a, enh.y(a).d);
        } else
        {
            enh.c(a, gcw.a(cursor, 9));
            if (enh.p(a) != null)
            {
                enh.p(a).unsubscribe();
            }
            enh.a(a, enh.r(a).a(enh.i(a)).a(((dup)dmz.a(dup)).c()).a(enh.q(a)));
        }
        a.b.a(enh.i(a), enh.z(a));
        enh.o(a);
        enh.d(a, gcw.a(cursor, 4));
        ((fpe)a.k()).P_();
        enh.A(a);
    }

    (enh enh1)
    {
        a = enh1;
        super();
    }
}
