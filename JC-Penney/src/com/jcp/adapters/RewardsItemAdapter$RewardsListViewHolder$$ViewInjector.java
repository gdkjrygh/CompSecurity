// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            cl, cm

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (TextView)ctor.dstv((View)ctor.dstv(obj, 0x7f0e034a, "field 'earnRewardstv'"), 0x7f0e034a, "field 'earnRewardstv'");
        .tv = (TextView)ctor.pDatetv((View)ctor.pDatetv(obj, 0x7f0e034b, "field 'rewardsExpDatetv'"), 0x7f0e034b, "field 'rewardsExpDatetv'");
        .tv = (TextView)ctor.ltv((View)ctor.ltv(obj, 0x7f0e024d, "field 'rewardsavltv'"), 0x7f0e024d, "field 'rewardsavltv'");
        .mber = (TextView)ctor.ialNumber((View)ctor.ialNumber(obj, 0x7f0e024f, "field 'rewardSerialNumber'"), 0x7f0e024f, "field 'rewardSerialNumber'");
        .ection = (LinearLayout)ctor.ttomSection((View)ctor.ttomSection(obj, 0x7f0e024b, "field 'rewardsBottomSection'"), 0x7f0e024b, "field 'rewardsBottomSection'");
        .umber = (TextView)ctor.CodeNumber((View)ctor.CodeNumber(obj, 0x7f0e0251, "field 'rewardBarCodeNumber'"), 0x7f0e0251, "field 'rewardBarCodeNumber'");
        .umber = (ImageView)ctor.age((View)ctor.age(obj, 0x7f0e0250, "field 'barcodeImage'"), 0x7f0e0250, "field 'barcodeImage'");
        View view = (View)ctor.age(obj, 0x7f0e034c, "field 'applyBagButton' and method 'onClick'");
        . = (Button)ctor.utton(view, 0x7f0e034c, "field 'applyBagButton'");
        view.setOnClickListener(new cl(this, ));
        obj = (View)ctor.ctor(obj, 0x7f0e0252, "field 'easyScanLayout' and method 'launchRewardCardActivity'");
        . = (TextView)ctor.ayout(((View) (obj)), 0x7f0e0252, "field 'easyScanLayout'");
        ((View) (obj)).setOnClickListener(new cm(this, ));
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.tv = null;
        inject1.tv = null;
        inject1.mber = null;
        inject1.ection = null;
        inject1.umber = null;
        inject1.umber = null;
        inject1. = null;
        inject1. = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
