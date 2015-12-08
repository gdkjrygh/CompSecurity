// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.QRBS.activity:
//            CreateBookmarks, BookmarksListActivity

class this._cls0
    implements android.view.er
{

    final CreateBookmarks this$0;

    public void onClick(View view)
    {
        view = new Intent(CreateBookmarks.this, com/QRBS/activity/BookmarksListActivity);
        startActivity(view);
    }

    ity()
    {
        this$0 = CreateBookmarks.this;
        super();
    }
}
