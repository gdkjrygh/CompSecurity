// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;


final class c extends Enum
{

    private static final c $VALUES[];
    public static final c ALL_UPLOADED;
    public static final c FAILED;
    public static final c IN_PROGRESS;
    public static final c NO_PHOTOS;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/orca/protocol/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        NO_PHOTOS = new c("NO_PHOTOS", 0);
        IN_PROGRESS = new c("IN_PROGRESS", 1);
        FAILED = new c("FAILED", 2);
        ALL_UPLOADED = new c("ALL_UPLOADED", 3);
        $VALUES = (new c[] {
            NO_PHOTOS, IN_PROGRESS, FAILED, ALL_UPLOADED
        });
    }
}
