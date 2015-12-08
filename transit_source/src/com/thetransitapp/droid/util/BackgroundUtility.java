// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;

public final class BackgroundUtility
{

    private BackgroundUtility()
    {
    }

    public static void setGlossyBackground(View view, int i, int j, int k, boolean flag)
    {
        Drawable adrawable[];
        LayerDrawable layerdrawable;
        boolean flag1;
        byte byte0;
        if (flag && android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            byte0 = 6;
        } else
        {
            byte0 = 5;
        }
        adrawable = new Drawable[byte0];
        adrawable[0] = new PaintDrawable(i);
        adrawable[1] = new PaintDrawable(0xbb000000);
        adrawable[2] = new PaintDrawable(k);
        adrawable[3] = new PaintDrawable(j);
        adrawable[4] = new PaintDrawable(i);
        if (flag1)
        {
            adrawable[5] = view.getContext().getResources().getDrawable(0x7f020092);
            adrawable[5].setAlpha(86);
        }
        layerdrawable = new LayerDrawable(adrawable);
        layerdrawable.setLayerInset(2, 0, 0, 0, 2);
        layerdrawable.setLayerInset(3, 0, 2, 0, 2);
        layerdrawable.setLayerInset(4, 2, 2, 2, 2);
        view.setBackgroundDrawable(layerdrawable);
    }

    public static void setGlossyBackground(View view, NearbyRouteViewModel nearbyrouteviewmodel)
    {
        setGlossyBackground(view, nearbyrouteviewmodel.getColor(), nearbyrouteviewmodel.getGlossColor(), nearbyrouteviewmodel.getTopGlossColor(), true);
    }

    public static void setGlossyBackground(View view, NearbyRouteViewModel nearbyrouteviewmodel, boolean flag)
    {
        setGlossyBackground(view, nearbyrouteviewmodel.getColor(), nearbyrouteviewmodel.getGlossColor(), nearbyrouteviewmodel.getTopGlossColor(), flag);
    }
}
