// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.SharedElementCallback;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity

final class this._cls0 extends SharedElementCallback
{

    final GamesFragmentActivity this$0;

    public final void onRejectSharedElements(List list)
    {
        if (list != null)
        {
            list.clear();
        }
    }

    ()
    {
        this$0 = GamesFragmentActivity.this;
        super();
    }
}
