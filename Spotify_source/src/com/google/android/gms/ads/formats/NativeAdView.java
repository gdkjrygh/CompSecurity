// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bew;
import bfq;
import bhj;
import bjz;
import bka;
import btl;
import byb;
import cbw;
import cda;

public abstract class NativeAdView extends FrameLayout
{

    private final FrameLayout a;
    private final cbw b;

    public NativeAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = a(context);
        b = a();
    }

    public NativeAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = a(context);
        b = a();
    }

    private FrameLayout a(Context context)
    {
        context = new FrameLayout(context);
        context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(context);
        return context;
    }

    private cbw a()
    {
        Object obj;
label0:
        {
            btl.a(a, "createDelegate must be called after mOverlayFrame has been created");
            obj = bfq.d();
            Object obj1 = a.getContext();
            FrameLayout framelayout = a;
            bfq.a();
            if (bjz.b(((Context) (obj1))))
            {
                obj1 = ((cda) (obj)).a(((Context) (obj1)), this, framelayout);
                obj = obj1;
                if (obj1 != null)
                {
                    break label0;
                }
            }
            bka.a("Using NativeAdViewDelegate from the client jar.");
            obj = new bhj(this, framelayout);
        }
        return ((cbw) (obj));
    }

    public final void a(bew bew1)
    {
        try
        {
            b.a((byb)bew1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bew bew1)
        {
            bka.b("Unable to call setNativeAd on delegate", bew1);
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        super.bringChildToFront(a);
    }

    public void bringChildToFront(View view)
    {
        super.bringChildToFront(view);
        if (a != view)
        {
            super.bringChildToFront(a);
        }
    }

    public void removeAllViews()
    {
        super.removeAllViews();
        super.addView(a);
    }

    public void removeView(View view)
    {
        if (a == view)
        {
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }
}
