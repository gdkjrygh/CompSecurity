// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.mobvista.sdk.m.a.a.a.a;
import com.mobvista.sdk.m.a.a.a.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g extends c
{

    public g(a a1)
    {
        super(a1);
    }

    private com.mobvista.sdk.m.core.entity.c a(Cursor cursor)
    {
        this;
        JVM INSTR monitorenter ;
        com.mobvista.sdk.m.core.entity.c c1;
        c1 = new com.mobvista.sdk.m.core.entity.c();
        c1.a(cursor.getString(cursor.getColumnIndexOrThrow("name")));
        c1.a(cursor.getInt(cursor.getColumnIndexOrThrow("weight")));
        c1.b(cursor.getString(cursor.getColumnIndexOrThrow("unitID")));
        this;
        JVM INSTR monitorexit ;
        return c1;
        cursor;
        throw cursor;
    }

    private boolean a(String s, com.mobvista.sdk.m.core.entity.c c1, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("profileName", s);
        contentvalues.put("name", c1.a());
        contentvalues.put("weight", Integer.valueOf(c1.b()));
        contentvalues.put("unitID", s1);
        if (!b(s, s1)) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder("profileName='")).append(s).append("' AND ").append("unitID = '").append(s1).append("'").toString();
        d().a("Weight", contentvalues, s, null);
_L6:
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        try
        {
            d().a("Weight", null, contentvalues);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            this;
        }
        s.printStackTrace();
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        throw s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder("SELECT id FROM Weight WHERE profileName='")).append(s).append("' AND ").append("unitID = '").append(s1).append("'").toString();
        s = c().a(s, null);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getCount() <= 0) goto _L2; else goto _L3
_L3:
        s.close();
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        s.close();
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public final Map a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = c().a("Weight", null, "profileName=?", new String[] {
            s
        }, null, null, null, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        HashMap hashmap;
        if (s.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        hashmap = new HashMap();
        s.moveToFirst();
        for (; !s.isAfterLast(); s.moveToNext())
        {
            s1 = a(((Cursor) (s)));
            hashmap.put(s1.a(), s1);
        }

          goto _L1
        Object obj;
        obj;
        s1 = s;
        s = hashmap;
_L6:
        ((Exception) (obj)).printStackTrace();
        obj = s;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s1.close();
        obj = s;
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
_L1:
        s1 = hashmap;
_L7:
        obj = s1;
        if (s == null) goto _L3; else goto _L2
_L2:
        s.close();
        obj = s1;
          goto _L3
        s;
        throw s;
        s1;
        s = null;
_L5:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        s.close();
        throw s1;
        s1;
        continue; /* Loop/switch isn't completed */
        obj;
        s = s1;
        s1 = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        s1 = null;
        s = null;
          goto _L6
        obj;
        s1 = s;
        s = null;
          goto _L6
        s1 = null;
          goto _L7
    }

    public final boolean a(String s, Map map, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(s, (com.mobvista.sdk.m.core.entity.c)map.get((String)iterator.next()), s1)) { }
          goto _L1
        s;
        s.printStackTrace();
        boolean flag = false;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L1:
        flag = true;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        throw s;
    }
}
