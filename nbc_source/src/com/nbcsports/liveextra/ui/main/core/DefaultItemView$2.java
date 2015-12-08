// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.widget.PopupMenu;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            DefaultItemView

class val.popup
    implements Runnable
{

    final DefaultItemView this$0;
    final PopupMenu val$popup;

    public void run()
    {
        val$popup.dismiss();
    }

    ()
    {
        this$0 = final_defaultitemview;
        val$popup = PopupMenu.this;
        super();
    }
}
