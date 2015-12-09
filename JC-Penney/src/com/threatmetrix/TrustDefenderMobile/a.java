// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            NativeGatherer

class a
{

    private static final String a = com/threatmetrix/TrustDefenderMobile/a.getSimpleName();

    a()
    {
    }

    static String a(Context context)
    {
        context = context.getApplicationInfo();
        if (context != null)
        {
            context = ((ApplicationInfo) (context)).sourceDir;
            String s = a;
            (new StringBuilder("sourceDir: ")).append(context);
            return a(((String) (context)));
        } else
        {
            return null;
        }
    }

    private static String a(String s)
    {
        Object obj;
        Object obj1;
        MessageDigest messagedigest;
        obj = null;
        if (NativeGatherer.a.a())
        {
            return NativeGatherer.a.a(s);
        }
        obj1 = a;
        int i;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(a, "Exception while getting digest", s);
            return null;
        }
        try
        {
            obj1 = new FileInputStream(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(a, "Exception while getting FileInputStream", s);
            return null;
        }
        s = new byte[8192];
        i = ((InputStream) (obj1)).read(s);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        try
        {
            messagedigest.update(s, 0, i);
            break MISSING_BLOCK_LABEL_44;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception)
            {
                Log.e(a, "Exception on closing MD5 input stream", ioexception);
            }
            throw s;
        }
        Log.e(a, "Unable to process file for MD5", s);
        ((InputStream) (obj1)).close();
        s = ((String) (obj));
_L4:
        obj = a;
        (new StringBuilder("Got : ")).append(s);
        return s;
_L2:
        s = String.format("%32s", new Object[] {
            (new BigInteger(1, messagedigest.digest())).toString(16)
        }).replace(' ', '0');
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(a, "Exception on closing MD5 input stream", ((Throwable) (obj)));
        }
        continue; /* Loop/switch isn't completed */
        s;
        Log.e(a, "Exception on closing MD5 input stream", s);
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

}
