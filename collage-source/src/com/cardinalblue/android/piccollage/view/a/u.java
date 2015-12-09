// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.lib.e;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import java.util.List;

public class u extends android.support.v7.widget.RecyclerView.Adapter
{
    static abstract class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public abstract void a(int i);

        protected void a(ImageView imageview, String s, String s1)
        {
            try
            {
                com.cardinalblue.android.piccollage.lib.a.e.a(s).a(imageview);
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                imageview.setImageResource(0x7f0202c6);
                f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader for bundle [").append(s1).append("] from uri [").append(s).append("]").toString()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                imageview.setImageResource(0x7f0202c6);
            }
            f.a(s);
        }

        public abstract void a(StickerBundle stickerbundle);

        public a(View view)
        {
            super(view);
        }
    }

    static class b extends a
    {

        ImageView a;
        TextView b;

        public void a(int i)
        {
            b.setTextSize(i);
        }

        public void a(StickerBundle stickerbundle)
        {
            b.setText(stickerbundle.b());
            String s = stickerbundle.e();
            a(a, s, stickerbundle.f());
        }

        public b(View view)
        {
            super(view);
            b = (TextView)view.findViewById(0x7f1002a4);
            a = (ImageView)view.findViewById(0x7f1002a2);
        }
    }

    static class c extends a
    {

        ImageView a;
        TextView b;
        TextView c;

        public void a(int i)
        {
            b.setTextSize(i);
        }

        public void a(StickerBundle stickerbundle)
        {
            b.setText(stickerbundle.b());
            String s = o.a().b(stickerbundle);
            c.setText(s);
            s = stickerbundle.e();
            a(a, s, stickerbundle.f());
        }

        public c(View view)
        {
            super(view);
            b = (TextView)view.findViewById(0x7f1002a4);
            c = (TextView)view.findViewById(0x7f1002a3);
            a = (ImageView)view.findViewById(0x7f1002a2);
        }
    }

    static class d extends a
    {

        ImageView a;
        TextView b;
        TextView c;

        public void a(int i)
        {
            b.setTextSize(i);
        }

        public void a(StickerBundle stickerbundle)
        {
            b.setText(stickerbundle.b());
            String s = o.a().b(stickerbundle);
            c.setText(s);
            s = stickerbundle.e();
            a(a, s, stickerbundle.f());
        }

        public d(View view)
        {
            super(view);
            b = (TextView)view.findViewById(0x7f1002a4);
            c = (TextView)view.findViewById(0x7f1002a3);
            a = (ImageView)view.findViewById(0x7f1002a2);
        }
    }


    private final LayoutInflater a;
    private final int b;
    private final Object c = new Object();
    private boolean d;
    private android.widget.AdapterView.OnItemClickListener e;

    public u(Context context)
    {
        d = true;
        a = LayoutInflater.from(context);
        b = context.getResources().getDimensionPixelSize(0x7f0b0177);
    }

    static android.widget.AdapterView.OnItemClickListener a(u u1)
    {
        return u1.e;
    }

    private List a()
    {
        return o.a().a(d);
    }

    public StickerBundle a(int i)
    {
label0:
        {
            synchronized (c)
            {
                if (i < a().size())
                {
                    break label0;
                }
            }
            return null;
        }
        StickerBundle stickerbundle = (StickerBundle)a().get(i);
        obj;
        JVM INSTR monitorexit ;
        return stickerbundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public a a(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            return new d(a.inflate(0x7f030147, viewgroup, false));

        case 300: 
            return new c(a.inflate(0x7f030149, viewgroup, false));

        case 200: 
            return new b(a.inflate(0x7f030148, viewgroup, false));
        }
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        e = onitemclicklistener;
    }

    public void a(a a1, int i)
    {
        a1.itemView.setOnClickListener(new android.view.View.OnClickListener(i) {

            final int a;
            final u b;

            public void onClick(View view)
            {
                if (u.a(b) != null)
                {
                    u.a(b).onItemClick(null, view, a, 0L);
                }
            }

            
            {
                b = u.this;
                a = i;
                super();
            }
        });
        a1.a(b);
        a1.a(a(i));
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (d != flag)
        {
            d = flag;
            notifyDataSetChanged();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int getItemCount()
    {
        int i;
        synchronized (c)
        {
            i = a().size();
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return !a(i).g() ? 100 : 200;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        a((a)viewholder, i);
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return a(viewgroup, i);
    }
}
