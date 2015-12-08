// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            b

final class a
    implements Runnable
{

    final a a;
    final a b;

    public final void run()
    {
        if (a.a == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        b.b.setFixedLengthStreamingMode(a.a.length);
        obj1 = new BufferedOutputStream(b.b.getOutputStream());
        Object obj;
        Object obj2;
        obj2 = obj1;
        obj = obj1;
        ((OutputStream) (obj1)).write(a.a);
        obj2 = obj1;
        obj = obj1;
        ((OutputStream) (obj1)).flush();
_L12:
        obj2 = obj1;
        obj = obj1;
        java.util.Map map = b.b.getHeaderFields();
        obj2 = obj1;
        obj = obj1;
        a.a("responseHeaders", new Object[] {
            map
        });
        obj2 = obj1;
        obj = obj1;
        int i = b.b.getResponseCode();
        if (200 != i) goto _L4; else goto _L3
_L3:
        obj2 = obj1;
        obj = obj1;
        (a);
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        ((OutputStream) (obj1)).close();
_L7:
        return;
_L4:
        obj2 = obj1;
        obj = obj1;
        a.a(new IOException(Integer.toString(i)));
          goto _L5
        obj1;
_L10:
        obj = obj2;
        a.a(((Exception) (obj1)));
        if (obj2 == null) goto _L7; else goto _L6
_L6:
        try
        {
            ((OutputStream) (obj2)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        obj = null;
_L9:
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw obj1;
        ioexception;
        return;
        obj1;
        if (true) goto _L9; else goto _L8
_L8:
        obj1;
        obj2 = null;
          goto _L10
_L2:
        obj1 = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    ( ,  1)
    {
        b = ;
        a = 1;
        super();
    }
}
