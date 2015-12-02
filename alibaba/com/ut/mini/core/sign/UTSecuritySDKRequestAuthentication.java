// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.core.sign;

import android.content.Context;
import com.ut.mini.b.a;
import com.ut.mini.base.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.ut.mini.core.sign:
//            IUTRequestAuthentication

public class UTSecuritySDKRequestAuthentication
    implements IUTRequestAuthentication
{

    private String a;
    private Object b;
    private Object c;
    private Class d;
    private Field e;
    private Field f;
    private Field g;
    private Method h;
    private int i;
    private boolean j;

    public UTSecuritySDKRequestAuthentication(String s)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 1;
        j = false;
        a = s;
    }

    private void _initSecurityCheck()
    {
        Object obj2 = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = Class.forName("com.taobao.wireless.security.sdk.SecurityGuardManager");
        b = ((Class) (obj)).getMethod("getInstance", new Class[] {
            android/content/Context
        }).invoke(null, new Object[] {
            com.ut.mini.base.c.a().k()
        });
        c = ((Class) (obj)).getMethod("getSecureSignatureComp", new Class[0]).invoke(b, new Object[0]);
_L8:
        if (obj == null) goto _L4; else goto _L3
_L3:
        d = Class.forName("com.taobao.wireless.security.sdk.SecurityGuardParamContext");
        e = d.getDeclaredField("appKey");
        f = d.getDeclaredField("paramMap");
        g = d.getDeclaredField("requestType");
        obj = ((Class) (obj)).getMethod("isOpen", new Class[0]);
_L9:
        if (obj == null) goto _L6; else goto _L5
_L5:
        flag = ((Boolean)((Method) (obj)).invoke(b, new Object[0])).booleanValue();
          goto _L7
_L11:
        int k;
        i = k;
        h = Class.forName("com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent").getMethod("signRequest", new Class[] {
            d
        });
_L4:
        j = true;
          goto _L1
        Object obj1;
        obj1;
        throw obj1;
        Throwable throwable;
        throwable;
        obj1 = null;
_L12:
        com.ut.mini.b.a.a(2, "initSecurityCheck", throwable.getMessage());
          goto _L8
        obj1;
        com.ut.mini.b.a.a(2, "initSecurityCheck", ((Throwable) (obj1)).getMessage());
        obj1 = null;
          goto _L9
_L6:
        obj1 = Class.forName("com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent");
_L10:
        if (obj1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L7
        obj1;
        com.ut.mini.b.a.a(2, "initSecurityCheck", ((Throwable) (obj1)).getMessage());
        obj1 = obj2;
          goto _L10
        obj1;
        com.ut.mini.b.a.a(2, "initSecurityCheck", ((Throwable) (obj1)).getMessage());
          goto _L4
_L14:
        k = 12;
          goto _L11
        throwable;
          goto _L12
_L7:
        if (!flag) goto _L14; else goto _L13
_L13:
        k = 1;
          goto _L11
    }

    public String getAppkey()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String getSign(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
