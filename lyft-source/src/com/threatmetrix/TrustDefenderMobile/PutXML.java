// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class PutXML
    implements Runnable
{

    private static final String f = StringUtils.a(com/threatmetrix/TrustDefenderMobile/PutXML);
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;

    public PutXML(String s, String s1, String s2, String s3, int i)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 10000;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = i;
    }

    public void run()
    {
        Object obj3;
        int i;
        obj3 = null;
        i = 0;
        Object obj = new Socket(a, 8080);
        Object obj1;
        ((Socket) (obj)).setSoTimeout(e);
        obj1 = new BufferedWriter(new PrintWriter(((Socket) (obj)).getOutputStream()));
        Object obj4 = new BufferedReader(new InputStreamReader(((Socket) (obj)).getInputStream()));
        Object obj5;
        Object obj7;
        Object obj8;
        obj8 = obj4;
        obj7 = obj1;
        obj5 = obj;
        ((BufferedWriter) (obj1)).write((new StringBuilder()).append("<handle sig=FF44EE55 session_id=").append(c).append(" org_id=").append(b).append(" w=").append(d).append(" />").toString());
        obj8 = obj4;
        obj7 = obj1;
        obj5 = obj;
        ((BufferedWriter) (obj1)).flush();
        obj8 = obj4;
        obj7 = obj1;
        obj5 = obj;
        if (((BufferedReader) (obj4)).read() == -1)
        {
            break MISSING_BLOCK_LABEL_219;
        }
_L2:
        if (i >= 15)
        {
            break; /* Loop/switch isn't completed */
        }
        obj8 = obj4;
        obj7 = obj1;
        obj5 = obj;
        ((BufferedWriter) (obj1)).write(new char[] {
            '\0'
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj8 = obj4;
        obj7 = obj1;
        obj5 = obj;
        ((BufferedReader) (obj4)).read();
        Object obj2;
        Log.d(f, "Tidying up");
        BufferedReader bufferedreader;
        if (obj != null)
        {
            try
            {
                ((Socket) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((BufferedWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        ((BufferedReader) (obj4)).close();
_L4:
        return;
        obj2;
        obj = null;
        obj1 = null;
_L9:
        Log.w(f, "Failed to connect to the fp server", ((Throwable) (obj2)));
        Log.d(f, "Tidying up");
        if (obj1 != null)
        {
            try
            {
                ((Socket) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((BufferedWriter) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
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
        obj3;
        bufferedreader = null;
        obj1 = null;
        obj = null;
_L8:
        obj8 = bufferedreader;
        obj7 = obj1;
        obj5 = obj;
        Log.w(f, "Failed to read/write to the fp server", ((Throwable) (obj3)));
        Log.d(f, "Tidying up");
        if (obj != null)
        {
            try
            {
                ((Socket) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((BufferedWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (bufferedreader == null) goto _L4; else goto _L5
_L5:
        try
        {
            bufferedreader.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        bufferedreader;
        obj3 = null;
        obj1 = null;
        obj = null;
_L7:
        Log.d(f, "Tidying up");
        if (obj != null)
        {
            try
            {
                ((Socket) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((BufferedWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj3 != null)
        {
            try
            {
                ((BufferedReader) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw bufferedreader;
        obj;
        return;
        bufferedreader;
        obj3 = null;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        bufferedreader;
        obj3 = null;
        continue; /* Loop/switch isn't completed */
        bufferedreader;
        obj3 = obj8;
        obj1 = obj7;
        obj = obj5;
        continue; /* Loop/switch isn't completed */
        bufferedreader;
        obj4 = obj1;
        obj1 = obj3;
        obj3 = obj;
        obj = obj4;
        if (true) goto _L7; else goto _L6
_L6:
        obj3;
        bufferedreader = null;
        obj1 = null;
          goto _L8
        obj3;
        bufferedreader = null;
          goto _L8
        obj3;
        bufferedreader = ((BufferedReader) (obj4));
          goto _L8
        bufferedreader;
        obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L9
        bufferedreader;
        obj3 = null;
        obj4 = obj;
        obj = obj3;
        obj3 = obj1;
        obj1 = obj4;
          goto _L9
        bufferedreader;
        Object obj6 = obj;
        obj = obj4;
        obj3 = obj1;
        obj1 = obj6;
          goto _L9
    }

}
