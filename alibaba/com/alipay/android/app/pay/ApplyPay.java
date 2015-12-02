// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.android.app.dynamic.DownloadForAsyncUpDate;
import com.alipay.android.app.model.TradeModel;
import com.alipay.android.app.monitor.log.ErrorCodeEnum;
import com.alipay.android.app.monitor.log.ErrorTypeEnum;
import com.alipay.android.app.monitor.log.ExceptionModel;
import com.alipay.android.app.monitor.log.LogEngine;
import com.alipay.android.app.pay.trade.TradeModelManager;
import com.alipay.android.app.util.GzipUtil;
import com.alipay.android.app.util.StringUtil;
import com.alipay.android.app.util.encrypt.Base64;
import com.alipay.android.app.util.encrypt.TriDes;
import com.alipay.android.app.warn.IActivityAdapter;
import com.alipay.android.app.warn.IUiInterControlBridge;
import com.alipay.android.app.warn.loading.GlobalLoading;
import java.io.PrintStream;

// Referenced classes of package com.alipay.android.app.pay:
//            ResultStatus, GlobalConfig, OuterConfig, PayEntrance

public class ApplyPay
{

    private static Boolean a = Boolean.valueOf(false);

    public ApplyPay()
    {
    }

    static void a()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static void a(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static String pay(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            LogEngine.getInstance().uploadException(new ExceptionModel(ErrorTypeEnum.BIZ_ERROR, ErrorCodeEnum.ERROR_CODE_ORDER_EMPTY, "externalInfo is empty"), ResultStatus.CANCELED_SYS);
            return TradeModelManager.buildResult(ResultStatus.CANCELED_SYS.getStatus(), "externalInfo is empty.");
        }
        GlobalConfig.updateContext(context);
        LogEngine.getInstance().initialCurrentModel(s);
        GlobalConfig.initialGlobalProper();
        if (!s.startsWith("AE_SDK_MAIN")) goto _L2; else goto _L1
_L1:
        TradeModelManager trademodelmanager;
        int i;
        try
        {
            s = s.substring(11);
            s = GzipUtil.unGZip(TriDes.decrypt(OuterConfig.getTripKey(), Base64.decode(s)));
            GlobalConfig.setAESpecialModel(true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            LogEngine.getInstance().addException(new ExceptionModel(ErrorTypeEnum.BIZ_ERROR, ErrorCodeEnum.ERROR_CODE_INITIAL, context));
            return TradeModelManager.buildResult(ResultStatus.INITIAL_ERROR.getStatus(), "");
        }
_L4:
        trademodelmanager = TradeModelManager.getInstance();
        i = StringUtil.getBizIdentity(s);
        trademodelmanager;
        JVM INSTR monitorenter ;
        if (GlobalConfig.getContext() == null || !(GlobalConfig.getContext() instanceof Activity))
        {
            GlobalConfig.updateContext(context);
        }
        boolean flag;
        if (TradeModelManager.getInstance().size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (!GlobalConfig.isToKilling())
        {
            break; /* Loop/switch isn't completed */
        }
        PayEntrance.clearPayContext(-1);
        LogEngine.getInstance().clear();
        trademodelmanager.addTrade(new TradeModel(i, s, new PayEntrance.PayResult()));
        trademodelmanager;
        JVM INSTR monitorexit ;
        GlobalConfig.setIsToBeKilling(false);
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            Toast.makeText(context, "can't call ApplyPay.pay() method on main thread", 1).show();
            return TradeModelManager.buildResult(ResultStatus.NOT_ALLOW.getStatus(), "");
        }
        break MISSING_BLOCK_LABEL_429;
_L2:
        if (!s.startsWith("AE_SDK_PK"))
        {
            break MISSING_BLOCK_LABEL_340;
        }
        try
        {
            s = s.substring(9).split("\\^#");
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("trideskey", s[0]).commit();
            GlobalConfig.updateRsaPublicKey(s[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            LogEngine.getInstance().addException(new ExceptionModel(ErrorTypeEnum.BIZ_ERROR, ErrorCodeEnum.ERROR_CODE_INITIAL, context));
            return TradeModelManager.buildResult(ResultStatus.INITIAL_ERROR.getStatus(), "");
        }
        s = s[1];
        GlobalConfig.setAESpecialModel(false);
        continue; /* Loop/switch isn't completed */
        GlobalConfig.setAESpecialModel(false);
        if (true) goto _L4; else goto _L3
_L3:
        System.out.println((new StringBuilder("warning::::")).append(LogEngine.getInstance().getlog()).toString());
        LogEngine.getInstance().uploadException(new ExceptionModel(ErrorTypeEnum.BIZ_ERROR, ErrorCodeEnum.ERROR_CODE_DOUBULE, LogEngine.getInstance().getlog()), ResultStatus.DUPLICATE_REQUEST);
        context = TradeModelManager.buildResult(ResultStatus.DUPLICATE_REQUEST.getStatus(), "");
        trademodelmanager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
        GlobalConfig.updateContext(context);
        GlobalLoading.initialize();
        GlobalLoading.showLoading(context);
        if (!a.booleanValue())
        {
            a();
        }
        a = Boolean.valueOf(false);
        LogEngine.getInstance().appLog("enterPay");
        context = PayEntrance.pay(s);
        GlobalLoading.dispose();
        a(s);
        PayEntrance.clearPayContext(i);
        DownloadForAsyncUpDate.doAsyncUpdate();
        return context;
        context;
        LogEngine.getInstance().addException(new ExceptionModel(ErrorTypeEnum.BIZ_ERROR, ErrorCodeEnum.ERROR_CODE_SER_PAY_INTER, context));
        try
        {
            GlobalConfig.getUiInterControlBridge().getActivtyAdapter().finishCurrentTradeOnException(StringUtil.getBizIdentity(s), TradeModelManager.buildResult(ResultStatus.EXCEPTION.getStatus(), ""));
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        context = TradeModelManager.buildResult(ResultStatus.EXCEPTION.getStatus(), "");
        GlobalLoading.dispose();
        a(s);
        PayEntrance.clearPayContext(i);
        DownloadForAsyncUpDate.doAsyncUpdate();
        return context;
        context;
        GlobalLoading.dispose();
        a(s);
        PayEntrance.clearPayContext(i);
        DownloadForAsyncUpDate.doAsyncUpdate();
        throw context;
    }

}
