// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.Plugins.Components.NativeButton;
import java.util.ArrayList;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            QuickNavJSI

class val.index
    implements Runnable
{

    final QuickNavJSI this$0;
    final int val$index;

    public void run()
    {
        ((NativeButton)QuickNavJSI.access$000(QuickNavJSI.this).get(val$index)).onClick(null);
    }

    iveButton()
    {
        this$0 = final_quicknavjsi;
        val$index = I.this;
        super();
    }
}
