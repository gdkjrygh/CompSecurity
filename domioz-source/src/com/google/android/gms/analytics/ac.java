// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.kw;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics:
//            ad, h

final class ac
{

    private final kw a;
    private Future b;

    protected ac(kw kw1)
    {
        ap.a(kw1);
        a = kw1;
        b = kw1.a(new ad(this));
    }

    private static String a(Context context)
    {
        ap.c("ClientId should be loaded from worker thread");
        Object obj = context.openFileInput("gaClientId");
        Object obj1 = obj;
        byte abyte0[] = new byte[36];
        obj1 = obj;
        int i = ((FileInputStream) (obj)).read(abyte0, 0, 36);
        obj1 = obj;
        if (((FileInputStream) (obj)).available() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        h.a("clientId file seems corrupted, deleting it.");
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                h.a((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
                return null;
            }
        }
_L4:
        return null;
_L2:
        if (i >= 14)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        h.a("clientId file seems empty, deleting it.");
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                h.a((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
                return null;
            }
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        ((FileInputStream) (obj)).close();
        obj1 = obj;
        String s = new String(abyte0, 0, i);
        obj1 = obj;
        h.c("Loaded client id from disk.");
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                h.a((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
            }
        }
        return s;
        context;
        context = null;
_L10:
        if (context == null) goto _L4; else goto _L5
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            h.a((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
            return null;
        }
        return null;
        obj;
        obj = null;
_L9:
        obj1 = obj;
        h.a("Error reading clientId file, deleting it.");
        obj1 = obj;
        context.deleteFile("gaClientId");
        if (obj == null) goto _L4; else goto _L6
_L6:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            h.a((new StringBuilder("Failed to close clientId reading stream: ")).append(context).toString());
            return null;
        }
        return null;
        context;
        obj1 = null;
_L8:
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                h.a((new StringBuilder("Failed to close clientId reading stream: ")).append(obj).toString());
            }
        }
        throw context;
        context;
        if (true) goto _L8; else goto _L7
_L7:
        IOException ioexception;
        ioexception;
          goto _L9
        context;
        context = ((Context) (obj));
          goto _L10
    }

    private static boolean a(Context context, String s)
    {
        Context context1;
        Context context2;
        Context context3;
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        flag = false;
        ap.a(s);
        ap.c("ClientId should be saved from worker thread");
        obj1 = null;
        obj2 = null;
        obj = null;
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        h.c("Storing clientId.");
        context2 = obj;
        context3 = obj1;
        context1 = obj2;
        context = context.openFileOutput("gaClientId", 0);
        context2 = context;
        context3 = context;
        context1 = context;
        context.write(s.getBytes());
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                h.a((new StringBuilder("Failed to close clientId writing stream: ")).append(context).toString());
            }
        }
        flag = true;
_L2:
        return flag;
        context;
        context1 = context2;
        h.a("Error creating clientId file.");
        if (context2 == null) goto _L2; else goto _L1
_L1:
        try
        {
            context2.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            h.a((new StringBuilder("Failed to close clientId writing stream: ")).append(context).toString());
            return false;
        }
        return false;
        context;
        context1 = context3;
        h.a("Error writing to clientId file.");
        if (context3 == null) goto _L2; else goto _L3
_L3:
        try
        {
            context3.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            h.a((new StringBuilder("Failed to close clientId writing stream: ")).append(context).toString());
            return false;
        }
        return false;
        context;
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                h.a((new StringBuilder("Failed to close clientId writing stream: ")).append(s).toString());
            }
        }
        throw context;
    }

    private String b()
    {
        String s;
        String s1;
        s1 = UUID.randomUUID().toString().toLowerCase();
        s = s1;
        if (!a(a.b(), s1))
        {
            s = "0";
        }
        return s;
        Exception exception;
        exception;
        h.a((new StringBuilder("Error saving clientId file: ")).append(exception).toString());
        return "0";
    }

    final String a()
    {
        String s1 = a(a.b());
        String s = s1;
        if (s1 == null)
        {
            s = b();
        }
        return s;
    }
}
