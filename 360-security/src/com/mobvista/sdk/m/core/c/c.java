// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.mobvista.sdk.m.core.entity.a;

public final class c extends com.mobvista.sdk.m.a.a.a.c
{

    private static c b;

    private c(com.mobvista.sdk.m.a.a.a.a a1)
    {
        super(a1);
    }

    public static c a(com.mobvista.sdk.m.a.a.a.a a1)
    {
        com/mobvista/sdk/m/core/c/c;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new c(a1);
        }
        a1 = b;
        com/mobvista/sdk/m/core/c/c;
        JVM INSTR monitorexit ;
        return a1;
        a1;
        throw a1;
    }

    private long b(a a1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", a1.a());
        contentvalues.put("unitid", s);
        contentvalues.put("fc_a", Integer.valueOf(a1.b()));
        contentvalues.put("fc_b", Integer.valueOf(a1.c()));
        contentvalues.put("ts", Long.valueOf(a1.f()));
        contentvalues.put("impression_count", Integer.valueOf(a1.d()));
        contentvalues.put("click_count", Integer.valueOf(a1.e()));
        contentvalues.put("ts", Long.valueOf(a1.f()));
        l = d().a("frequence", null, contentvalues);
        this;
        JVM INSTR monitorexit ;
        return l;
        a1;
        throw a1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        String s = (new StringBuilder("ts<")).append(l - 0x5265c00L).toString();
        d().a("frequence", s, null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(a a1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a(a1.a(), s))
        {
            b(a1, s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public final boolean a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder("SELECT id FROM frequence WHERE id='")).append(s).append("' AND ").append("unitid = '").append(s1).append("'").toString();
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

    public final long[] a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder("SELECT id FROM frequence WHERE unitid = '")).append(s).append("' AND fc_a").append("<impression_count").toString();
        s = c().a(s, null);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getCount() <= 0) goto _L2; else goto _L3
_L3:
        long al[] = new long[s.getCount()];
        int i = 0;
_L5:
        if (!s.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        al[i] = s.getLong(s.getColumnIndexOrThrow("id"));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        s.close();
        Object obj;
        obj = al;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s.close();
        obj = al;
_L12:
        this;
        JVM INSTR monitorexit ;
        return ((long []) (obj));
_L2:
        if (s == null) goto _L7; else goto _L6
_L6:
        s.close();
          goto _L7
_L11:
        if (s == null) goto _L7; else goto _L8
_L8:
        s.close();
          goto _L7
        s;
        throw s;
        obj;
        s = null;
_L10:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s.close();
        throw obj;
        obj;
        if (true) goto _L10; else goto _L9
_L9:
        obj;
          goto _L11
_L7:
        obj = null;
          goto _L12
        s;
        s = null;
          goto _L11
    }

    public final void b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a(s, s1))
        {
            s = (new StringBuilder("UPDATE frequence Set impression_count=impression_count+1 WHERE id=")).append(s).append(" AND unitid").append("=").append(s1).toString();
            c().b(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
