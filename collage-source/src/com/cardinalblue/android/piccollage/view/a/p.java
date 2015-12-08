// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.CustomFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import com.bumptech.glide.request.e;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.events.h;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.a.a;
import java.io.File;

public class p extends CustomFragmentStatePagerAdapter
{
    public static class a extends Fragment
    {

        private Collage a;
        private int b;
        private View c;

        static Collage a(a a1)
        {
            return a1.a;
        }

        public void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
            a = (Collage)getArguments().getParcelable("extra_collage");
            b = getArguments().getInt("position", -1);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            layoutinflater = layoutinflater.inflate(0x7f03012d, viewgroup, false);
            bundle = k.t();
            viewgroup = (ImageView)layoutinflater.findViewById(0x7f10026e);
            android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
            layoutparams.width = ((Point) (bundle)).x;
            int l;
            if (a.y())
            {
                l = ((Point) (bundle)).x;
            } else
            {
                l = ((Point) (bundle)).y;
            }
            layoutparams.height = l;
            viewgroup.setLayoutParams(layoutparams);
            viewgroup.setOnClickListener(new android.view.View.OnClickListener(this) {

                final a a;

                public void onClick(View view)
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new h(1, com.cardinalblue.android.piccollage.view.a.a.a(a)));
                }

            
            {
                a = a1;
                super();
            }
            });
            layoutinflater.findViewById(0x7f10026f).setOnClickListener(new android.view.View.OnClickListener(this) {

                final a a;

                public void onClick(View view)
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new h(2, com.cardinalblue.android.piccollage.view.a.a.a(a)));
                }

            
            {
                a = a1;
                super();
            }
            });
            c = layoutinflater.findViewById(0x7f10026f);
            bundle = layoutinflater.findViewById(0x7f10019b);
            bundle.setVisibility(0);
            g.a(getActivity()).a(a.q()).l().a(i.a).c().d().a(true).a(com.bumptech.glide.load.engine.b.b).a(new e(this, bundle, viewgroup) {

                final View a;
                final ImageView b;
                final a c;

                public boolean a(Bitmap bitmap, File file, com.bumptech.glide.request.b.j j, boolean flag, boolean flag1)
                {
                    a.setVisibility(8);
                    bitmap = b.getLayoutParams();
                    bitmap.height = -2;
                    b.setLayoutParams(bitmap);
                    return false;
                }

                public boolean a(Exception exception, File file, com.bumptech.glide.request.b.j j, boolean flag)
                {
                    f.a(exception);
                    return false;
                }

                public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j, boolean flag)
                {
                    return a(exception, (File)obj, j, flag);
                }

                public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j, boolean flag, boolean flag1)
                {
                    return a((Bitmap)obj, (File)obj1, j, flag, flag1);
                }

            
            {
                c = a1;
                a = view;
                b = imageview;
                super();
            }
            }).a(viewgroup);
            return layoutinflater;
        }

        public void onPageSelected(com.cardinalblue.android.piccollage.events.i l)
        {
label0:
            {
                if (c != null)
                {
                    if (b == l.b && l.a)
                    {
                        break label0;
                    }
                    c.setVisibility(8);
                }
                return;
            }
            c.setVisibility(0);
            k.a(getActivity(), a.p());
        }

        public void onStart()
        {
            super.onStart();
            com.cardinalblue.android.piccollage.controller.d.a().a(this);
        }

        public void onStop()
        {
            super.onStop();
            com.cardinalblue.android.piccollage.controller.d.a().b(this);
        }

        public a()
        {
        }
    }

    public static class b extends Fragment
    {

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            bundle = k.t();
            layoutinflater = layoutinflater.inflate(0x7f030145, viewgroup, false);
            viewgroup = layoutinflater.findViewById(0x7f10016c);
            android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
            layoutparams.width = ((Point) (bundle)).x;
            layoutparams.height = ((Point) (bundle)).y;
            viewgroup.setLayoutParams(layoutparams);
            layoutinflater.findViewById(0x7f10029d).setOnClickListener(new android.view.View.OnClickListener(this) {

                final b a;

                public void onClick(View view)
                {
                    com.cardinalblue.android.piccollage.a.b.aM("grid");
                    com.cardinalblue.android.piccollage.a.b.bk();
                    com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.fragments.v.b());
                }

            
            {
                a = b1;
                super();
            }
            });
            layoutinflater.findViewById(0x7f10029f).setOnClickListener(new android.view.View.OnClickListener(this) {

                final b a;

                public void onClick(View view)
                {
                    com.cardinalblue.android.piccollage.a.b.c();
                    com.cardinalblue.android.piccollage.a.b.a("gallery template");
                    com.cardinalblue.android.piccollage.a.b.aM("empty");
                    com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.fragments.v.a());
                }

            
            {
                a = b1;
                super();
            }
            });
            layoutinflater.findViewById(0x7f10029e).setOnClickListener(new android.view.View.OnClickListener(this) {

                final b a;

                public void onClick(View view)
                {
                    com.cardinalblue.android.piccollage.a.b.bj();
                    com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.fragments.v.c());
                }

            
            {
                a = b1;
                super();
            }
            });
            return layoutinflater;
        }

        public b()
        {
        }
    }


    private Cursor a;

    public p(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public int a()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getCount();
        }
    }

    public int a(long l)
    {
        Cursor cursor;
        Object obj;
        int i;
        i = 0;
        obj = com.cardinalblue.android.piccollage.model.a.a.a(k.a());
        cursor = null;
        obj = ((com.cardinalblue.android.piccollage.model.a.a) (obj)).a(new String[] {
            "_id"
        });
        cursor = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = ((Cursor) (obj));
        if (((Cursor) (obj)).isAfterLast()) goto _L2; else goto _L3
_L3:
        cursor = ((Cursor) (obj));
        ContentValues contentvalues = new ContentValues();
        cursor = ((Cursor) (obj));
        DatabaseUtils.cursorRowToContentValues(((Cursor) (obj)), contentvalues);
        cursor = ((Cursor) (obj));
        long l1 = contentvalues.getAsLong("_id").longValue();
        if (l != l1) goto _L5; else goto _L4
_L4:
        int j;
        j = i;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            j = i;
        }
_L7:
        return j;
_L5:
        cursor = ((Cursor) (obj));
        ((Cursor) (obj)).moveToNext();
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        cursor = ((Cursor) (obj));
        i = getCount();
        i--;
        j = i;
        if (obj == null) goto _L7; else goto _L6
_L6:
        ((Cursor) (obj)).close();
        return i;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void a(Cursor cursor)
    {
        if (a != null)
        {
            a.close();
        }
        a = cursor;
        notifyDataSetChanged();
    }

    public long b(long l)
    {
        boolean flag = false;
        Cursor cursor = com.cardinalblue.android.piccollage.model.a.a.a(k.a()).a(new String[] {
            "_id"
        });
        if (cursor.moveToFirst())
        {
            for (; !cursor.isAfterLast(); cursor.moveToNext())
            {
                ContentValues contentvalues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentvalues);
                long l1 = contentvalues.getAsLong("_id").longValue();
                if (flag)
                {
                    return l1;
                }
                if (l == l1)
                {
                    flag = true;
                }
            }

        }
        return -1L;
    }

    public int getCount()
    {
        return a() + 1;
    }

    public Fragment getItem(int i)
    {
        if (i == a())
        {
            return new b();
        } else
        {
            a a1 = new a();
            Bundle bundle = new Bundle();
            bundle.putInt("position", i);
            a.moveToPosition(i);
            bundle.putParcelable("extra_collage", Collage.a(a));
            a1.setArguments(bundle);
            return a1;
        }
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public String getItemTag(int i)
    {
        return String.valueOf(i);
    }
}
