// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder
{

    public static final String COMMAND_RESET = "RESET";
    private final List commands = new ArrayList();

    public CommandBuilder()
    {
    }

    public CommandBuilder appendReset(String s)
    {
        if (s != null)
        {
            commands.add(s);
            commands.add("RESET");
        }
        return this;
    }

    public CommandBuilder appendValue(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            commands.add(s);
            commands.add(s1);
        }
        return this;
    }

    public String[] build()
    {
        return (String[])commands.toArray(new String[commands.size()]);
    }
}
