// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.logging;

import java.util.List;

public interface Logger
{
    public static final class Verbosity extends Enum
    {

        private static final Verbosity $VALUES[];
        public static final Verbosity DEBUG;
        public static final Verbosity ERROR;
        public static final Verbosity INFO;
        public static final Verbosity NONE;
        public static final Verbosity WARN;
        private final int level;

        public static Verbosity valueOf(String s)
        {
            return (Verbosity)Enum.valueOf(com/adobe/mediacore/logging/Logger$Verbosity, s);
        }

        public static Verbosity[] values()
        {
            return (Verbosity[])$VALUES.clone();
        }

        public int getLevel()
        {
            return level;
        }

        static 
        {
            NONE = new Verbosity("NONE", 0, 0);
            ERROR = new Verbosity("ERROR", 1, 1);
            WARN = new Verbosity("WARN", 2, 2);
            INFO = new Verbosity("INFO", 3, 3);
            DEBUG = new Verbosity("DEBUG", 4, 4);
            $VALUES = (new Verbosity[] {
                NONE, ERROR, WARN, INFO, DEBUG
            });
        }

        private Verbosity(String s, int j, int k)
        {
            super(s, j);
            level = k;
        }
    }


    public abstract void clear();

    public abstract void d(String s, String s1);

    public abstract void e(String s, String s1);

    public abstract void e(String s, String s1, Exception exception);

    public abstract List getEntries();

    public abstract void i(String s, String s1);

    public abstract void setCapacity(int j);

    public abstract void setVerbosityLevel(Verbosity verbosity);

    public abstract void w(String s, String s1);

    public abstract void w(String s, String s1, Exception exception);
}
