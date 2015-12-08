// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

class this._cls0
    implements Runnable
{

    final GuidedSearchBar this$0;

    public void run()
    {
        _tokenScrollable.fullScroll(66);
        loseFocus();
    }

    ()
    {
        this$0 = GuidedSearchBar.this;
        super();
    }
}
