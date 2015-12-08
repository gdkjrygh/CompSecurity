// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Iterator;

public class ahp
{

    static boolean b = Log.isLoggable("FilterFactory", 2);
    private static ClassLoader c = ahp.getClassLoader();
    private static HashSet d = new HashSet();
    private static Object e = new Object();
    HashSet a;

    public ahp()
    {
        a = new HashSet();
    }

    public static ahn a(Class class1, String s, ajr ajr1)
    {
        Constructor constructor;
        try
        {
            constructor = class1.getConstructor(new Class[] {
                ajr, java/lang/String
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            class1 = String.valueOf(class1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(class1).length() + 87)).append("The filter class '").append(class1).append("' does not have a constructor of the form <init>(MffContext, String)!").toString());
        }
        try
        {
            class1 = (ahn)constructor.newInstance(new Object[] {
                ajr1, s
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 23)).append("Error creating filter ").append(s).append("!").toString(), class1);
        }
        if (class1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 34)).append("Could not construct the filter '").append(s).append("'!").toString());
        } else
        {
            return class1;
        }
    }

    public static void a(String s)
    {
label0:
        {
            if (b)
            {
                String s1 = String.valueOf(s);
                if (s1.length() != 0)
                {
                    "Adding filter library ".concat(s1);
                } else
                {
                    new String("Adding filter library ");
                }
            }
            synchronized (e)
            {
                if (!d.contains(s))
                {
                    break label0;
                }
            }
            return;
        }
        d.add(s);
        c = new PathClassLoader(s, c);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    Class b(String s)
    {
        Object obj;
        Object obj2;
        Iterator iterator;
        obj2 = null;
        iterator = a.iterator();
        obj = null;
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        String s1;
        s1 = (String)iterator.next();
        obj1 = obj;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj1 = obj;
        (new StringBuilder(String.valueOf(s1).length() + 8 + String.valueOf(s).length())).append("Trying ").append(s1).append(".").append(s);
        obj1 = obj;
        Object obj3 = e;
        obj1 = obj;
        obj3;
        JVM INSTR monitorenter ;
        obj1 = c.loadClass((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(".").append(s).toString());
        obj = obj1;
        obj3;
        JVM INSTR monitorexit ;
        obj1 = obj;
        if (obj != null) goto _L4; else goto _L3
        Exception exception;
        exception;
        obj1 = obj;
_L5:
        obj = obj1;
        obj3;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
          goto _L3
_L2:
        obj1 = obj;
_L4:
        s = obj2;
        if (obj1 != null)
        {
            try
            {
                s = ((Class) (obj1)).asSubclass(ahn);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return s;
        exception;
        obj1 = obj;
          goto _L5
    }

}
