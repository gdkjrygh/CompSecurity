// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.view.View;

// Referenced classes of package com.soundcloud.android.view:
//            EmptyView

class this._cls0
    implements android.view.Listener
{

    final EmptyView this$0;

    public void onClick(View view)
    {
        if (EmptyView.access$000(EmptyView.this) != null)
        {
            EmptyView.access$000(EmptyView.this).onAction();
        }
    }

    tionListener()
    {
        this$0 = EmptyView.this;
        super();
    }
}
