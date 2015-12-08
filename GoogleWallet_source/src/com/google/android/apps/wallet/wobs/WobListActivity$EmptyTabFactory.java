// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListActivity

final class this._cls0
    implements android.widget.vity.EmptyTabFactory
{

    final WobListActivity this$0;

    public final View createTabContent(String s)
    {
        s = new View(WobListActivity.this);
        s.setMinimumWidth(0);
        s.setMinimumHeight(0);
        return s;
    }

    public I()
    {
        this$0 = WobListActivity.this;
        super();
    }
}
