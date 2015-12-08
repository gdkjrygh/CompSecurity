// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.f;
import android.support.v4.content.i;
import com.pandora.android.inbox.b;

// Referenced classes of package com.pandora.android.activity:
//            HomeTabsActivity, g

class a
    implements android.support.v4.app.ity._cls1
{

    final HomeTabsActivity a;

    public void a(i i, Cursor cursor)
    {
        boolean flag = false;
        int j;
        if (cursor != null)
        {
            j = cursor.getCount();
        } else
        {
            j = 0;
        }
        i = HomeTabsActivity.a(a);
        if (j > 0)
        {
            flag = true;
        }
        i.a(flag);
    }

    public i onCreateLoader(int i, Bundle bundle)
    {
        bundle = a;
        android.net.Uri uri = b.a;
        String s = (new StringBuilder()).append(b.r).append(" AND ").append(b.q).toString();
        return new f(bundle, uri, new String[] {
            "isSeen"
        }, s, null, null);
    }

    public void onLoadFinished(i i, Object obj)
    {
        a(i, (Cursor)obj);
    }

    public void onLoaderReset(i i)
    {
        HomeTabsActivity.a(a).a(false);
    }

    (HomeTabsActivity hometabsactivity)
    {
        a = hometabsactivity;
        super();
    }
}
