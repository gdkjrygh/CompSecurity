// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mobvista.sdk.m.a.a.a.c;
import com.mobvista.sdk.m.a.f.h;
import com.mobvista.sdk.m.core.entity.CampaignEx;

public final class a extends c
{

    private static a b;

    private a(com.mobvista.sdk.m.a.a.a.a a1)
    {
        super(a1);
    }

    public static a a(com.mobvista.sdk.m.a.a.a.a a1)
    {
        com/mobvista/sdk/m/core/c/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new a(a1);
        }
        a1 = b;
        com/mobvista/sdk/m/core/c/a;
        JVM INSTR monitorexit ;
        return a1;
        a1;
        throw a1;
    }

    private boolean b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder("SELECT id FROM campaignclick WHERE id='")).append(s).append("' AND ").append("unitid= '").append(s1).append("'").toString();
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

    public final long a(CampaignEx campaignex, String s)
    {
        long l1 = 0L;
        this;
        JVM INSTR monitorenter ;
        long l = l1;
        if (campaignex == null) goto _L2; else goto _L1
_L1:
        Object obj = campaignex.getJumpResult();
        if (obj != null) goto _L4; else goto _L3
_L3:
        l = l1;
_L2:
        this;
        JVM INSTR monitorexit ;
        return l;
_L4:
        String s1 = h.a(campaignex.getJumpResult());
        l = l1;
        if (TextUtils.isEmpty(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new ContentValues();
        ((ContentValues) (obj)).put("id", campaignex.getId());
        ((ContentValues) (obj)).put("unitid", s);
        ((ContentValues) (obj)).put("result", s1);
        ((ContentValues) (obj)).put("ts", Long.valueOf(campaignex.getTimestamp()));
        if (b(campaignex.getId(), s))
        {
            campaignex = (new StringBuilder("id = ")).append(campaignex.getId()).append(" AND unitid").append(" = ").append(s).toString();
            l = d().a("campaignclick", ((ContentValues) (obj)), campaignex, null);
            continue; /* Loop/switch isn't completed */
        }
        l = d().a("campaignclick", null, ((ContentValues) (obj)));
        if (true) goto _L2; else goto _L5
_L5:
        campaignex;
        throw campaignex;
    }

    public final com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = c().a("campaignclick", null, "id=? AND unitid=?", new String[] {
            s, s1
        }, null, null, null, null);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s = s1;
        if (s1.getCount() <= 0) goto _L2; else goto _L3
_L3:
        s = s1;
        if (!s1.moveToFirst()) goto _L2; else goto _L4
_L4:
        s = s1;
        com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult jumploaderresult = (com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult)h.a(s1.getString(s1.getColumnIndex("result")));
        s = jumploaderresult;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s1.close();
        s = jumploaderresult;
_L6:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s1.close();
_L8:
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        s1 = null;
_L11:
        s = s1;
        exception.printStackTrace();
        if (s1 == null) goto _L8; else goto _L7
_L7:
        s1.close();
          goto _L8
        s;
        throw s;
        s1;
        s = null;
_L10:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        s.close();
        throw s1;
        s1;
        if (true) goto _L10; else goto _L9
_L9:
        exception;
          goto _L11
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        String s = (new StringBuilder("ts<")).append(l - 0x5265c00L).toString();
        d().a("campaignclick", s, null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
