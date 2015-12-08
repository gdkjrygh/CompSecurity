// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.view.View;
import com.amobee.adsdk.Log;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeChromeClient

class this._cls0
    implements android.view.tener
{

    final AmobeeChromeClient this$0;

    public void onFocusChange(View view, boolean flag)
    {
        Log.d("VideoView on focus change", (new StringBuilder("view;")).append(view).append(", hasFocus:").append(flag).toString());
    }

    ()
    {
        this$0 = AmobeeChromeClient.this;
        super();
    }
}
