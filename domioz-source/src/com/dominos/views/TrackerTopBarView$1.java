// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;

// Referenced classes of package com.dominos.views:
//            TrackerTopBarView

class TopBarClickListener
    implements android.view.
{

    final TrackerTopBarView this$0;
    final TopBarClickListener val$listener;

    public void onClick(View view)
    {
        if (val$listener != null)
        {
            val$listener.onHomeButtonClicked();
        }
    }

    TopBarClickListener()
    {
        this$0 = final_trackertopbarview;
        val$listener = TopBarClickListener.this;
        super();
    }
}
