// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RatingBar;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (RadioButton)ctor.ctor((View)ctor.ctor(obj, 0x7f0e03ac, "field 'radioBtn'"), 0x7f0e03ac, "field 'radioBtn'");
        . = (RatingBar)ctor.((View)ctor.(obj, 0x7f0e03ad, "field 'ratingBar'"), 0x7f0e03ad, "field 'ratingBar'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.inject = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
