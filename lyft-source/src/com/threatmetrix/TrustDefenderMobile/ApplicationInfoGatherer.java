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
//            StringUtils, NativeGatherer

class ApplicationInfoGatherer
{

    private static final String a = StringUtils.a(com/threatmetrix/TrustDefenderMobile/ApplicationInfoGatherer);

    ApplicationInfoGatherer()
    {
    }

    static String a(Context context)
    {
        context = context.getApplicationInfo();
        if (context != null)
        {
            context = ((ApplicationInfo) (context)).sourceDir;
            Log.d(a, (new StringBuilder()).append("sourceDir: ").append(context).toString());
            return a(((String) (context)));
        } else
        {
            return null;
        }
    }

    private static String a(String s)
    {
        IOException ioexception;
        FileInputStream fileinputstream;
        MessageDigest messagedigest;
        ioexception = null;
        if (NativeGatherer.a().b())
        {
            return NativeGatherer.a().a(s);
        }
        Log.d(a, "Falling back to managed code for hashing");
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
            fileinputstream = new FileInputStream(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(a, "Exception while getting FileInputStream", s);
            return null;
        }
        s = new byte[8192];
        i = fileinputstream.read(s);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        try
        {
            messagedigest.update(s, 0, i);
            break MISSING_BLOCK_LABEL_49;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            try
            {
                fileinputstream.close();
            }
            catch (IOException ioexception1)
            {
                Log.e(a, "Exception on closing MD5 input stream", ioexception1);
            }
            throw s;
        }
        Log.e(a, "Unable to process file for MD5", s);
        fileinputstream.close();
        s = ioexception;
_L4:
        Log.d(a, (new StringBuilder()).append("Got : ").append(s).toString());
        return s;
_L2:
        s = String.format("%32s", new Object[] {
            (new BigInteger(1, messagedigest.digest())).toString(16)
        }).replace(' ', '0');
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            Log.e(a, "Exception on closing MD5 input stream", ioexception);
        }
        continue; /* Loop/switch isn't completed */
        s;
        Log.e(a, "Exception on closing MD5 input stream", s);
        s = ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
