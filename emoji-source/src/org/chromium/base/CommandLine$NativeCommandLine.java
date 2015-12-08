// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            CommandLine

private static class <init> extends CommandLine
{

    public void appendSwitch(String s)
    {
        CommandLine.access$500(s);
    }

    public void appendSwitchWithValue(String s, String s1)
    {
        CommandLine.access$600(s, s1);
    }

    public void appendSwitchesAndArguments(String as[])
    {
        CommandLine.access$700(as);
    }

    public String getSwitchValue(String s)
    {
        return CommandLine.access$400(s);
    }

    public boolean hasSwitch(String s)
    {
        return CommandLine.access$300(s);
    }

    public boolean isNativeImplementation()
    {
        return true;
    }

    private ()
    {
        super(null);
    }

    ( )
    {
        this();
    }
}
