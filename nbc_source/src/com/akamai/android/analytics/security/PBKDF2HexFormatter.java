// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics.security;


// Referenced classes of package com.akamai.android.analytics.security:
//            PBKDF2Formatter, BinTools, PBKDF2Parameters

public class PBKDF2HexFormatter
    implements PBKDF2Formatter
{

    public PBKDF2HexFormatter()
    {
    }

    public boolean fromString(PBKDF2Parameters pbkdf2parameters, String s)
    {
        if (pbkdf2parameters == null || s == null)
        {
            return true;
        }
        Object aobj[] = s.split(":");
        if (aobj == null || aobj.length != 3)
        {
            return true;
        } else
        {
            s = BinTools.hex2bin(aobj[0]);
            int i = Integer.parseInt(aobj[1]);
            aobj = BinTools.hex2bin(aobj[2]);
            pbkdf2parameters.setSalt(s);
            pbkdf2parameters.setIterationCount(i);
            pbkdf2parameters.setDerivedKey(((byte []) (aobj)));
            return false;
        }
    }

    public String toString(PBKDF2Parameters pbkdf2parameters)
    {
        return (new StringBuilder(String.valueOf(BinTools.bin2hex(pbkdf2parameters.getSalt())))).append(":").append(String.valueOf(pbkdf2parameters.getIterationCount())).append(":").append(BinTools.bin2hex(pbkdf2parameters.getDerivedKey())).toString();
    }
}
