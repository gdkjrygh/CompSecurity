// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.view.View;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            NativeButton

class val.on
    implements Runnable
{

    final NativeButton this$0;
    final boolean val$on;

    public void run()
    {
        Log.d("NatBut", (new StringBuilder()).append("setOn: ").append(imgName).toString());
        button.setSelected(val$on);
    }

    ()
    {
        this$0 = final_nativebutton;
        val$on = Z.this;
        super();
    }
}
