// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.views.TypefaceButton;
import com.jcp.views.TypefaceTextView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (TypefaceTextView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e01ac, "field 'nameView'"), 0x7f0e01ac, "field 'nameView'");
        . = (TypefaceTextView)ctor.w((View)ctor.w(obj, 0x7f0e01ad, "field 'streetView'"), 0x7f0e01ad, "field 'streetView'");
        . = (TypefaceTextView)ctor.ew((View)ctor.ew(obj, 0x7f0e01af, "field 'addressView'"), 0x7f0e01af, "field 'addressView'");
        . = (TypefaceTextView)ctor.iew((View)ctor.iew(obj, 0x7f0e01ae, "field 'distanceView'"), 0x7f0e01ae, "field 'distanceView'");
        . = (TextView)ctor.lable((View)ctor.lable(obj, 0x7f0e01e5, "field 'itemsAvailable'"), 0x7f0e01e5, "field 'itemsAvailable'");
        . = (TypefaceButton)ctor.((View)ctor.(obj, 0x7f0e01e8, "field 'storepick'"), 0x7f0e01e8, "field 'storepick'");
        . = (LinearLayout)ctor.((View)ctor.(obj, 0x7f0e01e7, "field 'llview'"), 0x7f0e01e7, "field 'llview'");
        .t = (RelativeLayout)ctor.Layout((View)ctor.Layout(obj, 0x7f0e01e2, "field 'storeInfoLayout'"), 0x7f0e01e2, "field 'storeInfoLayout'");
        .t = (HorizontalScrollView)ctor.((View)ctor.(obj, 0x7f0e01e6, "field 'hsvimages'"), 0x7f0e01e6, "field 'hsvimages'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
        inject1. = null;
        inject1. = null;
        inject1. = null;
        inject1.t = null;
        inject1.t = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
