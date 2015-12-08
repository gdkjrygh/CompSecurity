// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.kik.cache.d;
import com.kik.sdkutils.LazyLoadingImage;
import com.kik.sdkutils.ab;
import java.util.HashMap;
import java.util.Map;
import kik.android.util.cv;
import kik.android.widget.UserMediaImageThumbNailList;

// Referenced classes of package com.kik.cards.usermedia:
//            CustomGalleryActivity, q

final class d extends d
{
    final class a
        implements android.view.View.OnClickListener
    {

        final CustomGalleryActivity.b a;
        private int b;
        private CustomGalleryActivity.a.a c;

        public final void onClick(View view)
        {
            CustomGalleryActivity.g(a.e).moveToPosition(b);
            long l = CustomGalleryActivity.g(a.e).getLong(CustomGalleryActivity.g(a.e).getColumnIndexOrThrow("_id"));
            view = new q(Long.valueOf(l), CustomGalleryActivity.g(a.e).getInt(CustomGalleryActivity.g(a.e).getColumnIndexOrThrow("orientation")));
            String s = CustomGalleryActivity.g(a.e).getString(CustomGalleryActivity.g(a.e).getColumnIndexOrThrow("_data"));
            if (CustomGalleryActivity.a(a.e).remove(Long.valueOf(l)) == null && CustomGalleryActivity.a(a.e).size() < CustomGalleryActivity.h(a.e))
            {
                CustomGalleryActivity.a(a.e).put(Long.valueOf(l), new CustomGalleryActivity.d(a.e, s, Long.valueOf(ab.a())));
                a.e.a(b);
            } else
            if (CustomGalleryActivity.a(a.e).size() >= CustomGalleryActivity.h(a.e))
            {
                CustomGalleryActivity.i(a.e).show();
            }
            if (CustomGalleryActivity.a(a.e).containsKey(Long.valueOf(l)))
            {
                CustomGalleryActivity.f(a.e).a(CustomGalleryActivity.j(a.e), com.kik.cards.usermedia.CustomGalleryActivity.d(a.e).c(), CustomGalleryActivity.e(a.e), view);
            } else
            {
                CustomGalleryActivity.f(a.e).a(view);
            }
            a.e.a();
            if (CustomGalleryActivity.a(a.e).containsKey(Long.valueOf(l)))
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

        public a(int i, CustomGalleryActivity.a.a a1)
        {
            a = CustomGalleryActivity.b.this;
            super();
            b = i;
            c = a1;
        }
    }


    Map c;
    int d;
    final CustomGalleryActivity e;

    protected final void a(int i)
    {
        super.a(i);
        d = i;
    }

    public final void a(q q1)
    {
        if (q1 != null)
        {
            CustomGalleryActivity.a(e).remove(q1.a());
        }
        CustomGalleryActivity.f(e).a(q1);
        if (c.containsKey(q1))
        {
            q1 = (a)c.get(q1);
            ((a) (q1)).b.setImageResource(0x7f070047);
            cv.e(new View[] {
                ((a) (q1)).d
            });
        }
        e.a();
    }

    public final void bindView(View view, Context context, Cursor cursor)
    {
        view = (a)view.getTag();
        if (((a) (view)).e != null)
        {
            c.remove(((a) (view)).e);
        }
        int i = cursor.getPosition();
        long l = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        context = new q(Long.valueOf(l), cursor.getInt(cursor.getColumnIndexOrThrow("orientation")));
        ((a) (view)).c.a(context, com.kik.cards.usermedia.CustomGalleryActivity.d(e), com.kik.cards.usermedia.CustomGalleryActivity.d(e).c(), CustomGalleryActivity.e(e));
        ((a) (view)).a.setOnClickListener(new a(i, view));
        cursor = (android.widget.)((a) (view)).a.getLayoutParams();
        cursor.width = a;
        cursor.height = a;
        ((a) (view)).a.setLayoutParams(cursor);
        view.e = context;
        c.put(context, view);
        if (CustomGalleryActivity.a(e).containsKey(Long.valueOf(l)))
        {
            ((a) (view)).b.setImageResource(0x7f070048);
            cv.b(new View[] {
                ((a) (view)).d
            });
            return;
        } else
        {
            ((a) (view)).b.setImageResource(0x7f070047);
            cv.e(new View[] {
                ((a) (view)).d
            });
            return;
        }
    }

    public a.c(CustomGalleryActivity customgalleryactivity, Context context, Cursor cursor, int i)
    {
        e = customgalleryactivity;
        super(customgalleryactivity, context, cursor, i);
        c = new HashMap();
        d = 0;
        d = i;
    }
}
