// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mobvista.sdk.m.a.f.e;
import com.mobvista.sdk.m.core.c.b;
import com.mobvista.sdk.m.core.c.c;
import com.mobvista.sdk.m.core.c.f;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends com.mobvista.sdk.m.a.a.c.a
{

    private int c;
    private f d;
    private List e;
    private Context f;
    private int g;
    private int h;
    private String i;

    public a()
    {
        c = 5;
        d = null;
        e = null;
        f = null;
        g = 0;
        h = 0;
    }

    private List a(String s)
    {
        ArrayList arraylist;
        Object obj1;
        int j;
        boolean flag;
        com.mobvista.sdk.m.a.b.a.a.b("APILoader", (new StringBuilder("RESPONSE: ")).append(s).toString());
        c c1 = com.mobvista.sdk.m.core.c.c.a(d);
        c1.a();
        arraylist = new ArrayList();
        Object obj;
        Object obj2;
        Object obj3;
        try
        {
            obj = new JSONObject(s);
            j = ((JSONObject) (obj)).optInt("status");
            obj1 = ((JSONObject) (obj)).optString("msg");
            s = ((JSONObject) (obj)).optString("only_impression_url");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return arraylist;
        }
        if (j != 1) goto _L2; else goto _L1
_L1:
        obj = ((JSONObject) (obj)).optJSONArray("data");
        j = 0;
_L13:
        if (j >= ((JSONArray) (obj)).length()) goto _L4; else goto _L3
_L3:
        obj2 = (JSONObject)((JSONArray) (obj)).get(j);
        obj1 = new CampaignEx();
        ((CampaignEx) (obj1)).setId((new StringBuilder()).append(((JSONObject) (obj2)).optLong("id", 0L)).toString());
        ((CampaignEx) (obj1)).setAppName(((JSONObject) (obj2)).optString("title", ""));
        ((CampaignEx) (obj1)).setPackageName(((JSONObject) (obj2)).optString("package_name", ""));
        ((CampaignEx) (obj1)).setAppDesc(((JSONObject) (obj2)).optString("desc", ""));
        ((CampaignEx) (obj1)).setSize(((JSONObject) (obj2)).optString("size", ""));
        ((CampaignEx) (obj1)).setIconUrl(((JSONObject) (obj2)).optString("icon_url", ""));
        ((CampaignEx) (obj1)).setImageUrl(((JSONObject) (obj2)).optString("image_url", ""));
        ((CampaignEx) (obj1)).setImpressionURL(((JSONObject) (obj2)).optString("impression_url", ""));
        ((CampaignEx) (obj1)).setClickURL(((JSONObject) (obj2)).optString("click_url", ""));
        ((CampaignEx) (obj1)).setNoticeUrl(((JSONObject) (obj2)).optString("notice_url", ""));
        ((CampaignEx) (obj1)).setPreClick(((JSONObject) (obj2)).optBoolean("pre_click", false));
        ((CampaignEx) (obj1)).setTimestamp(System.currentTimeMillis());
        ((CampaignEx) (obj1)).setOnlyImpressionURL(s);
        ((CampaignEx) (obj1)).setBgImage(((JSONObject) (obj2)).optString("bg_image", ""));
        ((CampaignEx) (obj1)).setTab(g);
        if (e == null) goto _L6; else goto _L5
_L5:
        obj3 = e.iterator();
_L9:
        if (!((Iterator) (obj3)).hasNext()) goto _L6; else goto _L7
_L7:
        if (!((String)((Iterator) (obj3)).next()).equals(((CampaignEx) (obj1)).getPackageName())) goto _L9; else goto _L8
_L8:
        flag = true;
_L11:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        arraylist.add(obj1);
        if (!c1.a(((CampaignEx) (obj1)).getId(), i))
        {
            obj3 = new com.mobvista.sdk.m.core.entity.a();
            ((com.mobvista.sdk.m.core.entity.a) (obj3)).a(((CampaignEx) (obj1)).getId());
            ((com.mobvista.sdk.m.core.entity.a) (obj3)).a(((JSONObject) (obj2)).optInt("fca", 10));
            ((com.mobvista.sdk.m.core.entity.a) (obj3)).b(((JSONObject) (obj2)).optInt("fcb", 10));
            ((com.mobvista.sdk.m.core.entity.a) (obj3)).d(0);
            ((com.mobvista.sdk.m.core.entity.a) (obj3)).c(0);
            ((com.mobvista.sdk.m.core.entity.a) (obj3)).a(System.currentTimeMillis());
            c1.a(((com.mobvista.sdk.m.core.entity.a) (obj3)), i);
        }
        break; /* Loop/switch isn't completed */
        obj2 = new com.mobvista.sdk.m.core.entity.a();
        ((com.mobvista.sdk.m.core.entity.a) (obj2)).a(((CampaignEx) (obj1)).getId());
        ((com.mobvista.sdk.m.core.entity.a) (obj2)).a(System.currentTimeMillis());
        c1.a(((com.mobvista.sdk.m.core.entity.a) (obj2)), i);
        break; /* Loop/switch isn't completed */
_L4:
        com.mobvista.sdk.m.core.c.b.a(d).a(arraylist, i);
        return arraylist;
_L2:
        Log.w("APILoader", (new StringBuilder("APILoader error: ")).append(((String) (obj1))).toString());
        return arraylist;
_L6:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
        j++;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private List a(byte abyte0[])
    {
label0:
        {
            if (abyte0 != null && abyte0.length > 0)
            {
                abyte0 = new String(abyte0);
                if (!TextUtils.isEmpty(abyte0))
                {
                    break label0;
                }
            }
            return null;
        }
        return a(((String) (abyte0)));
    }

    private String b()
    {
        String s1 = "";
        long al[] = com.mobvista.sdk.m.core.c.c.a(d).a(i);
        String s = s1;
        if (al != null)
        {
            JSONArray jsonarray = new JSONArray();
            int k = al.length;
            for (int j = 0; j < k; j++)
            {
                jsonarray.put(al[j]);
            }

            s = s1;
            if (jsonarray.length() > 0)
            {
                s = jsonarray.toString();
            }
        }
        return (new e()).a(i).b(c).a(g).c(h).b(s).b().a().d(7).a(f);
    }

    protected final volatile Object a(Map map, byte abyte0[])
    {
        return a(abyte0);
    }

    protected final String a()
    {
        return (new StringBuilder("http://net.rayjump.com/openapi/ad/v2?")).append(b()).toString();
    }

    public final void a(int j)
    {
        g = j;
    }

    public final void a(int j, List list, f f1, Context context, String s)
    {
        c = j;
        d = f1;
        e = list;
        f = context;
        i = s;
    }

    public final void b(int j)
    {
        h = 2;
    }
}
