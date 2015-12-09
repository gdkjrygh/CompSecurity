// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dfz;
import dmz;
import gcg;
import giq;
import java.util.ArrayList;
import jz;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            Reason

final class UpsellDialogPagerAdapter extends jz
{

    final Item b[];
    private final LayoutInflater c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final String g;
    private final Flags h;

    public UpsellDialogPagerAdapter(Context context, boolean flag, boolean flag1, int i, Reason reason, Flags flags, String s)
    {
        h = flags;
        c = LayoutInflater.from(context);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Reason.values().length];
                try
                {
                    a[Reason.e.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Reason.i.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Reason.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Reason.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Reason.g.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Reason.d.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Reason.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Reason.j.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[reason.ordinal()];
        JVM INSTR tableswitch 1 5: default 60
    //                   1 147
    //                   2 155
    //                   3 163
    //                   4 163
    //                   5 163;
           goto _L1 _L2 _L3 _L4 _L4 _L4
_L1:
        Item item = Item.a;
_L6:
        ArrayList arraylist;
        context = ((giq)dmz.a(giq)).b(context);
        Item aitem[] = Item.values();
        arraylist = new ArrayList(aitem.length);
        int k = aitem.length;
        for (int j = 0; j < k; j++)
        {
            Item item1 = aitem[j];
            if (item1.a(reason, flags, context))
            {
                arraylist.add(item1);
            }
        }

        break; /* Loop/switch isn't completed */
_L2:
        item = Item.e;
        continue; /* Loop/switch isn't completed */
_L3:
        item = Item.f;
        continue; /* Loop/switch isn't completed */
_L4:
        item = Item.d;
        if (true) goto _L6; else goto _L5
_L5:
        if (arraylist.remove(item))
        {
            arraylist.add(0, item);
        }
        b = (Item[])arraylist.toArray(new Item[arraylist.size()]);
        d = flag;
        f = i;
        if (flag1 && i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        g = s;
        return;
    }

    static boolean a(Item aitem[])
    {
        return aitem.length == 1 && (aitem[0] == Item.b || aitem[0] == Item.c);
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        View view;
        Object obj;
        Object obj1;
        int j;
        if (a(b))
        {
            j = 0x7f0300fb;
        } else
        {
            j = 0x7f0300fa;
        }
        view = c.inflate(j, viewgroup, false);
        viewgroup.addView(view);
        obj = b[i];
        obj1 = (TextView)view.findViewById(0x7f1102c4);
        if (e)
        {
            if (i == 0)
            {
                i = f;
            } else
            {
                i = ((Item) (obj)).mReason;
            }
            ((TextView) (obj1)).setText(i);
        } else
        {
            ((TextView) (obj1)).setVisibility(4);
        }
        obj1 = (TextView)view.findViewById(0x7f1102ad);
        if (obj1 != null)
        {
            ((TextView) (obj1)).setText(((Item) (obj)).mHeading);
        }
        ((TextView)view.findViewById(0x7f1102a3)).setText(((Item) (obj)).a(viewgroup.getContext(), h, g));
        viewgroup = (ImageView)view.findViewById(0x7f11026d);
        if (!d)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        if (((Item) (obj)).mIconSpotifyIcon == null) goto _L2; else goto _L1
_L1:
        obj1 = ((Item) (obj)).mIconSpotifyIcon;
        obj = view.getContext();
        if (obj1 == SpotifyIcon.ap)
        {
            i = ((Context) (obj)).getResources().getDimensionPixelOffset(0x7f0c0160);
            viewgroup.setPadding(i, i, i, i);
        }
        obj1 = new dfz(((Context) (obj)), ((SpotifyIcon) (obj1)), view.getResources().getDimension(0x7f0c0165));
        ((dfz) (obj1)).a(gcg.b(((Context) (obj)), 0x7f0f0087));
        viewgroup.setImageDrawable(((android.graphics.drawable.Drawable) (obj1)));
_L4:
        return view;
_L2:
        if (((Item) (obj)).mIconResourceId == 0) goto _L4; else goto _L3
_L3:
        viewgroup.setImageResource(((Item) (obj)).mIconResourceId);
        return view;
        viewgroup.setVisibility(8);
        return view;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public final int b()
    {
        return b.length;
    }

    private class Item extends Enum
    {

        public static final Item a;
        public static final Item b;
        public static final Item c;
        public static final Item d;
        public static final Item e;
        public static final Item f;
        private static Item g;
        private static final Item h[];
        public final int mDescription;
        public final int mHeading;
        public final int mIconResourceId;
        public final SpotifyIcon mIconSpotifyIcon;
        public final int mReason;
        public final com.spotify.mobile.android.util.viewuri.ViewUri.SubView mUri;

        static boolean a(Reason reason, Flags flags)
        {
            return reason == Reason.d && ((Boolean)flags.a(fys.ag)).booleanValue();
        }

        public static Item valueOf(String s)
        {
            return (Item)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/UpsellDialogPagerAdapter$Item, s);
        }

        public static Item[] values()
        {
            return (Item[])h.clone();
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
            a = new Item("MAIN", 0, 0x7f0805c3, 0x7f0805c2, 0x7f02025f, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.E);
            b = new Item("GET_PLUS", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.F) {

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
                    return !frh.a(gin, reason, flags) && Item.a(reason, flags);
                }

            };
            c = new Item("GET_PLUS_CONSUMABLE", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.G) {

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
            d = new Item("ONDEMAND", SpotifyIcon.C, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.H) {

                protected final boolean a(Reason reason, Flags flags, gin gin)
                {
                    return !gex.a(flags) && a(reason, flags, gin);
                }

            };
            e = new Item("OFFLINE", 4, 0x7f0805c5, 0x7f0805c4, SpotifyIcon.q, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.I);
            g = new Item("ADFREE", 5, 0x7f0805c1, 0x7f0805c0, 0x7f0201f6, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.J);
            f = new Item("QUALITY", 6, 0x7f0805d0, 0x7f0805cf, SpotifyIcon.ap, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.K);
            h = (new Item[] {
                a, b, c, d, e, g, f
            });
        }

        private Item(String s, int i, int j, int k, int l, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
        {
            this(s, i, j, k, null, l, subview);
        }

        private Item(String s, int i, int j, int k, SpotifyIcon spotifyicon, int l, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
        {
            super(s, i);
            mReason = 0x7f0805bc;
            mHeading = j;
            mDescription = k;
            mIconSpotifyIcon = spotifyicon;
            mIconResourceId = l;
            mUri = subview;
        }

        private Item(String s, int i, int j, int k, SpotifyIcon spotifyicon, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
        {
            this(s, i, j, k, spotifyicon, 0, subview);
        }

        Item(String s, int i, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
        {
            this(s, i, 0x7f0805ce, 0x7f0805cc, 0x7f020279, subview);
        }

        Item(String s, SpotifyIcon spotifyicon, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
        {
            this(s, 3, 0x7f0805c7, 0x7f0805c6, spotifyicon, subview);
        }
    }

}
