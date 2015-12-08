// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import a.a.a;
import android.view.View;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchItemRenderer

class val.target extends a
{

    final val.target this$0;
    final SearchItemRenderer val$target;

    public void doClick(View view)
    {
        val$target.onSearchClick(view);
    }

    ()
    {
        this$0 = final_;
        val$target = SearchItemRenderer.this;
        super();
    }
}
