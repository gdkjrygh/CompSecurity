// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package ch.qos.logback.classic.spi:
//            IThrowableProxy, StackTraceElementProxy

public class ThrowableProxyVO
    implements IThrowableProxy, Serializable
{

    private IThrowableProxy cause;
    private String className;
    private int commonFramesCount;
    private String message;
    private StackTraceElementProxy stackTraceElementProxyArray[];
    private IThrowableProxy suppressed[];

    public ThrowableProxyVO()
    {
    }

    public static ThrowableProxyVO build(IThrowableProxy ithrowableproxy)
    {
        if (ithrowableproxy == null)
        {
            return null;
        }
        ThrowableProxyVO throwableproxyvo = new ThrowableProxyVO();
        throwableproxyvo.className = ithrowableproxy.getClassName();
        throwableproxyvo.message = ithrowableproxy.getMessage();
        throwableproxyvo.commonFramesCount = ithrowableproxy.getCommonFrames();
        throwableproxyvo.stackTraceElementProxyArray = ithrowableproxy.getStackTraceElementProxyArray();
        IThrowableProxy ithrowableproxy1 = ithrowableproxy.getCause();
        if (ithrowableproxy1 != null)
        {
            throwableproxyvo.cause = build(ithrowableproxy1);
        }
        ithrowableproxy = ithrowableproxy.getSuppressed();
        if (ithrowableproxy != null)
        {
            throwableproxyvo.suppressed = new IThrowableProxy[ithrowableproxy.length];
            for (int i = 0; i < ithrowableproxy.length; i++)
            {
                throwableproxyvo.suppressed[i] = build(ithrowableproxy[i]);
            }

        }
        return throwableproxyvo;
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
        obj = (ThrowableProxyVO)obj;
        if (className == null)
        {
            if (((ThrowableProxyVO) (obj)).className != null)
            {
                return false;
            }
        } else
        if (!className.equals(((ThrowableProxyVO) (obj)).className))
        {
            return false;
        }
        if (!Arrays.equals(stackTraceElementProxyArray, ((ThrowableProxyVO) (obj)).stackTraceElementProxyArray))
        {
            return false;
        }
        if (!Arrays.equals(suppressed, ((ThrowableProxyVO) (obj)).suppressed))
        {
            return false;
        }
        if (cause != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ThrowableProxyVO) (obj)).cause == null) goto _L1; else goto _L3
_L3:
        return false;
        if (cause.equals(((ThrowableProxyVO) (obj)).cause)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public IThrowableProxy getCause()
    {
        return cause;
    }

    public String getClassName()
    {
        return className;
    }

    public int getCommonFrames()
    {
        return commonFramesCount;
    }

    public String getMessage()
    {
        return message;
    }

    public StackTraceElementProxy[] getStackTraceElementProxyArray()
    {
        return stackTraceElementProxyArray;
    }

    public IThrowableProxy[] getSuppressed()
    {
        return suppressed;
    }

    public int hashCode()
    {
        int i;
        if (className == null)
        {
            i = 0;
        } else
        {
            i = className.hashCode();
        }
        return i + 31;
    }
}
