// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            df

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (TextView)ctor.tatus((View)ctor.tatus(obj, 0x7f0e0376, "field 'shippingStatus'"), 0x7f0e0376, "field 'shippingStatus'");
        .ndTime = (TextView)ctor.DateAndTime((View)ctor.DateAndTime(obj, 0x7f0e0377, "field 'deliveredDateAndTime'"), 0x7f0e0377, "field 'deliveredDateAndTime'");
        .ion = (TextView)ctor.Location((View)ctor.Location(obj, 0x7f0e01a4, "field 'deliveredLocation'"), 0x7f0e01a4, "field 'deliveredLocation'");
        .Layout = (LinearLayout)ctor.lInfoLayout((View)ctor.lInfoLayout(obj, 0x7f0e037a, "field 'additionalInfoLayout'"), 0x7f0e037a, "field 'additionalInfoLayout'");
        .e = (TextView)ctor.ervice((View)ctor.ervice(obj, 0x7f0e037c, "field 'shippingService'"), 0x7f0e037c, "field 'shippingService'");
        .e = (TextView)ctor.ervice((View)ctor.ervice(obj, 0x7f0e037e, "field 'type'"), 0x7f0e037e, "field 'type'");
        .e = (TextView)ctor.ervice((View)ctor.ervice(obj, 0x7f0e0380, "field 'weight'"), 0x7f0e0380, "field 'weight'");
        View view = (View)ctor.ervice(obj, 0x7f0e0383, "field 'contactNumber' and method 'onPhoneClick'");
        .e = (TextView)ctor.mber(view, 0x7f0e0383, "field 'contactNumber'");
        view.setOnClickListener(new df(this, ));
        .e = (LinearLayout)ctor.yout((View)ctor.yout(obj, 0x7f0e0378, "field 'chevronLayout'"), 0x7f0e0378, "field 'chevronLayout'");
        .ew = (ImageView)ctor.ageView((View)ctor.ageView(obj, 0x7f0e0379, "field 'chevronImageView'"), 0x7f0e0379, "field 'chevronImageView'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1. = null;
        inject1.ndTime = null;
        inject1.ion = null;
        inject1.Layout = null;
        inject1.e = null;
        inject1.e = null;
        inject1.e = null;
        inject1.e = null;
        inject1.e = null;
        inject1.ew = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
