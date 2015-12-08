// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.kik.sdkutils.LazyLoadingImage;
import kik.android.chat.KikApplication;

// Referenced classes of package com.kik.cards.usermedia:
//            CustomGalleryActivity, q

abstract class a extends CursorAdapter
{
    protected final class a
    {

        RelativeLayout a;
        ImageView b;
        LazyLoadingImage c;
        View d;
        q e;
        final CustomGalleryActivity.a f;

        protected a()
        {
            f = CustomGalleryActivity.a.this;
            super();
        }
    }


    protected int a;
    final CustomGalleryActivity b;

    protected void a(int i)
    {
        a = (b.getResources().getDisplayMetrics().widthPixels - (i + 1) * KikApplication.a(2)) / i;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030071, viewgroup, false);
        cursor = new a();
        cursor.a = (RelativeLayout)context.findViewById(0x7f0e0179);
        cursor.c = (LazyLoadingImage)context.findViewById(0x7f0e017a);
        cursor.b = (ImageView)context.findViewById(0x7f0e017c);
        cursor.d = context.findViewById(0x7f0e017b);
        cursor.e = null;
        context.setTag(cursor);
        return context;
    }

    public a.f(CustomGalleryActivity customgalleryactivity, Context context, Cursor cursor, int i)
    {
        b = customgalleryactivity;
        super(context, cursor);
        a(i);
    }
}
