// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import java.io.Serializable;

public class ClassPackagingData
    implements Serializable
{

    final String codeLocation;
    private final boolean exact;
    final String version;

    public ClassPackagingData(String s, String s1, boolean flag)
    {
        codeLocation = s;
        version = s1;
        exact = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ClassPackagingData)obj;
        if (codeLocation == null)
        {
            if (((ClassPackagingData) (obj)).codeLocation != null)
            {
                return false;
            }
        } else
        if (!codeLocation.equals(((ClassPackagingData) (obj)).codeLocation))
        {
            return false;
        }
        if (exact != ((ClassPackagingData) (obj)).exact)
        {
            return false;
        }
        if (version != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ClassPackagingData) (obj)).version == null) goto _L1; else goto _L3
_L3:
        return false;
        if (version.equals(((ClassPackagingData) (obj)).version)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getCodeLocation()
    {
        return codeLocation;
    }

    public String getVersion()
    {
        return version;
    }

    public int hashCode()
    {
        int i;
        if (codeLocation == null)
        {
            i = 0;
        } else
        {
            i = codeLocation.hashCode();
        }
        return i + 31;
    }

    public boolean isExact()
    {
        return exact;
    }
}
