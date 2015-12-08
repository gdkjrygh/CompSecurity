// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidquery.a;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.piccollage.activities.EchoesListActivity;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.util.List;

public class j extends android.support.v7.widget.RecyclerView.Adapter
{
    static class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        final ImageView a;
        final ImageView b;
        final View c;
        final ImageView d;
        final TextView e;
        final ImageView f;
        final TextView g;

        private void a(int k)
        {
            a(k, d, e);
        }

        private void a(int k, ImageView imageview, TextView textview)
        {
            boolean flag1 = false;
            boolean flag;
            if (k > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (imageview != null)
            {
                int l;
                if (flag)
                {
                    l = 0;
                } else
                {
                    l = 8;
                }
                imageview.setVisibility(l);
            }
            if (textview != null)
            {
                textview.setText(i.a(k));
                if (flag)
                {
                    k = ((flag1) ? 1 : 0);
                } else
                {
                    k = 8;
                }
                textview.setVisibility(k);
            }
        }

        static void a(a a1, int k)
        {
            a1.a(k);
        }

        private void b(int k)
        {
            a(k, f, g);
        }

        static void b(a a1, int k)
        {
            a1.b(k);
        }

        public a(View view)
        {
            super(view);
            a = (ImageView)view.findViewById(0x7f100180);
            b = (ImageView)view.findViewById(0x7f10016d);
            c = view.findViewById(0x7f1000ea);
            d = (ImageView)view.findViewById(0x7f10017e);
            e = (TextView)view.findViewById(0x7f1000ee);
            f = (ImageView)view.findViewById(0x7f10017f);
            g = (TextView)view.findViewById(0x7f1000f0);
        }
    }


    private final Context a;
    private final LayoutInflater b;
    private final int c;
    private final int d;
    private CBCollagesResponse e;
    private String f;
    private android.widget.AdapterView.OnItemClickListener g;

    public j(Context context, int i, int k)
    {
        a = context;
        c = i;
        d = k;
        b = LayoutInflater.from(context);
    }

    static android.widget.AdapterView.OnItemClickListener a(j j1)
    {
        return j1.g;
    }

    static Context b(j j1)
    {
        return j1.a;
    }

    public CBCollagesResponse a()
    {
        return e;
    }

    public WebPhoto a(int i)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return (WebPhoto)e.getPhotos().get(i);
        }
    }

    public a a(ViewGroup viewgroup, int i)
    {
        viewgroup = b.inflate(0x7f03008b, viewgroup, false);
        android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
        layoutparams.height = d;
        viewgroup.setLayoutParams(layoutparams);
        return new a(viewgroup);
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        g = onitemclicklistener;
    }

    public void a(CBCollagesResponse cbcollagesresponse)
    {
        if (e == null)
        {
            e = cbcollagesresponse;
            return;
        } else
        {
            e.addMoreCollage(cbcollagesresponse);
            return;
        }
    }

    public void a(a a1, int i)
    {
        a1.itemView.setOnClickListener(new android.view.View.OnClickListener(i) {

            final int a;
            final j b;

            public void onClick(View view)
            {
                if (com.cardinalblue.android.piccollage.view.fragments.j.a(b) != null)
                {
                    com.cardinalblue.android.piccollage.view.fragments.j.a(b).onItemClick(null, view, a, 0L);
                }
            }

            
            {
                b = j.this;
                a = i;
                super();
            }
        });
        WebPhoto webphoto = a(i);
        a1.b.setTag(webphoto);
        Object obj = webphoto.getUser();
        if (a1.a != null)
        {
            obj = ((PicUser) (obj)).getProfileImageUrl();
            com.androidquery.a a2 = new com.androidquery.a(a1.a);
            a2.a(((String) (obj)), false, true, a1.a.getMeasuredWidth(), 0x7f020224, com.cardinalblue.android.piccollage.helpers.a.a(a.getResources(), 0x7f020224), 0);
            a2.a(new android.view.View.OnClickListener(webphoto) {

                final WebPhoto a;
                final j b;

                public void onClick(View view)
                {
                    PicUser picuser = a.getUser();
                    if (picuser == null)
                    {
                        return;
                    }
                    if (picuser.equals(PicAuth.h().i()))
                    {
                        view = new Intent(j.b(b), com/cardinalblue/android/piccollage/activities/HomeActivity);
                        view.setAction("piccollage.intent.action.VIEW_PROFILE");
                    } else
                    {
                        view = new Intent(j.b(b), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                    }
                    view.putExtra("user", picuser);
                    j.b(b).startActivity(view);
                }

            
            {
                b = j.this;
                a = webphoto;
                super();
            }
            });
        }
        (new com.androidquery.a(a1.b)).a(webphoto.getMediumImageUrl(), false, true, c, 0x7f020229, com.cardinalblue.android.piccollage.helpers.a.a(a.getResources(), 0x7f020229), 0);
        if (a1.c != null)
        {
            a1.c.setOnClickListener(new android.view.View.OnClickListener(webphoto) {

                final WebPhoto a;
                final j b;

                public void onClick(View view)
                {
                    view = new Intent(j.b(b), com/cardinalblue/android/piccollage/activities/EchoesListActivity);
                    view.putExtra("extra_webphoto", a);
                    view.putExtra("start_from", b.b());
                    j.b(b).startActivity(view);
                }

            
            {
                b = j.this;
                a = webphoto;
                super();
            }
            });
        }
        com.cardinalblue.android.piccollage.view.fragments.a.a(a1, webphoto.getLikeNum());
        a.b(a1, webphoto.getEchoesNum());
    }

    public void a(String s)
    {
        f = s;
    }

    public String b()
    {
        return f;
    }

    public void b(CBCollagesResponse cbcollagesresponse)
    {
        e = cbcollagesresponse;
    }

    public int getItemCount()
    {
        if (e == null)
        {
            return 0;
        } else
        {
            return e.getPhotos().size();
        }
    }

    public long getItemId(int i)
    {
        return 0L;
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
