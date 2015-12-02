// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.analytics.cb;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.config.a.a;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.server.aq;
import com.facebook.widget.images.UrlImage;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.stickers:
//            aj, StickerPack, ai, h, 
//            c, ah

public class StickerStorePackFragment extends FbFragment
    implements b
{

    private static final Class a = com/facebook/orca/stickers/StickerStorePackFragment;
    private TextView Z;
    private TextView aa;
    private TextView ab;
    private Button ac;
    private ProgressBar ad;
    private UrlImage ae;
    private c b;
    private a c;
    private k d;
    private com.facebook.orca.stickers.c e;
    private h f;
    private StickerPack g;
    private boolean h;
    private UrlImage i;

    public StickerStorePackFragment()
    {
    }

    static StickerPack a(StickerStorePackFragment stickerstorepackfragment)
    {
        return stickerstorepackfragment.g;
    }

    static Class a()
    {
        return a;
    }

    private void a(StickerPack stickerpack)
    {
        a("sticker_pack_download_tapped", stickerpack);
        ac.setText(o.sticker_store_downloading);
        ac.setEnabled(false);
        Bundle bundle = new Bundle();
        bundle.putParcelable("stickerPack", stickerpack);
        com.google.common.d.a.i.a(d.a(aq.J, bundle).a(), new aj(this, stickerpack));
    }

    static void a(StickerStorePackFragment stickerstorepackfragment, StickerPack stickerpack)
    {
        stickerstorepackfragment.a(stickerpack);
    }

    static ProgressBar b(StickerStorePackFragment stickerstorepackfragment)
    {
        return stickerstorepackfragment.ad;
    }

    private void b()
    {
        if (g == null || i == null)
        {
            return;
        }
        i.setImageParams(g.d());
        Z.setText(g.b());
        aa.setText(o.sticker_store_price_free);
        ab.setText(g.c());
        Button button;
        boolean flag;
        if (h)
        {
            ac.setText(o.sticker_store_downloaded);
        } else
        {
            ac.setText(o.sticker_store_download);
        }
        button = ac;
        if (!h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
        ae.setOnImageDownloadListener(new ai(this));
        ae.setImageParams(g.e());
    }

    static Button c(StickerStorePackFragment stickerstorepackfragment)
    {
        return stickerstorepackfragment.ac;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.facebook.k.orca_sticker_store_pack_fragment, viewgroup, false);
    }

    public void a(c c1)
    {
        b = c1;
    }

    public void a(StickerPack stickerpack, boolean flag)
    {
        g = stickerpack;
        h = flag;
        b();
    }

    protected void a(String s, StickerPack stickerpack)
    {
        cb cb1 = f.a("sticker_store_pack");
        cb1.b("action", s);
        cb1.b("sticker_pack", stickerpack.a());
        cb1.a("is_featured", stickerpack.h());
        f.a(cb1);
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        bundle = S();
        c = (a)bundle.a(com/facebook/config/a/a);
        d = (k)bundle.a(com/facebook/fbservice/ops/k);
        e = (com.facebook.orca.stickers.c)bundle.a(com/facebook/orca/stickers/c);
        f = (h)bundle.a(com/facebook/orca/stickers/h);
        i = (UrlImage)d(com.facebook.i.thumbnail);
        Z = (TextView)d(com.facebook.i.name);
        aa = (TextView)d(com.facebook.i.price);
        ab = (TextView)d(com.facebook.i.description);
        ac = (Button)d(com.facebook.i.download_button);
        ad = (ProgressBar)d(com.facebook.i.loading_indicator);
        ae = (UrlImage)d(com.facebook.i.preview);
        ac.setOnClickListener(new ah(this));
        b();
    }

}
