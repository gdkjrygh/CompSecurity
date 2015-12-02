// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.alipay.android.app.exception.AlipayException;
import com.alipay.android.app.monitor.log.ErrorCodeEnum;
import com.alipay.android.app.monitor.log.LogEngine;
import com.alipay.android.app.pay.GlobalConfig;
import com.alipay.android.app.transfer.NetWrapperExt;
import com.alipay.android.app.util.FileUtils;
import com.alipay.android.app.util.LibUtils;
import com.alipay.android.app.util.PkgUtils;
import com.alipay.android.app.util.ThreadPools;
import com.alipay.android.app.warn.IUiInterControlBridge;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DynamicResourceManager
{

    private static DexClassLoader a = null;
    private static IUiInterControlBridge b = null;

    public DynamicResourceManager()
    {
    }

    public static DexClassLoader getDexLoader()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void loadUiEngine()
    {
        com/alipay/android/app/dynamic/DynamicResourceManager;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        boolean flag = GlobalConfig.isNeedFouceUpdate();
        if (!flag) goto _L3; else goto _L2
_L2:
        Field afield[];
        int j;
        afield = android/view/LayoutInflater.getDeclaredFields();
        j = afield.length;
        int i = 0;
_L9:
        Object obj;
        if (i >= j) goto _L5; else goto _L4
_L4:
        if (!((Field) (obj = afield[i])).getName().contains("sConstructorMap")) goto _L7; else goto _L6
_L6:
        String s;
        if (obj != null)
        {
            try
            {
                ((Field) (obj)).setAccessible(true);
                obj = (HashMap)((Field) (obj)).get(null);
                Iterator iterator = ((HashMap) (obj)).entrySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    if (((String)entry.getKey()).contains("com.alipay.android"))
                    {
                        ((HashMap) (obj)).put(entry.getKey(), null);
                    }
                } while (true);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally { }
        }
        if (GlobalConfig.isNeedFouceUpdate())
        {
            ThreadPools.closeThreadPool();
            NetWrapperExt.clear();
        }
        obj = FileUtils.genFilePathIfNotEx("installApkOtpCache").getAbsolutePath();
        s = LibUtils.prepareLibs(GlobalConfig.getContext(), new File(PkgUtils.fetchUIEngineFile()));
        a = new DexClassLoader(PkgUtils.fetchUIEngineFile(), ((String) (obj)), s, com/alipay/android/app/dynamic/DynamicResourceManager.getClassLoader());
        obj = PkgUtils.fetchMetaInfo(PkgUtils.fetchUIEngineFile()).getString("uiengine_bridge_class_path");
        b = (IUiInterControlBridge)a.loadClass(((String) (obj))).newInstance();
_L3:
        com/alipay/android/app/dynamic/DynamicResourceManager;
        JVM INSTR monitorexit ;
        try
        {
            LogEngine.getInstance().appLog("dynOk");
            b.initial();
            GlobalConfig.setUiInterControlBridge(b);
            GlobalConfig.updateSdkVersion();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            FileUtils.clearResource();
        }
        break MISSING_BLOCK_LABEL_258;
        com/alipay/android/app/dynamic/DynamicResourceManager;
        JVM INSTR monitorexit ;
        throw obj;
        a = null;
        throw new AlipayException(ErrorCodeEnum.ERROR_CODE_DYNAMIC_LOAD_ERROR, true, ((Throwable) (obj)));
_L5:
        obj = null;
        if (true) goto _L6; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static int restartForUpdate()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

}
