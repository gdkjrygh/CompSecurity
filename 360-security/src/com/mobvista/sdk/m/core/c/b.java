// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;
import com.mobvista.sdk.m.a.a.a.a;
import com.mobvista.sdk.m.a.a.a.c;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends c
{

    private static b b;

    private b(a a1)
    {
        super(a1);
    }

    private long a(CampaignEx campaignex, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (campaignex != null) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("id", campaignex.getId());
        contentvalues.put("unitid", s);
        contentvalues.put("tab", Integer.valueOf(campaignex.getTab()));
        contentvalues.put("package_name", campaignex.getPackageName());
        contentvalues.put("app_name", campaignex.getAppName());
        contentvalues.put("app_desc", campaignex.getAppDesc());
        contentvalues.put("app_size", campaignex.getSize());
        contentvalues.put("icon_url", campaignex.getIconUrl());
        contentvalues.put("image_url", campaignex.getImageUrl());
        contentvalues.put("impression_url", campaignex.getImpressionURL());
        contentvalues.put("notice_url", campaignex.getNoticeUrl());
        contentvalues.put("download_url", campaignex.getClickURL());
        contentvalues.put("only_impression", campaignex.getOnlyImpressionURL());
        contentvalues.put("bg_image", campaignex.getBgImage());
        contentvalues.put("ts", Long.valueOf(campaignex.getTimestamp()));
        contentvalues.put("preclick", Boolean.valueOf(campaignex.isPreClick()));
        if (a(campaignex.getId(), campaignex.getTab(), s))
        {
            campaignex = (new StringBuilder("id = ")).append(campaignex.getId()).append(" AND unitid").append(" = ").append(s).toString();
            l = d().a("campaign", contentvalues, campaignex, null);
            continue; /* Loop/switch isn't completed */
        }
        l = d().a("campaign", null, contentvalues);
        if (true) goto _L4; else goto _L3
_L3:
        campaignex;
        throw campaignex;
    }

    public static b a(a a1)
    {
        com/mobvista/sdk/m/core/c/b;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new b(a1);
        }
        a1 = b;
        com/mobvista/sdk/m/core/c/b;
        JVM INSTR monitorexit ;
        return a1;
        a1;
        throw a1;
    }

    private boolean a(String s, int i, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder("SELECT id FROM campaign WHERE id='")).append(s).append("' AND ").append("tab=").append(i).append(" AND unitid").append(" = '").append(s1).append("'").toString();
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

    public final List a(int i, int j, String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder(" WHERE tab = ")).append(j).append(" AND unitid").append(" = '").append(s).append("'").toString();
        String s1 = (new StringBuilder(" LIMIT ")).append(20).toString();
        s = (new StringBuilder("SELECT * FROM campaign")).append(s).append(s1).toString();
        s = c().a(s, null);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getCount() <= 0) goto _L2; else goto _L3
_L3:
        ArrayList arraylist = new ArrayList();
_L6:
        if (!s.moveToNext()) goto _L5; else goto _L4
_L4:
        Object obj;
        obj = new CampaignEx();
        ((CampaignEx) (obj)).setId(s.getString(s.getColumnIndex("id")));
        ((CampaignEx) (obj)).setTab(s.getInt(s.getColumnIndex("tab")));
        ((CampaignEx) (obj)).setPackageName(s.getString(s.getColumnIndex("package_name")));
        ((CampaignEx) (obj)).setAppName(s.getString(s.getColumnIndex("app_name")));
        ((CampaignEx) (obj)).setAppDesc(s.getString(s.getColumnIndex("app_desc")));
        ((CampaignEx) (obj)).setSize(s.getString(s.getColumnIndex("app_size")));
        ((CampaignEx) (obj)).setIconUrl(s.getString(s.getColumnIndex("icon_url")));
        ((CampaignEx) (obj)).setImageUrl(s.getString(s.getColumnIndex("image_url")));
        ((CampaignEx) (obj)).setImpressionURL(s.getString(s.getColumnIndex("impression_url")));
        ((CampaignEx) (obj)).setNoticeUrl(s.getString(s.getColumnIndex("notice_url")));
        ((CampaignEx) (obj)).setClickURL(s.getString(s.getColumnIndex("download_url")));
        ((CampaignEx) (obj)).setOnlyImpressionURL(s.getString(s.getColumnIndex("only_impression")));
        ((CampaignEx) (obj)).setBgImage(s.getString(s.getColumnIndex("bg_image")));
        Object obj1;
        boolean flag;
        if (s.getInt(s.getColumnIndex("preclick")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CampaignEx) (obj)).setPreClick(flag);
        ((CampaignEx) (obj)).setTimestamp(s.getLong(s.getColumnIndex("ts")));
        arraylist.add(obj);
          goto _L6
        obj1;
_L11:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        s.close();
_L10:
        obj1 = null;
_L8:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
_L5:
        s.close();
        obj1 = arraylist;
        if (s == null) goto _L8; else goto _L7
_L7:
        s.close();
        obj1 = arraylist;
          goto _L8
        s;
        throw s;
_L2:
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s.close();
        if (true) goto _L10; else goto _L9
_L9:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        s.close();
        throw obj1;
        obj1;
          goto _L9
        s;
        s = null;
          goto _L11
        obj1;
        s = null;
          goto _L9
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d().a("campaign", null, null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(List list, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (list == null) goto _L2; else goto _L1
_L1:
        int i = list.size();
        if (i != 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        list = list.iterator();
        while (list.hasNext()) 
        {
            a((CampaignEx)list.next(), s);
        }
        if (true) goto _L2; else goto _L4
_L4:
        list;
        throw list;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        String s = String.format("%s < ? or %s > ?", new Object[] {
            "ts", "ts"
        });
        int i = d().a("campaign", s, new String[] {
            String.valueOf(l - 0x36ee80L), String.valueOf(l)
        });
        Log.e("deleted", (new StringBuilder()).append(i).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
