// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;


final class ao extends Enum
{

    private static final ao $VALUES[];
    public static final ao INSTANCE_GET;
    public static final ao PROVIDER_GET;

    private ao(String s, int i)
    {
        super(s, i);
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(com/facebook/inject/ao, s);
    }

    public static ao[] values()
    {
        return (ao[])$VALUES.clone();
    }

    static 
    {
        PROVIDER_GET = new ao("PROVIDER_GET", 0);
        INSTANCE_GET = new ao("INSTANCE_GET", 1);
        $VALUES = (new ao[] {
            PROVIDER_GET, INSTANCE_GET
        });
    }
}
