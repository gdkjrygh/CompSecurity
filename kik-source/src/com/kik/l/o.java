// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import kik.a.d.a.a;
import kik.a.d.d;
import kik.a.h.i;

// Referenced classes of package com.kik.l:
//            y

final class o extends y
{

    public o(Cursor cursor)
    {
        super(cursor);
    }

    public static ArrayList a(a a1)
    {
        Hashtable hashtable = a1.q();
        Hashtable hashtable1 = a1.r();
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        hashmap.put(Integer.valueOf(2), hashtable1);
        hashmap.put(Integer.valueOf(4), hashtable);
        for (Iterator iterator = hashmap.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Iterator iterator1 = ((Hashtable)entry.getValue()).entrySet().iterator();
            int j = ((Integer)entry.getKey()).intValue();
            while (iterator1.hasNext()) 
            {
                ContentValues contentvalues = new ContentValues();
                Object obj = (java.util.Map.Entry)iterator1.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (String)((java.util.Map.Entry) (obj)).getValue();
                if (!i.a(s) && !i.a(((CharSequence) (obj))))
                {
                    contentvalues.put("content_id", a1.o());
                    contentvalues.put("content_type", Integer.valueOf(j));
                    contentvalues.put("content_name", s);
                    contentvalues.put("content_string", ((String) (obj)));
                    arraylist.add(contentvalues);
                }
            }
        }

        return arraylist;
    }

    final a b(a a1)
    {
        String s;
        String s1;
        int j;
        c("content_id");
        j = d("content_type");
        s = c("content_name");
        s1 = c("content_string");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 2 4: default 60
    //                   2 95
    //                   3 70
    //                   4 62;
           goto _L2 _L3 _L4 _L5
_L2:
        return a1;
_L5:
        a1.c(s, s1);
        return a1;
_L4:
        d d1 = new d(null);
        d1.a(s1);
        a1.a(s, d1);
        return a1;
_L3:
        a1.a(s, s1);
        return a1;
    }
}
