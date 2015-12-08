// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.url;

import java.net.IDN;

public class IDNStringUtil
{

    public IDNStringUtil()
    {
    }

    private static String idnToASCII(String s)
    {
        try
        {
            s = IDN.toASCII(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
