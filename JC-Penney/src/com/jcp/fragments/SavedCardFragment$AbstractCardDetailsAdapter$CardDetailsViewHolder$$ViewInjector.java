// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector,  , Object obj)
    {
        . = (ImageView)ector.eView((View)ector.eView(obj, 0x7f0e0469, "field 'iconImageView'"), 0x7f0e0469, "field 'iconImageView'");
        .View = (TextView)ector.erTextView((View)ector.erTextView(obj, 0x7f0e046a, "field 'cardNumberTextView'"), 0x7f0e046a, "field 'cardNumberTextView'");
        .extView = (TextView)ector.hYearTextView((View)ector.hYearTextView(obj, 0x7f0e0471, "field 'cardMonthYearTextView'"), 0x7f0e0471, "field 'cardMonthYearTextView'");
        .extView = (ImageView)ector.mage((View)ector.mage(obj, 0x7f0e046d, "field 'defaultImage'"), 0x7f0e046d, "field 'defaultImage'");
        . = (ImageView)ector.tImage((View)ector.tImage(obj, 0x7f0e046e, "field 'unDefaultImage'"), 0x7f0e046e, "field 'unDefaultImage'");
        . = (ImageView)ector.rd((View)ector.rd(obj, 0x7f0e0470, "field 'deleteCard'"), 0x7f0e0470, "field 'deleteCard'");
        . = (TextView)ector.nOff((View)ector.nOff(obj, 0x7f0e046f, "field 'defaultOnOff'"), 0x7f0e046f, "field 'defaultOnOff'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.View = null;
        inject1.extView = null;
        inject1.extView = null;
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
