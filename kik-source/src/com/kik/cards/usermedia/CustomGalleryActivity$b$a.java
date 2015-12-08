// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.kik.cache.d;
import com.kik.sdkutils.ab;
import java.util.HashMap;
import kik.android.util.cv;
import kik.android.widget.UserMediaImageThumbNailList;

// Referenced classes of package com.kik.cards.usermedia:
//            CustomGalleryActivity, q

final class c
    implements android.view.tivity.b.a
{

    final b a;
    private int b;
    private b c;

    public final void onClick(View view)
    {
        CustomGalleryActivity.g(a.a).moveToPosition(b);
        long l = CustomGalleryActivity.g(a.a).getLong(CustomGalleryActivity.g(a.a).getColumnIndexOrThrow("_id"));
        view = new q(Long.valueOf(l), CustomGalleryActivity.g(a.a).getInt(CustomGalleryActivity.g(a.a).getColumnIndexOrThrow("orientation")));
        String s = CustomGalleryActivity.g(a.a).getString(CustomGalleryActivity.g(a.a).getColumnIndexOrThrow("_data"));
        if (CustomGalleryActivity.a(a.a).remove(Long.valueOf(l)) == null && CustomGalleryActivity.a(a.a).size() < CustomGalleryActivity.h(a.a))
        {
            CustomGalleryActivity.a(a.a).put(Long.valueOf(l), new nit>(a.a, s, Long.valueOf(ab.a())));
            a.a.a(b);
        } else
        if (CustomGalleryActivity.a(a.a).size() >= CustomGalleryActivity.h(a.a))
        {
            CustomGalleryActivity.i(a.a).show();
        }
        if (CustomGalleryActivity.a(a.a).containsKey(Long.valueOf(l)))
        {
            CustomGalleryActivity.f(a.a).a(CustomGalleryActivity.j(a.a), com.kik.cards.usermedia.CustomGalleryActivity.d(a.a).c(), CustomGalleryActivity.e(a.a), view);
        } else
        {
            CustomGalleryActivity.f(a.a).a(view);
        }
        a.a.a();
        if (CustomGalleryActivity.a(a.a).containsKey(Long.valueOf(l)))
        {
            c.b.setImageResource(0x7f070048);
            cv.b(new View[] {
                c.d
            });
            return;
        } else
        {
            cv.e(new View[] {
                c.d
            });
            c.b.setImageResource(0x7f070047);
            return;
        }
    }

    public ( , int i,  1)
    {
        a = ;
        super();
        b = i;
        c = 1;
    }
}
