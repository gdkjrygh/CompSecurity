// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.service;


public final class Service extends Enum
{

    private static final Service $VALUES[];
    public static final Service facebook;
    protected String name;

    private Service(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static Service find(String s)
    {
        if (facebook.name.equalsIgnoreCase(s))
        {
            return facebook;
        } else
        {
            return null;
        }
    }

    public static Service valueOf(String s)
    {
        return (Service)Enum.valueOf(com/netflix/mediaclient/event/service/Service, s);
    }

    public static Service[] values()
    {
        return (Service[])$VALUES.clone();
    }

    public final String getName()
    {
        return name;
    }

    static 
    {
        facebook = new Service("facebook", 0, "fb");
        $VALUES = (new Service[] {
            facebook
        });
    }
}
