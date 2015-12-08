// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import java.io.Serializable;

public class EOMonitoringLevel extends Enum
    implements Serializable
{

    private static final EOMonitoringLevel $VALUES[];
    public static final EOMonitoringLevel kEOMonitoringLevelDebug;
    public static final EOMonitoringLevel kEOMonitoringLevelError;
    public static final EOMonitoringLevel kEOMonitoringLevelIgnore;
    public static final EOMonitoringLevel kEOMonitoringLevelInfo;
    public static final EOMonitoringLevel kEOMonitoringLevelVerbose;
    public static final EOMonitoringLevel kEOMonitoringLevelWarning;
    private int value;

    private EOMonitoringLevel(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    EOMonitoringLevel(String s, int i, int j, _cls1 _pcls1)
    {
        this(s, i, j);
    }

    public static EOMonitoringLevel valueOf(String s)
    {
        return (EOMonitoringLevel)Enum.valueOf(com/ibm/eo/model/EOMonitoringLevel, s);
    }

    public static EOMonitoringLevel[] values()
    {
        return (EOMonitoringLevel[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        kEOMonitoringLevelIgnore = new _cls1("kEOMonitoringLevelIgnore", 0, -1);
        kEOMonitoringLevelError = new _cls2("kEOMonitoringLevelError", 1, 0);
        kEOMonitoringLevelWarning = new _cls3("kEOMonitoringLevelWarning", 2, 1);
        kEOMonitoringLevelVerbose = new _cls4("kEOMonitoringLevelVerbose", 3, 2);
        kEOMonitoringLevelInfo = new _cls5("kEOMonitoringLevelInfo", 4, 3);
        kEOMonitoringLevelDebug = new _cls6("kEOMonitoringLevelDebug", 5, 4);
        $VALUES = (new EOMonitoringLevel[] {
            kEOMonitoringLevelIgnore, kEOMonitoringLevelError, kEOMonitoringLevelWarning, kEOMonitoringLevelVerbose, kEOMonitoringLevelInfo, kEOMonitoringLevelDebug
        });
    }

    private class _cls1 extends EOMonitoringLevel
    {

        public String toString()
        {
            return "kEOMonitoringLevelIgnore";
        }

        _cls1(String s, int i, int j)
        {
            super(s, i, j, null);
        }
    }


    private class _cls2 extends EOMonitoringLevel
    {

        public String toString()
        {
            return "kEOMonitoringLevelError";
        }

        _cls2(String s, int i, int j)
        {
            super(s, i, j, null);
        }
    }


    private class _cls3 extends EOMonitoringLevel
    {

        public String toString()
        {
            return "kEOMonitoringLevelWarning";
        }

        _cls3(String s, int i, int j)
        {
            super(s, i, j, null);
        }
    }


    private class _cls4 extends EOMonitoringLevel
    {

        public String toString()
        {
            return "kEOMonitoringLevelVerbose";
        }

        _cls4(String s, int i, int j)
        {
            super(s, i, j, null);
        }
    }


    private class _cls5 extends EOMonitoringLevel
    {

        public String toString()
        {
            return "kEOMonitoringLevelInfo";
        }

        _cls5(String s, int i, int j)
        {
            super(s, i, j, null);
        }
    }


    private class _cls6 extends EOMonitoringLevel
    {

        public String toString()
        {
            return "kEOMonitoringLevelDebug";
        }

        _cls6(String s, int i, int j)
        {
            super(s, i, j, null);
        }
    }

}
