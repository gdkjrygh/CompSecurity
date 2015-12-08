// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j;

import fs.org.slf4j.helpers.NOPLoggerFactory;
import fs.org.slf4j.helpers.SubstituteLoggerFactory;
import fs.org.slf4j.helpers.Util;
import fs.org.slf4j.impl.StaticLoggerBinder;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package fs.org.slf4j:
//            ILoggerFactory, Logger

public final class LoggerFactory
{

    private static final String API_COMPATIBILITY_LIST[] = {
        "1.6"
    };
    static int INITIALIZATION_STATE = 0;
    static NOPLoggerFactory NOP_FALLBACK_FACTORY = new NOPLoggerFactory();
    private static String STATIC_LOGGER_BINDER_PATH = "fs/org/slf4j/impl/StaticLoggerBinder.class";
    static SubstituteLoggerFactory TEMP_FACTORY = new SubstituteLoggerFactory();
    static Class class$org$slf4j$LoggerFactory;

    private LoggerFactory()
    {
    }

    private static final void bind()
    {
        try
        {
            StaticLoggerBinder.getSingleton();
            INITIALIZATION_STATE = 3;
            emitSubstituteLoggerWarning();
            return;
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            if (messageContainsOrgSlf4jImplStaticLoggerBinder(noclassdeffounderror.getMessage()))
            {
                INITIALIZATION_STATE = 4;
                Util.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                Util.report("Defaulting to no-operation (NOP) logger implementation");
                Util.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            } else
            {
                failedBinding(noclassdeffounderror);
                throw noclassdeffounderror;
            }
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            String s = nosuchmethoderror.getMessage();
            if (s != null && s.indexOf("fs.org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1)
            {
                INITIALIZATION_STATE = 2;
                Util.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                Util.report("Your binding is version 1.5.5 or earlier.");
                Util.report("Upgrade your binding to version 1.6.x. or 2.0.x");
            }
            throw nosuchmethoderror;
        }
        catch (Exception exception)
        {
            failedBinding(exception);
            throw new IllegalStateException("Unexpected initialization failure", exception);
        }
    }

    static Class _mthclass$(String s)
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

    private static final void emitSubstituteLoggerWarning()
    {
        List list = TEMP_FACTORY.getLoggerNameList();
        if (list.size() != 0)
        {
            Util.report("The following loggers will not work becasue they were created");
            Util.report("during the default configuration phase of the underlying logging system.");
            Util.report("See also http://www.slf4j.org/codes.html#substituteLogger");
            int i = 0;
            while (i < list.size()) 
            {
                Util.report((String)list.get(i));
                i++;
            }
        }
    }

    static void failedBinding(Throwable throwable)
    {
        INITIALIZATION_STATE = 2;
        Util.report("Failed to instantiate SLF4J LoggerFactory", throwable);
    }

    public static ILoggerFactory getILoggerFactory()
    {
        if (INITIALIZATION_STATE == 0)
        {
            INITIALIZATION_STATE = 1;
            performInitialization();
        }
        switch (INITIALIZATION_STATE)
        {
        default:
            throw new IllegalStateException("Unreachable code");

        case 3: // '\003'
            return StaticLoggerBinder.getSingleton().getLoggerFactory();

        case 4: // '\004'
            return NOP_FALLBACK_FACTORY;

        case 2: // '\002'
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");

        case 1: // '\001'
            return TEMP_FACTORY;
        }
    }

    public static Logger getLogger(Class class1)
    {
        return getLogger(class1.getName());
    }

    public static Logger getLogger(String s)
    {
        return getILoggerFactory().getLogger(s);
    }

    private static boolean messageContainsOrgSlf4jImplStaticLoggerBinder(String s)
    {
        if (s != null)
        {
            if (s.indexOf("fs/org/slf4j/impl/StaticLoggerBinder") != -1)
            {
                return true;
            }
            if (s.indexOf("fs.org.slf4j.impl.StaticLoggerBinder") != -1)
            {
                return true;
            }
        }
        return false;
    }

    private static final void performInitialization()
    {
        singleImplementationSanityCheck();
        bind();
        if (INITIALIZATION_STATE == 3)
        {
            versionSanityCheck();
        }
    }

    private static void singleImplementationSanityCheck()
    {
        if (class$org$slf4j$LoggerFactory != null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = _mthclass$("fs.org.slf4j.LoggerFactory");
        class$org$slf4j$LoggerFactory = ((Class) (obj));
_L6:
        obj = ((Class) (obj)).getClassLoader();
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH);
_L7:
        Object obj1;
        obj1 = new LinkedHashSet();
        for (; ((Enumeration) (obj)).hasMoreElements(); ((Set) (obj1)).add((URL)((Enumeration) (obj)).nextElement())) { }
          goto _L5
        obj;
        Util.report("Error getting resources from path", ((Throwable) (obj)));
_L9:
        return;
_L2:
        obj = class$org$slf4j$LoggerFactory;
          goto _L6
_L4:
        obj = ((ClassLoader) (obj)).getResources(STATIC_LOGGER_BINDER_PATH);
          goto _L7
_L5:
        if (((Set) (obj1)).size() <= 1) goto _L9; else goto _L8
_L8:
        Util.report("Class path contains multiple SLF4J bindings.");
        for (Iterator iterator = ((Set) (obj1)).iterator(); iterator.hasNext(); Util.report("Found binding in [" + obj1 + "]"))
        {
            obj1 = (URL)iterator.next();
        }

        Util.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        return;
          goto _L6
    }

    private static final void versionSanityCheck()
    {
        int i;
        String s;
        boolean flag;
        try
        {
            s = StaticLoggerBinder.REQUESTED_API_VERSION;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
        catch (Throwable throwable)
        {
            Util.report("Unexpected problem occured during version sanity check", throwable);
            return;
        }
        flag = false;
        i = 0;
_L2:
        if (i < API_COMPATIBILITY_LIST.length)
        {
            if (s.startsWith(API_COMPATIBILITY_LIST[i]))
            {
                flag = true;
            }
            break MISSING_BLOCK_LABEL_96;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        Util.report("The requested version " + s + " by your slf4j binding is not compatible with " + Arrays.asList(API_COMPATIBILITY_LIST).toString());
        Util.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
