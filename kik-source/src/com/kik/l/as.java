// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import kik.a.d.a.a;

// Referenced classes of package com.kik.l:
//            y

final class as extends y
{

    public as(Cursor cursor)
    {
        super(cursor);
    }

    public static ArrayList a(a a1)
    {
        Object obj = a1.f();
        ArrayList arraylist = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
        {
            com.kik.f.a.a.a a2 = (com.kik.f.a.a.a)((Iterator) (obj)).next();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("platform", a2.c());
            contentvalues.put("content_uri", a2.f());
            contentvalues.put("type", a2.d());
            contentvalues.put("byline", a2.e());
            contentvalues.put("priority", Integer.valueOf(i));
            contentvalues.put("content_id", a1.o());
            contentvalues.put("file_content_type", a2.i());
            arraylist.add(contentvalues);
        }

        return arraylist;
    }

    final a b(a a1)
    {
        if (a1 != null)
        {
            a1.a(c("content_uri"), c("platform"), c("type"), c("byline"), c("file_content_type"));
        }
        return a1;
    }
}
