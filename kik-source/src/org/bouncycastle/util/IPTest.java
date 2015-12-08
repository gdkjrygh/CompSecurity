// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util;

import junit.framework.TestCase;

public class IPTest extends TestCase
{

    private static final String a[] = {
        "0.0.0.0", "255.255.255.255", "192.168.0.0"
    };
    private static final String b[] = {
        "0.0.0.0.1", "256.255.255.255", "1", "A.B.C", "1:.4.6.5"
    };
    private static final String c[] = {
        "0:0:0:0:0:0:0:0", "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF", "0:1:2:3:FFFF:5:FFFF:1"
    };
    private static final String d[] = {
        "0.0.0.0:1", "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFFF"
    };

    public IPTest()
    {
    }

    public String getName()
    {
        return "IPTest";
    }

}
