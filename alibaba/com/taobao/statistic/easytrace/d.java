// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic.easytrace;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.taobao.statistic.core.Logger;
import com.taobao.statistic.core.h;
import com.taobao.statistic.core.i;
import com.taobao.statistic.core.m;
import com.taobao.statistic.e.a.e;
import com.taobao.statistic.e.a.f;
import com.taobao.statistic.e.a.g;
import com.taobao.statistic.f.p;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.taobao.statistic.easytrace:
//            a

public class d
{

    private static String TAG = "H5TpkAndArgsProcess";

    private static String a(String s, Uri uri)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static String a(String s, Uri uri, Bundle bundle)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static String a(String s, Uri uri, Bundle bundle, HashMap hashmap)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static String a(String s, Bundle bundle)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String a(String s, String s1, String s2)
    {
        Object obj;
        Object obj1;
        String as[];
        as = null;
        obj = null;
        obj1 = obj;
        if (s == null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        if (s.isEmpty()) goto _L2; else goto _L3
_L3:
        obj1 = obj;
        if (s1 == null) goto _L2; else goto _L4
_L4:
        if (!s1.isEmpty()) goto _L6; else goto _L5
_L5:
        obj1 = obj;
_L2:
        return ((String) (obj1));
_L6:
        String as1[];
        as1 = s.split("\\?");
        obj1 = obj;
        if (as1 == null) goto _L2; else goto _L7
_L7:
        obj1 = obj;
        if (as1.length == 0) goto _L2; else goto _L8
_L8:
        int j;
        int l;
        l = as1.length;
        j = 0;
        obj = as;
_L13:
        obj1 = obj;
        if (j >= l) goto _L2; else goto _L9
_L9:
        as = as1[j].split("&");
        obj1 = obj;
        if (as1 == null) goto _L11; else goto _L10
_L10:
        obj1 = obj;
        if (as1.length == 0) goto _L11; else goto _L12
_L12:
        int k;
        int i1;
        i1 = as.length;
        k = 0;
_L14:
        obj1 = obj;
        if (k < i1)
        {
            obj1 = as[k];
            if (obj1 == null || !((String) (obj1)).startsWith((new StringBuilder()).append(s1).append("=").toString()))
            {
                break MISSING_BLOCK_LABEL_280;
            }
            if (s2 != null && !s2.isEmpty())
            {
                obj1 = Pattern.compile((new StringBuilder()).append(s1).append("=").append(s2).toString()).matcher(((CharSequence) (obj1)));
                if (((Matcher) (obj1)).find())
                {
                    obj = ((Matcher) (obj1)).group();
                }
            } else
            {
                obj = obj1;
            }
            Logger.i(1, "getKeyFromUrl", String.format("url(%s) and key:%s value:%s", new Object[] {
                s, s1, obj
            }));
            obj1 = obj;
        }
_L11:
        j++;
        obj = obj1;
          goto _L13
        k++;
          goto _L14
    }

    public static Map a(String s, String s1, Activity activity, List list)
    {
        HashMap hashmap = new HashMap();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.isEmpty())
        {
            return null;
        }
        h h1;
        i j;
        Uri uri;
        Bundle bundle;
        uri = activity.getIntent().getData();
        bundle = activity.getIntent().getExtras();
        h1 = com.taobao.statistic.TBS.a.x();
        j = h1.at();
        activity = com.taobao.statistic.TBS.a.x().ak().bi().bK();
        if (activity == null) goto _L4; else goto _L3
_L3:
        if (activity.size() <= 0 || j == null) goto _L4; else goto _L5
_L5:
        Hashtable hashtable;
        Iterator iterator;
        hashtable = h1.at().az();
        iterator = activity.iterator();
_L38:
        if (!iterator.hasNext()) goto _L4; else goto _L6
_L6:
        e e1 = (e)iterator.next();
        if (!hashtable.containsKey(e1.bD())) goto _L8; else goto _L7
_L7:
        if (!"nearby".equals(e1.getType()))
        {
            continue; /* Loop/switch isn't completed */
        }
        activity = e1.bE();
        if (!p.isEmpty(activity)) goto _L10; else goto _L9
_L9:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        Object obj;
        String s2;
        s2 = e1.bD();
        obj = a(s1, s2, ((String) (null)));
        activity = ((Activity) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        activity = ((Activity) (obj));
        if (!((String) (obj)).isEmpty())
        {
            activity = ((String) (obj)).substring(s2.length() + 1);
        }
        if (activity == null) goto _L12; else goto _L11
_L11:
        obj = activity;
        if (!activity.isEmpty()) goto _L13; else goto _L12
_L12:
        if (j == null) goto _L15; else goto _L14
_L14:
        activity = a(e1.bD(), uri, bundle, (HashMap)j.ay().get(s));
_L17:
        obj = activity;
        if (activity == null) goto _L13; else goto _L16
_L16:
        obj = activity;
        if (!activity.isEmpty())
        {
            obj = URLEncoder.encode(activity, "utf-8");
        }
_L13:
        if (!p.isEmpty(((String) (obj))))
        {
            hashtable.put(e1.bD(), obj);
        }
        continue; /* Loop/switch isn't completed */
        s;
        Logger.d(2, TAG, (new StringBuilder()).append("error during getEffectParams for _spm _tpk!").append(s.getLocalizedMessage()).toString());
_L32:
        return hashmap;
_L15:
        activity = a(e1.bD(), uri, bundle, ((HashMap) (null)));
          goto _L17
_L10:
        obj = URLEncoder.encode(activity, "utf-8");
          goto _L13
_L8:
        activity = e1.bE();
        if (!p.isEmpty(activity))
        {
            break MISSING_BLOCK_LABEL_543;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        s2 = e1.bD();
        obj = a(s1, s2, ((String) (null)));
        activity = ((Activity) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        activity = ((Activity) (obj));
        if (!((String) (obj)).isEmpty())
        {
            activity = ((String) (obj)).substring(s2.length() + 1);
        }
        if (activity == null) goto _L19; else goto _L18
_L18:
        obj = activity;
        if (!activity.isEmpty()) goto _L20; else goto _L19
_L19:
        if (j == null) goto _L22; else goto _L21
_L21:
        activity = a(e1.bD(), uri, bundle, (HashMap)j.ay().get(s));
_L24:
        obj = activity;
        if (activity == null) goto _L20; else goto _L23
_L23:
        obj = activity;
        if (!activity.isEmpty())
        {
            obj = URLEncoder.encode(activity, "utf-8");
        }
_L20:
        if (!p.isEmpty(((String) (obj))))
        {
            hashtable.put(e1.bD(), obj);
        }
        continue; /* Loop/switch isn't completed */
_L22:
        activity = a(e1.bD(), uri, bundle, ((HashMap) (null)));
          goto _L24
        obj = URLEncoder.encode(activity, "utf-8");
          goto _L20
_L4:
        if (list == null) goto _L26; else goto _L25
_L25:
        if (list.size() <= 0 || j == null) goto _L26; else goto _L27
_L27:
        s = h1.at().az();
        s1 = list.iterator();
_L36:
        if (!s1.hasNext()) goto _L26; else goto _L28
_L28:
        activity = (String)s1.next();
        if (!activity.equals("-1")) goto _L30; else goto _L29
_L29:
        h1.at().az().clear();
_L26:
        if (j == null) goto _L32; else goto _L31
_L31:
        s = h1.at().az();
        if (s == null) goto _L32; else goto _L33
_L33:
        if (s.size() <= 0) goto _L32; else goto _L34
_L34:
        a(((Map) (hashmap)), ((Hashtable) (s)));
          goto _L32
_L30:
        if (!s.containsKey(activity)) goto _L36; else goto _L35
_L35:
        s.remove(activity);
          goto _L36
_L2:
        return null;
        if (true) goto _L38; else goto _L37
_L37:
    }

    private static void a(Map map, Hashtable hashtable)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String[] a(String s, String s1, Activity activity)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        arraylist1 = new ArrayList();
        if (s != null && !s.isEmpty()) goto _L2; else goto _L1
_L1:
        activity = null;
_L23:
        return activity;
_L2:
        Object obj = com.taobao.statistic.easytrace.a.O(s);
        if (obj == null || !((f) (obj)).getType().equals("page")) goto _L4; else goto _L3
_L3:
        obj = ((f) (obj)).bI();
        if (((Map) (obj)).isEmpty()) goto _L4; else goto _L5
_L5:
        Iterator iterator;
        Uri uri;
        Bundle bundle;
        iterator = ((Map) (obj)).entrySet().iterator();
        uri = activity.getIntent().getData();
        bundle = activity.getIntent().getExtras();
_L11:
        if (!iterator.hasNext()) goto _L4; else goto _L6
_L6:
        obj = (java.util.Map.Entry)iterator.next();
        if (((java.util.Map.Entry) (obj)).getValue() == null || ((java.util.Map.Entry) (obj)).getValue() == "") goto _L8; else goto _L7
_L7:
        String s3 = (new StringBuilder()).append((String)((java.util.Map.Entry) (obj)).getKey()).append("=").append(((java.util.Map.Entry) (obj)).getValue()).toString();
_L12:
        if (!s3.contains("_tpkc=-1")) goto _L10; else goto _L9
_L9:
        arraylist1.add("-1");
          goto _L11
        obj;
        Logger.d(2, TAG, (new StringBuilder()).append("error during pvDataAllCollect - process args!").append(((Throwable) (obj)).getLocalizedMessage()).toString());
          goto _L4
_L8:
        s3 = (new StringBuilder()).append((String)((java.util.Map.Entry) (obj)).getKey()).append("=").toString();
          goto _L12
_L10:
        if (!s3.contains("_tpkc") || !s3.contains("={"))
        {
            break MISSING_BLOCK_LABEL_539;
        }
        if (s3.length() <= s3.indexOf("={") + 2 + 1) goto _L11; else goto _L13
_L13:
        as = s3.substring(s3.indexOf("={") + 2, s3.length() - 1).split("&");
        k = as.length;
        j = 0;
_L15:
        if (j >= k) goto _L11; else goto _L14
_L14:
        arraylist1.add(as[j].trim());
        j++;
          goto _L15
        if (!s3.contains("${url|")) goto _L17; else goto _L16
_L16:
        s4 = s3.substring(s3.indexOf("${url|") + 6, s3.length() - 1);
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_1104;
        }
        String s2;
        if (s4.isEmpty())
        {
            break MISSING_BLOCK_LABEL_1104;
        }
        s2 = a(s1, s4, ((String) (null)));
_L25:
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_613;
        }
        as = s2;
        if (!s2.isEmpty())
        {
            break MISSING_BLOCK_LABEL_654;
        }
        s2 = a(s4, uri);
        as = s2;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_654;
        }
        as = s2;
        if (!s2.isEmpty())
        {
            as = s2.substring(s4.length() + 1);
        }
        if (!p.isEmpty(as))
        {
            arraylist.add((new StringBuilder()).append(s3.substring(0, s3.indexOf("${url|"))).append(as).toString());
        }
          goto _L11
_L17:
label0:
        {
            if (!s3.contains("${ut|"))
            {
                break label0;
            }
            as = a(s3.substring(s3.indexOf("${ut|") + 5, s3.length() - 1), bundle);
            if (!p.isEmpty(as))
            {
                arraylist.add((new StringBuilder()).append(s3.substring(0, s3.indexOf("${ut|"))).append(as).toString());
            }
        }
          goto _L11
        if (!s3.contains("${")) goto _L19; else goto _L18
_L18:
        s4 = s3.substring(s3.indexOf("${") + 2, s3.length() - 1);
        if (s4 == null) goto _L21; else goto _L20
_L20:
        if (s4.isEmpty()) goto _L21; else goto _L22
_L22:
        s2 = a(s1, s4, ((String) (null)));
        as = s2;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_880;
        }
        as = s2;
        if (!s2.isEmpty())
        {
            as = s2.substring(s4.length() + 1);
        }
_L24:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_894;
        }
        s2 = as;
        if (!as.isEmpty())
        {
            break MISSING_BLOCK_LABEL_925;
        }
        s2 = a(s3.substring(s3.indexOf("${") + 2, s3.length() - 1), uri, bundle);
        if (!p.isEmpty(s2))
        {
            arraylist.add((new StringBuilder()).append(s3.substring(0, s3.indexOf("${"))).append(s2).toString());
        }
          goto _L11
_L19:
        arraylist.add(s3);
          goto _L11
_L4:
        s1 = a(s, s1, activity, ((List) (arraylist1)));
        if (s1 != null && s1.size() > 0)
        {
            activity = s1.entrySet().iterator();
            while (activity.hasNext()) 
            {
                s1 = (java.util.Map.Entry)activity.next();
                String as[];
                String s4;
                int j;
                int k;
                if (s1.getValue() != null && !((String)s1.getValue()).equals(""))
                {
                    s1 = (new StringBuilder()).append((String)s1.getKey()).append("=").append((String)s1.getValue()).toString();
                } else
                {
                    s1 = (new StringBuilder()).append((String)s1.getKey()).append("=").toString();
                }
                arraylist.add(s1);
            }
        }
        activity = com.taobao.statistic.TBS.a.x();
        if (arraylist.size() > 0)
        {
            s1 = new String[arraylist.size()];
            arraylist.toArray(s1);
        } else
        {
            s1 = null;
        }
        as = activity.at();
        activity = s1;
        if (as != null)
        {
            activity = s1;
            if (as.ay().get(s) != null)
            {
                ((HashMap)as.ay().get(s)).clear();
                return s1;
            }
        }
          goto _L23
_L21:
        as = null;
          goto _L24
        s2 = null;
          goto _L25
    }

}
