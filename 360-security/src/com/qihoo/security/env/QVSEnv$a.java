// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.env;

import android.content.Context;
import java.io.DataInputStream;
import java.io.FileInputStream;

// Referenced classes of package com.qihoo.security.env:
//            QVSEnv

public static class 
{

    public static String a(Context context)
    {
        Object obj;
        Object obj1;
        String s;
        obj1 = null;
        obj = null;
        s = "";
        context = context.openFileInput("qvsupdate");
        obj = new DataInputStream(context);
        obj1 = ((DataInputStream) (obj)).readLine();
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((String) (obj1));
            }
        }
        s = ((String) (obj1));
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        context.close();
        s = ((String) (obj1));
_L2:
        return s;
        context;
        context = null;
_L5:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return "";
            }
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((FileInputStream) (obj)).close();
        return "";
        obj;
        context = null;
_L4:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ((DataInputStream) (obj1)).close();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        Object obj2 = null;
        obj = context;
        context = obj2;
          goto _L5
        Exception exception;
        exception;
        Context context1 = context;
        context = ((Context) (obj));
        obj = context1;
          goto _L5
    }

    public static String a(Context context, String s)
    {
        return s;
    }
}
