// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.adapters.releases;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.google.common.collect.Maps;
import dhu;
import dhw;
import eiw;
import ejn;
import ejy;
import gfp;
import java.util.Map;

public final class ReleasesAdapterWithViewAll extends BaseAdapter
    implements eiw
{

    private final Map a = Maps.b();
    private com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType b;
    private eiw c;
    private Context d;
    private final ejn e;

    public ReleasesAdapterWithViewAll(Context context, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType releasetype, eiw eiw1, ejn ejn1)
    {
        c = eiw1;
        b = releasetype;
        d = context;
        e = ejn1;
        c.b();
    }

    public final ListAdapter a()
    {
        return this;
    }

    public final com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release a(int i)
    {
        if (i < c.getCount())
        {
            return c.a(i);
        } else
        {
            return null;
        }
    }

    public final void a(gfp gfp)
    {
        c.a(gfp);
    }

    public final void a(String s)
    {
        c.a(s);
    }

    public final void b()
    {
    }

    public final int getCount()
    {
        return c.getCount() + 1;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        if (i == c.getCount())
        {
            return ViewTypes.b.ordinal();
        } else
        {
            return ViewTypes.a.ordinal();
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i < c.getCount())
        {
            return c.a().getView(i, view, viewgroup);
        }
        view = dhu.b(view);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.values().length];
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        dhw dhw1;
        if (view == null)
        {
            viewgroup = e.a(viewgroup);
        } else
        {
            viewgroup = view;
        }
        viewgroup.e(true);
        dhw1 = (dhw)viewgroup.u();
        view = b;
        _cls1.a[view.ordinal()];
        JVM INSTR tableswitch 1 4: default 108
    //                   1 189
    //                   2 202
    //                   3 215
    //                   4 228;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        view = d.getString(0x7f08034d);
_L7:
        dhw1.a(view);
        if (!a.containsKey(b))
        {
            a.put(b, new ejy(b));
        }
        viewgroup.b(a.get(b));
        return viewgroup.v();
_L2:
        view = d.getString(0x7f08034e);
        continue; /* Loop/switch isn't completed */
_L3:
        view = d.getString(0x7f080350);
        continue; /* Loop/switch isn't completed */
_L4:
        view = d.getString(0x7f08034d);
        continue; /* Loop/switch isn't completed */
_L5:
        view = d.getString(0x7f08034f);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int getViewTypeCount()
    {
        return ViewTypes.a();
    }

    public final boolean isEnabled(int i)
    {
        if (i < c.getCount() + 1)
        {
            return c.a().isEnabled(i);
        } else
        {
            return super.isEnabled(i);
        }
    }

    private class ViewTypes extends Enum
    {

        public static final ViewTypes a;
        public static final ViewTypes b;
        private static final int c = values().length;
        private static final ViewTypes d[];

        static int a()
        {
            return c;
        }

        public static ViewTypes valueOf(String s)
        {
            return (ViewTypes)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/adapters/releases/ReleasesAdapterWithViewAll$ViewTypes, s);
        }

        public static ViewTypes[] values()
        {
            return (ViewTypes[])d.clone();
        }

        static 
        {
            a = new ViewTypes("REGULAR", 0);
            b = new ViewTypes("VIEW_ALL", 1);
            d = (new ViewTypes[] {
                a, b
            });
        }

        private ViewTypes(String s, int i)
        {
            super(s, i);
        }
    }

}
