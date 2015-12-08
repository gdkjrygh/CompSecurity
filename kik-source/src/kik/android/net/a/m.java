// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package kik.android.net.a:
//            l

final class m
    implements Runnable
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public final void run()
    {
        BufferedReader bufferedreader;
        Object obj2;
        l.a(a, l.a(a).getInputStream());
        bufferedreader = new BufferedReader(new InputStreamReader(l.b(a)));
        obj2 = Pattern.compile("HTTP\\/\\d\\.\\d (\\d+) (.*)$");
        obj = null;
_L2:
        int i;
        int j;
        int k;
        boolean flag;
        try
        {
            obj1 = bufferedreader.readLine();
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            sockettimeoutexception = ((SocketTimeoutException) (obj));
        }
        if (!"".equals(obj1))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (l.c(a) == 2) goto _L2; else goto _L1
_L1:
        if (obj1 == null)
        {
            try
            {
                throw new EOFException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            synchronized (l.d(a))
            {
                l.a(a, ((IOException) (obj1)));
            }
            return;
        }
        obj = ((Pattern) (obj2)).matcher(((CharSequence) (obj1)));
        if (!((Matcher) (obj)).find())
        {
            throw new ProtocolException((new StringBuilder("Could not parse status: ")).append(((String) (obj1))).toString());
        }
        if (((Matcher) (obj)).groupCount() < 2)
        {
            throw new ProtocolException((new StringBuilder("Could not parse code from status: ")).append(((String) (obj1))).toString());
        }
        i = Integer.parseInt(((Matcher) (obj)).group(1));
        obj1 = ((Matcher) (obj)).group(2);
        obj = new HashMap();
_L3:
        obj2 = bufferedreader.readLine();
        if ("".equals(obj2))
        {
            break MISSING_BLOCK_LABEL_281;
        }
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        throw new EOFException("EOF while reading headers");
        String as[] = ((String) (obj2)).split(": ");
        if (as.length != 2)
        {
            throw new ProtocolException("Could not parse header");
        }
        ((HashMap) (obj)).put(as[0].toLowerCase(), as[1]);
          goto _L3
        synchronized (l.d(a))
        {
            l.a(a, i);
            l.a(a, ((String) (obj1)));
            l.a(a, ((HashMap) (obj)));
            l.d(a).notifyAll();
        }
        obj1 = (String)((HashMap) (obj)).get("transfer-encoding");
        obj3 = (String)((HashMap) (obj)).get("content-length");
        obj = new StringBuilder();
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        if (!"chunked".equals(obj1)) goto _L5; else goto _L6
_L6:
        do
        {
            obj1 = bufferedreader.readLine();
            flag = "".equals(obj1);
        } while (flag);
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        i = Integer.parseInt(((String) (obj1)));
        obj1 = new char[4096];
        j = 0;
_L13:
        k = i;
        if (j >= i) goto _L10; else goto _L9
_L9:
        k = bufferedreader.read(((char []) (obj1)));
        if (k != -1) goto _L12; else goto _L11
_L11:
        k = 0;
          goto _L10
_L8:
        l.b(a, ((StringBuilder) (obj)).toString());
        return;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new IOException(((NumberFormatException) (obj)).getMessage());
_L12:
        ((StringBuilder) (obj)).append(((char []) (obj1)), 0, k);
        j += k;
          goto _L13
_L5:
        if (obj3 == null) goto _L8; else goto _L14
_L14:
        j = Integer.parseInt(((String) (obj3)));
        obj1 = new char[4096];
        i = 0;
_L17:
        if (i >= j) goto _L8; else goto _L15
_L15:
        k = bufferedreader.read(((char []) (obj1)));
        if (k == -1) goto _L8; else goto _L16
_L16:
        ((StringBuilder) (obj)).append(((char []) (obj1)), 0, k);
        i += k;
          goto _L17
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L10:
        if (k > 0) goto _L6; else goto _L8
    }
}
