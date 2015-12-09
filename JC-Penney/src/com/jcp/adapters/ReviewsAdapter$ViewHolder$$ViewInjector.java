// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        .r = (View)ctor.tainer(obj, 0x7f0e0416, "field 'reviewContainer'");
        .r = (TextView)ctor.tainer((View)ctor.tainer(obj, 0x7f0e041a, "field 'title'"), 0x7f0e041a, "field 'title'");
        .r = (TextView)ctor.tainer((View)ctor.tainer(obj, 0x7f0e0418, "field 'username'"), 0x7f0e0418, "field 'username'");
        .r = (TextView)ctor.tainer((View)ctor.tainer(obj, 0x7f0e0419, "field 'date'"), 0x7f0e0419, "field 'date'");
        .r = (TextView)ctor.tainer((View)ctor.tainer(obj, 0x7f0e041b, "field 'review'"), 0x7f0e041b, "field 'review'");
        .r = (ImageView)ctor.tainer((View)ctor.tainer(obj, 0x7f0e041c, "field 'arrow'"), 0x7f0e041c, "field 'arrow'");
        .r = (RatingBar)ctor.tainer((View)ctor.tainer(obj, 0x7f0e0417, "field 'rating'"), 0x7f0e0417, "field 'rating'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.r = null;
        inject1.r = null;
        inject1.r = null;
        inject1.r = null;
        inject1.r = null;
        inject1.r = null;
        inject1.r = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
