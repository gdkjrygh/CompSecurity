// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

public final class fdp extends BaseAdapter
{

    private final Context a;
    private final Picasso b = ((gft)dmz.a(gft)).a();
    private List c;
    private String d;
    private final Drawable e;
    private final Drawable f;
    private final Drawable g;
    private final Drawable h;
    private final Drawable i;
    private final Drawable j;
    private final Verified k;
    private final Flags l;
    private fuj m;

    public fdp(Context context, Verified verified, Flags flags)
    {
        c = new ArrayList();
        m = new fuj() {

            private fdp a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                boolean flag = true;
                obj = (RecentlyPlayedItem)obj;
                final class _cls2
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.values().length];
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.e.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls2.a[((RecentlyPlayedItem) (obj)).type.ordinal()])
                {
                default:
                    Assertion.a((new StringBuilder("Unknown type with link: ")).append(((RecentlyPlayedItem) (obj)).link).toString());
                    // fall through

                case 5: // '\005'
                    return;

                case 1: // '\001'
                    fve.a(fdp.c(a)).d(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a)).a(true).a(false).a(fdp.a(a)).a(spotifycontextmenu);
                    return;

                case 2: // '\002'
                    fve.a(fdp.c(a)).b(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a)).a(true).a().b(((RecentlyPlayedItem) (obj)).inCollection).a(fdp.a(a)).a(spotifycontextmenu);
                    return;

                case 3: // '\003'
                    fuy fuy1 = fve.a(fdp.c(a)).c(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a));
                    if (((RecentlyPlayedItem) (obj)).tracksInCollectionCount <= 0)
                    {
                        flag = false;
                    }
                    fuy1.a(flag).a(fdp.a(a)).a(spotifycontextmenu);
                    return;

                case 4: // '\004'
                    fve.a(fdp.c(a)).f(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a)).a().a(fdp.a(a)).a(spotifycontextmenu);
                    return;
                }
            }

            
            {
                a = fdp.this;
                super();
            }
        };
        a = context;
        k = verified;
        l = flags;
        f = dff.g(context);
        e = dff.b(context);
        g = dff.a(context, SpotifyIcon.V);
        h = dff.i(context);
        i = dff.a(context, SpotifyIcon.aX);
        j = dff.a(context, SpotifyIcon.K);
    }

    private RecentlyPlayedItem a(int i1)
    {
        return (RecentlyPlayedItem)c.get(i1);
    }

    static Flags a(fdp fdp1)
    {
        return fdp1.l;
    }

    static Verified b(fdp fdp1)
    {
        return fdp1.k;
    }

    static Context c(fdp fdp1)
    {
        return fdp1.a;
    }

    public final void a(String s)
    {
        if (TextUtils.equals(s, d))
        {
            return;
        } else
        {
            d = s;
            notifyDataSetChanged();
            return;
        }
    }

    public final void a(List list)
    {
        if (list == null)
        {
            c = new ArrayList();
            notifyDataSetInvalidated();
            return;
        } else
        {
            c = list;
            notifyDataSetChanged();
            return;
        }
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i1)
    {
        return a(i1);
    }

    public final long getItemId(int i1)
    {
        return (long)i1;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        boolean flag1 = true;
        view = dhu.b(view);
        RecentlyPlayedItem recentlyplayeditem;
        dib dib1;
        Object obj;
        Context context;
        boolean flag;
        if (view == null)
        {
            viewgroup = dhv.e(a, viewgroup);
        } else
        {
            viewgroup = view;
        }
        recentlyplayeditem = a(i1);
        dib1 = (dib)viewgroup.u();
        _cls2.a[recentlyplayeditem.type.ordinal()];
        JVM INSTR tableswitch 1 5: default 84
    //                   1 397
    //                   2 450
    //                   3 450
    //                   4 450
    //                   5 450;
           goto _L1 _L2 _L3 _L3 _L3 _L3
_L1:
        Assertion.a((new StringBuilder("Unknown type with link: ")).append(recentlyplayeditem.link).toString());
        view = "";
_L10:
        dib1.a(view);
        view = recentlyplayeditem.getSubtitle(l, a);
        dib1.b(view);
        obj = dib1.b();
        if (TextUtils.isEmpty(view))
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((TextView) (obj)).setVisibility(i1);
        view = dib1.d();
        ((gft)dmz.a(gft)).a().a(view);
        _cls2.a[recentlyplayeditem.type.ordinal()];
        JVM INSTR tableswitch 1 5: default 236
    //                   1 464
    //                   2 552
    //                   3 596
    //                   4 652
    //                   5 696;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_696;
_L4:
        Assertion.a((new StringBuilder("Unknown type for link: ")).append(recentlyplayeditem.link).toString());
_L11:
        viewgroup.e(true);
        viewgroup.b(recentlyplayeditem.available);
        if (!TextUtils.isEmpty(d) && TextUtils.equals(d, recentlyplayeditem.link))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        viewgroup.c(flag);
        viewgroup.b(recentlyplayeditem);
        if (!recentlyplayeditem.isLoading() && recentlyplayeditem.type != com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.e)
        {
            viewgroup.a(gae.a(a, m, recentlyplayeditem));
            viewgroup.c(new fxh(m, recentlyplayeditem));
        } else
        {
            viewgroup.a(null);
            viewgroup.c(null);
        }
        gdb.a(a, dib1.b(), recentlyplayeditem.offlineState, recentlyplayeditem.syncProgress);
        return viewgroup.v();
_L2:
        if (recentlyplayeditem.isStarred)
        {
            view = a.getString(0x7f0803ff);
        } else
        if (recentlyplayeditem.isTopTracks)
        {
            view = a.getString(0x7f080400);
        } else
        {
            view = recentlyplayeditem.name;
        }
          goto _L10
_L3:
        view = recentlyplayeditem.name;
          goto _L10
_L5:
        if (!recentlyplayeditem.isStarred || !recentlyplayeditem.isOwnedBySelf)
        {
            obj = b.a(dto.a(recentlyplayeditem.imageUri));
            ((gwb) (obj)).a(h);
            ((gwb) (obj)).b(h);
            ((gwb) (obj)).a(view, null);
            view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else
        {
            view.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            view.setImageDrawable(g);
        }
          goto _L11
_L6:
        b.a(dto.a(recentlyplayeditem.imageUri)).a(e).b(e).a(view, null);
        view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
          goto _L11
_L7:
        obj = b.a(dto.a(recentlyplayeditem.imageUri));
        ((gwb) (obj)).a(f);
        ((gwb) (obj)).b(f);
        ((gwb) (obj)).a(gft.a(view));
        view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
          goto _L11
_L8:
        b.a(dto.a(recentlyplayeditem.imageUri)).a(i).b(i).a(view, null);
        view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
          goto _L11
        obj = b.a(dto.a(recentlyplayeditem.imageUri)).a(j).b(j).a(android.graphics.Bitmap.Config.ARGB_4444);
        context = a;
        if (recentlyplayeditem.link != null && recentlyplayeditem.link.contains(":artist:"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gwb) (obj)).a(new gai(context, flag)).a(view, null);
        view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
          goto _L11
    }
}
