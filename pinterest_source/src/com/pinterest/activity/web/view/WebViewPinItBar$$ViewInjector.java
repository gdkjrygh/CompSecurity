// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.widget.ImageButton;
import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.web.view:
//            WebViewPinItBar

public class 
{

    public static void inject(butterknife.ItBar itbar, WebViewPinItBar webviewpinitbar, Object obj)
    {
        webviewpinitbar._openButton = (PButton)itbar._openButton(obj, 0x7f0f0306, "field '_openButton'");
        webviewpinitbar._pinItButton = itbar._pinItButton(obj, 0x7f0f0305, "field '_pinItButton'");
        webviewpinitbar._feedbackButton = (ImageButton)itbar._feedbackButton(obj, 0x7f0f0307, "field '_feedbackButton'");
    }

    public static void reset(WebViewPinItBar webviewpinitbar)
    {
        webviewpinitbar._openButton = null;
        webviewpinitbar._pinItButton = null;
        webviewpinitbar._feedbackButton = null;
    }

    public ()
    {
    }
}
