// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mobvista.sdk.m.a.a.a.a;
import com.mobvista.sdk.m.a.a.a.c;
import com.mobvista.sdk.m.core.entity.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.mobvista.sdk.m.core.c:
//            g

public final class d extends c
{

    private static d b;
    private g c;

    private d(a a1)
    {
        super(a1);
        c = null;
        c = new g(a1);
    }

    public static d a(a a1)
    {
        com/mobvista/sdk/m/core/c/d;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new d(a1);
        }
        a1 = b;
        com/mobvista/sdk/m/core/c/d;
        JVM INSTR monitorexit ;
        return a1;
        a1;
        throw a1;
    }

    private b a(Cursor cursor, String s)
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        b1 = new b();
        b1.a(cursor.getString(cursor.getColumnIndexOrThrow("name")));
        b1.a(cursor.getInt(cursor.getColumnIndexOrThrow("ver")));
        b1.c(cursor.getString(cursor.getColumnIndexOrThrow("check_md5")));
        b1.b(cursor.getString(cursor.getColumnIndexOrThrow("url")));
        b1.d(cursor.getString(cursor.getColumnIndexOrThrow("appid")));
        b1.g(cursor.getString(cursor.getColumnIndexOrThrow("appkey")));
        b1.e(cursor.getString(cursor.getColumnIndexOrThrow("entryClass")));
        b1.f(cursor.getString(cursor.getColumnIndexOrThrow("modPkgName")));
        b1.b(cursor.getInt(cursor.getColumnIndexOrThrow("state")));
        b1.c(cursor.getInt(cursor.getColumnIndexOrThrow("downloadState")));
        b1.a(a(b1.a(), s));
        this;
        JVM INSTR monitorexit ;
        return b1;
        cursor;
        throw cursor;
    }

    private Map a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = c.a(s, s1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        s.printStackTrace();
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    private boolean a(b b1, String s)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("time", Long.valueOf(System.currentTimeMillis()));
        contentvalues.put("name", b1.a());
        contentvalues.put("ver", Integer.valueOf(b1.b()));
        if (!TextUtils.isEmpty(b1.c())) goto _L2; else goto _L1
_L1:
        contentvalues.put("check_md5", "null");
_L7:
        if (!TextUtils.isEmpty(b1.c())) goto _L4; else goto _L3
_L3:
        contentvalues.put("url", "null");
_L9:
        contentvalues.put("appid", b1.g());
        contentvalues.put("appkey", b1.k());
        contentvalues.put("unitid", s);
        contentvalues.put("entryClass", b1.i());
        if (!TextUtils.isEmpty(b1.j())) goto _L6; else goto _L5
_L5:
        contentvalues.put("modPkgName", "");
_L10:
        contentvalues.put("state", Integer.valueOf(b1.e()));
        contentvalues.put("downloadState", Integer.valueOf(b1.f()));
        if (b(b1.a(), s) <= 0)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        d().a("Profile", contentvalues, "name=? AND unitid=?", new String[] {
            b1.a(), s
        });
_L11:
        boolean flag = flag1;
        if (b1.h() == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        flag = flag1;
        if (b1.h().size() <= 0)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        c.a(b1.a(), b1.h(), s);
        flag = flag1;
_L8:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        contentvalues.put("check_md5", b1.d());
          goto _L7
        b1;
        b1.printStackTrace();
        flag = false;
          goto _L8
_L4:
        contentvalues.put("url", b1.c());
          goto _L9
        b1;
        throw b1;
_L6:
        contentvalues.put("modPkgName", b1.j());
          goto _L10
        d().a("Profile", null, contentvalues);
          goto _L11
    }

    private int b(String s, String s1)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        s1 = c().a("Profile", new String[] {
            " count(name) "
        }, "name=? AND unitid=?", new String[] {
            s, s1
        }, null, null, null);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s = s1;
        if (!s1.moveToFirst()) goto _L2; else goto _L3
_L3:
        s = s1;
        int i = s1.getInt(0);
_L9:
        int j;
        j = i;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s1.close();
        j = i;
_L6:
        this;
        JVM INSTR monitorexit ;
        return j;
        obj;
        s1 = null;
_L8:
        s = s1;
        ((Exception) (obj)).printStackTrace();
        if (s1 == null) goto _L5; else goto _L4
_L4:
        s1.close();
        j = 0;
          goto _L6
_L7:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        s1.close();
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        s1 = s;
        s = ((String) (obj));
          goto _L7
        obj;
          goto _L8
_L5:
        j = 0;
          goto _L6
_L2:
        i = 0;
          goto _L9
        s;
        s1 = ((String) (obj));
          goto _L7
    }

    public final List a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Cursor cursor = c().a("Profile", null, (new StringBuilder("unitid=")).append(s).toString(), null, null, null, null, null);
        Object obj;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        obj = new ArrayList();
        cursor.moveToFirst();
        for (; !cursor.isAfterLast(); cursor.moveToNext())
        {
            ((List) (obj)).add(a(cursor, s));
        }

          goto _L1
        Exception exception;
        exception;
        s = ((String) (obj));
        obj = exception;
_L6:
        ((Exception) (obj)).printStackTrace();
        obj = s;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        cursor.close();
        obj = s;
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L1:
        s = ((String) (obj));
_L7:
        obj = s;
        if (cursor == null) goto _L3; else goto _L2
_L2:
        cursor.close();
        obj = s;
          goto _L3
        s;
        throw s;
        s;
        cursor = null;
_L5:
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        cursor.close();
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        cursor = null;
        s = null;
          goto _L6
        obj;
        s = null;
          goto _L6
        s = null;
          goto _L7
    }

    public final boolean a(List list, String s)
    {
        this;
        JVM INSTR monitorenter ;
        for (list = list.iterator(); list.hasNext(); a((b)list.next(), s)) { }
          goto _L1
        list;
        list.printStackTrace();
        boolean flag = false;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L1:
        flag = true;
        if (true) goto _L3; else goto _L2
_L2:
        list;
        throw list;
    }
}
