// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticLoggerBinder;

// Referenced classes of package org.slf4j:
//            ILoggerFactory, Logger

public final class LoggerFactory
{

    private static final String API_COMPATIBILITY_LIST[] = {
        "1.6"
    };
    static final String CODES_PREFIX = "http://www.slf4j.org/codes.html";
    static final int FAILED_INITILIZATION = 2;
    static int INITIALIZATION_STATE = 0;
    static final String MULTIPLE_BINDINGS_URL = "http://www.slf4j.org/codes.html#multiple_bindings";
    static NOPLoggerFactory NOP_FALLBACK_FACTORY = new NOPLoggerFactory();
    static final int NOP_FALLBACK_INITILIZATION = 4;
    static final String NO_STATICLOGGERBINDER_URL = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    static final String NULL_LF_URL = "http://www.slf4j.org/codes.html#null_LF";
    static final int ONGOING_INITILIZATION = 1;
    private static String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";
    static final String SUBSTITUTE_LOGGER_URL = "http://www.slf4j.org/codes.html#substituteLogger";
    static final int SUCCESSFUL_INITILIZATION = 3;
    static SubstituteLoggerFactory TEMP_FACTORY = new SubstituteLoggerFactory();
    static final int UNINITIALIZED = 0;
    static final String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String UNSUCCESSFUL_INIT_URL = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String VERSION_MISMATCH = "http://www.slf4j.org/codes.html#version_mismatch";

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
            String s = noclassdeffounderror.getMessage();
            if (s != null && s.indexOf("org/slf4j/impl/StaticLoggerBinder") != -1)
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
            String s1 = nosuchmethoderror.getMessage();
            if (s1 != null && s1.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1)
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

    private static final void performInitialization()
    {
        singleImplementationSanityCheck();
        bind();
        if (INITIALIZATION_STATE == 3)
        {
            versionSanityCheck();
        }
    }

    static void reset()
    {
        INITIALIZATION_STATE = 0;
        TEMP_FACTORY = new SubstituteLoggerFactory();
    }

    private static void singleImplementationSanityCheck()
    {
        Object obj = org/slf4j/LoggerFactory.getClassLoader();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH);
_L4:
        ArrayList arraylist;
        arraylist = new ArrayList();
        for (; ((Enumeration) (obj)).hasMoreElements(); arraylist.add((URL)((Enumeration) (obj)).nextElement())) { }
          goto _L3
        obj;
        Util.report("Error getting resources from path", ((Throwable) (obj)));
_L6:
        return;
_L2:
        obj = ((ClassLoader) (obj)).getResources(STATIC_LOGGER_BINDER_PATH);
          goto _L4
_L3:
        if (arraylist.size() <= 1) goto _L6; else goto _L5
_L5:
        Util.report("Class path contains multiple SLF4J bindings.");
        int i = 0;
_L8:
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Util.report((new StringBuilder("Found binding in [")).append(arraylist.get(i)).append("]").toString());
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        Util.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        return;
          goto _L4
    }

    private static final void versionSanityCheck()
    {
        int i;
        boolean flag = false;
        String s;
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
        i = 0;
_L2:
        if (i < API_COMPATIBILITY_LIST.length)
        {
            if (s.startsWith(API_COMPATIBILITY_LIST[i]))
            {
                flag = true;
            }
            break MISSING_BLOCK_LABEL_93;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        Util.report((new StringBuilder("The requested version ")).append(s).append(" by your slf4j binding is not compatible with ").append(Arrays.asList(API_COMPATIBILITY_LIST).toString()).toString());
        Util.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        INITIALIZATION_STATE = 0;
    }
}
