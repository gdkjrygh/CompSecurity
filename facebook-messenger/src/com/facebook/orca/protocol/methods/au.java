// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;


public final class au extends Enum
{

    private static final au $VALUES[];
    public static final au FAILED;
    public static final au SKIPPED;
    public static final au SUCCEEDED;

    private au(String s, int i)
    {
        super(s, i);
    }

    public static au valueOf(String s)
    {
        return (au)Enum.valueOf(com/facebook/orca/protocol/methods/au, s);
    }

    public static au[] values()
    {
        return (au[])$VALUES.clone();
    }

    static 
    {
        SKIPPED = new au("SKIPPED", 0);
        FAILED = new au("FAILED", 1);
        SUCCEEDED = new au("SUCCEEDED", 2);
        $VALUES = (new au[] {
            SKIPPED, FAILED, SUCCEEDED
        });
    }
}
