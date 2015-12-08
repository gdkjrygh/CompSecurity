// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.e;
import com.cardinalblue.android.piccollage.model.f;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import java.util.ArrayList;
import java.util.List;

public class j extends android.support.v7.widget.RecyclerView.Adapter
{
    public static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public a(View view)
        {
            super(view);
        }
    }

    public static interface b
    {

        public abstract void a(d d1);
    }


    private final List a = new ArrayList();
    private final b b;
    private int c;
    private int d;
    private final LayoutInflater e;
    private int f;

    public j(Context context, ArrayList arraylist, b b1)
    {
        f = -1;
        e = LayoutInflater.from(context);
        c = context.getResources().getDimensionPixelSize(0x7f0b0126);
        d = context.getResources().getDimensionPixelSize(0x7f0b0125);
        a.addAll(arraylist);
        b = b1;
    }

    static int a(j j1, int i)
    {
        j1.f = i;
        return i;
    }

    static b a(j j1)
    {
        return j1.b;
    }

    public void a(int i)
    {
        int k = 0;
        while (k < a.size()) 
        {
            if (k != f)
            {
                f f1 = com.cardinalblue.android.piccollage.model.f.a(((d)a.get(k)).f());
                ArrayList arraylist = new ArrayList();
                f1.a(i, arraylist);
                ((d)a.get(k)).a(arraylist, f1.c());
            }
            k++;
        }
    }

    public void a(int i, int k)
    {
        if (i == c && k == d)
        {
            return;
        } else
        {
            c = i;
            d = k;
            notifyDataSetChanged();
            return;
        }
    }

    public int getItemCount()
    {
        return a.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        CheckableImageView checkableimageview = (CheckableImageView)viewholder.itemView.findViewById(0x7f100235);
        float f1 = (float)d / (float)c;
        if (f1 != checkableimageview.getAspectRatio())
        {
            checkableimageview.setAspectRatio(f1);
            checkableimageview.requestLayout();
        }
        d d1 = (d)a.get(i);
        android.graphics.Bitmap bitmap = (new e(d1.h(), (int)d1.e())).a(c, d);
        if (bitmap != null)
        {
            checkableimageview.setImageBitmap(bitmap);
        }
        boolean flag;
        if (f == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkableimageview.setChecked(flag);
        viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener(i, d1) {

            final int a;
            final d b;
            final j c;

            public void onClick(View view)
            {
                j.a(c, a);
                if (j.a(c) != null)
                {
                    j.a(c).a(b);
                }
            }

            
            {
                c = j.this;
                a = i;
                b = d1;
                super();
            }
        });
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a(e.inflate(0x7f0300f6, viewgroup, false));
    }
}
