// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            d, WebSearchActivity

public class a extends android.support.v7.widget.clerView.Adapter
{
    class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        final d.b a;

        public a(View view)
        {
            a = d.b.this;
            super(view);
        }
    }


    Context a;
    ArrayList b;
    final d c;

    public void a()
    {
        b.clear();
    }

    public void a(Collection collection)
    {
        b.addAll(collection);
    }

    public int getItemCount()
    {
        return b.size();
    }

    public void onBindViewHolder(android.support.v7.widget.clerView.ViewHolder viewholder, int i)
    {
        String s = (String)b.get(i);
        viewholder = (TextView)viewholder.itemView;
        viewholder.setText(s);
        viewholder.setOnClickListener(new android.view.View.OnClickListener(s) {

            final String a;
            final d.b b;

            public void onClick(View view)
            {
                ((WebSearchActivity)b.c.getActivity()).a(a);
            }

            
            {
                b = d.b.this;
                a = s;
                super();
            }
        });
    }

    public android.support.v7.widget.clerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a((TextView)((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f0300e6, viewgroup, false));
    }

    public _cls1.a(d d1, Context context)
    {
        c = d1;
        super();
        b = new ArrayList();
        a = context;
    }
}
