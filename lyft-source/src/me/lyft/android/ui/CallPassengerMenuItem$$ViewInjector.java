// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.ui.driver.RideProgressPassengerItem;

// Referenced classes of package me.lyft.android.ui:
//            CallPassengerMenuItem

public class 
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (CallPassengerMenuItem)obj, obj1);
    }

    public void inject(butterknife.jector jector, CallPassengerMenuItem callpassengermenuitem, Object obj)
    {
        callpassengermenuitem.label = (TextView)jector.jector((View)jector.jector(obj, 0x7f0d019a, "field 'label'"), 0x7f0d019a, "field 'label'");
        callpassengermenuitem.userImageView = (RideProgressPassengerItem)jector.tem((View)jector.tem(obj, 0x7f0d029b, "field 'userImageView'"), 0x7f0d029b, "field 'userImageView'");
    }

    public volatile void reset(Object obj)
    {
        reset((CallPassengerMenuItem)obj);
    }

    public void reset(CallPassengerMenuItem callpassengermenuitem)
    {
        callpassengermenuitem.label = null;
        callpassengermenuitem.userImageView = null;
    }

    public ()
    {
    }
}
