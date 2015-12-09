// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.lib.e;
import com.cardinalblue.android.piccollage.model.RecentStickersBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import com.cardinalblue.android.piccollage.model.n;
import com.cardinalblue.android.piccollage.view.a.w;
import java.io.IOException;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            e

public abstract class g extends Fragment
{

    protected StickerBundle a;
    protected String b;
    protected String c;
    private com.cardinalblue.android.piccollage.view.fragments.e d;
    private ImageView e;

    public g()
    {
    }

    private void b()
    {
        b = a.b();
        c = o.a().b(a);
    }

    protected void a(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        d = com.cardinalblue.android.piccollage.view.fragments.e.a(null, getString(0x7f070131), getString(0x1040013), onclicklistener, getString(0x1040009), null);
        k.a(getActivity(), d, "download_confirm_fragment");
    }

    protected void a(View view, boolean flag)
    {
        view = (RecyclerView)view.findViewById(0x7f1001e5);
        GridLayoutManager gridlayoutmanager = new GridLayoutManager(getActivity(), getResources().getInteger(0x7f09003f));
        boolean flag1 = a instanceof RecentStickersBundle;
        w w1 = new w(getActivity(), a.j(), flag1, new com.cardinalblue.android.piccollage.view.a.w.a() {

            final g a;

            public void a()
            {
                com.cardinalblue.android.piccollage.a.b.ac(a.a.f());
                Object obj = a.a.h().c();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    obj = PICAppRoutesService.d(((String) (obj)));
                    a.getActivity().startService(((android.content.Intent) (obj)));
                }
            }

            public void a(Sticker sticker, Checkable checkable)
            {
                a.a(sticker, checkable);
            }

            
            {
                a = g.this;
                super();
            }
        });
        gridlayoutmanager.setSpanSizeLookup(new android.support.v7.widget.GridLayoutManager.SpanSizeLookup(w1, gridlayoutmanager) {

            final w a;
            final GridLayoutManager b;
            final g c;

            public int getSpanSize(int i)
            {
                if (a.a(i))
                {
                    return b.getSpanCount();
                } else
                {
                    return 1;
                }
            }

            
            {
                c = g.this;
                a = w1;
                b = gridlayoutmanager;
                super();
            }
        });
        n n1 = a.h();
        if (n1 != null)
        {
            w1.a(n1.a(), n1.b(), flag);
        }
        view.setLayoutManager(gridlayoutmanager);
        view.setAdapter(w1);
    }

    protected void a(ImageView imageview)
    {
        e = imageview;
        int i = k.a(getActivity(), 0x7f09003f);
        android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
        layoutparams.width = i;
        layoutparams.height = i;
        imageview.setLayoutParams(layoutparams);
        com.cardinalblue.android.piccollage.lib.a.e.a(a.e()).a(imageview);
        return;
        Object obj;
        obj;
        imageview.setImageResource(0x7f0202c6);
        f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader for bundle [").append(a.f()).append("] from uri [").append(a.e()).append("]").toString()));
        return;
        obj;
_L2:
        imageview.setImageResource(0x7f0202c6);
        f.a(((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected abstract void a(Sticker sticker, Checkable checkable);

    protected void a(String s)
    {
        com.cardinalblue.android.piccollage.a.b.b("sticker store", s, a.f());
    }

    protected boolean a()
    {
        com.cardinalblue.android.piccollage.controller.a.k.b b1 = a.o();
        if (b1 != null && !b1.a())
        {
            b1.a(this, a);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (StickerBundle)getArguments().getParcelable("sticker_bundle");
        b();
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (e != null)
        {
            e.setImageDrawable(null);
            e = null;
        }
        System.gc();
    }

    public void onPause()
    {
        super.onPause();
        if (d != null && d.getFragmentManager() != null)
        {
            d.dismiss();
        }
    }
}
