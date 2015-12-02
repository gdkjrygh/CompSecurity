// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ahw
{

    public static boolean a = true;
    private static File b = null;
    private static File c = null;
    private static String d = null;
    private static String e = null;
    private static String f = "logger";
    private static String g = null;
    private static String h = null;
    private static String i = null;
    private static Context j = null;

    private static String a(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void a()
    {
        int l = 0;
        ahw;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a(j);
        }
        if (!b.exists() || !b.isDirectory()) goto _L2; else goto _L1
_L1:
        int k = b.list().length;
        if (k != 0) goto _L3; else goto _L2
_L2:
        ahw;
        JVM INSTR monitorexit ;
        return;
_L3:
        String as[];
        ArrayList arraylist;
        int i1;
        arraylist = new ArrayList();
        as = b.list();
        i1 = as.length;
        k = 0;
_L5:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(as[k]);
        k++;
        if (true) goto _L5; else goto _L4
_L4:
        String s;
        Collections.sort(arraylist);
        s = (String)arraylist.get(arraylist.size() - 1);
        k = arraylist.size();
        if (!s.equals(d()))
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (arraylist.size() < 2)
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)arraylist.get(arraylist.size() - 2);
        k--;
        s = a(s);
        if (!ahu.a(j).a(s))
        {
            k--;
        }
_L7:
        if (l >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = (String)arraylist.get(l);
        (new File(b, s1)).delete();
        l++;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L2; else goto _L8
_L8:
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context)
    {
        ahw;
        JVM INSTR monitorenter ;
        j = context;
        if (b == null)
        {
            b = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/log/ap").toString());
            d = Build.MODEL;
            e = context.getApplicationContext().getApplicationInfo().packageName;
        }
        if (!b.exists())
        {
            b.mkdirs();
        }
        ahw;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void a(Context context, String s)
    {
        ahw;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        a(context, ((List) (arraylist)));
        ahw;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void a(Context context, Throwable throwable)
    {
        ahw;
        JVM INSTR monitorenter ;
        Object obj = new StringWriter();
        throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
        throwable = obj.toString();
        obj = new ArrayList();
        ((List) (obj)).add(throwable);
        a(context, ((List) (obj)));
        ahw;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void a(Context context, List list)
    {
        ahw;
        JVM INSTR monitorenter ;
        StringBuffer stringbuffer;
        if (b == null)
        {
            a(context);
        }
        if (aid.a(i))
        {
            b();
        }
        stringbuffer = new StringBuffer((new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(Calendar.getInstance().getTime()));
        stringbuffer.append((new StringBuilder(",")).append(d).toString());
        stringbuffer.append((new StringBuilder(",")).append(e).toString());
        if (!aid.a(g) && g.length() >= 20) goto _L2; else goto _L1
_L1:
        stringbuffer.append((new StringBuilder(",")).append(g).toString());
_L5:
        if (!aid.a(h) && h.length() >= 20) goto _L4; else goto _L3
_L3:
        stringbuffer.append((new StringBuilder(",")).append(h).toString());
_L6:
        if (!aid.a(i) && i.length() >= 20)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        stringbuffer.append((new StringBuilder(",")).append(i).toString());
_L7:
        for (context = list.iterator(); context.hasNext(); stringbuffer.append((new StringBuilder(",")).append(list).toString()))
        {
            list = (String)context.next();
        }

        break MISSING_BLOCK_LABEL_388;
        context;
        throw context;
_L2:
        stringbuffer.append((new StringBuilder(",")).append(g.substring(0, 20)).toString());
          goto _L5
_L4:
        stringbuffer.append((new StringBuilder(",")).append(h.substring(0, 20)).toString());
          goto _L6
        stringbuffer.append((new StringBuilder(",")).append(i.substring(0, 20)).toString());
          goto _L7
        Context context1;
        Object obj;
        obj = null;
        context = null;
        context1 = context;
        list = obj;
        if (c() + (long)stringbuffer.length() > 51200L) goto _L9; else goto _L8
_L8:
        context1 = context;
        list = obj;
        context = new FileWriter(c, true);
_L10:
        context1 = context;
        list = context;
        stringbuffer.append("\n");
        context1 = context;
        list = context;
        context.write(stringbuffer.toString());
        context.close();
_L11:
        ahw;
        JVM INSTR monitorexit ;
        return;
_L9:
        context1 = context;
        list = obj;
        context = new FileWriter(c);
          goto _L10
        context;
        list = f;
        context.printStackTrace();
          goto _L11
        context;
        list = context1;
        context.printStackTrace();
        if (context1 == null) goto _L11; else goto _L12
_L12:
        context1.close();
          goto _L11
        context;
        list = f;
        context.printStackTrace();
          goto _L11
        context;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_531;
        }
        list.close();
_L13:
        throw context;
        list;
        String s = f;
        list.printStackTrace();
          goto _L13
    }

    public static void a(Context context, Map map)
    {
        ahw;
        JVM INSTR monitorenter ;
        a(context);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        g = aid.a(map, "tid", "");
        h = aid.a(map, "utdid", "");
        b();
        ahw;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void b()
    {
        ahw;
        JVM INSTR monitorenter ;
        boolean flag = aid.a(i);
        if (flag) goto _L2; else goto _L1
_L1:
        ahw;
        JVM INSTR monitorexit ;
        return;
_L2:
        ahp ahp1 = aho.a(j);
        if (ahp1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = ahp1.a();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static long c()
    {
        ahw;
        JVM INSTR monitorenter ;
        boolean flag;
        File file = new File(b, d());
        c = file;
        flag = file.exists();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        c.createNewFile();
_L1:
        long l = 0L;
_L2:
        ahw;
        JVM INSTR monitorexit ;
        return l;
        Object obj;
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L1
        obj;
        throw obj;
        l = c.length();
          goto _L2
    }

    private static String d()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

}
