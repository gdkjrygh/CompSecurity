// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;


public final class Orientation extends Enum
{

    private static final Orientation $VALUES[];
    public static final Orientation landscape;
    public static final Orientation portrait;

    private Orientation(String s, int i)
    {
        super(s, i);
    }

    public static Orientation valueOf(String s)
    {
        return (Orientation)Enum.valueOf(com/netflix/mediaclient/service/logging/apm/model/Orientation, s);
    }

    public static Orientation[] values()
    {
        return (Orientation[])$VALUES.clone();
    }

    static 
    {
        portrait = new Orientation("portrait", 0);
        landscape = new Orientation("landscape", 1);
        $VALUES = (new Orientation[] {
            portrait, landscape
        });
    }
}
