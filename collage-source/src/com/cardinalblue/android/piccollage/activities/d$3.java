// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.ContentResolver;
import android.database.Cursor;
import android.support.v4.app.FragmentActivity;
import com.cardinalblue.android.piccollage.MySuggestionProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            d

class a
    implements Callable
{

    final String a;
    final d b;

    public List a()
        throws Exception
    {
        Object obj;
        ArrayList arraylist;
        if (d.c(b))
        {
            obj = MySuggestionProvider.b;
        } else
        {
            obj = MySuggestionProvider.a;
        }
        obj = b.getActivity().getContentResolver().query(((android.net.Uri) (obj)), null, null, new String[] {
            a
        }, null);
        arraylist = new ArrayList();
        if (((Cursor) (obj)).moveToFirst())
        {
            int i = ((Cursor) (obj)).getColumnIndex("suggest_text_1");
            for (; !((Cursor) (obj)).isAfterLast(); ((Cursor) (obj)).moveToNext())
            {
                arraylist.add(((Cursor) (obj)).getString(i));
            }

        }
        ((Cursor) (obj)).close();
        return arraylist;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    vider(d d1, String s)
    {
        b = d1;
        a = s;
        super();
    }
}
