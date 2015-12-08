// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeChromeClient, AmobeeView

class val.ormma
    implements android.view.romeClient._cls1
{

    final AmobeeChromeClient this$0;
    private final AmobeeView val$ormma;
    private final View val$view;

    public boolean onKey(View view1, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            closeVideo(val$view, val$ormma);
            AmobeeChromeClient.access$0(AmobeeChromeClient.this).requestFocus();
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = final_amobeechromeclient;
        val$view = view1;
        val$ormma = AmobeeView.this;
        super();
    }
}
