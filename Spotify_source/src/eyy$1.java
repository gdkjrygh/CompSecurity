// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.Locale;

final class ang.Object
    implements an
{

    private eyy a;

    public final da a(Bundle bundle)
    {
        bundle = dtg.a(eyy.f(a));
        return new cu(a.k(), bundle, dnw.a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Object obj1;
        obj1 = null;
        obj = (Cursor)obj;
        ((Cursor) (obj)).moveToFirst();
        if (((Cursor) (obj)).isAfterLast()) goto _L2; else goto _L1
_L1:
        eyz eyz1;
        dnw dnw1;
        int i;
        int j;
        if (!eyy.a(a).d())
        {
            eyy.a(a).b();
        }
        eyy.a(a, new dnw());
        eyy.b(a).a(((Cursor) (obj)));
        eyz1 = eyy.c(a);
        dnw1 = eyy.b(a);
        obj = dnw1.h();
        ((djr)eyz1.b.f.a()).a(((CharSequence) (obj)));
        obj = dnw1.e();
        eyz1.e.a(3, ((fzv) (eyz1)).p.getString(0x7f08006e, new Object[] {
            obj
        }));
        Object obj2 = eyz1.b;
        obj2.i = ((String) (obj));
        ((djr)((ezb) (obj2)).f.a()).b(((ezb) (obj2)).a.getString(0x7f08006a, new Object[] {
            obj
        }).toUpperCase(Locale.getDefault()));
        ((ezb) (obj2)).g.c(((String) (obj)).toUpperCase(Locale.getDefault()));
        obj = dnw1.g();
        eyz1.f = ((String) (obj));
        eyz1.b.h = ((String) (obj));
        eyz1.d.a(0x7f11005f, null, eyz1.l);
        obj2 = dnw1.k();
        obj = eyz1.b;
        obj2 = dto.a(((String) (obj2)));
        Object obj3 = ((ezb) (obj)).l;
        android.widget.ImageView imageview = ((ezb) (obj)).f.c();
        gve gve = ((ezb) (obj)).f.g();
        ((gji) (obj3)).a(imageview, ((android.net.Uri) (obj2)), dff.b(((gji) (obj3)).a), null, gve);
        ((ezb) (obj)).l.a(((ezb) (obj)).f.d(), ((android.net.Uri) (obj2)));
        CoverImageActivity.a((Activity)((ezb) (obj)).a, ((ezb) (obj)).f.c(), ((android.net.Uri) (obj2)));
        obj = dnw1.j();
        eyz1.b.g.a(((String) (obj)));
        obj = dnw1.l();
        String as[] = ((String) (obj)).split("\n");
        obj3 = new StringBuilder(((String) (obj)).length());
        j = as.length;
        i = 0;
        for (obj = obj1; i < j; obj = obj1)
        {
            obj1 = as[i];
            if (!((String) (obj1)).equals(obj))
            {
                if (((StringBuilder) (obj3)).length() != 0)
                {
                    ((StringBuilder) (obj3)).append('\n');
                }
                ((StringBuilder) (obj3)).append(((String) (obj1)));
            }
            i++;
        }

        obj = ((StringBuilder) (obj3)).toString();
        eyz1.c.setText(((CharSequence) (obj)));
        obj = dnw1.a(eyz1.m);
        i = dnw1.b();
        j = dnw1.d();
        obj1 = eyz1.b;
        obj1.d = ((CollectionState) (obj));
        if (((ezb) (obj1)).c == null) goto _L4; else goto _L3
_L3:
        a[((CollectionState) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 560
    //                   1 772
    //                   2 793
    //                   3 814;
           goto _L5 _L6 _L7 _L8
_L5:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_814;
_L4:
        eyz1.j.a(new evo(i, j, ((CollectionState) (obj))));
        obj1 = dnw1.g();
        String s = dnw1.m();
        obj = eyz1.b;
        boolean flag;
        boolean flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((ezb) (obj)).a();
        } else
        {
            android.net.Uri uri = dto.a(s);
            ((ezb) (obj)).l.c(((ezb) (obj)).g.b, uri);
        }
        flag1 = dnw1.f();
        obj = eyz1.b;
        obj1 = ((ezb) (obj)).g;
        if (flag1 && SpotifyLink.b(((ezb) (obj)).h))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gbg) (obj1)).a(flag);
        if (!flag1)
        {
            ((ezb) (obj)).a();
        }
        obj = eyy.b(a).b;
        if (!((String) (obj)).equals(eyy.d(a)))
        {
            eyy.a(a, ((String) (obj)));
            a.g().putString("title", eyy.d(a));
            ((fpe)a.k()).a(a, eyy.d(a));
        }
        ((fpe)a.k()).P_();
        eyy.e(a).b();
_L2:
        return;
_L6:
        ((ezb) (obj1)).c.setText(0x7f080160);
        ((ezb) (obj1)).c.setChecked(false);
          goto _L4
_L7:
        ((ezb) (obj1)).c.setText(0x7f08015f);
        ((ezb) (obj1)).c.setChecked(false);
          goto _L4
        ((ezb) (obj1)).c.setText(0x7f080161);
        ((ezb) (obj1)).c.setChecked(true);
          goto _L4
    }

    (eyy eyy1)
    {
        a = eyy1;
        super();
    }
}
