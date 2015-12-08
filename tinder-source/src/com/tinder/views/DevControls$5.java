// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.support.v4.g.g;
import com.tinder.managers.d;
import com.tinder.model.GlobalConfig;
import com.tinder.model.UserMeta;

// Referenced classes of package com.tinder.views:
//            DevControls

class vPanelStatusRunnable extends vPanelStatusRunnable
{

    final DevControls this$0;

    public g run()
    {
        Object obj = d.c();
        int i;
        if (obj != null)
        {
            i = ((UserMeta) (obj)).globalConfig.adSwipeLimit;
        } else
        {
            i = -1;
        }
        if (i == -1)
        {
            obj = "No meta";
        } else
        {
            obj = String.valueOf(i);
        }
        return new g("Mad Ave swipe limit", obj);
    }

    vPanelStatusRunnable()
    {
        this$0 = DevControls.this;
        super(DevControls.this);
    }
}
