// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            InAppPromoActivity, s

public class _cls9
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, InAppPromoActivity inapppromoactivity, Object obj)
    {
        inapppromoactivity.webView = (JCPWebView)jector.((View)jector.ew(obj, 0x7f0e0156, "field 'webView'"), 0x7f0e0156, "field 'webView'");
        ((View)jector.ew(obj, 0x7f0e0095, "method 'close'")).setOnClickListener(new s(this, inapppromoactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (InAppPromoActivity)obj, obj1);
    }

    public void reset(InAppPromoActivity inapppromoactivity)
    {
        inapppromoactivity.webView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((InAppPromoActivity)obj);
    }

    public _cls9()
    {
    }
}
