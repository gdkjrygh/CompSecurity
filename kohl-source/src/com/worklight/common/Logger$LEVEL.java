// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;


// Referenced classes of package com.worklight.common:
//            Logger

public static abstract class <init> extends Enum
{

    private static final TRACE $VALUES[];
    public static final TRACE ANALYTICS;
    public static final TRACE DEBUG;
    public static final TRACE ERROR;
    public static final TRACE FATAL;
    public static final TRACE INFO;
    public static final TRACE LOG;
    public static final TRACE TRACE;
    public static final TRACE WARN;

    public static <init> fromString(String s)
    {
        try
        {
            s = valueOf(s.toUpperCase());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/worklight/common/Logger$LEVEL, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    protected abstract int getLevelValue();

    protected boolean isLoggable()
    {
        L_3B_.clone clone = Logger.access$100();
        return clone != null && clone.getLevelValue() >= getLevelValue();
    }

    static 
    {
        ANALYTICS = new Logger.LEVEL("ANALYTICS", 0) {

            protected int getLevelValue()
            {
                return 25;
            }

        };
        FATAL = new Logger.LEVEL("FATAL", 1) {

            protected int getLevelValue()
            {
                return 50;
            }

        };
        ERROR = new Logger.LEVEL("ERROR", 2) {

            protected int getLevelValue()
            {
                return 100;
            }

        };
        WARN = new Logger.LEVEL("WARN", 3) {

            protected int getLevelValue()
            {
                return 200;
            }

        };
        INFO = new Logger.LEVEL("INFO", 4) {

            protected int getLevelValue()
            {
                return 300;
            }

        };
        LOG = new Logger.LEVEL("LOG", 5) {

            protected int getLevelValue()
            {
                return 400;
            }

        };
        DEBUG = new Logger.LEVEL("DEBUG", 6) {

            protected int getLevelValue()
            {
                return 500;
            }

        };
        TRACE = new Logger.LEVEL("TRACE", 7) {

            protected int getLevelValue()
            {
                return 600;
            }

        };
        $VALUES = (new .VALUES[] {
            ANALYTICS, FATAL, ERROR, WARN, INFO, LOG, DEBUG, TRACE
        });
    }

    private _cls8(String s, int i)
    {
        super(s, i);
    }

    _cls8(String s, int i, _cls8 _pcls8)
    {
        this(s, i);
    }
}
