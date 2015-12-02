// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;


public final class ag extends Enum
{

    private static final ag $VALUES[];
    public static final ag ADD;
    public static final ag MODIFY;
    public static final ag NONE;
    public static final ag REMOVE;

    private ag(String s, int i)
    {
        super(s, i);
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(com/facebook/contacts/server/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])$VALUES.clone();
    }

    static 
    {
        ADD = new ag("ADD", 0);
        MODIFY = new ag("MODIFY", 1);
        REMOVE = new ag("REMOVE", 2);
        NONE = new ag("NONE", 3);
        $VALUES = (new ag[] {
            ADD, MODIFY, REMOVE, NONE
        });
    }
}
