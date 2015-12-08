// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;

import java.util.ArrayList;

public final class Capability
{

    public static final ArrayList mSupportedCapabilities;

    public static String fromInt(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown capability: ")).append(i).toString());

        case 0: // '\0'
            return "ibb";

        case 1: // '\001'
            return "rtp";

        case 2: // '\002'
            return "unreliable_ping";
        }
    }

    public static int fromString(String s)
    {
        if (s.equals("ibb"))
        {
            return 0;
        }
        if (s.equals("rtp"))
        {
            return 1;
        }
        if (s.equals("unreliable_ping"))
        {
            return 2;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown capability : ")).append(s).toString());
        }
    }

    public static ArrayList getSupportedCapabilities()
    {
        return mSupportedCapabilities;
    }

    public static int getSupportedCapabilitiesAsInteger()
    {
        return 7;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        mSupportedCapabilities = arraylist;
        arraylist.add("ibb");
        mSupportedCapabilities.add("rtp");
        mSupportedCapabilities.add("unreliable_ping");
    }
}
