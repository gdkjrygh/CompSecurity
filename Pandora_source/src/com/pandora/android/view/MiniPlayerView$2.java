// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.pandora.android.view:
//            MiniPlayerView

class a
    implements android.view.OnGlobalLayoutListener
{

    final LinearLayout a;
    final MiniPlayerView b;

    public void onGlobalLayout()
    {
        android.widget.youtParams youtparams;
        int i;
        if (android.os._INT < 16)
        {
            a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else
        {
            a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        i = MiniPlayerView.a(b).getHeight();
        youtparams = (android.widget.youtParams)a.getLayoutParams();
        youtparams.height = i;
        a.setLayoutParams(youtparams);
    }

    (MiniPlayerView miniplayerview, LinearLayout linearlayout)
    {
        b = miniplayerview;
        a = linearlayout;
        super();
    }
}
