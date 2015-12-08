// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            av, hs, bb, et, 
//            cn

public final class g extends av
    implements hs
{

    public g()
    {
        super.a = System.currentTimeMillis();
        b();
        super.c = bb.a;
    }

    public g(Throwable throwable)
    {
        this();
        super.b = a(throwable);
    }

    private static String a(Throwable throwable)
    {
        Object obj = null;
        if (throwable == null)
        {
            return null;
        }
        Throwable throwable1 = obj;
        StringWriter stringwriter;
        PrintWriter printwriter;
        try
        {
            stringwriter = new StringWriter();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
            return throwable1;
        }
        throwable1 = obj;
        printwriter = new PrintWriter(stringwriter);
        throwable1 = obj;
        throwable.printStackTrace(printwriter);
        throwable1 = obj;
        throwable = throwable.getCause();
_L2:
        if (throwable == null)
        {
            break; /* Loop/switch isn't completed */
        }
        throwable1 = obj;
        throwable.printStackTrace(printwriter);
        throwable1 = obj;
        throwable = throwable.getCause();
        if (true) goto _L2; else goto _L1
_L1:
        throwable1 = obj;
        throwable = stringwriter.toString();
        throwable1 = throwable;
        printwriter.close();
        throwable1 = throwable;
        stringwriter.close();
        return throwable;
    }

    public final void a(et et1, String s)
    {
        if (et1.g() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = et1.h().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        cn cn1 = (cn)iterator.next();
        if (!s.equals(cn1.a())) goto _L5; else goto _L4
_L4:
        cn cn2 = cn1;
        if (cn1 == null)
        {
            cn2 = new cn();
            cn2.a(s);
            et1.a(cn2);
        }
        cn2.a(this);
        return;
_L2:
        cn1 = null;
        if (true) goto _L4; else goto _L6
_L6:
    }
}
