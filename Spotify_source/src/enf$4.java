// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import java.util.Locale;

final class ang.Object
    implements an
{

    private enf a;

    public final da a(Bundle bundle)
    {
        bundle = dti.c(enf.f(a));
        return new cu(a.k(), bundle, enf.H(), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        enf.p(a).a(Integer.valueOf(0), ((Cursor) (obj)));
        if (!((Cursor) (obj)).moveToFirst() || !duc.a(((Cursor) (obj))))
        {
            return;
        }
        enf.a(a, ((Cursor) (obj)));
        boolean flag = TextUtils.isEmpty(enf.q(a));
        enf.a(a, gcw.a(((Cursor) (obj)), 0, enf.r(a)));
        enf.b(a, ((Cursor) (obj)).getString(1));
        enf.c(a, ((Cursor) (obj)).getString(9));
        enf.d(a, ((Cursor) (obj)).getString(10));
        enf.b(a, gcw.a(((Cursor) (obj)), 15));
        dmz.a(gjj);
        gji gji1 = gjj.a(a.k());
        enf.e(a, ((Cursor) (obj)).getString(12));
        if (enf.c(a) != null)
        {
            android.net.Uri uri = dto.a(enf.s(a));
            gji1.a(enf.c(a).d(), uri);
            gji1.e(enf.c(a).c(), uri);
            enf.c(a).c().setScaleType(android.widget.iew.ScaleType.CENTER_CROP);
            CoverImageActivity.a(a.k(), enf.c(a).c(), uri);
            ImageView imageview = enf.t(a).d();
            if (imageview.getVisibility() == 0)
            {
                gji1.e(imageview, uri);
            }
        }
        if (flag)
        {
            enf.u(a);
        }
        if (enf.c(a) != null)
        {
            ((djr)enf.c(a).a()).b(a.k().getString(0x7f08006a, new Object[] {
                enf.k(a)
            }).toUpperCase(Locale.getDefault()));
            enf.v(a).c(enf.k(a).toUpperCase(Locale.getDefault()));
            enf.v(a).a(gcw.a(((Cursor) (obj)), 13, ""));
            String s1 = ((Cursor) (obj)).getString(14);
            ImageView imageview1 = enf.v(a).b;
            if (!TextUtils.equals(enf.w(a), s1) || !TextUtils.isEmpty(s1) && imageview1.getDrawable() == null)
            {
                enf.f(a, s1);
                gji1.c(imageview1, dto.a(s1));
            }
        }
        enf.a(a, ((Cursor) (obj)).getInt(7));
        flag = gcw.a(((Cursor) (obj)), 8);
        enf.a(a, CollectionState.a(enf.a(a), enf.x(a), flag));
        enf.i(a);
        enf.y(a);
        enf.b(a, ((Cursor) (obj)).getInt(2));
        enf.c(a, ((Cursor) (obj)).getInt(3));
        enf.c(a, gcw.a(((Cursor) (obj)), 4));
        enf.d(a, gcw.a(((Cursor) (obj)), 6));
        a.g().putString("title", enf.r(a));
        if (enf.c(a) == null)
        {
            ((fpe)a.k()).a(a, enf.r(a));
        } else
        {
            String s = enf.r(a);
            ((djr)enf.c(a).a()).a(s);
        }
        enf.e(a, gcw.a(((Cursor) (obj)), 5));
        enf.f(a, gcw.a(((Cursor) (obj)), 11));
        if (!gbx.a(enf.k(a)) && enf.z(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (enf.c(a) != null)
        {
            enf.v(a).a(flag);
        }
        ((fpe)a.k()).P_();
        enf.A(a);
    }

    (enf enf1)
    {
        a = enf1;
        super();
    }
}
