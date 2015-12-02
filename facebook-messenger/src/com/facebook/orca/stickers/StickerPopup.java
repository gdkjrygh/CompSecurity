// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.cb;
import com.facebook.common.w.n;
import com.facebook.debug.d.e;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.s;
import com.facebook.g;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.orca.emoji.ComposerPopup;
import com.facebook.orca.emoji.TabbedPageView;
import com.facebook.orca.emoji.ae;
import com.facebook.orca.emoji.ag;
import com.facebook.orca.emoji.am;
import com.facebook.orca.emoji.ao;
import com.facebook.orca.server.FetchStickerPacksParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.v;
import com.facebook.prefs.shared.d;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.es;
import com.google.common.d.a.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.stickers:
//            m, StickerStoreActivity, h, Sticker, 
//            s, t, u, n, 
//            StickerPack, o, p, v, 
//            q, l, g

public class StickerPopup extends ComposerPopup
{

    private static final Class ai = com/facebook/orca/stickers/StickerPopup;
    private u aj;
    private TabbedPageView ak;
    private ag al;
    private com.facebook.c.s am;
    private com.facebook.orca.stickers.h an;
    private k ao;
    private d ap;
    private String aq;
    private int ar;

    public StickerPopup()
    {
    }

    static Class U()
    {
        return ai;
    }

    private void V()
    {
        FetchStickerPacksParams fetchstickerpacksparams = new FetchStickerPacksParams(v.USER_PACKS, true, s.PREFER_CACHE_IF_UP_TO_DATE);
        Bundle bundle = new Bundle();
        bundle.putParcelable("fetchStickerPacksParams", fetchstickerpacksparams);
        i.a(ao.a(aq.I, bundle).a(), new com.facebook.orca.stickers.m(this));
    }

    private void W()
    {
        X();
        Intent intent = new Intent(n(), com/facebook/orca/stickers/StickerStoreActivity);
        am.a(intent, n());
        a();
    }

    private void X()
    {
        cb cb1 = T();
        cb1.b("action", "sticker_store_opened");
        an.a(cb1);
    }

    static int a(StickerPopup stickerpopup, int j)
    {
        stickerpopup.ar = j;
        return j;
    }

    private View a(Context context, Object obj, String s1, int j)
    {
        if (!(obj instanceof Sticker))
        {
            throw new RuntimeException("Expected an object of type Sticker");
        } else
        {
            obj = (Sticker)obj;
            int i1 = al.d();
            int j1 = al.e();
            int k1 = al.g();
            int l1 = al.i();
            int i2 = al.h();
            int j2 = al.j();
            context = new UrlImage(context);
            context.setImageParams(((Sticker) (obj)).b());
            context.setPlaceHolderResourceId(h.orca_stickers_popup_placeholder);
            context.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            context.setPlaceHolderScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i1, j1));
            context.setPadding(k1, l1, i2, j2);
            context.setOnClickListener(new com.facebook.orca.stickers.s(this, ((Sticker) (obj)), s1, j));
            return context;
        }
    }

    static View a(StickerPopup stickerpopup, Context context, Object obj, String s1, int j)
    {
        return stickerpopup.a(context, obj, s1, j);
    }

    static TabbedPageView a(StickerPopup stickerpopup)
    {
        return stickerpopup.ak;
    }

    public static StickerPopup a(int j, int i1, int j1, int k1, boolean flag, int l1)
    {
        StickerPopup stickerpopup = new StickerPopup();
        Bundle bundle = new Bundle();
        bundle.putInt("x", j);
        bundle.putInt("y", i1);
        bundle.putInt("gravity", l1);
        bundle.putInt("height", j1);
        bundle.putInt("width", k1);
        bundle.putBoolean("showArrowAbove", flag);
        stickerpopup.g(bundle);
        return stickerpopup;
    }

    static String a(StickerPopup stickerpopup, String s1)
    {
        stickerpopup.aq = s1;
        return s1;
    }

    private void a(Sticker sticker)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("sticker", sticker);
        i.a(ao.a(aq.K, bundle).a(), new com.facebook.orca.stickers.t(this, sticker));
    }

    private void a(Sticker sticker, String s1, int j)
    {
        if (aj != null)
        {
            b(sticker, s1, j);
            a(sticker);
            aj.a(sticker);
        }
        a();
    }

    private void a(StickerPack stickerpack)
    {
        b(stickerpack);
        Intent intent = new Intent(n(), com/facebook/orca/stickers/StickerStoreActivity);
        intent.putExtra("stickerPack", stickerpack);
        am.a(intent, n());
        a();
    }

    static void a(StickerPopup stickerpopup, Sticker sticker, String s1, int j)
    {
        stickerpopup.a(sticker, s1, j);
    }

    static void a(StickerPopup stickerpopup, StickerPack stickerpack)
    {
        stickerpopup.a(stickerpack);
    }

    static void a(StickerPopup stickerpopup, es es1, es es2)
    {
        stickerpopup.a(es1, es2);
    }

    private void a(es es1, es es2)
    {
        e e1 = e.a("StickerPopup updateStickerPacks");
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(new ao(Integer.valueOf(h.orca_stickers_store_tab), new com.facebook.orca.stickers.n(this)));
        HashSet hashset = new HashSet();
        LinkedList linkedlist1 = new LinkedList();
        if (!es2.isEmpty())
        {
            linkedlist1.add(new am("recentStickers", Integer.valueOf(h.orca_stickers_recent_tab), es2));
        }
        for (es1 = es1.iterator(); es1.hasNext(); linkedlist1.add(new am(es2.a(), Integer.valueOf(h.orca_emoji_category_people), es2.f(), es2.j())))
        {
            es2 = (StickerPack)es1.next();
            hashset.add(es2.a());
        }

        es1 = new o(this);
        es2 = new p(this);
        String s1 = ap.a(v.c, null);
        int j = ap.a(com.facebook.orca.stickers.v.d, 0);
        ak.a(linkedlist, linkedlist1, al, es1, es2, true, s1, j);
        es1 = new FetchStickerPacksParams(v.STORE_PACKS, true, s.PREFER_CACHE_IF_UP_TO_DATE);
        es2 = new Bundle();
        es2.putParcelable("fetchStickerPacksParams", es1);
        i.a(ao.a(aq.I, es2).a(), new q(this, hashset));
        e1.a();
    }

    private void b(Sticker sticker, String s1, int j)
    {
        cb cb1 = T();
        cb1.b("action", "sticker_selected");
        cb1.b("sticker", sticker.a());
        cb1.b("sticker_pack", s1);
        cb1.a("page_num", j);
        an.a(cb1);
    }

    private void b(StickerPack stickerpack)
    {
        cb cb1 = T();
        cb1.b("action", "sticker_store_pack_opened");
        cb1.b("sticker_pack", stickerpack.a());
        an.a(cb1);
    }

    static void b(StickerPopup stickerpopup)
    {
        stickerpopup.W();
    }

    protected String S()
    {
        return "sticker_popup";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = e.a("StickerPopup onCreateView");
        Q();
        e e1 = e.a("StickerPopup onCreateView layoutInflation");
        ag = layoutinflater.inflate(com.facebook.k.orca_sticker_popup, viewgroup, false);
        e1.a();
        ak = (TabbedPageView)a(ag, com.facebook.i.tabbed_page_view);
        V();
        ak.setEllipsisClickListener(new l(this));
        O();
        P();
        bundle.a();
        return ag;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = t.a(n());
        am = (com.facebook.c.s)bundle.a(com/facebook/c/s);
        an = (com.facebook.orca.stickers.h)bundle.a(com/facebook/orca/stickers/h);
        ao = (k)bundle.a(com/facebook/fbservice/ops/k);
        ap = (d)bundle.a(com/facebook/prefs/shared/d);
        bundle = o();
        al = (new ae(bundle, new com.facebook.orca.stickers.g())).a(ac, ab - bundle.getDimensionPixelSize(g.emoji_category_height_dp) - af, ad);
    }

    public void a(u u1)
    {
        a(((com.facebook.orca.emoji.b) (u1)));
        aj = u1;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (!n.a(aq))
        {
            ap.b().a(v.c, aq).a(com.facebook.orca.stickers.v.d, ar).a();
        }
    }

}
