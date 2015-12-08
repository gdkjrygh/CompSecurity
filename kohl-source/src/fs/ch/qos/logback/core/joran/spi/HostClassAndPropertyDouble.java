// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;


public class HostClassAndPropertyDouble
{

    final Class hostClass;
    final String propertyName;

    public HostClassAndPropertyDouble(Class class1, String s)
    {
        hostClass = class1;
        propertyName = s;
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
        obj = (HostClassAndPropertyDouble)obj;
        if (hostClass == null)
        {
            if (((HostClassAndPropertyDouble) (obj)).hostClass != null)
            {
                return false;
            }
        } else
        if (!hostClass.equals(((HostClassAndPropertyDouble) (obj)).hostClass))
        {
            return false;
        }
        if (propertyName != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((HostClassAndPropertyDouble) (obj)).propertyName == null) goto _L1; else goto _L3
_L3:
        return false;
        if (propertyName.equals(((HostClassAndPropertyDouble) (obj)).propertyName)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (hostClass == null)
        {
            i = 0;
        } else
        {
            i = hostClass.hashCode();
        }
        if (propertyName != null)
        {
            j = propertyName.hashCode();
        }
        return (i + 31) * 31 + j;
    }
}
