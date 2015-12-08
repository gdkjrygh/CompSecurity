// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            GiftCardActivity, q

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, GiftCardActivity giftcardactivity, Object obj)
    {
        giftcardactivity.webView = (JCPWebView)jector.((View)jector.View(obj, 0x7f0e014c, "field 'webView'"), 0x7f0e014c, "field 'webView'");
        ((View)jector.View(obj, 0x7f0e014b, "method 'closeGiftCardActivity'")).setOnClickListener(new q(this, giftcardactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (GiftCardActivity)obj, obj1);
    }

    public void reset(GiftCardActivity giftcardactivity)
    {
        giftcardactivity.webView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((GiftCardActivity)obj);
    }

    public ()
    {
    }
}
