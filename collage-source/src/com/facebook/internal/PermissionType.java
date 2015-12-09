// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


public final class PermissionType extends Enum
{

    private static final PermissionType $VALUES[];
    public static final PermissionType PUBLISH;
    public static final PermissionType READ;

    private PermissionType(String s, int i)
    {
        super(s, i);
    }

    public static PermissionType valueOf(String s)
    {
        return (PermissionType)Enum.valueOf(com/facebook/internal/PermissionType, s);
    }

    public static PermissionType[] values()
    {
        return (PermissionType[])$VALUES.clone();
    }

    static 
    {
        READ = new PermissionType("READ", 0);
        PUBLISH = new PermissionType("PUBLISH", 1);
        $VALUES = (new PermissionType[] {
            READ, PUBLISH
        });
    }
}
