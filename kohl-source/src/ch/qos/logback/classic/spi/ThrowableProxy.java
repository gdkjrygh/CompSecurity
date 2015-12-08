// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package ch.qos.logback.classic.spi:
//            IThrowableProxy, ThrowableProxyUtil, PackagingDataCalculator, StackTraceElementProxy

public class ThrowableProxy
    implements IThrowableProxy
{

    private static final Method GET_SUPPRESSED_METHOD;
    private static final ThrowableProxy NO_SUPPRESSED[];
    private boolean calculatedPackageData;
    private ThrowableProxy cause;
    private String className;
    int commonFrames;
    private String message;
    private transient PackagingDataCalculator packagingDataCalculator;
    StackTraceElementProxy stackTraceElementProxyArray[];
    private ThrowableProxy suppressed[];
    private Throwable throwable;

    public ThrowableProxy(Throwable throwable1)
    {
        int i;
        i = 0;
        super();
        suppressed = NO_SUPPRESSED;
        calculatedPackageData = false;
        throwable = throwable1;
        className = throwable1.getClass().getName();
        message = throwable1.getMessage();
        stackTraceElementProxyArray = ThrowableProxyUtil.steArrayToStepArray(throwable1.getStackTrace());
        Throwable throwable2 = throwable1.getCause();
        if (throwable2 != null)
        {
            cause = new ThrowableProxy(throwable2);
            cause.commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(throwable2.getStackTrace(), stackTraceElementProxyArray);
        }
        if (GET_SUPPRESSED_METHOD == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        throwable1 = ((Throwable) (GET_SUPPRESSED_METHOD.invoke(throwable1, new Object[0])));
        if (!(throwable1 instanceof Throwable[]))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        throwable1 = (Throwable[])(Throwable[])throwable1;
        if (throwable1.length <= 0)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        suppressed = new ThrowableProxy[throwable1.length];
_L1:
        if (i >= throwable1.length)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        suppressed[i] = new ThrowableProxy(throwable1[i]);
        suppressed[i].commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(throwable1[i].getStackTrace(), stackTraceElementProxyArray);
        i++;
          goto _L1
        throwable1;
        return;
        throwable1;
    }

    public void calculatePackagingData()
    {
        PackagingDataCalculator packagingdatacalculator;
        if (!calculatedPackageData)
        {
            if ((packagingdatacalculator = getPackagingDataCalculator()) != null)
            {
                calculatedPackageData = true;
                packagingdatacalculator.calculate(this);
                return;
            }
        }
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
        return commonFrames;
    }

    public String getMessage()
    {
        return message;
    }

    public PackagingDataCalculator getPackagingDataCalculator()
    {
        if (throwable != null && packagingDataCalculator == null)
        {
            packagingDataCalculator = new PackagingDataCalculator();
        }
        return packagingDataCalculator;
    }

    public StackTraceElementProxy[] getStackTraceElementProxyArray()
    {
        return stackTraceElementProxyArray;
    }

    public IThrowableProxy[] getSuppressed()
    {
        return suppressed;
    }

    static 
    {
        Method method = null;
        Method method1 = java/lang/Throwable.getMethod("getSuppressed", new Class[0]);
        method = method1;
_L2:
        GET_SUPPRESSED_METHOD = method;
        NO_SUPPRESSED = new ThrowableProxy[0];
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
