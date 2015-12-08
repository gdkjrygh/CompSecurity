// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.util.Pair;
import com.pinterest.activity.pin.view.modules.util.ClickThroughUtil;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;

public class PinUtils
{

    public PinUtils()
    {
    }

    public static void repinOrSavePin(Pin pin, String s, String s1)
    {
        if (pin.isCSR())
        {
            s = new Pair("com.pinterest.IS_CSR_REPIN", Boolean.valueOf(true));
            ClickThroughUtil.gotoPinLink(pin.getClickThroughUrl(), pin, s1, s, true);
            return;
        }
        StopWatch.get().start("repin_dialog");
        pin = new Navigation(Location.REPIN, pin);
        if (s != null)
        {
            pin.putExtra("com.pinterest.EXTRA_IMAGE_SIGNATURE", s);
        }
        Events.post(pin);
    }
}
