// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;

// Referenced classes of package com.pandora.android.activity:
//            g

class  extends AsyncQueryHandler
{

    final g a;

    protected void onQueryComplete(int i, Object obj, Cursor cursor)
    {
        if ((g.a(a) instanceof Activity) && !((Activity)g.a(a)).isFinishing())
        {
            obj = a;
            boolean flag;
            if (cursor != null && cursor.getCount() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((g) (obj)).a(flag);
        }
    }

    (g g1, ContentResolver contentresolver)
    {
        a = g1;
        super(contentresolver);
    }
}
