// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import java.util.ArrayList;
import kik.a.d.k;
import kik.a.e.r;

public class j extends ArrayAdapter
{
    public final class a
    {

        public String a;
        public ContactImageView b;
        public ImageView c;
        public TextView d;
        public TextView e;
        final j f;

        public a()
        {
            f = j.this;
            super();
        }
    }


    protected ArrayList a;
    protected final ad b;
    protected final com.kik.android.a c;
    private final LayoutInflater d;
    private final r e;

    public j(Context context, ArrayList arraylist, ad ad, r r, com.kik.android.a a1)
    {
        super(context, 0, arraylist);
        a = arraylist;
        d = LayoutInflater.from(context);
        b = ad;
        c = a1;
        e = r;
    }

    protected void a(a a1, k k1)
    {
        if (k1.g())
        {
            k1 = getContext().getString(0x7f090202);
        } else
        {
            k1 = k1.e();
        }
        a1.e.setText(k1);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = false;
        k k1 = (k)a.get(i);
        Object obj;
        if (view == null)
        {
            view = d.inflate(0x7f03006e, viewgroup, false);
            viewgroup = new a();
            viewgroup.b = (ContactImageView)view.findViewById(0x7f0e0167);
            viewgroup.c = (ImageView)view.findViewById(0x7f0e0168);
            viewgroup.d = (TextView)view.findViewById(0x7f0e016a);
            viewgroup.e = (TextView)view.findViewById(0x7f0e016b);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        if (k1.g())
        {
            obj = getContext().getString(0x7f090202);
        } else
        {
            obj = k1.c();
        }
        a(viewgroup, k1);
        viewgroup.a = k1.a().a();
        ((a) (viewgroup)).d.setText(((CharSequence) (obj)));
        ((a) (viewgroup)).b.a(k1, b, false, e, c);
        obj = ((a) (viewgroup)).c;
        if (k1.i())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        ((a) (viewgroup)).e.setContentDescription("AUTOMATION_CONTACT_USERNAME");
        ((a) (viewgroup)).d.setContentDescription("AUTOMATION_CONTACT_DISPLAY_NAME");
        return view;
    }
}
