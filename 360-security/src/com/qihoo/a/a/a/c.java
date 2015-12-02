// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.SystemClock;
import com.qihoo360.mobilesafe.opti.i.IClearModule;
import com.qihoo360.mobilesafe.opti.i.IFunctionManager;
import com.qihoo360.mobilesafe.opti.i.appclear.IClearApp;
import com.qihoo360.mobilesafe.opti.i.cloudquery.ICloudQuery;
import com.qihoo360.mobilesafe.opti.i.trashclear.ITrashClear;
import com.qihoo360.mobilesafe.opti.i.whitelist.IBlackAndWhiteList;
import java.io.File;

// Referenced classes of package com.qihoo.a.a.a:
//            b, a

public class c
{

    private static final String a = com/qihoo/a/a/a/c.getSimpleName();
    private static IFunctionManager b;
    private static String c;

    public c()
    {
    }

    public static IClearModule a(Context context)
    {
        Throwable throwable = null;
        com/qihoo/a/a/a/c;
        JVM INSTR monitorenter ;
        IClearModule iclearmodule;
        int i;
        i = 0;
        iclearmodule = null;
_L2:
        IClearModule iclearmodule1 = com.qihoo.a.a.a.b.a(context, c, b).a(context);
        iclearmodule = iclearmodule1;
_L3:
        if (iclearmodule != null)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        if (i < 3) goto _L2; else goto _L1
_L1:
        if (iclearmodule != null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        context = (new StringBuilder("clear module load fail...")).append("").append(" retryCount:").append(i).append(" ").append("oclt.jar").append(" ").append(context.getFileStreamPath("oclt.jar").exists()).append(" ").append("oclt.dex").append(" ").append(context.getFileStreamPath("oclt.dex").exists()).append(" isMD5Equals: ").append(com.qihoo.a.a.a.a.a(context, "oclt.jar", context.getFilesDir().getAbsolutePath(), "oclt.jar")).toString();
        if (throwable != null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        throw new RuntimeException(context);
        context;
        com/qihoo/a/a/a/c;
        JVM INSTR monitorexit ;
        throw context;
        throwable;
        SystemClock.sleep(100L);
          goto _L3
        throw new RuntimeException(context, throwable);
        return iclearmodule;
    }

    public static String a(Context context, String s, String s1, String s2)
    {
        Object obj;
        Object obj1;
        Resources resources;
        obj = null;
        obj1 = null;
        resources = context.getResources();
        context = resources.getXml(resources.getIdentifier(s, "xml", context.getPackageName()));
_L4:
        int i = context.getEventType();
        if (i != 1) goto _L2; else goto _L1
_L1:
        s = obj1;
_L3:
        s1 = s;
        if (context != null)
        {
            context.close();
            s1 = s;
        }
_L6:
        return s1;
_L2:
label0:
        {
            if (context.getEventType() != 2 || !context.getName().equals(s1) || !s2.equals(context.getAttributeValue(0)))
            {
                break label0;
            }
            s = context.getAttributeValue(1);
        }
          goto _L3
        context.next();
          goto _L4
        s;
_L9:
        s1 = obj;
        if (context == null) goto _L6; else goto _L5
_L5:
        context.close();
        return null;
        context;
        s1 = null;
        s = context;
_L8:
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s;
        s1 = context;
        if (true) goto _L8; else goto _L7
_L7:
        context;
        context = null;
          goto _L9
    }

    public static void a(String s, IFunctionManager ifunctionmanager)
    {
        c = s;
        b = ifunctionmanager;
    }

    public static ITrashClear b(Context context)
    {
        return (ITrashClear)a(context).getInterface(com/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear);
    }

    public static ICloudQuery c(Context context)
    {
        try
        {
            context = (ICloudQuery)a(context).getInterface(com/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static IBlackAndWhiteList d(Context context)
    {
        IBlackAndWhiteList iblackandwhitelist = (IBlackAndWhiteList)a(context).getInterface(com/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList);
        if (iblackandwhitelist != null)
        {
            iblackandwhitelist.init(context);
        }
        return iblackandwhitelist;
    }

    public static IClearApp e(Context context)
    {
        return (IClearApp)a(context).getInterface(com/qihoo360/mobilesafe/opti/i/appclear/IClearApp);
    }

}
