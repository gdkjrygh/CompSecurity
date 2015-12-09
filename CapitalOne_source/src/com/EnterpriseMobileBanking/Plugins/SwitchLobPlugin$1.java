// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;


// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            SwitchLobPlugin, BusyJSI

class this._cls0
    implements Runnable
{

    final SwitchLobPlugin this$0;

    public void run()
    {
        BusyJSI.forceHide();
    }

    ()
    {
        this$0 = SwitchLobPlugin.this;
        super();
    }
}
