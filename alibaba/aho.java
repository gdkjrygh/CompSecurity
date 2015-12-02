// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class aho
{

    public static ahp a(Context context)
    {
        Object obj1 = null;
        aho;
        JVM INSTR monitorenter ;
        Object obj = ajl.a(context, "profiles", "deviceid", "");
        if (!aid.a(((String) (obj)))) goto _L2; else goto _L1
_L1:
        obj = null;
_L7:
        String s = ((String) (obj));
        boolean flag;
        if (aid.a(((String) (obj))))
        {
            s = a();
        }
        flag = aid.a(s);
        if (!flag) goto _L4; else goto _L3
_L3:
        context = obj1;
_L5:
        aho;
        JVM INSTR monitorexit ;
        return context;
_L2:
        obj = aiv.b(aiv.a(), ((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new JSONObject(s);
        obj = new ahp(((JSONObject) (obj)).optString("apdid"), ((JSONObject) (obj)).optString("deviceInfoHash"), ((JSONObject) (obj)).optString("token"), ((JSONObject) (obj)).optString("timestamp"));
        context = ((Context) (obj));
          goto _L5
        Exception exception;
        exception;
        ahw.a(context, exception);
        context = obj1;
          goto _L5
        context;
        throw context;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static String a()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void a(Context context, ahp ahp1)
    {
        aho;
        JVM INSTR monitorenter ;
        boolean flag;
        Object obj = new JSONObject();
        ((JSONObject) (obj)).put("apdid", ahp1.a());
        ((JSONObject) (obj)).put("deviceInfoHash", ahp1.b());
        ((JSONObject) (obj)).put("token", ahp1.c());
        ((JSONObject) (obj)).put("timestamp", ahp1.d());
        ahp1 = ((JSONObject) (obj)).toString();
        obj = aiv.a(aiv.a(), ahp1);
        if (!aid.a(((String) (obj))))
        {
            HashMap hashmap = new HashMap();
            hashmap.put("deviceid", obj);
            ajl.a(context, "profiles", hashmap);
        }
        flag = aid.a(ahp1);
        if (flag) goto _L2; else goto _L1
_L1:
        String s;
        ahp1 = aiv.a(aiv.a(), ahp1);
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("device", ahp1);
        s = jsonobject.toString();
        if (!ajj.a()) goto _L4; else goto _L3
_L3:
        ahp1 = (new StringBuilder(".SystemConfig")).append(File.separator).append("deviceid_international").toString();
        if (!ajj.a()) goto _L2; else goto _L5
_L5:
        ahp1 = new File(Environment.getExternalStorageDirectory(), ahp1);
        if (!ahp1.exists())
        {
            ahp1.getParentFile().mkdirs();
        }
        ahp1 = new File(ahp1.getAbsolutePath());
        Object obj1 = null;
        ahp1 = new FileWriter(ahp1, false);
        ahp1.write(s);
        ahp1.close();
_L2:
        aho;
        JVM INSTR monitorexit ;
        return;
        ahp1;
        ahp1 = null;
_L9:
        if (ahp1 == null) goto _L2; else goto _L6
_L6:
        ahp1.close();
          goto _L2
        context;
          goto _L2
        ahp1;
_L8:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        try
        {
            ((FileWriter) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        throw ahp1;
        context;
          goto _L2
_L4:
        if (ajk.a(s)) goto _L2; else goto _L7
_L7:
        System.setProperty("deviceid_international", s);
          goto _L2
        context;
          goto _L2
        ahp1;
        ahw.a(context, ahp1);
          goto _L2
        context;
        throw context;
        context;
          goto _L2
        Exception exception1;
        exception1;
        obj1 = ahp1;
        ahp1 = exception1;
          goto _L8
        Exception exception;
        exception;
          goto _L9
    }
}
