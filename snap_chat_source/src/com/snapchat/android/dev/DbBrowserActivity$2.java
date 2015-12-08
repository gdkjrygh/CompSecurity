// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.dev;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.snapchat.android.dev:
//            DbBrowserActivity

final class a
    implements android.widget.ickListener
{

    private b a;
    private DbBrowserActivity b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (a.getItem(i)));
        if (adapterview instanceof com.snapchat.android.database.table.e)
        {
            adapterview = (com.snapchat.android.database.table.e)adapterview;
            DbBrowserActivity.a(b, adapterview);
            b.c();
        }
        DbBrowserActivity.b(b).a(false);
    }

    atabaseTable(DbBrowserActivity dbbrowseractivity, atabaseTable atabasetable)
    {
        b = dbbrowseractivity;
        a = atabasetable;
        super();
    }
}
