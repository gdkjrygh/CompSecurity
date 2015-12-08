// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import java.text.ParseException;

// Referenced classes of package com.google.common.net:
//            InetAddresses, InternetDomainName

public final class HostSpecifier
{

    private final String canonicalForm;

    private HostSpecifier(String s)
    {
        canonicalForm = s;
    }

    public static HostSpecifier from(String s)
        throws ParseException
    {
        HostSpecifier hostspecifier;
        try
        {
            hostspecifier = fromValid(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            s = new ParseException((new StringBuilder()).append("Invalid host specifier: ").append(s).toString(), 0);
            s.initCause(illegalargumentexception);
            throw s;
        }
        return hostspecifier;
    }

    public static HostSpecifier fromValid(String s)
    {
        Object obj = null;
        java.net.InetAddress inetaddress = InetAddresses.forString(s);
        obj = inetaddress;
_L1:
        Object obj1 = obj;
        IllegalArgumentException illegalargumentexception;
        if (obj == null)
        {
            try
            {
                obj1 = InetAddresses.forUriString(s);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                illegalargumentexception1 = ((IllegalArgumentException) (obj));
            }
        }
        if (obj1 != null)
        {
            return new HostSpecifier(InetAddresses.toUriString(((java.net.InetAddress) (obj1))));
        }
        obj = InternetDomainName.fromLenient(s);
        if (((InternetDomainName) (obj)).hasPublicSuffix())
        {
            return new HostSpecifier(((InternetDomainName) (obj)).name());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Domain name does not have a recognized public suffix: ").append(s).toString());
        }
        illegalargumentexception;
          goto _L1
    }

    public static boolean isValid(String s)
    {
        try
        {
            fromValid(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof HostSpecifier)
        {
            obj = (HostSpecifier)obj;
            return canonicalForm.equals(((HostSpecifier) (obj)).canonicalForm);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return canonicalForm.hashCode();
    }

    public String toString()
    {
        return canonicalForm;
    }
}
