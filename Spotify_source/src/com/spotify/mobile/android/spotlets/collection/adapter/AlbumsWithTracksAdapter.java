// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.Verified;
import ctz;
import ddd;
import ddh;
import ddi;
import ddl;
import dds;
import dgd;
import dmz;
import doe;
import dto;
import emo;
import fuj;
import fuo;
import fup;
import fuq;
import fur;
import fut;
import fuu;
import fve;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;
import fxh;
import gae;
import gdb;
import gji;
import gjj;
import java.util.ArrayList;
import java.util.List;

public final class AlbumsWithTracksAdapter extends BaseAdapter
{

    private static final int e = Type.values().length;
    public List a;
    public List b;
    public String c;
    public Cursor d;
    private Context f;
    private boolean g;
    private final Flags h;
    private Verified i;
    private final fuj j = new fuj() {

        private AlbumsWithTracksAdapter a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (doe)obj;
            fve.a(AlbumsWithTracksAdapter.c(a)).a(((doe) (obj)).e(), ((doe) (obj)).j()).a(AlbumsWithTracksAdapter.b(a)).a(false).a(false).a(true).a(false, null).a(AlbumsWithTracksAdapter.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = AlbumsWithTracksAdapter.this;
                super();
            }
    };
    private final fuj k = new fuj() {

        private AlbumsWithTracksAdapter a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (emo)obj;
            fve.a(AlbumsWithTracksAdapter.c(a)).b(((emo) (obj)).a.h(), ((emo) (obj)).a()).a(AlbumsWithTracksAdapter.b(a)).a(false).a().b(true).a(AlbumsWithTracksAdapter.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = AlbumsWithTracksAdapter.this;
                super();
            }
    };

    public AlbumsWithTracksAdapter(Context context, boolean flag, Verified verified, Flags flags)
    {
        a = new ArrayList();
        b = new ArrayList();
        f = context;
        g = flag;
        h = flags;
        c = context.getString(0x7f0803e1);
        i = (Verified)ctz.a(verified);
    }

    static Flags a(AlbumsWithTracksAdapter albumswithtracksadapter)
    {
        return albumswithtracksadapter.h;
    }

    static Verified b(AlbumsWithTracksAdapter albumswithtracksadapter)
    {
        return albumswithtracksadapter.i;
    }

    static Context c(AlbumsWithTracksAdapter albumswithtracksadapter)
    {
        return albumswithtracksadapter.f;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int l)
    {
        return a.get(l);
    }

    public final long getItemId(int l)
    {
        if (b.get(l) == Type.b)
        {
            return ((emo)a.get(l)).a.d();
        } else
        {
            return ((doe)a.get(l)).d();
        }
    }

    public final int getItemViewType(int l)
    {
        return ((Type)b.get(l)).ordinal();
    }

    public final View getView(int l, View view, ViewGroup viewgroup)
    {
        View view1;
        Type type = (Type)b.get(l);
        view = dds.a(view);
        view1 = view;
        if (view == null)
        {
            if (type == Type.a)
            {
                view = f;
                final class _cls3
                {

                    static final int a[];

                    static 
                    {
                        a = new int[Type.values().length];
                        try
                        {
                            a[Type.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[Type.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[Type.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                boolean flag;
                if (!g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view = dds.a(view, viewgroup, flag);
            } else
            if (type == Type.c)
            {
                view = dds.b(f, viewgroup);
            } else
            {
                view = dds.a(f, viewgroup);
            }
            view1 = view;
            if (type == Type.b)
            {
                ((ddi)view).c().setTypeface(dgd.c(f, 0x7f010006));
                view1 = view;
            }
        }
        _cls3.a[type.ordinal()];
        JVM INSTR tableswitch 1 3: default 128
    //                   1 194
    //                   2 321
    //                   3 469;
           goto _L1 _L2 _L3 _L4
_L1:
        Assertion.a((new StringBuilder("Unknown type ")).append(type).toString());
_L6:
        return view1.a();
_L2:
        view = (emo)a.get(l);
        viewgroup = (ddi)view1;
        viewgroup.a(view.a());
        dmz.a(gjj);
        gjj.a(f).f(viewgroup.d(), dto.a(((emo) (view)).a.b()));
        viewgroup.d().setVisibility(0);
        viewgroup.a(view);
        viewgroup.a(true);
        viewgroup.a(gae.a(f, k, view));
        viewgroup.b(new fxh(k, view));
        continue; /* Loop/switch isn't completed */
_L3:
        view = (doe)a.get(l);
        viewgroup = (ddl)view1;
        viewgroup.a(view.j());
        viewgroup.b(view.g());
        viewgroup.b(view.a());
        viewgroup.a().setEnabled(view.c());
        viewgroup.a(g);
        gdb.a(f, viewgroup.d(), view.f(), -1);
        viewgroup.a(view);
        viewgroup.a(gae.a(f, j, view));
        viewgroup.b(new fxh(j, view));
        continue; /* Loop/switch isn't completed */
_L4:
        view = (ddh)view1;
        view.a("");
        view.a(true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int getViewTypeCount()
    {
        return e;
    }

    public final boolean isEnabled(int l)
    {
        return Type.values()[getItemViewType(l)] != Type.c;
    }


    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        private static final Type d[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/adapter/AlbumsWithTracksAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])d.clone();
        }

        static 
        {
            a = new Type("TRACK", 0);
            b = new Type("ALBUM", 1);
            c = new Type("PLACEHOLDER", 2);
            d = (new Type[] {
                a, b, c
            });
        }

        private Type(String s, int l)
        {
            super(s, l);
        }
    }

}
