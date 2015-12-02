// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.a;

import com.qihoo360.common.b.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.qihoo360.common.a:
//            a

public class b
{

    public static String a(String s)
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = null;
        s = new com.qihoo360.common.a.a(new ByteArrayInputStream(s.getBytes()));
        obj = new byte[512];
_L1:
        int i = s.read(((byte []) (obj)), 0, obj.length);
label0:
        {
            {
                if (i >= 0)
                {
                    break label0;
                }
                if (s != null)
                {
                    try
                    {
                        s.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s) { }
                }
            }
            return new String(com.qihoo360.common.b.a.a(bytearrayoutputstream.toByteArray()));
        }
        bytearrayoutputstream.write(((byte []) (obj)), 0, i);
          goto _L1
        obj;
_L5:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        break MISSING_BLOCK_LABEL_56;
        s;
_L3:
        if (obj != null)
        {
            try
            {
                ((com.qihoo360.common.a.a) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        Exception exception;
        exception;
        obj = s;
        s = exception;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        s = null;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
