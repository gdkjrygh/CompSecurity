// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.widget.CursorAdapter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.aviary.android.feather.sdk.a.a;
import it.sephiroth.android.library.picasso.Picasso;
import it.sephiroth.android.library.picasso.c;
import it.sephiroth.android.library.picasso.n;
import java.io.File;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            IAPDialogDetail, AviaryWorkspace, CellLayout

class a extends CursorAdapter
{

    LayoutInflater a;
    int b;
    String c;
    String d;
    int e;
    int f;
    int g;
    int h;
    final IAPDialogDetail i;

    private void a(Cursor cursor)
    {
        if (cursor != null)
        {
            g = cursor.getColumnIndex("item_displayName");
            h = cursor.getColumnIndex("item_identifier");
            f = cursor.getColumnIndex("pack_type");
        }
    }

    private void c()
    {
        com.aviary.android.feather.sdk.widget.IAPDialogDetail.c().c("recycleBitmaps");
        int l = com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getChildCount();
        for (int j = 0; j < l; j++)
        {
            CellLayout celllayout = (CellLayout)com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getChildAt(j);
            int i1 = celllayout.getChildCount();
            for (int k = 0; k < i1; k++)
            {
                Object obj = (ImageView)celllayout.getChildAt(k);
                if (obj == null)
                {
                    continue;
                }
                android.graphics.drawable.Drawable drawable = ((ImageView) (obj)).getDrawable();
                if (drawable == null || !(drawable instanceof BitmapDrawable))
                {
                    continue;
                }
                ((ImageView) (obj)).setImageBitmap(null);
                obj = ((BitmapDrawable)drawable).getBitmap();
                if (obj != null && !((Bitmap) (obj)).isRecycled())
                {
                    ((Bitmap) (obj)).recycle();
                }
            }

        }

    }

    public String a()
    {
        return c;
    }

    public void a(int j)
    {
        b = j;
    }

    public void a(int j, int k, ImageView imageview, boolean flag, int l, int i1)
    {
        Object obj = (Cursor)getItem(k);
        if (obj != null && !((Cursor) (obj)).isAfterLast() && imageview != null)
        {
            String s1 = ((Cursor) (obj)).getString(h);
            String s = ((Cursor) (obj)).getString(g);
            obj = ((Cursor) (obj)).getString(f);
            s1 = (new File(a(), (new StringBuilder()).append(s1).append(d).toString())).getAbsolutePath();
            l = s1.hashCode();
            Integer integer = (Integer)imageview.getTag();
            if (integer != null && integer.equals(Integer.valueOf(l)))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (flag)
            {
                if (k == 0)
                {
                    imageview.setTag(null);
                    imageview.setImageBitmap(null);
                }
            } else
            if (k == 0)
            {
                IAPDialogDetail.d(i).a(s1).b(j).c().a(com.aviary.android.feather.sdk.ic_na).a(new a(s1, s, ((String) (obj)))).a(imageview, new c(imageview, l) {

                    final ImageView a;
                    final int b;
                    final IAPDialogDetail.d c;

                    public void a()
                    {
                        a.setTag(Integer.valueOf(b));
                    }

                    public void b()
                    {
                    }

            
            {
                c = IAPDialogDetail.d.this;
                a = imageview;
                b = j;
                super();
            }
                });
                return;
            }
        }
    }

    public void a(Context context)
    {
        mContext = context;
    }

    public void a(String s)
    {
        c = s;
    }

    public int b()
    {
        return super.getCount();
    }

    public void b(String s)
    {
        d = s;
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        int k = cursor.getPosition() * i.c;
        cursor = (CellLayout)view;
        cursor.setNumCols(i.b);
        cursor.setNumRows(i.a);
        int j = 0;
        while (j < i.c) 
        {
            d d1 = cursor.a();
            int l;
            int i1;
            if (d1 == null)
            {
                context = cursor.getChildAt(j);
            } else
            {
                context = a.inflate(IAPDialogDetail.b(i), com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i), false);
                cursor.addView(context, -1, new >(d1.>, d1.>, d1.>, d1.>));
            }
            context = (ImageView)context.findViewById(com.aviary.android.feather.sdk.a.e);
            l = com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getWidth() / i.b;
            i1 = com.aviary.android.feather.sdk.widget.IAPDialogDetail.a(i).getHeight() / i.a;
            if (k + j < b())
            {
                a(j * 60, k + j, context, com.aviary.android.feather.sdk.widget.IAPDialogDetail.c(i), l, i1);
            } else
            if (context != null)
            {
                context.setImageBitmap(null);
            }
            j++;
        }
        view.requestLayout();
    }

    public int getCount()
    {
        return (int)Math.ceil((double)super.getCount() / (double)i.c);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return a.inflate(b, viewgroup, false);
    }

    public Cursor swapCursor(Cursor cursor)
    {
        a(cursor);
        c();
        return super.swapCursor(cursor);
    }

    public _cls1.b(IAPDialogDetail iapdialogdetail, Context context, String s, int j, Cursor cursor)
    {
        i = iapdialogdetail;
        super(context, cursor, false);
        b = j;
        a = LayoutInflater.from(iapdialogdetail.getContext());
        c = s;
        e = context.getResources().getDisplayMetrics().densityDpi;
        a(cursor);
    }
}
