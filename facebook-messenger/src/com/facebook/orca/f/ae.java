// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;


public final class ae extends Enum
{

    private static final ae $VALUES[];
    public static final ae PREFER_MERGED_FOLDERS;
    public static final ae PREFER_RAW_FOLDERS;

    private ae(String s, int i)
    {
        super(s, i);
    }

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(com/facebook/orca/f/ae, s);
    }

    public static ae[] values()
    {
        return (ae[])$VALUES.clone();
    }

    static 
    {
        PREFER_MERGED_FOLDERS = new ae("PREFER_MERGED_FOLDERS", 0);
        PREFER_RAW_FOLDERS = new ae("PREFER_RAW_FOLDERS", 1);
        $VALUES = (new ae[] {
            PREFER_MERGED_FOLDERS, PREFER_RAW_FOLDERS
        });
    }
}
