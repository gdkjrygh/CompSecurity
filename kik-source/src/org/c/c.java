// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import org.c.a.e;
import org.c.a.g;
import org.c.a.h;

// Referenced classes of package org.c:
//            a, b

public final class c
{

    static int a = 0;
    static g b = new g();
    static e c = new e();
    private static final String d[] = {
        "1.6"
    };
    private static String e = "org/slf4j/impl/StaticLoggerBinder.class";

    private c()
    {
    }

    public static b a(Class class1)
    {
        return a(class1.getName());
    }

    public static b a(String s)
    {
        if (a != 0) goto _L2; else goto _L1
_L1:
        a = 1;
        Object obj = org/c/c.getClassLoader();
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = ClassLoader.getSystemResources(e);
_L18:
        ArrayList arraylist;
        arraylist = new ArrayList();
        for (; ((Enumeration) (obj)).hasMoreElements(); arraylist.add((URL)((Enumeration) (obj)).nextElement())) { }
          goto _L5
_L12:
        int i;
        try
        {
            org.c.b.c.a();
            a = 3;
            a();
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            String s1 = noclassdeffounderror.getMessage();
            if (s1 != null && s1.indexOf("org/slf4j/impl/StaticLoggerBinder") != -1)
            {
                a = 4;
                h.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                h.a("Defaulting to no-operation (NOP) logger implementation");
                h.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } else
            {
                a(((Throwable) (noclassdeffounderror)));
                throw noclassdeffounderror;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            noclassdeffounderror = s.getMessage();
            if (noclassdeffounderror != null && noclassdeffounderror.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1)
            {
                a = 2;
                h.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                h.a("Your binding is version 1.5.5 or earlier.");
                h.a("Upgrade your binding to version 1.6.x. or 2.0.x");
            }
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(((Throwable) (s)));
            throw new IllegalStateException("Unexpected initialization failure", s);
        }
        if (a == 3)
        {
            b();
        }
_L2:
        a;
        JVM INSTR tableswitch 1 4: default 124
    //                   1 354
    //                   2 344
    //                   3 322
    //                   4 337;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        throw new IllegalStateException("Unreachable code");
_L4:
        obj = ((ClassLoader) (obj)).getResources(e);
        continue; /* Loop/switch isn't completed */
_L5:
        if (arraylist.size() <= 1) goto _L12; else goto _L11
_L11:
        h.a("Class path contains multiple SLF4J bindings.");
        i = 0;
_L14:
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        h.a((new StringBuilder("Found binding in [")).append(arraylist.get(i)).append("]").toString());
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        try
        {
            h.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            h.a("Error getting resources from path", ((Throwable) (obj)));
        }
          goto _L12
_L9:
        noclassdeffounderror = org.c.b.c.a().b();
_L16:
        return noclassdeffounderror.a(s);
_L10:
        noclassdeffounderror = c;
        continue; /* Loop/switch isn't completed */
_L8:
        throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
_L7:
        noclassdeffounderror = b;
        if (true) goto _L16; else goto _L15
_L15:
        if (true) goto _L18; else goto _L17
_L17:
    }

    private static final void a()
    {
        List list = b.a();
        if (list.size() != 0)
        {
            h.a("The following loggers will not work becasue they were created");
            h.a("during the default configuration phase of the underlying logging system.");
            h.a("See also http://www.slf4j.org/codes.html#substituteLogger");
            int i = 0;
            while (i < list.size()) 
            {
                h.a((String)list.get(i));
                i++;
            }
        }
    }

    private static void a(Throwable throwable)
    {
        a = 2;
        h.a("Failed to instantiate SLF4J LoggerFactory", throwable);
    }

    private static final void b()
    {
        int i;
        boolean flag = false;
        String s;
        try
        {
            s = org.c.b.c.a;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
        catch (Throwable throwable)
        {
            h.a("Unexpected problem occured during version sanity check", throwable);
            return;
        }
        i = 0;
_L2:
        if (i < d.length)
        {
            if (s.startsWith(d[i]))
            {
                flag = true;
            }
            break MISSING_BLOCK_LABEL_89;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        h.a((new StringBuilder("The requested version ")).append(s).append(" by your slf4j binding is not compatible with ").append(Arrays.asList(d).toString()).toString());
        h.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
