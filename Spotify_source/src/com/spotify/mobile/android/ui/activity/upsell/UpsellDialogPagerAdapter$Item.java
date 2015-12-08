// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.activity.upsell.consumables.ConsumablePeriod;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyPrice;
import frh;
import fys;
import gex;
import gin;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            Reason

class <init> extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static f g;
    private static final f h[];
    public final int mDescription;
    public final int mHeading;
    public final int mIconResourceId;
    public final SpotifyIcon mIconSpotifyIcon;
    public final int mReason;
    public final com.spotify.mobile.android.util.viewuri..Item mUri;

    static boolean a(Reason reason, Flags flags)
    {
        return reason == Reason.d && ((Boolean)flags.a(fys.ag)).booleanValue();
    }

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/UpsellDialogPagerAdapter$Item, s);
    }

    public static <init>[] values()
    {
        return (<init>[])h.clone();
    }

    public String a(Context context, Flags flags, String s)
    {
        return context.getString(mDescription);
    }

    protected boolean a(Reason reason, Flags flags, gin gin)
    {
        return !a(reason, flags) && !frh.a(gin, reason, flags);
    }

    static 
    {
        a = new <init>("MAIN", 0, 0x7f0805c3, 0x7f0805c2, 0x7f02025f, com.spotify.mobile.android.util.viewuri..Item);
        b = new UpsellDialogPagerAdapter.Item("GET_PLUS", com.spotify.mobile.android.util.viewuri..Item) {

            public final String a(Context context, Flags flags, String s)
            {
                String s1 = SpotifyPrice.a(s, com.spotify.mobile.android.util.SpotifyPrice.Tier.a);
                if (s1 == null)
                {
                    return a(context, flags, s);
                } else
                {
                    return context.getString(0x7f0805cb, new Object[] {
                        context.getString(0x7f0805cd, new Object[] {
                            s1
                        })
                    });
                }
            }

            protected final boolean a(Reason reason, Flags flags, gin gin)
            {
                return !frh.a(gin, reason, flags) && UpsellDialogPagerAdapter.Item.a(reason, flags);
            }

        };
        c = new UpsellDialogPagerAdapter.Item("GET_PLUS_CONSUMABLE", com.spotify.mobile.android.util.viewuri..Item) {

            public final String a(Context context, Flags flags, String s)
            {
                s = frh.a(flags);
                ConsumablePeriod consumableperiod = frh.b(flags);
                int i = frh.c(flags);
                context = context.getResources();
                if (i == 1)
                {
                    return context.getString(consumableperiod.mDescriptionOneId, new Object[] {
                        s
                    });
                } else
                {
                    return context.getQuantityString(consumableperiod.mDescriptionId, i, new Object[] {
                        Integer.valueOf(i), s
                    });
                }
            }

            protected final boolean a(Reason reason, Flags flags, gin gin)
            {
                return frh.a(gin, reason, flags);
            }

        };
        d = new UpsellDialogPagerAdapter.Item("ONDEMAND", SpotifyIcon.C, com.spotify.mobile.android.util.viewuri..Item) {

            protected final boolean a(Reason reason, Flags flags, gin gin)
            {
                return !gex.a(flags) && a(reason, flags, gin);
            }

        };
        e = new <init>("OFFLINE", 4, 0x7f0805c5, 0x7f0805c4, SpotifyIcon.q, com.spotify.mobile.android.util.viewuri..Item);
        g = new <init>("ADFREE", 5, 0x7f0805c1, 0x7f0805c0, 0x7f0201f6, com.spotify.mobile.android.util.viewuri..Item);
        f = new <init>("QUALITY", 6, 0x7f0805d0, 0x7f0805cf, SpotifyIcon.ap, com.spotify.mobile.android.util.viewuri..Item);
        h = (new h[] {
            a, b, c, d, e, g, f
        });
    }

    private _cls3(String s, int i, int j, int k, int l, com.spotify.mobile.android.util.viewuri..Item item)
    {
        this(s, i, j, k, null, l, item);
    }

    private <init>(String s, int i, int j, int k, SpotifyIcon spotifyicon, int l, com.spotify.mobile.android.util.viewuri..Item item)
    {
        super(s, i);
        mReason = 0x7f0805bc;
        mHeading = j;
        mDescription = k;
        mIconSpotifyIcon = spotifyicon;
        mIconResourceId = l;
        mUri = item;
    }

    private mUri(String s, int i, int j, int k, SpotifyIcon spotifyicon, com.spotify.mobile.android.util.viewuri..Item item)
    {
        this(s, i, j, k, spotifyicon, 0, item);
    }

    <init>(String s, int i, com.spotify.mobile.android.util.viewuri..Item item)
    {
        this(s, i, 0x7f0805ce, 0x7f0805cc, 0x7f020279, item);
    }

    <init>(String s, SpotifyIcon spotifyicon, com.spotify.mobile.android.util.viewuri..Item item)
    {
        this(s, 3, 0x7f0805c7, 0x7f0805c6, spotifyicon, item);
    }
}
