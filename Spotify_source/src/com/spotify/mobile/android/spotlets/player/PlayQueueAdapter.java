// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.util.SpotifyLink;
import com.squareup.picasso.Picasso;
import ctz;
import dff;
import dgo;
import dhu;
import dhv;
import dib;
import die;
import dmz;
import dto;
import ezz;
import fah;
import fuj;
import fxh;
import gae;
import gcg;
import gft;
import gwb;
import java.util.Map;

public final class PlayQueueAdapter extends BaseAdapter
{

    private static final int b = Type.values().length;
    ezz a;
    private final Context c;
    private final fuj d;
    private final ColorStateList e;
    private final int f;
    private int g;
    private int h;
    private Picasso i;

    public PlayQueueAdapter(Context context, fuj fuj1)
    {
        a = new fah();
        c = context;
        d = (fuj)ctz.a(fuj1);
        e = dgo.c(c, 0x7f0101d1);
        f = gcg.b(c, 0x7f0f008d);
        g = c.getResources().getDimensionPixelOffset(0x7f0c0158);
        h = c.getResources().getDimensionPixelOffset(0x7f0c0157);
        i = ((gft)dmz.a(gft)).a();
    }

    private PlayerTrack a(int j)
    {
        return a.a(j);
    }

    private void a(TextView textview, boolean flag)
    {
        if (flag)
        {
            textview.setTextColor(f);
            return;
        } else
        {
            textview.setTextColor(e);
            return;
        }
    }

    public final int getCount()
    {
        return a.a();
    }

    public final Object getItem(int j)
    {
        return a(j);
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }

    public final int getItemViewType(int j)
    {
        if (a.b(j))
        {
            return Type.b.ordinal();
        } else
        {
            return Type.a.ordinal();
        }
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        Object obj1 = Type.values()[getItemViewType(j)];
        Object obj = view;
        String s;
        Object obj2;
        Object obj3;
        boolean flag;
        boolean flag1;
        if (view == null)
        {
            if (obj1 == Type.a)
            {
                obj = dhv.e(c, viewgroup).v();
            } else
            {
                obj = dhv.g(c, viewgroup).v();
            }
        }
        obj2 = a(j);
        s = (String)((PlayerTrack) (obj2)).metadata().get("title");
        obj3 = (String)((PlayerTrack) (obj2)).metadata().get("album_title");
        view = (String)((PlayerTrack) (obj2)).metadata().get("artist_name");
        viewgroup = dto.a((String)((PlayerTrack) (obj2)).metadata().get("image_small_url"));
        flag1 = QueueManager.isExplicitlyQueued(((PlayerTrack) (obj2)));
        if ((new SpotifyLink(((PlayerTrack) (obj2)).uri())).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj3 = (new StringBuilder()).append(((String) (obj3)));
        if (!flag)
        {
            view = (new StringBuilder(" \u2022 ")).append(view).toString();
        } else
        {
            view = "";
        }
        view = ((StringBuilder) (obj3)).append(view).toString();
        obj2 = new Pair(obj2, Integer.valueOf(j));
        if (obj1 == Type.a)
        {
            obj = dhu.b(((View) (obj)));
            obj1 = (dib)((dhu) (obj)).u();
            ((dib) (obj1)).a(s);
            ((dib) (obj1)).b(view);
            a(((dib) (obj1)).a(), flag1);
            i.a(((dib) (obj1)).d());
            if (flag)
            {
                view = dff.b(c, SpotifyIcon.aX);
            } else
            {
                view = dff.b(c, SpotifyIcon.b);
            }
            i.a(viewgroup).a(view).a(((dib) (obj1)).d(), null);
            ((dhu) (obj)).c(new fxh(d, obj2));
            ((dhu) (obj)).a(gae.a(c, d, obj2));
            if (j == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((dhu) (obj)).c(flag1);
            return ((dhu) (obj)).v();
        }
        obj = dhu.b(((View) (obj)));
        obj1 = (die)((dhu) (obj)).u();
        ((die) (obj1)).a(s);
        ((die) (obj1)).b(view);
        a(((die) (obj1)).a(), flag1);
        i.a(((die) (obj1)).d());
        i.a(viewgroup).a(dff.m(c)).b(g, h).b().a(((die) (obj1)).d(), null);
        ((dhu) (obj)).c(new fxh(d, obj2));
        ((dhu) (obj)).a(gae.a(c, d, obj2));
        if (j == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((dhu) (obj)).c(flag1);
        return ((dhu) (obj)).v();
    }

    public final int getViewTypeCount()
    {
        return b;
    }


    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        private static final Type c[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/player/PlayQueueAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("AUDIO", 0);
            b = new Type("VIDEO", 1);
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int j)
        {
            super(s, j);
        }
    }

}
