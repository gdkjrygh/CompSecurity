// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Checkable;
import android.widget.ImageView;
import com.bumptech.glide.d;
import com.bumptech.glide.j;
import com.bumptech.glide.request.e;
import com.cardinalblue.android.b.g;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.lib.i;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import com.cardinalblue.android.piccollage.view.CheckableStickerView;
import java.io.IOException;
import java.util.List;
import pl.droidsonroids.gif.c;

public class w extends android.support.v7.widget.RecyclerView.Adapter
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(Sticker sticker, Checkable checkable);
    }

    static class b extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public b(View view)
        {
            super(view);
        }
    }

    static class c extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public c(View view)
        {
            super(view);
        }
    }


    private final List a;
    private final a b;
    private final boolean c;
    private Context d;
    private boolean e;
    private String f;
    private String g;

    public w(Context context, List list, boolean flag, a a1)
    {
        e = true;
        d = context;
        a = list;
        b = a1;
        c = flag;
    }

    private Context a()
    {
        return d;
    }

    static boolean a(w w1)
    {
        return w1.c;
    }

    private Sticker b(int k)
    {
        if (b() && !e)
        {
            return (Sticker)a.get(k - 1);
        } else
        {
            return (Sticker)a.get(k);
        }
    }

    static List b(w w1)
    {
        return w1.a;
    }

    private boolean b()
    {
        return !TextUtils.isEmpty(f);
    }

    static a c(w w1)
    {
        return w1.b;
    }

    public void a(String s, String s1, boolean flag)
    {
        g = s;
        f = s1;
        e = flag;
    }

    public boolean a(int k)
    {
        boolean flag = true;
        if (b()) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (!e)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a.size() == k) goto _L4; else goto _L3
_L3:
        return false;
        if (k == 0) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getItemCount()
    {
        if (b())
        {
            return a.size() + 1;
        } else
        {
            return a.size();
        }
    }

    public int getItemViewType(int k)
    {
        boolean flag = true;
        byte byte0 = flag;
        if (b())
        {
            byte0 = flag;
            if (a(k))
            {
                byte0 = 2;
            }
        }
        return byte0;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int k)
    {
        if (viewholder instanceof c)
        {
            Sticker sticker = b(k);
            String s = sticker.getThumbnailSubpath();
            Object obj = (ImageView)viewholder.itemView.findViewById(0x7f100077);
            if (com.cardinalblue.android.b.g.b(s))
            {
                if (URLUtil.isHttpUrl(s) || URLUtil.isHttpsUrl(s))
                {
                    i.a().b(new com.cardinalblue.android.piccollage.lib.i.e(0, s, new com.android.volley.m.b(((ImageView) (obj))) {

                        final ImageView a;
                        final w b;

                        public volatile void a(Object obj1)
                        {
                            a((pl.droidsonroids.gif.c)obj1);
                        }

                        public void a(pl.droidsonroids.gif.c c1)
                        {
                            a.setImageDrawable(c1);
                        }

            
            {
                b = w.this;
                a = imageview;
                super();
            }
                    }, null));
                } else
                {
                    try
                    {
                        ((ImageView) (obj)).setImageDrawable(new pl.droidsonroids.gif.c(com.cardinalblue.android.piccollage.lib.e.a.c.c(s)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
                    }
                }
            } else
            {
                com.cardinalblue.android.piccollage.lib.a a1 = com.cardinalblue.android.piccollage.lib.a.e.a(sticker.getThumbnailSubpath());
                try
                {
                    a1.a(((ImageView) (obj)), new com.cardinalblue.android.piccollage.lib.f(sticker) {

                        final Sticker a;
                        final w b;

                        public void a(ImageView imageview, String s1)
                        {
                            if (com.cardinalblue.android.piccollage.view.a.w.a(b))
                            {
                                w.b(b).remove(a);
                                b.notifyDataSetChanged();
                                return;
                            }
                            try
                            {
                                com.cardinalblue.android.piccollage.lib.a.e.a(a.getImgSubpath()).a(imageview);
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (ImageView imageview)
                            {
                                com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader for sticker from uri [").append(a.getImgSubpath()).append("]").toString()));
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (ImageView imageview)
                            {
                                com.cardinalblue.android.piccollage.a.f.a(imageview);
                            }
                        }

            
            {
                b = w.this;
                a = sticker;
                super();
            }
                    });
                }
                catch (IOException ioexception)
                {
                    com.cardinalblue.android.piccollage.a.f.a(ioexception);
                }
            }
            ((CheckableStickerView)viewholder.itemView).setChecked(o.a().a(sticker));
            viewholder.itemView.setOnClickListener(new android.view.View.OnClickListener(sticker, viewholder) {

                final Sticker a;
                final android.support.v7.widget.RecyclerView.ViewHolder b;
                final w c;

                public void onClick(View view)
                {
                    if (com.cardinalblue.android.piccollage.view.a.w.c(c) != null)
                    {
                        com.cardinalblue.android.piccollage.view.a.w.c(c).a(a, (Checkable)b.itemView);
                    }
                }

            
            {
                c = w.this;
                a = sticker;
                b = viewholder;
                super();
            }
            });
        } else
        if (viewholder instanceof b)
        {
            com.bumptech.glide.g.b(a()).a(f).a(new e(viewholder) {

                final android.support.v7.widget.RecyclerView.ViewHolder a;
                final w b;

                public boolean a(com.bumptech.glide.load.resource.a.b b1, String s1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    a.itemView.setOnClickListener(new android.view.View.OnClickListener(this) {

                        final _cls4 a;

                        public void onClick(View view)
                        {
                            if (com.cardinalblue.android.piccollage.view.a.w.c(a.b) != null)
                            {
                                com.cardinalblue.android.piccollage.view.a.w.c(a.b).a();
                            }
                        }

            
            {
                a = _pcls4;
                super();
            }
                    });
                    return false;
                }

                public volatile boolean a(Exception exception, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    return a(exception, (String)obj1, j1, flag);
                }

                public boolean a(Exception exception, String s1, com.bumptech.glide.request.b.j j1, boolean flag)
                {
                    return false;
                }

                public volatile boolean a(Object obj1, Object obj2, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
                {
                    return a((com.bumptech.glide.load.resource.a.b)obj1, (String)obj2, j1, flag, flag1);
                }

            
            {
                b = w.this;
                a = viewholder;
                super();
            }
            }).a((ImageView)viewholder.itemView);
            return;
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int k)
    {
        switch (k)
        {
        default:
            return new c(LayoutInflater.from(a()).inflate(0x7f0300e4, viewgroup, false));

        case 2: // '\002'
            return new b(LayoutInflater.from(a()).inflate(0x7f030146, viewgroup, false));
        }
    }
}
