// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config;

import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.util.al;

public final class SynclairConfigType extends Enum
{

    public static final SynclairConfigType a;
    public static final SynclairConfigType b;
    public static final SynclairConfigType c;
    private static final SynclairConfigType d[];
    private final String file;
    private final String folder;

    private SynclairConfigType(String s, int i, String s1, String s2)
    {
        super(s, i);
        folder = s1;
        file = s2;
    }

    public static SynclairConfigType valueOf(String s)
    {
        return (SynclairConfigType)Enum.valueOf(com/fitbit/synclair/config/SynclairConfigType, s);
    }

    public static SynclairConfigType[] values()
    {
        return (SynclairConfigType[])d.clone();
    }

    public String a(TrackerType trackertype)
    {
        Object obj = null;
        if (trackertype != null)
        {
            trackertype = trackertype.b();
            obj = trackertype;
            if (trackertype != null)
            {
                obj = trackertype;
                if (!trackertype.endsWith("/"))
                {
                    obj = (new StringBuilder()).append(trackertype).append("/").toString();
                }
                obj = (new StringBuilder()).append(((String) (obj))).append(folder).append("/").toString();
            }
        }
        return ((String) (obj));
    }

    public String b(TrackerType trackertype)
    {
        trackertype = a(trackertype);
        return (new StringBuilder()).append(trackertype).append(file).append("_").append(al.g()).append(".json").toString();
    }

    static 
    {
        a = new SynclairConfigType("PAIR", 0, "pair", "flow");
        b = new SynclairConfigType("FIRMWARE", 1, "firmware", "flow");
        c = new SynclairConfigType("INFO", 2, "info", "info");
        d = (new SynclairConfigType[] {
            a, b, c
        });
    }
}
