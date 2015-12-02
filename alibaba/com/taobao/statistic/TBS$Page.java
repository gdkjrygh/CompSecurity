// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic;

import com.taobao.statistic.core.b;
import com.taobao.statistic.core.c;
import com.taobao.statistic.f.p;
import java.util.Properties;

// Referenced classes of package com.taobao.statistic:
//            TBS, CT

public static class 
{

    public static void buttonClicked(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void create(String s)
    {
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        c1.d(s, s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void create(String s, String s1)
    {
        if (p.isEmpty(s) || p.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c1.d(s, s1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void ctrlClicked(CT ct, String s)
    {
        if (ct == null || p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        c1.a(ct.toString(), s, false);
        obj;
        JVM INSTR monitorexit ;
        return;
        ct;
        obj;
        JVM INSTR monitorexit ;
        throw ct;
    }

    public static void ctrlLongClicked(CT ct, String s)
    {
        if (ct == null || p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        c1.b(ct.toString(), s, false);
        obj;
        JVM INSTR monitorexit ;
        return;
        ct;
        obj;
        JVM INSTR monitorexit ;
        throw ct;
    }

    public static void destroy(String s)
    {
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        c1.d(s, new String[0]);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void enter(String s)
    {
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        c1.b(s, new String[0]);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void enterWithPageName(String s, String s1)
    {
        if (p.isEmpty(s) || p.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        c1.a(s, s1, (String[])null);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void goBack()
    {
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        c1.goBack();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void itemSelected(CT ct, String s, int i)
    {
        if (ct == null || p.isEmpty(s) || i < 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        c1.a(ct.toString(), s, i, false);
        obj;
        JVM INSTR monitorexit ;
        return;
        ct;
        obj;
        JVM INSTR monitorexit ;
        throw ct;
    }

    public static void leave(String s)
    {
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        c1.c(s, new String[0]);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void updatePageName(String s, String s1)
    {
        if (p.isEmpty(s) || p.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = TBS.access$300();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj1 = ((c) (obj1)).Y();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        ((b) (obj1)).updatePageName(s, s1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
    }

    public static void updatePageProperties(String s, Properties properties)
    {
        if (p.isEmpty(s) || properties == null || properties.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = TBS.access$300();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj1 = ((c) (obj1)).Y();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        ((b) (obj1)).updatePageProperties(s, properties);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public ()
    {
    }
}
