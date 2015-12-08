// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.webkit.WebSettings;

// Referenced classes of package com.amobee.richmedia.view:
//            Browser

class 
{

    final Browser this$0;

    public (WebSettings websettings)
    {
        this$0 = Browser.this;
        super();
        try
        {
            websettings.setLoadWithOverviewMode(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Browser browser)
        {
            return;
        }
    }
}
