// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.view.View;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            NativeButton

static final class val.lb
    implements Runnable
{

    final View val$lb;

    public void run()
    {
        Log.d("NatBut", (new StringBuilder()).append("Deselecting: <").append(val$lb.getTag()).append(">").toString());
        val$lb.setSelected(false);
        val$lb.postInvalidate();
    }

    (View view)
    {
        val$lb = view;
        super();
    }
}
