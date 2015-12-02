// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic.easytrace;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.taobao.statistic.core.Logger;
import com.taobao.statistic.core.b;
import com.taobao.statistic.core.h;
import com.taobao.statistic.core.i;
import com.taobao.statistic.core.m;
import com.taobao.statistic.e.a.e;
import com.taobao.statistic.e.a.f;
import com.taobao.statistic.e.a.g;
import com.taobao.statistic.f.c;
import com.taobao.statistic.f.p;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.taobao.statistic.easytrace:
//            c

public class a
{

    private static String TAG = "EasyTraceClickUtil";
    static Field fr[] = null;
    private static a fs = null;
    public static String ft = null;
    private static Object fu = new Object();
    private static String packageName = null;
    Class fl;
    Field fm;
    Field fn;
    Class fo;
    Field fp;
    Class fq;

    private a()
    {
        fl = null;
        fm = null;
        fn = null;
        fo = null;
        fp = null;
        fq = null;
        try
        {
            packageName = com.taobao.statistic.TBS.a.x().ao().getPackageName();
            if (packageName != null)
            {
                if (p.isEmpty(packageName))
                {
                    Logger.d(2, TAG, "EasyTraceClickUtil can't get packageName!");
                }
                fq = Class.forName((new StringBuilder()).append(packageName).append(".R$id").toString());
                if (fq != null)
                {
                    fr = fq.getDeclaredFields();
                }
            }
        }
        catch (ClassCastException classcastexception)
        {
            Log.e(TAG, "Class of view cast exception.");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Logger.d(2, TAG, "EasyTraceClickUtil cant't get packageName.R$id !,but don't effect easytrace", classnotfoundexception);
        }
        catch (Throwable throwable)
        {
            Log.e(TAG, "usertrack hasn't been started!");
        }
        try
        {
            fl = Class.forName("android.view.View");
        }
        catch (ClassCastException classcastexception1)
        {
            Log.e("Cast", "Class of view cast exception.");
        }
        catch (ClassNotFoundException classnotfoundexception1)
        {
            Log.e("Reflection", "Class Not Found.");
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        if (fl != null)
        {
            try
            {
                fn = fl.getDeclaredField("mListenerInfo");
                if (!fn.isAccessible())
                {
                    fn.setAccessible(true);
                }
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("Reflection", "No Such Field.");
            }
        }
        if (fl == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        fo = Class.forName("android.view.View$ListenerInfo");
        fp = fo.getDeclaredField("mOnClickListener");
        if (!fp.isAccessible())
        {
            fp.setAccessible(true);
        }
_L1:
        return;
        Object obj;
        obj;
        Log.e("Reflection", "No Such Field.");
        return;
        obj;
        Log.e("Reflection", "Class Not Found.");
        return;
        obj;
        Log.e("Reflection", "no such Field Error.");
        return;
        if (fl != null)
        {
            try
            {
                fm = fl.getDeclaredField("mOnClickListener");
                if (!fm.isAccessible())
                {
                    fm.setAccessible(true);
                    return;
                }
            }
            catch (NoSuchFieldException nosuchfieldexception1)
            {
                Log.e("Reflection", "No Such Field.");
                return;
            }
        }
          goto _L1
    }

    public static f O(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String P(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static boolean Q(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static boolean R(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static boolean S(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String a(Uri uri)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private String a(String s, Uri uri)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private String a(String s, Uri uri, Bundle bundle)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static String a(String s, Uri uri, Bundle bundle, HashMap hashmap)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private String a(String s, Bundle bundle)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static Map a(String s, Activity activity, List list)
    {
        HashMap hashmap = new HashMap();
        if (p.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String s1 = s;
_L15:
        Object obj;
        h h1;
        Uri uri;
        i j;
        Bundle bundle;
        uri = activity.getIntent().getData();
        bundle = activity.getIntent().getExtras();
        h1 = com.taobao.statistic.TBS.a.x();
        j = h1.at();
        obj = com.taobao.statistic.TBS.a.x().ak().bi().bK();
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((List) (obj)).size() <= 0 || j == null) goto _L4; else goto _L5
_L5:
        Hashtable hashtable;
        Iterator iterator;
        hashtable = h1.at().az();
        iterator = ((List) (obj)).iterator();
_L10:
        if (!iterator.hasNext()) goto _L4; else goto _L6
_L6:
        e e1 = (e)iterator.next();
        if (!hashtable.containsKey(e1.bD())) goto _L8; else goto _L7
_L7:
        if (!"nearby".equals(e1.getType())) goto _L10; else goto _L9
_L9:
        String s2 = e1.bE();
        obj = s2;
        if (!p.isEmpty(s2)) goto _L12; else goto _L11
_L11:
        if (j == null) goto _L14; else goto _L13
_L13:
        obj = a(e1.bD(), uri, bundle, (HashMap)j.ay().get(s1));
_L12:
        if (!p.isEmpty(((String) (obj))))
        {
            hashtable.put(e1.bD(), URLEncoder.encode(((String) (obj)), "utf-8"));
        }
          goto _L10
        s;
        Logger.d(2, TAG, (new StringBuilder()).append("error during getEffectParams for _spm _tpk!").append(s.getLocalizedMessage()).toString());
_L29:
        return hashmap;
_L2:
        s1 = activity.getClass().getSimpleName();
          goto _L15
_L14:
        obj = a(e1.bD(), uri, bundle, null);
          goto _L12
_L8:
        s2 = e1.bE();
        obj = s2;
        if (!p.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_336;
        }
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        obj = a(e1.bD(), uri, bundle, (HashMap)j.ay().get(s1));
_L16:
        if (!p.isEmpty(((String) (obj))))
        {
            hashtable.put(e1.bD(), URLEncoder.encode(((String) (obj)), "utf-8"));
        }
          goto _L10
        obj = a(e1.bD(), uri, bundle, null);
          goto _L16
_L4:
        if (list == null) goto _L18; else goto _L17
_L17:
        if (list.size() <= 0 || j == null) goto _L18; else goto _L19
_L19:
        obj = h1.at().az();
        list = list.iterator();
_L33:
        if (!list.hasNext()) goto _L18; else goto _L20
_L20:
        s2 = (String)list.next();
        if (!s2.equals("-1")) goto _L22; else goto _L21
_L21:
        h1.at().az().clear();
_L18:
        if (j == null) goto _L24; else goto _L23
_L23:
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_494;
        }
        if (!p.isEmpty(ft))
        {
            break MISSING_BLOCK_LABEL_494;
        }
        list = a(activity.getIntent().getData());
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_494;
        }
        ft = list;
        obj = h1.at().az();
        if (obj == null) goto _L26; else goto _L25
_L25:
        if (((Hashtable) (obj)).size() <= 0) goto _L26; else goto _L27
_L27:
        if (!p.isEmpty(ft))
        {
            ((Hashtable) (obj)).put("ttid", ft);
        }
        a(((Map) (hashmap)), ((Hashtable) (obj)));
_L24:
        if (uri == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        list = uri.toString();
        if (list.contains("spm"))
        {
            String.valueOf(c.ai(list.substring(0, list.indexOf("?"))));
            hashmap.put("spm", uri.getQueryParameter("spm"));
        }
        if (list.contains("scm"))
        {
            hashmap.put("scm", uri.getQueryParameter("scm"));
        }
        if (hashmap.containsKey("_spm")) goto _L29; else goto _L28
_L28:
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_906;
        }
        obj = activity.getClass().getSimpleName();
        list = O(((String) (obj)));
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_898;
        }
        list = list.bF();
_L34:
        hashmap.put("_spm", (new StringBuilder()).append(list).append("-0-0").toString());
        list = h1.at().aA();
        if (list == null) goto _L29; else goto _L30
_L30:
        if (list.bl().equals(c.ai(c.ai(((String) (obj)))))) goto _L29; else goto _L31
_L31:
        list = new com.taobao.statistic.easytrace.c();
        list.V(String.valueOf(c.ai(activity.getClass().getSimpleName())));
        list.W((new StringBuilder()).append(c.ai(activity.getClass().getSimpleName())).append("-0-0").toString());
        Logger.i(1, TAG, String.format("fragmentName(%s) spm(%s) xpath(%s)", new Object[] {
            s, list.bm(), list.bl()
        }));
        h1.at().a(list);
        return hashmap;
_L22:
        if (!((Hashtable) (obj)).containsKey(s2)) goto _L33; else goto _L32
_L32:
        ((Hashtable) (obj)).remove(s2);
          goto _L33
_L26:
        list = ((List) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_869;
        }
        list = new Hashtable();
        if (!p.isEmpty(ft))
        {
            list.put("ttid", ft);
        }
        a(((Map) (hashmap)), ((Hashtable) (list)));
          goto _L24
        list = c.ai(((String) (obj)));
          goto _L34
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_1306;
        }
        list = h1.at().aA();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_1176;
        }
        s = h1.getExecProxy().Y().q((new StringBuilder()).append("EasyTrace_").append(activity.getClass().getSimpleName()).toString());
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_1035;
        }
_L35:
        if (list.bl().equals(String.valueOf(c.ai(s))))
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        hashmap.put("_spm", list.bm());
        h1.at().a(null);
        Logger.i(1, TAG, String.format("activity(%s) spm is null", new Object[] {
            s1
        }));
        return hashmap;
        s = activity.getClass().getSimpleName();
          goto _L35
        activity = h1.getExecProxy().Y().p((new StringBuilder()).append("EasyTrace_").append(activity.getClass().getSimpleName()).toString());
        s = activity;
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_1108;
        }
        s = activity;
        if (activity.startsWith("_o_p_"))
        {
            s = activity.substring(5);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1159;
        }
        if (s.equals("-"))
        {
            break MISSING_BLOCK_LABEL_1159;
        }
        hashmap.put("_spm", (new StringBuilder()).append(c.ai(s)).append("-0-0").toString());
        return hashmap;
        hashmap.put("_spm", "0-0-0");
        return hashmap;
        activity = h1.getExecProxy().Y().p((new StringBuilder()).append("EasyTrace_").append(activity.getClass().getSimpleName()).toString());
        s = activity;
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_1238;
        }
        s = activity;
        if (activity.startsWith("_o_p_"))
        {
            s = activity.substring(5);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1289;
        }
        if (s.equals("-"))
        {
            break MISSING_BLOCK_LABEL_1289;
        }
        hashmap.put("_spm", (new StringBuilder()).append(c.ai(s)).append("-0-0").toString());
        return hashmap;
        hashmap.put("_spm", "0-0-0");
        return hashmap;
        hashmap.put("_spm", "0-0-0");
        return hashmap;
          goto _L10
    }

    private static void a(Map map, Hashtable hashtable)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static a bj()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String[] a(String s, Activity activity)
    {
        String s1;
        Object obj;
        ArrayList arraylist;
        ArrayList arraylist1;
        Uri uri;
        Bundle bundle;
        arraylist = new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        arraylist1 = new ArrayList();
        Iterator iterator;
        if (!p.isEmpty(s))
        {
            s1 = s;
        } else
        {
            s1 = activity.getClass().getSimpleName();
        }
        obj = O(s1);
        if (obj == null || !((f) (obj)).getType().equals("page")) goto _L2; else goto _L1
_L1:
        obj = ((f) (obj)).bI();
        if (((Map) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
        iterator = ((Map) (obj)).entrySet().iterator();
        uri = activity.getIntent().getData();
        bundle = activity.getIntent().getExtras();
_L9:
        if (!iterator.hasNext()) goto _L2; else goto _L4
_L4:
        obj = (java.util.Map.Entry)iterator.next();
        if (((java.util.Map.Entry) (obj)).getValue() == null || ((java.util.Map.Entry) (obj)).getValue() == "") goto _L6; else goto _L5
_L5:
        obj = (new StringBuilder()).append((String)((java.util.Map.Entry) (obj)).getKey()).append("=").append(((java.util.Map.Entry) (obj)).getValue()).toString();
_L10:
        if (!((String) (obj)).contains("_tpkc=-1")) goto _L8; else goto _L7
_L7:
        arraylist1.add("-1");
          goto _L9
        obj;
        Logger.d(2, TAG, (new StringBuilder()).append("error during pvDataAllCollect - process args!").append(((Throwable) (obj)).getLocalizedMessage()).toString());
_L2:
        s = a(s, activity, ((List) (arraylist1)));
        if (s != null && s.size() > 0)
        {
            activity = s.entrySet().iterator();
            while (activity.hasNext()) 
            {
                s = (java.util.Map.Entry)activity.next();
                String s2;
                int j;
                int k;
                if (s.getValue() != null && !((String)s.getValue()).equals(""))
                {
                    s = (new StringBuilder()).append((String)s.getKey()).append("=").append((String)s.getValue()).toString();
                } else
                {
                    s = (new StringBuilder()).append((String)s.getKey()).append("=").toString();
                }
                arraylist.add(s);
            }
        }
        break MISSING_BLOCK_LABEL_890;
_L6:
        obj = (new StringBuilder()).append((String)((java.util.Map.Entry) (obj)).getKey()).append("=").toString();
          goto _L10
_L8:
        if (!((String) (obj)).contains("_tpkc") || !((String) (obj)).contains("={"))
        {
            break MISSING_BLOCK_LABEL_566;
        }
        if (((String) (obj)).length() <= ((String) (obj)).indexOf("={") + 2 + 1) goto _L9; else goto _L11
_L11:
        obj = ((String) (obj)).substring(((String) (obj)).indexOf("={") + 2, ((String) (obj)).length() - 1).split("&");
        k = obj.length;
        j = 0;
_L13:
        if (j >= k) goto _L9; else goto _L12
_L12:
        arraylist1.add(obj[j].trim());
        j++;
          goto _L13
label0:
        {
            if (!((String) (obj)).contains("${url|"))
            {
                break label0;
            }
            s2 = a(((String) (obj)).substring(((String) (obj)).indexOf("${url|") + 6, ((String) (obj)).length() - 1), uri);
            if (!p.isEmpty(s2))
            {
                arraylist.add((new StringBuilder()).append(((String) (obj)).substring(0, ((String) (obj)).indexOf("${url|"))).append(s2).toString());
            }
        }
          goto _L9
label1:
        {
            if (!((String) (obj)).contains("${ut|"))
            {
                break label1;
            }
            s2 = a(((String) (obj)).substring(((String) (obj)).indexOf("${ut|") + 5, ((String) (obj)).length() - 1), bundle);
            if (!p.isEmpty(s2))
            {
                arraylist.add((new StringBuilder()).append(((String) (obj)).substring(0, ((String) (obj)).indexOf("${ut|"))).append(s2).toString());
            }
        }
          goto _L9
label2:
        {
            if (!((String) (obj)).contains("${"))
            {
                break label2;
            }
            s2 = a(((String) (obj)).substring(((String) (obj)).indexOf("${") + 2, ((String) (obj)).length() - 1), uri, bundle);
            if (!p.isEmpty(s2))
            {
                arraylist.add((new StringBuilder()).append(((String) (obj)).substring(0, ((String) (obj)).indexOf("${"))).append(s2).toString());
            }
        }
          goto _L9
        arraylist.add(obj);
          goto _L9
        s = String.valueOf(c.ai(s1));
        arraylist.add((new StringBuilder()).append("_xp=").append(s).toString());
        activity = com.taobao.statistic.TBS.a.x();
        if (activity.ak() != null && activity.ak().bh())
        {
            arraylist.add((new StringBuilder()).append("_xPath=").append(s1).toString());
        }
        if (arraylist.size() > 0)
        {
            s = new String[arraylist.size()];
            arraylist.toArray(s);
        } else
        {
            s = null;
        }
        activity = activity.at();
        if (activity != null && activity.ay().get(s1) != null)
        {
            ((HashMap)activity.ay().get(s1)).clear();
        }
        return s;
    }

}
