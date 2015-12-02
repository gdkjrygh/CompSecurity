// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.facebook.analytics.cb;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.common.w.j;
import com.facebook.debug.d.e;
import com.facebook.f;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.ops.n;
import com.facebook.fbservice.service.s;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.server.FetchStickerPacksParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.v;
import com.facebook.widget.listview.EmptyListViewItem;
import com.google.common.d.a.i;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.stickers:
//            ag, ae, ac, ad, 
//            h, StickerPack, y, z, 
//            aa, ab

public class StickerStoreFragment extends FbFragment
    implements b
{

    private static final Class a = com/facebook/orca/stickers/StickerStoreFragment;
    private EmptyListViewItem Z;
    private EmptyListViewItem aa;
    private Set ab;
    private boolean ac;
    private ag ad;
    private c b;
    private k c;
    private com.facebook.orca.stickers.h d;
    private LinearLayout e;
    private LinearLayout f;
    private LinearLayout g;
    private FrameLayout h;
    private EmptyListViewItem i;

    public StickerStoreFragment()
    {
    }

    private void O()
    {
        if (ad == ag.OWNED)
        {
            return;
        } else
        {
            e e1 = com.facebook.debug.d.e.a("StickerStoreFragment gotoOwnedTab");
            ListView listview = P();
            a(v.USER_PACKS, listview, ag.OWNED);
            b(ag.OWNED);
            e1.a();
            return;
        }
    }

    private ListView P()
    {
        ListView listview = new ListView(n());
        listview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        listview.setDivider(new ClipDrawable(new ColorDrawable(o().getColor(f.publisher_vertical_divider)), 9800, 1));
        listview.setDividerHeight(1);
        listview.setHeaderDividersEnabled(false);
        listview.setFooterDividersEnabled(false);
        listview.setCacheColorHint(o().getColor(0x106000d));
        listview.setFadingEdgeLength(0);
        listview.addHeaderView(a(j.a(n(), 10F), 0x106000d));
        listview.addHeaderView(a(-1, h.sticker_store_bg_top));
        listview.addFooterView(a(-1, h.sticker_store_bg_bottom));
        listview.addFooterView(a(j.a(n(), 10F), 0x106000d));
        h.removeAllViews();
        h.addView(listview);
        a(listview);
        return listview;
    }

    private View a(int l, int i1)
    {
        View view = new View(n());
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, l));
        view.setBackgroundResource(i1);
        return view;
    }

    private n a(v v1, s s1)
    {
        v1 = new FetchStickerPacksParams(v1, s1);
        s1 = new Bundle();
        s1.putParcelable("fetchStickerPacksParams", v1);
        return c.a(aq.I, s1).a();
    }

    static Class a()
    {
        return a;
    }

    private void a(ListView listview)
    {
        h.removeView(i);
        h.addView(i);
        listview.setEmptyView(i);
        i.setVisibility(0);
        Z.setVisibility(8);
        aa.setVisibility(8);
    }

    private void a(ListView listview, List list)
    {
        e e1 = com.facebook.debug.d.e.a("StickerStoreFragment loadListViewContent");
        b(listview);
        listview.setAdapter(new ae(this, n(), list));
        e1.a();
    }

    private void a(v v1, ListView listview, ag ag1)
    {
        s s1;
        if (!ac && v1 == v.STORE_PACKS)
        {
            s1 = s.CHECK_SERVER_FOR_NEW_DATA;
            ac = true;
        } else
        {
            s1 = s.PREFER_CACHE_IF_UP_TO_DATE;
        }
        com.google.common.d.a.i.a(a(v1, s1), new ac(this, v1, ag1, listview));
    }

    private void a(StickerPack stickerpack, boolean flag)
    {
        if (b != null)
        {
            a(stickerpack);
            Intent intent = new Intent();
            intent.putExtra("stickerPack", stickerpack);
            intent.putExtra("isOwned", flag);
            b.a(this, intent);
        }
    }

    static void a(StickerStoreFragment stickerstorefragment)
    {
        stickerstorefragment.c();
    }

    static void a(StickerStoreFragment stickerstorefragment, ListView listview)
    {
        stickerstorefragment.c(listview);
    }

    static void a(StickerStoreFragment stickerstorefragment, ListView listview, List list)
    {
        stickerstorefragment.a(listview, list);
    }

    static void a(StickerStoreFragment stickerstorefragment, StickerPack stickerpack, boolean flag)
    {
        stickerstorefragment.a(stickerpack, flag);
    }

    private void b()
    {
        ag ag1 = ad;
        ad = null;
        switch (ad.a[ag1.ordinal()])
        {
        default:
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unknown tab specified for reload: ").append(ag1).toString());
            ad = ag1;
            return;

        case 1: // '\001'
            c();
            return;

        case 2: // '\002'
            d();
            return;

        case 3: // '\003'
            O();
            break;
        }
    }

    private void b(ListView listview)
    {
        h.removeView(Z);
        h.addView(Z);
        listview.setEmptyView(Z);
        i.setVisibility(8);
        Z.setVisibility(0);
        aa.setVisibility(8);
    }

    static void b(StickerStoreFragment stickerstorefragment)
    {
        stickerstorefragment.d();
    }

    private void b(ag ag1)
    {
        boolean flag1 = true;
        ad = ag1;
        LinearLayout linearlayout = e;
        boolean flag;
        if (ag1 == ag.FEATURED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linearlayout.setSelected(flag);
        linearlayout = f;
        if (ag1 == ag.AVAILABLE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linearlayout.setSelected(flag);
        linearlayout = g;
        if (ag1 == ag.OWNED)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        linearlayout.setSelected(flag);
    }

    private void c()
    {
        if (ad == ag.FEATURED)
        {
            return;
        } else
        {
            e e1 = com.facebook.debug.d.e.a("StickerStoreFragment gotoFeaturedTab");
            ListView listview = P();
            a(v.STORE_PACKS, listview, ag.FEATURED);
            b(ag.FEATURED);
            e1.a();
            return;
        }
    }

    private void c(ListView listview)
    {
        h.removeView(aa);
        h.addView(aa);
        listview.setEmptyView(aa);
        i.setVisibility(8);
        Z.setVisibility(8);
        aa.setVisibility(0);
    }

    static void c(StickerStoreFragment stickerstorefragment)
    {
        stickerstorefragment.O();
    }

    static Set d(StickerStoreFragment stickerstorefragment)
    {
        return stickerstorefragment.ab;
    }

    private void d()
    {
        if (ad == ag.AVAILABLE)
        {
            return;
        } else
        {
            e e1 = com.facebook.debug.d.e.a("StickerStoreFragment gotoAvailableTab");
            ListView listview = P();
            a(v.STORE_PACKS, listview, ag.AVAILABLE);
            b(ag.AVAILABLE);
            e1.a();
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.facebook.k.orca_sticker_store_fragment, viewgroup, false);
    }

    public void a(c c1)
    {
        b = c1;
    }

    protected void a(StickerPack stickerpack)
    {
        cb cb1 = d.a("sticker_store");
        cb1.b("action", "sticker_pack_selected");
        cb1.b("sticker_pack", stickerpack.a());
        cb1.b("store_tab", ad.toString());
        d.a(cb1);
    }

    protected void a(ag ag1)
    {
        cb cb1 = d.a("sticker_store");
        cb1.b("action", "sticker_store_tab_load_error");
        cb1.b("store_tab", ag1.toString());
        d.a(cb1);
    }

    public void c(boolean flag)
    {
        if (!flag)
        {
            b();
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        bundle = S();
        c = (k)bundle.a(com/facebook/fbservice/ops/k);
        d = (com.facebook.orca.stickers.h)bundle.a(com/facebook/orca/stickers/h);
        e = (LinearLayout)d(com.facebook.i.featured_tab);
        f = (LinearLayout)d(com.facebook.i.available_tab);
        g = (LinearLayout)d(com.facebook.i.owned_tab);
        h = (FrameLayout)d(com.facebook.i.store_tab_content);
        i = (EmptyListViewItem)d(com.facebook.i.loading_item);
        Z = (EmptyListViewItem)d(com.facebook.i.empty_item);
        aa = (EmptyListViewItem)d(com.facebook.i.error_item);
        i.a(true);
        i.setMessage(o.generic_loading);
        i.setBackgroundColor(o().getColor(0x106000d));
        Z.setMessage(o.sticker_store_category_empty);
        Z.setBackgroundColor(o().getColor(0x106000d));
        aa.setMessage(o.generic_error_message);
        aa.setBackgroundColor(o().getColor(0x106000d));
        e.setOnClickListener(new y(this));
        f.setOnClickListener(new z(this));
        g.setOnClickListener(new aa(this));
        h.removeAllViews();
        P();
        ab = new HashSet();
        com.google.common.d.a.i.a(a(v.USER_PACKS, s.PREFER_CACHE_IF_UP_TO_DATE), new ab(this));
    }

}
