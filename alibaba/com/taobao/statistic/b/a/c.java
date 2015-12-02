// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic.b.a;

import com.taobao.statistic.core.Logger;
import com.taobao.statistic.core.h;
import com.taobao.statistic.core.m;
import com.taobao.statistic.e.a.b;
import com.taobao.statistic.e.a.f;
import com.taobao.statistic.e.a.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends b
{

    private static final List bn = new ArrayList(Arrays.asList(new String[] {
        "B01N10"
    }));

    public c(h h1)
    {
        super(h1);
    }

    public List F()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void b(String s, String s1)
    {
        s = al.ak().bi();
        try
        {
            s1 = new JSONObject(s1);
            if (!s1.has("content"))
            {
                Logger.e(1, "TraceConfigBusiness", "onConfigurationArrive error, has no content");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.e(1, "TraceConfigBusiness", "onConfigurationArrive error", s);
            return;
        }
        if ("disable".equals(s1.optString("content")))
        {
            s.k(true);
            Logger.i(1, "TraceConfigBusiness", (new StringBuilder()).append("onConfigurationArrive tcache=").append(s.toString()).toString());
            return;
        }
        s1 = s1.optJSONArray("content");
        int i = 0;
_L14:
        if (i >= s1.length()) goto _L2; else goto _L1
_L1:
        Object obj = s1.optJSONObject(i);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!((JSONObject) (obj)).has("x") || ((JSONObject) (obj)).isNull("x")) goto _L4; else goto _L5
_L5:
        f f1;
        String s2;
        Object obj2;
        Object obj3;
        f1 = new f("page");
        s2 = ((JSONObject) (obj)).getString("x");
        String s3 = ((JSONObject) (obj)).optString("em");
        obj2 = ((JSONObject) (obj)).optString("ic", "y");
        obj3 = ((JSONObject) (obj)).optString("ish5", "n");
        f1.ac(s2);
        f1.ad(s3);
        Object obj1;
        int j;
        boolean flag;
        if (!"n".equals(obj2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f1.i(flag);
        f1.j("y".equals(obj3));
        obj1 = ((JSONObject) (obj)).optJSONObject("kvs");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        for (obj2 = ((JSONObject) (obj1)).keys(); ((Iterator) (obj2)).hasNext(); f1.a(((String) (obj3)), ((JSONObject) (obj1)).opt(((String) (obj3)))))
        {
            obj3 = (String)((Iterator) (obj2)).next();
        }

        obj = ((JSONObject) (obj)).optJSONArray("cts");
        if (obj == null) goto _L7; else goto _L6
_L6:
        j = 0;
_L12:
        if (j >= ((JSONArray) (obj)).length()) goto _L7; else goto _L8
_L8:
        obj3 = ((JSONArray) (obj)).optJSONObject(j);
        if (obj3 == null) goto _L10; else goto _L9
_L9:
        if (!((JSONObject) (obj3)).has("x") || ((JSONObject) (obj3)).isNull("x")) goto _L10; else goto _L11
_L11:
        obj1 = new f("ctrl");
        obj2 = ((JSONObject) (obj3)).getString("x");
        ((f) (obj1)).ac(((String) (obj2)));
        ((f) (obj1)).ad(((JSONObject) (obj3)).optString("em"));
        if (!"n".equals(((JSONObject) (obj3)).optString("ic", "y")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((f) (obj1)).i(flag);
        obj3 = ((JSONObject) (obj3)).optJSONObject("kvs");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        String s4;
        for (Iterator iterator = ((JSONObject) (obj3)).keys(); iterator.hasNext(); ((f) (obj1)).a(s4, ((JSONObject) (obj3)).opt(s4)))
        {
            s4 = (String)iterator.next();
        }

        f1.a(((f) (obj1)));
        ((f) (obj1)).b(f1);
        s.a(((String) (obj2)), ((f) (obj1)));
          goto _L10
_L7:
        s.a(s2, f1);
        break; /* Loop/switch isn't completed */
_L2:
        Logger.i(2, "TraceConfigBusiness", (new StringBuilder()).append("onConfigurationArrive tcache=").append(s.toString()).toString());
        return;
_L10:
        j++;
        if (true) goto _L12; else goto _L4
_L4:
        i++;
        if (true) goto _L14; else goto _L13
_L13:
    }

}
