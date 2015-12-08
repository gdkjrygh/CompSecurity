// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            TopPanel

class this._cls0
    implements android.view.kListener
{

    final TopPanel this$0;

    public void onClick(View view)
    {
        boolean flag = false;
        boolean flag1 = PreferenceUtils.getBooleanPref(context, "ui.playeroverlay", false);
        if (flag1)
        {
            Log.d("screen", "Disable debug metadata on player UI");
        } else
        {
            Log.d("screen", "Enable debug metadata on `player UI");
        }
        view = context;
        if (!flag1)
        {
            flag = true;
        }
        PreferenceUtils.putBooleanPref(view, "ui.playeroverlay", flag);
    }

    ()
    {
        this$0 = TopPanel.this;
        super();
    }
}
