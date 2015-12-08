// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.view.View;
import android.widget.AdapterView;
import com.scannerfire.utils.EncodeUtils;
import java.util.ArrayList;

// Referenced classes of package com.QRBS.activity:
//            BookmarksListActivity

class this._cls0
    implements android.widget.istener
{

    final BookmarksListActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        (new EncodeUtils(BookmarksListActivity.this)).start((String)BookmarksListActivity.access$1(BookmarksListActivity.this).get(i), (String)BookmarksListActivity.access$1(BookmarksListActivity.this).get(i));
    }

    ener()
    {
        this$0 = BookmarksListActivity.this;
        super();
    }
}
