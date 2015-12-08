// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.b;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.a.a.a.b:
//            a, b

public final class c
    implements Serializable
{

    public static boolean a = true;
    public static boolean b = true;
    public static boolean c = true;
    private Throwable d;

    public c(b b1)
    {
        d = null;
        if (b1 instanceof Throwable)
        {
            d = (Throwable)b1;
            return;
        } else
        {
            throw new IllegalArgumentException("The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable");
        }
    }

    private static void a(List list)
    {
        for (int i = list.size() - 1; i > 0; i--)
        {
            String as[] = (String[])list.get(i);
            String as1[] = (String[])list.get(i - 1);
            ArrayList arraylist = new ArrayList(Arrays.asList(as));
            org.a.a.a.b.a.a(arraylist, new ArrayList(Arrays.asList(as1)));
            int j = as.length - arraylist.size();
            if (j > 0)
            {
                arraylist.add("\t... " + j + " more");
                list.set(i, ((Object) (arraylist.toArray(new String[arraylist.size()]))));
            }
        }

    }

    public final void a(PrintStream printstream)
    {
        printstream;
        JVM INSTR monitorenter ;
        PrintWriter printwriter = new PrintWriter(printstream, false);
        a(printwriter);
        printwriter.flush();
        printstream;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        printstream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(PrintWriter printwriter)
    {
        Object obj;
        Object obj1;
        obj = d;
        if (org.a.a.a.b.a.a())
        {
            if (obj instanceof b)
            {
                ((b)obj).a(printwriter);
                return;
            } else
            {
                ((Throwable) (obj)).printStackTrace(printwriter);
                return;
            }
        }
        obj1 = new ArrayList();
        while (obj != null) 
        {
            StringWriter stringwriter = new StringWriter();
            PrintWriter printwriter1 = new PrintWriter(stringwriter, true);
            if (obj instanceof b)
            {
                ((b)obj).a(printwriter1);
            } else
            {
                ((Throwable) (obj)).printStackTrace(printwriter1);
            }
            ((List) (obj1)).add(org.a.a.a.b.a.a(stringwriter.getBuffer().toString()));
            obj = org.a.a.a.b.a.a(((Throwable) (obj)));
        }
        obj = "Caused by: ";
        if (!a)
        {
            obj = "Rethrown as: ";
            Collections.reverse(((List) (obj1)));
        }
        if (b)
        {
            a(((List) (obj1)));
        }
        printwriter;
        JVM INSTR monitorenter ;
        obj1 = ((List) (obj1)).iterator();
_L4:
        String as[];
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_231;
        }
        as = (String[])((Iterator) (obj1)).next();
        int i = 0;
        int j = as.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        printwriter.println(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        printwriter.print(((String) (obj)));
          goto _L4
        Exception exception;
        exception;
        printwriter;
        JVM INSTR monitorexit ;
        throw exception;
        printwriter;
        JVM INSTR monitorexit ;
    }

}
