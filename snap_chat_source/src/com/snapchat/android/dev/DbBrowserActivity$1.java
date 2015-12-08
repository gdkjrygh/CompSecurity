// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.dev;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.snapchat.android.dev:
//            DbBrowserActivity

final class a
    implements android.view.
{

    private DbBrowserActivity a;

    public final void onClick(View view)
    {
        DbBrowserActivity.a(a).smoothScrollToPosition(0);
    }

    (DbBrowserActivity dbbrowseractivity)
    {
        a = dbbrowseractivity;
        super();
    }
}
