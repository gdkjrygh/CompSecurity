// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.model.InstalledStickerBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.cardinalblue.android.piccollage.model.gson.Sticker;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            g

public class FreeStickerBundleFragment extends g
{
    public static class OnVideoAdFinishedEvent
        implements IGsonable
    {

        public final StickerBundle a;

        public OnVideoAdFinishedEvent(StickerBundle stickerbundle)
        {
            a = stickerbundle;
        }
    }

    public static class OnWatchVideoForDownloadPackEvent
        implements IGsonable
    {

        public final StickerBundle a;

        public OnWatchVideoForDownloadPackEvent(StickerBundle stickerbundle)
        {
            a = stickerbundle;
        }
    }


    private TextView d;
    private TextView e;

    public FreeStickerBundleFragment()
    {
    }

    static void a(FreeStickerBundleFragment freestickerbundlefragment)
    {
        freestickerbundlefragment.b();
    }

    private void a(boolean flag)
    {
        TextView textview = e;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        if (c())
        {
            ((com.cardinalblue.android.piccollage.controller.a.k.c)a.o()).a(flag);
        }
    }

    private void b()
    {
        if (a())
        {
            return;
        }
        if (a instanceof InstalledStickerBundle)
        {
            k.c(a.f());
        }
        a("free");
        o.a().a(a);
    }

    private boolean c()
    {
        com.cardinalblue.android.piccollage.controller.a.k.b b1 = a.o();
        return b1 != null && (b1 instanceof com.cardinalblue.android.piccollage.controller.a.k.c);
    }

    private float d()
    {
        return (float)com.cardinalblue.android.b.d.i() / 8.64E+07F;
    }

    private int e()
    {
        com.cardinalblue.android.piccollage.controller.a.k.b b1 = a.o();
        if (b1 != null && !b1.a())
        {
            return b1.b();
        } else
        {
            return 0x7f07012f;
        }
    }

    protected void a(Sticker sticker, Checkable checkable)
    {
        a(new android.content.DialogInterface.OnClickListener() {

            final FreeStickerBundleFragment a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                com.cardinalblue.android.piccollage.view.fragments.FreeStickerBundleFragment.a(a);
            }

            
            {
                a = FreeStickerBundleFragment.this;
                super();
            }
        });
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        switch (i)
        {
        default:
            super.onActivityResult(i, j, intent);
            return;

        case 200: 
            if (j == -1)
            {
                k.i(getActivity());
                d.setText(0x7f07012f);
                return;
            } else
            {
                k.a(getActivity(), 0x7f07010f, 0);
                return;
            }

        case 201: 
            o.a().a(a);
            return;
        }
    }

    public void onAdPlayableChanged(com.cardinalblue.android.piccollage.activities.StickersActivity.b b1)
    {
        PICDeviceConfig picdeviceconfig = ((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a();
        boolean flag = b1.a;
        if (!picdeviceconfig.isVideoAdsEnabled())
        {
            flag = false;
        }
        if (flag)
        {
            com.cardinalblue.android.piccollage.a.b.bL();
        }
        a(flag);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bc, viewgroup, false);
        viewgroup = new com.androidquery.a(layoutinflater);
        a(layoutinflater, true);
        e = (TextView)layoutinflater.findViewById(0x7f1001e4);
        e.setText(getString(0x7f0702c3, new Object[] {
            Float.valueOf(d())
        }));
        d = (TextView)layoutinflater.findViewById(0x7f1001e1);
        d.setText(e());
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final FreeStickerBundleFragment a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.view.fragments.FreeStickerBundleFragment.a(a);
            }

            
            {
                a = FreeStickerBundleFragment.this;
                super();
            }
        });
        ((com.androidquery.a)viewgroup.a(0x7f1001de)).a(b);
        if (TextUtils.isEmpty(a.c()))
        {
            ((com.androidquery.a)viewgroup.a(0x7f1001df)).c();
        } else
        {
            ((com.androidquery.a)viewgroup.a(0x7f1001df)).a(a.c());
        }
        ((com.androidquery.a)viewgroup.a(0x7f1001e0)).a(c);
        a((ImageView)layoutinflater.findViewById(0x7f1001dd));
        if (!c())
        {
            a(false);
        }
        layoutinflater.findViewById(0x7f1001e0).setVisibility(0);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (d != null)
        {
            d.setOnClickListener(null);
            d = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        if (c())
        {
            com.cardinalblue.android.piccollage.controller.d.a().a(this);
        }
    }

    public void onStop()
    {
        super.onStop();
        if (c())
        {
            com.cardinalblue.android.piccollage.controller.d.a().b(this);
        }
    }

    public void onVideoAdFinished(OnVideoAdFinishedEvent onvideoadfinishedevent)
    {
        d.setText(0x7f07012f);
    }
}
