// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import com.kik.m.d;
import kik.a.d.k;
import kik.a.e.r;

public class ContactsCursorAdapter extends CursorAdapter
{
    public static final class a
    {

        public String a;
        public ContactImageView b;
        public ImageView c;
        public TextView d;
        public TextView e;
        public ImageView f;
        public ImageView g;

        public a()
        {
        }
    }


    protected final ad a;
    protected final com.kik.android.a b;
    protected final r c;
    private final LayoutInflater d;
    private final boolean e;
    private final boolean f;

    public ContactsCursorAdapter(Context context, Cursor cursor, boolean flag, boolean flag1, ad ad, r r1, com.kik.android.a a1)
    {
        super(context, cursor, 0);
        e = flag;
        d = LayoutInflater.from(context);
        f = flag1;
        a = ad;
        b = a1;
        c = r1;
    }

    protected int a()
    {
        return 0x7f03006e;
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        int i = 0;
        a a1 = (a)view.getTag();
        int j = cursor.getColumnIndex("suggest_intent_data_id");
        if (j == -1)
        {
            return;
        }
        int l = cursor.getColumnIndex("suggest_text_1");
        int i1 = cursor.getColumnIndex("suggest_text_2");
        Object obj = cursor.getString(j);
        String s;
        if (l != -1)
        {
            s = cursor.getString(l);
        } else
        {
            s = context.getString(0x7f090346);
        }
        if (i1 != -1)
        {
            context = cursor.getString(i1);
        } else
        {
            context = context.getString(0x7f090346);
        }
        a1.a = ((String) (obj));
        cursor = c.a(((String) (obj)), true);
        if (f)
        {
            a1.b.a(null, a, false, c, b);
        } else
        {
            a1.b.a(cursor, a, false, c, b);
        }
        obj = a1.c;
        if (!cursor.i())
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        a1.d.setText(s);
        a1.e.setText(context);
        if (a1.g != null)
        {
            a1.g.setVisibility(8);
        }
        com.kik.m.d.a(view, (new StringBuilder("AUTOMATION_SELECT_USER_")).append(context.toUpperCase()).toString());
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getCursor() != null && getCursor().isClosed())
        {
            if (view != null)
            {
                return view;
            } else
            {
                return newView(mContext, getCursor(), viewgroup);
            }
        } else
        {
            return super.getView(i, view, viewgroup);
        }
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return getCount() == 0 && e;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = d.inflate(a(), viewgroup, false);
        cursor = new a();
        cursor.b = (ContactImageView)context.findViewById(0x7f0e0167);
        cursor.c = (ImageView)context.findViewById(0x7f0e0168);
        cursor.d = (TextView)context.findViewById(0x7f0e016a);
        cursor.e = (TextView)context.findViewById(0x7f0e016b);
        viewgroup = context.findViewById(0x7f0e016c);
        if (viewgroup != null)
        {
            cursor.f = (ImageView)viewgroup;
        }
        context.setTag(cursor);
        return context;
    }
}
