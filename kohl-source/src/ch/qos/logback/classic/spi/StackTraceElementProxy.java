// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import java.io.Serializable;

// Referenced classes of package ch.qos.logback.classic.spi:
//            ClassPackagingData

public class StackTraceElementProxy
    implements Serializable
{

    private ClassPackagingData cpd;
    final StackTraceElement ste;
    private transient String steAsString;

    public StackTraceElementProxy(StackTraceElement stacktraceelement)
    {
        if (stacktraceelement == null)
        {
            throw new IllegalArgumentException("ste cannot be null");
        } else
        {
            ste = stacktraceelement;
            return;
        }
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
        obj = (StackTraceElementProxy)obj;
        if (!ste.equals(((StackTraceElementProxy) (obj)).ste))
        {
            return false;
        }
        if (cpd != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((StackTraceElementProxy) (obj)).cpd == null) goto _L1; else goto _L3
_L3:
        return false;
        if (cpd.equals(((StackTraceElementProxy) (obj)).cpd)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public ClassPackagingData getClassPackagingData()
    {
        return cpd;
    }

    public String getSTEAsString()
    {
        if (steAsString == null)
        {
            steAsString = (new StringBuilder()).append("at ").append(ste.toString()).toString();
        }
        return steAsString;
    }

    public int hashCode()
    {
        return ste.hashCode();
    }

    public void setClassPackagingData(ClassPackagingData classpackagingdata)
    {
        if (cpd != null)
        {
            throw new IllegalStateException("Packaging data has been already set");
        } else
        {
            cpd = classpackagingdata;
            return;
        }
    }

    public String toString()
    {
        return getSTEAsString();
    }
}
