// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.io;

import android.os.Build;
import com.alibaba.akita.AkitaApplication;
import com.alibaba.akita.net.util.NetWorkUtil;
import java.util.HashSet;
import java.util.Locale;
import lk;
import lw;

// Referenced classes of package com.alibaba.akita.net.io:
//            SecurityGuardUtil

public class SitUtil
{

    private static final String HEADER_SIT = "sit";
    private static final String SPLIT = "|";
    private static final String TAG = com/alibaba/akita/net/io/SitUtil.getSimpleName();
    private static HashSet uriSet;

    public SitUtil()
    {
    }

    public static void addHeader(Object obj)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static void addSitHeader(Object obj)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static String generateSitBody()
    {
        Object obj;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        Object obj1;
        Object obj2;
        Object obj3;
        String s8;
        Object obj4;
        String s9;
        String s10;
        String s11;
        String s12;
        String s13;
        String s14;
        Object obj5;
        String s15;
        String s16;
        s15 = "";
        s1 = "";
        s3 = "";
        s5 = "";
        s7 = "";
        obj2 = "";
        obj4 = "";
        s9 = "";
        s11 = "";
        s13 = "";
        obj5 = "";
        s16 = "";
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        String s = SecurityGuardUtil.getUmidToken();
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        s1 = lk.r(AkitaApplication.a());
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        s3 = Build.BRAND;
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        s5 = Build.MODEL;
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        s7 = android.os.Build.VERSION.RELEASE;
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        obj2 = NetWorkUtil.getConnectTypeName();
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        obj4 = lk.b(AkitaApplication.a());
        s9 = "mobile";
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        s11 = lk.g();
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        s13 = Locale.getDefault().getLanguage();
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        obj5 = (new StringBuilder()).append(lk.h(AkitaApplication.a())).append("x").append(lk.i(AkitaApplication.a())).toString();
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj3 = obj2;
        s8 = s7;
        s10 = s5;
        s12 = s3;
        s14 = s1;
        s15 = s;
        String s17 = SecurityGuardUtil.getWua();
        obj = s17;
        s8 = (new StringBuilder()).append("").append(SecurityGuardUtil.getSecurityTime()).toString();
        obj1 = obj4;
        s6 = s9;
        s4 = s11;
        s2 = s13;
        obj3 = obj;
_L2:
        obj = new StringBuffer();
        ((StringBuffer) (obj)).append(s);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s1);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s3);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s5);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s7);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(((String) (obj2)));
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(((String) (obj1)));
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s6);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s4);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s2);
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(((String) (obj5)));
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(((String) (obj3)));
        ((StringBuffer) (obj)).append("|");
        ((StringBuffer) (obj)).append(s8);
        return ((StringBuffer) (obj)).toString();
        obj4;
        s9 = "";
        s = s15;
        s1 = s14;
        s3 = s12;
        s5 = s10;
        s7 = s8;
        obj2 = obj3;
        obj3 = s9;
_L3:
        lw.a(TAG, ((Throwable) (obj4)), new Object[0]);
        s8 = s16;
        obj5 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj3 = obj;
        obj = obj5;
        s2 = s13;
        s4 = s11;
        s6 = s9;
        obj1 = obj4;
        obj4 = exception;
          goto _L3
    }

    static 
    {
        uriSet = new HashSet();
        uriSet.add("aliexpress.mobile/member.login");
        uriSet.add("aliexpress.mobile/order.placeOrder");
    }
}
