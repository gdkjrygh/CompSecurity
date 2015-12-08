// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ctz;
import dhu;
import dhv;
import dia;
import dib;
import dmz;
import dnw;
import dto;
import fuj;
import fxh;
import gae;
import gdb;
import gji;
import gjj;
import os;

public final class AlbumsAdapter extends os
{

    public String c;
    private Options d;
    private String e;
    private final fuj f;
    private gji g;

    public AlbumsAdapter(Context context, Options options, fuj fuj1)
    {
        super(context);
        d = options;
        f = (fuj)ctz.a(fuj1);
        e = b.getResources().getString(0x7f0803e1);
        dmz.a(gjj);
        g = gjj.a(context);
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        cursor = dhv.e(context, viewgroup);
        if (f == null)
        {
            cursor.a(gae.b(context));
        }
        cursor.e(true);
        return cursor.v();
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        dnw dnw1;
        dhu dhu1 = dhu.b(view);
        dnw1 = new dnw();
        dnw1.a(cursor);
        dhu1.c(dnw1.l);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Options.ArtistViewType.values().length];
                try
                {
                    a[Options.ArtistViewType.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Options.ArtistViewType.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Options.ArtistViewType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        class Options.ArtistViewType extends Enum
        {

            public static final Options.ArtistViewType a;
            public static final Options.ArtistViewType b;
            public static final Options.ArtistViewType c;
            private static final Options.ArtistViewType d[];

            public static Options.ArtistViewType valueOf(String s)
            {
                return (Options.ArtistViewType)Enum.valueOf(com/spotify/mobile/android/ui/adapter/AlbumsAdapter$Options$ArtistViewType, s);
            }

            public static Options.ArtistViewType[] values()
            {
                return (Options.ArtistViewType[])d.clone();
            }

            static 
            {
                a = new Options.ArtistViewType("YEAR", 0);
                b = new Options.ArtistViewType("ARTIST", 1);
                c = new Options.ArtistViewType("TRACK_COUNTS", 2);
                d = (new Options.ArtistViewType[] {
                    a, b, c
                });
            }

            private Options.ArtistViewType(String s, int i)
            {
                super(s, i);
            }
        }

        boolean flag;
        if (c != null && c.equals(dnw1.c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dhu1.d(flag);
        if (dnw1.f || d.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dhu1.b(flag);
        dhu1.e(true);
        dhu1.b(dnw1);
        cursor = (dia)dhu1.u();
        cursor.a(dnw1.b);
        g.f(((dib)cursor).d(), dto.a(dnw1.o));
        _cls1.a[d.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 192
    //                   1 294
    //                   2 329
    //                   3 364;
           goto _L1 _L2 _L3 _L4
_L1:
        if (gdb.a(context, cursor.b(), dnw1.j, dnw1.k))
        {
            cursor.c(b.getString(0x7f0802ee, new Object[] {
                Integer.valueOf(dnw1.k)
            }));
        }
        dhu1.a(gae.a(b, f, dnw1));
        dhu1.c(new fxh(f, dnw1));
        return;
_L2:
        if (TextUtils.isEmpty(dnw1.d))
        {
            view = e;
        } else
        {
            view = dnw1.d;
        }
        cursor.b(view);
        continue; /* Loop/switch isn't completed */
_L3:
        if (TextUtils.isEmpty(dnw1.q))
        {
            view = e;
        } else
        {
            view = dnw1.q;
        }
        cursor.b(view);
        continue; /* Loop/switch isn't completed */
_L4:
        if (dnw1.m <= 0)
        {
            cursor.c(b.getResources().getQuantityString(0x7f090007, dnw1.n, new Object[] {
                Integer.valueOf(dnw1.n)
            }));
        } else
        if (dnw1.n == dnw1.m)
        {
            cursor.c(b.getResources().getString(0x7f080162));
        } else
        {
            cursor.b(b.getResources().getQuantityString(0x7f090006, dnw1.m, new Object[] {
                Integer.valueOf(dnw1.n), Integer.valueOf(dnw1.m)
            }));
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private class Options
    {

        public abstract ArtistViewType a();

        public abstract boolean b();
    }

}
