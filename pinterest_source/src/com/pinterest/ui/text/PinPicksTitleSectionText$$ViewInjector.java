// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.text:
//            PinPicksTitleSectionText

public class 
{

    public static void inject(butterknife.wInjector winjector, PinPicksTitleSectionText pinpickstitlesectiontext, Object obj)
    {
        pinpickstitlesectiontext._titleEt = (TextView)winjector.leEt(obj, 0x7f0f0077, "field '_titleEt'");
        pinpickstitlesectiontext._subtitleEt = (TextView)winjector.titleEt(obj, 0x7f0f01d1, "field '_subtitleEt'");
    }

    public static void reset(PinPicksTitleSectionText pinpickstitlesectiontext)
    {
        pinpickstitlesectiontext._titleEt = null;
        pinpickstitlesectiontext._subtitleEt = null;
    }

    public ()
    {
    }
}
