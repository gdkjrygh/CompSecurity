// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.b;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.a.a.a.m;

// Referenced classes of package org.a.a.a.b:
//            b

public final class a
{

    static Class a;
    private static final Object b;
    private static String c[];
    private static final Method d;
    private static final Method e;

    public static Throwable a(Throwable throwable)
    {
        synchronized (b)
        {
            throwable = a(throwable, c);
        }
        return throwable;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    private static Throwable a(Throwable throwable, String s)
    {
        Class class1;
        try
        {
            s = throwable.getClass().getMethod(s, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (a == null)
        {
            class1 = b("java.lang.Throwable");
            a = class1;
        } else
        {
            class1 = a;
        }
        if (!class1.isAssignableFrom(s.getReturnType()))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        throwable = (Throwable)s.invoke(throwable, org.a.a.a.a.a);
        return throwable;
        throwable;
_L2:
        return null;
        throwable;
        continue; /* Loop/switch isn't completed */
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Throwable a(Throwable throwable, String as[])
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (throwable != null) goto _L2; else goto _L1
_L1:
        return ((Throwable) (obj1));
_L2:
        int i;
        if (throwable instanceof b)
        {
            obj = ((b)throwable).getCause();
        } else
        if (throwable instanceof SQLException)
        {
            obj = ((SQLException)throwable).getNextException();
        } else
        if (throwable instanceof InvocationTargetException)
        {
            obj = ((InvocationTargetException)throwable).getTargetException();
        }
        obj1 = obj;
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = as;
        if (as == null)
        {
            synchronized (b)
            {
                obj1 = c;
            }
        }
        i = 0;
        do
        {
            as = ((String []) (obj));
            if (i >= obj1.length)
            {
                break;
            }
            as = obj1[i];
            if (as != null)
            {
                obj = a(throwable, ((String) (as)));
                as = ((String []) (obj));
                if (obj != null)
                {
                    break;
                }
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_134;
        throwable;
        as;
        JVM INSTR monitorexit ;
        throw throwable;
        obj1 = as;
        if (as == null)
        {
            return b(throwable, "detail");
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void a(List list, List list1)
    {
        int i = list.size();
        int j = list1.size() - 1;
        for (i--; i >= 0 && j >= 0; i--)
        {
            if (((String)list.get(i)).equals((String)list1.get(j)))
            {
                list.remove(i);
            }
            j--;
        }

    }

    public static boolean a()
    {
        return d != null;
    }

    static String[] a(String s)
    {
        s = new StringTokenizer(s, m.F);
        ArrayList arraylist = new ArrayList();
        for (; s.hasMoreTokens(); arraylist.add(s.nextToken())) { }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    private static Class b(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoClassDefFoundError(s.getMessage());
        }
        return s;
    }

    private static Throwable b(Throwable throwable, String s)
    {
        Class class1;
        try
        {
            s = throwable.getClass().getField(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (a == null)
        {
            class1 = b("java.lang.Throwable");
            a = class1;
        } else
        {
            class1 = a;
        }
        if (!class1.isAssignableFrom(s.getType()))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        throwable = (Throwable)s.get(throwable);
        return throwable;
        throwable;
_L2:
        return null;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        Object obj1;
        obj1 = null;
        b = new Object();
        c = (new String[] {
            "getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", 
            "getLinkedCause", "getThrowable"
        });
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = b("java.lang.Throwable");
        a = ((Class) (obj));
_L7:
        obj = ((Class) (obj)).getMethod("getCause", null);
_L8:
        d = ((Method) (obj));
        if (a != null) goto _L4; else goto _L3
_L3:
        obj = b("java.lang.Throwable");
        a = ((Class) (obj));
_L9:
        if (a != null) goto _L6; else goto _L5
_L5:
        Class class1;
        class1 = b("java.lang.Throwable");
        a = class1;
_L10:
        obj = ((Class) (obj)).getMethod("initCause", new Class[] {
            class1
        });
_L11:
        e = ((Method) (obj));
        return;
_L2:
        obj = a;
          goto _L7
        obj;
        obj = null;
          goto _L8
_L4:
        obj = a;
          goto _L9
_L6:
        class1 = a;
          goto _L10
        Exception exception;
        exception;
        exception = obj1;
          goto _L11
    }
}
