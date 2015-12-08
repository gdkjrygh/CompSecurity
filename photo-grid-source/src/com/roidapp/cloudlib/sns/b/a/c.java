// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.sns.b.h;
import com.roidapp.cloudlib.sns.b.i;
import com.roidapp.cloudlib.sns.b.o;
import com.roidapp.cloudlib.sns.b.v;
import com.roidapp.cloudlib.sns.b.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends ArrayList
    implements v
{

    public c()
    {
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        jsonobject = jsonobject.optJSONArray("data");
        if (jsonobject == null || jsonobject.length() <= 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L18:
        if (j >= jsonobject.length()) goto _L2; else goto _L3
_L3:
        h h1;
        Object obj;
        String s;
        int k;
        obj = jsonobject.optJSONObject(j);
        h1 = new h();
        s = ((JSONObject) (obj)).optString("type");
        if (s.equals(i.a.a()))
        {
            h1.a = i.a;
        } else
        if (s.equals(i.c.a()))
        {
            h1.a = i.c;
            h1.b = ((JSONObject) (obj)).optString("content");
        } else
        if (s.equals(i.b.a()))
        {
            h1.a = i.b;
        } else
        {
            if (!s.equals(i.d.a()))
            {
                continue;
            }
            h1.a = i.d;
            h1.b = ((JSONObject) (obj)).optString("content");
        }
        h1.f = n.a(((JSONObject) (obj)), "time");
        h1.c = x.a(((JSONObject) (obj)).optJSONObject("user"), null, flag);
        h1.d = o.a(((JSONObject) (obj)).optJSONObject("post"));
        h1.e = ((JSONObject) (obj)).optInt("pid");
        if (h1.a != i.b) goto _L5; else goto _L4
_L4:
        k = 0;
_L13:
        if (k >= size()) goto _L5; else goto _L6
_L6:
        obj = (h)get(k);
        if (((h) (obj)).a != i.b || !((h) (obj)).c.b.equalsIgnoreCase(h1.c.b) || h1.f >= ((h) (obj)).f) goto _L8; else goto _L7
_L7:
        k = 1;
_L14:
        if (k != 0) goto _L10; else goto _L9
_L9:
        if (h1.a != i.a)
        {
            break MISSING_BLOCK_LABEL_486;
        }
        k = 0;
_L15:
        if (k >= size())
        {
            break MISSING_BLOCK_LABEL_486;
        }
        obj = (h)get(k);
        if (((h) (obj)).a != i.a || !((h) (obj)).c.b.equalsIgnoreCase(h1.c.b) || h1.d.a != ((h) (obj)).d.a || h1.f >= ((h) (obj)).f) goto _L12; else goto _L11
_L11:
        k = 1;
_L16:
        if (k == 0)
        {
            add(h1);
        }
_L10:
        do
        {
            j++;
            continue; /* Loop/switch isn't completed */
        } while (!s.equals(i.e.a()));
        h1.a = i.e;
        h1.b = ((JSONObject) (obj)).optString("content");
        break MISSING_BLOCK_LABEL_76;
_L8:
        k++;
          goto _L13
_L5:
        k = 0;
          goto _L14
_L12:
        k++;
          goto _L15
        k = 0;
          goto _L16
_L2:
        return;
        if (true) goto _L18; else goto _L17
_L17:
    }
}
