// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.z;
import kik.android.util.bx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.l:
//            y

public class ap extends y
{

    public ap(Cursor cursor)
    {
        super(cursor);
    }

    public static ContentValues a(List list, String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("bin_id", s);
        if (list != null && list.size() > 0)
        {
            contentvalues.put("suggested_responses", a(list));
            return contentvalues;
        } else
        {
            contentvalues.put("suggested_responses", "[]");
            return contentvalues;
        }
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder("[");
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(","))
        {
            stringbuilder.append(((z)list.next()).d());
        }

        return (new StringBuilder()).append(stringbuilder.substring(0, stringbuilder.length() - 1)).append("]").toString();
    }

    public final List a()
    {
        ArrayList arraylist;
        Object obj;
        obj = c("suggested_responses");
        arraylist = new ArrayList();
        obj = new JSONArray(((String) (obj)));
        int i = 0;
_L2:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        arraylist.add(new z(jsonobject.getString("type"), jsonobject.getString("data")));
        i++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        bx.c(jsonexception);
_L1:
        return arraylist;
    }
}
