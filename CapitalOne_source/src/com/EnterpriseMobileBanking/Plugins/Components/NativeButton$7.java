// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.view.View;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            NativeButton

class this._cls0
    implements Runnable
{

    final NativeButton this$0;

    public void run()
    {
        Log.d("NatBut", (new StringBuilder()).append("Deslsecting: ").append(imgName).toString());
        button.setPressed(false);
        button.setSelected(false);
        button.invalidate();
    }

    ()
    {
        this$0 = NativeButton.this;
        super();
    }
}
