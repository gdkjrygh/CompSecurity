// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import com.nbcsports.liveextra.ui.views.ContentLoadingOverlay;

// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            BaseFragment

class this._cls0
    implements Runnable
{

    final BaseFragment this$0;

    public void run()
    {
        if (modal != null)
        {
            modal.hide();
        }
    }

    Overlay()
    {
        this$0 = BaseFragment.this;
        super();
    }
}
