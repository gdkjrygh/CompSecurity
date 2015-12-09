// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.mobile.android.util.Assertion;
import ctz;
import dgo;
import dhu;
import dhv;
import dia;
import doe;
import fuj;
import fxh;
import gae;
import gdb;
import java.util.ArrayList;
import java.util.List;

public final class AlbumTracksAdapter extends BaseAdapter
{

    private static final int d = Type.values().length;
    public List a;
    public Cursor b;
    public String c;
    private Context e;
    private boolean f;
    private final fuj g;

    public AlbumTracksAdapter(Context context, boolean flag, fuj fuj1)
    {
        a = new ArrayList();
        e = context;
        f = flag;
        g = (fuj)ctz.a(fuj1);
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return ((doe)a.get(i)).d();
    }

    public final int getItemViewType(int i)
    {
        return Type.a.ordinal();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Type type = Type.values()[getItemViewType(i)];
        view = dhu.b(view);
        if (view == null)
        {
            view = dhv.d(e, viewgroup);
        }
        viewgroup = (dia)view.u();
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        if (!f && type == Type.a)
        {
            dgo.b(e, viewgroup.a(), 0x7f0101da);
            dgo.b(e, viewgroup.b(), 0x7f0101db);
        } else
        {
            dgo.b(e, viewgroup.a(), 0x7f0101d6);
            dgo.b(e, viewgroup.b(), 0x7f0101d8);
        }
        _cls1.a[type.ordinal()];
        JVM INSTR tableswitch 1 1: default 108
    //                   1 166;
           goto _L1 _L2
_L1:
        Assertion.a((new StringBuilder("Unknown type ")).append(type).toString());
_L4:
        return view.v();
_L2:
        doe doe1 = (doe)a.get(i);
        viewgroup.a(doe1.j());
        viewgroup.b(doe1.g());
        gdb.a(e, viewgroup.b(), doe1.f(), -1);
        view.c(doe1.a());
        view.b(doe1.c());
        view.e(f);
        view.b(doe1);
        view.a(gae.a(e, g, doe1));
        view.c(new fxh(g, doe1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int getViewTypeCount()
    {
        return d;
    }

    public final boolean isEnabled(int i)
    {
        return true;
    }


    private class Type extends Enum
    {

        public static final Type a;
        private static final Type b[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/adapter/AlbumTracksAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])b.clone();
        }

        static 
        {
            a = new Type("TRACK");
            b = (new Type[] {
                a
            });
        }

        private Type(String s)
        {
            super(s, 0);
        }
    }

}
