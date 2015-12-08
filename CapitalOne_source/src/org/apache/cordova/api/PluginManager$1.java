// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.api;

import com.EnterpriseMobileBanking.Plugins.BusyJSI;

// Referenced classes of package org.apache.cordova.api:
//            PluginManager

class this._cls0
    implements Runnable
{

    final PluginManager this$0;

    public void run()
    {
        BusyJSI.forceHide();
    }

    yJSI()
    {
        this$0 = PluginManager.this;
        super();
    }
}
