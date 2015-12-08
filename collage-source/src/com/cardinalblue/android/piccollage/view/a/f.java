// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidquery.a;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class f extends android.support.v7.widget.RecyclerView.Adapter
{
    public static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        ImageView a;
        ImageView b;
        ImageView c;
        TextView d;

        private void a(int j)
        {
            boolean flag1 = false;
            boolean flag;
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (c != null)
            {
                Object obj = c;
                int l;
                if (flag)
                {
                    l = 0;
                } else
                {
                    l = 8;
                }
                ((ImageView) (obj)).setVisibility(l);
            }
            if (d != null)
            {
                d.setText(i.a(j));
                obj = d;
                if (flag)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = 8;
                }
                ((TextView) (obj)).setVisibility(j);
            }
        }

        static void a(a a1, int j)
        {
            a1.a(j);
        }

        public a(View view)
        {
            this(view, false);
        }

        public a(View view, boolean flag)
        {
            super(view);
            if (flag)
            {
                return;
            } else
            {
                a = (ImageView)view.findViewById(0x7f100180);
                b = (ImageView)view.findViewById(0x7f10016d);
                c = (ImageView)view.findViewById(0x7f10017e);
                d = (TextView)view.findViewById(0x7f1000ee);
                return;
            }
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(int i);
    }


    protected final LayoutInflater a;
    private final Context b;
    private int c;
    private int d;
    private List e;
    private b f;

    public f(Context context)
    {
        e = Collections.synchronizedList(new ArrayList());
        b = context;
        a = LayoutInflater.from(context);
        a();
    }

    static b a(f f1)
    {
        return f1.f;
    }

    static Context b(f f1)
    {
        return f1.d();
    }

    private Context d()
    {
        return b;
    }

    public a a(ViewGroup viewgroup, int i)
    {
        if (i == 100)
        {
            viewgroup = a.inflate(0x7f0300f5, viewgroup, false);
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(c, d));
            return new a(viewgroup, true);
        } else
        {
            viewgroup = a.inflate(0x7f03008d, viewgroup, false);
            android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
            layoutparams.height = d;
            viewgroup.setLayoutParams(layoutparams);
            return new a(viewgroup);
        }
    }

    protected void a()
    {
        Point point = k.b();
        int i = point.x;
        int j = point.y;
        int l = d().getResources().getInteger(0x7f09001c);
        c = (i - d().getResources().getDimensionPixelSize(0x7f0b0062) * (l + 1)) / l;
        d = (j * c) / i;
    }

    public void a(a a1, int i)
    {
        if (i == 0)
        {
            a1.itemView.setOnClickListener(new android.view.View.OnClickListener() {

                final f a;

                public void onClick(View view)
                {
                    if (com.cardinalblue.android.piccollage.view.a.f.a(a) != null)
                    {
                        com.cardinalblue.android.piccollage.view.a.f.a(a).a();
                    }
                }

            
            {
                a = f.this;
                super();
            }
            });
            return;
        } else
        {
            WebPhoto webphoto = (WebPhoto)e.get(i - 1);
            a1.itemView.setOnClickListener(new android.view.View.OnClickListener(i) {

                final int a;
                final f b;

                public void onClick(View view)
                {
                    if (com.cardinalblue.android.piccollage.view.a.f.a(b) != null)
                    {
                        com.cardinalblue.android.piccollage.view.a.f.a(b).a(a - 1);
                    }
                }

            
            {
                b = f.this;
                a = i;
                super();
            }
            });
            com.cardinalblue.android.piccollage.view.a.a.a(a1, webphoto.getLikeNum());
            com.androidquery.a a2 = new com.androidquery.a(a1.a);
            a2.a(webphoto.getUser().getProfileImageUrl(), false, true, a1.a.getMeasuredWidth(), 0x7f020224, com.cardinalblue.android.piccollage.helpers.a.a(d().getResources(), 0x7f020224), 0);
            a2.a(new android.view.View.OnClickListener(webphoto) {

                final WebPhoto a;
                final f b;

                public void onClick(View view)
                {
                    view = view.getContext();
                    break MISSING_BLOCK_LABEL_5;
                    if (view != null && a != null)
                    {
                        PicUser picuser = a.getUser();
                        if (picuser != null)
                        {
                            if (picuser.equals(PicAuth.h().i()))
                            {
                                view = new Intent(view, com/cardinalblue/android/piccollage/activities/HomeActivity);
                                view.setAction("piccollage.intent.action.VIEW_PROFILE");
                            } else
                            {
                                view = new Intent(view, com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                            }
                            view.putExtra("user", picuser);
                            f.b(b).startActivity(view);
                            return;
                        }
                    }
                    return;
                }

            
            {
                b = f.this;
                a = webphoto;
                super();
            }
            });
            (new com.androidquery.a(a1.b)).a(webphoto.getMediumImageUrl(), false, true, c, 0x7f020229, com.cardinalblue.android.piccollage.helpers.a.a(d().getResources(), 0x7f020229), 0);
            return;
        }
    }

    public void a(b b1)
    {
        f = b1;
    }

    public void a(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                WebPhoto webphoto = (WebPhoto)list.next();
                if (!e.contains(webphoto))
                {
                    e.add(webphoto);
                }
            }
        }
    }

    public int b()
    {
        return e.size();
    }

    public void c()
    {
        e.clear();
        notifyDataSetChanged();
    }

    public int getItemCount()
    {
        return e.size() + 1;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (i == 0)
        {
            return 100;
        } else
        {
            return super.getItemViewType(i);
        }
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
