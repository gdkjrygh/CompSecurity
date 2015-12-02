// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateService

class a extends Thread
{

    final String a;
    final UpdateService b;

    public void run()
    {
        Object obj = new File(UpdateService.v(b).getFilesDir(), a);
        obj = new BufferedReader(new FileReader(((File) (obj))));
        Object obj1 = ((BufferedReader) (obj)).readLine();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (!Pattern.compile("\\d{1,3}").matcher(((CharSequence) (obj1))).matches()) goto _L2; else goto _L3
_L3:
        obj1 = Integer.decode(((String) (obj1)));
        if (((Integer) (obj1)).intValue() > 100 || ((Integer) (obj1)).intValue() < 0) goto _L2; else goto _L4
_L4:
        int i;
        i = (new Random()).nextInt(101);
        if (((Integer) (obj1)).intValue() == 0)
        {
            SharedPref.a(UpdateService.w(b), "user_ex_v3", false);
            return;
        }
        if (((Integer) (obj1)).intValue() == 100)
        {
            SharedPref.a(UpdateService.x(b), "user_ex_v3", true);
            return;
        }
          goto _L5
_L6:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (i < ((Integer) (obj1)).intValue())
        {
            SharedPref.a(UpdateService.y(b), "user_ex_v3", true);
            return;
        }
        try
        {
            SharedPref.a(UpdateService.z(b), "user_ex_v3", false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        exception = null;
        if (true) goto _L6; else goto _L2
_L2:
    }

    ef(UpdateService updateservice, String s)
    {
        b = updateservice;
        a = s;
        super();
    }
}
