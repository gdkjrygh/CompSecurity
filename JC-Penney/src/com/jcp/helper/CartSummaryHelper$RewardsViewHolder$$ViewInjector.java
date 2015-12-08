// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class 
    implements butterknife.or
{

    public void inject(butterknife.or or,  , Object obj)
    {
        . = (Button)or.Btn((View)or.Btn(obj, 0x7f0e034c, "field 'applyRewardBtn'"), 0x7f0e034c, "field 'applyRewardBtn'");
        . = (TextView)or.e((View)or.e(obj, 0x7f0e034a, "field 'rewardsTitle'"), 0x7f0e034a, "field 'rewardsTitle'");
        . = (TextView)or.ate((View)or.ate(obj, 0x7f0e034b, "field 'rewardsExpDate'"), 0x7f0e034b, "field 'rewardsExpDate'");
    }

    public volatile void inject(butterknife.or or, Object obj, Object obj1)
    {
        inject(or, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1. = null;
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
