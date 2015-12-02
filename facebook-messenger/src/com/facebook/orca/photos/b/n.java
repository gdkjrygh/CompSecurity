// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;


public final class n extends Enum
{

    private static final n $VALUES[];
    public static final n FAIL;
    public static final n IN_PROGRESS;
    public static final n NOT_ACTIVE;
    public static final n SUCCESS;

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/facebook/orca/photos/b/n, s);
    }

    public static n[] values()
    {
        return (n[])$VALUES.clone();
    }

    static 
    {
        IN_PROGRESS = new n("IN_PROGRESS", 0);
        SUCCESS = new n("SUCCESS", 1);
        NOT_ACTIVE = new n("NOT_ACTIVE", 2);
        FAIL = new n("FAIL", 3);
        $VALUES = (new n[] {
            IN_PROGRESS, SUCCESS, NOT_ACTIVE, FAIL
        });
    }
}
