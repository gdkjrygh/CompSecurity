// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.widget.ImageView;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            TopPanel

class this._cls0
    implements Runnable
{

    final TopPanel this$0;

    public void run()
    {
        android.widget.ImageButton imagebutton = TopPanel.access$300(TopPanel.this);
        if (imagebutton != null && !imagebutton.isShown())
        {
            imagebutton.setVisibility(0);
        }
    }

    ()
    {
        this$0 = TopPanel.this;
        super();
    }
}
