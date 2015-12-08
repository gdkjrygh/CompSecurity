// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.HashMap;

// Referenced classes of package ch.qos.logback.classic.spi:
//            StackTraceElementProxy, ClassPackagingData, IThrowableProxy, STEUtil

public class PackagingDataCalculator
{

    static final StackTraceElementProxy STEP_ARRAY_TEMPLATE[] = new StackTraceElementProxy[0];
    HashMap cache;

    public PackagingDataCalculator()
    {
        cache = new HashMap();
    }

    private Class bestEffortLoadClass(ClassLoader classloader, String s)
    {
        Class class1 = loadClass(classloader, s);
        if (class1 != null)
        {
            classloader = class1;
        } else
        {
            ClassLoader classloader1 = Thread.currentThread().getContextClassLoader();
            if (classloader1 != classloader)
            {
                class1 = loadClass(classloader1, s);
            }
            classloader = class1;
            if (class1 == null)
            {
                try
                {
                    classloader = Class.forName(s);
                }
                // Misplaced declaration of an exception variable
                catch (ClassLoader classloader)
                {
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (ClassLoader classloader)
                {
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (ClassLoader classloader)
                {
                    classloader.printStackTrace();
                    return null;
                }
                return classloader;
            }
        }
        return classloader;
    }

    private ClassPackagingData computeBySTEP(StackTraceElementProxy stacktraceelementproxy, ClassLoader classloader)
    {
        stacktraceelementproxy = stacktraceelementproxy.ste.getClassName();
        ClassPackagingData classpackagingdata = (ClassPackagingData)cache.get(stacktraceelementproxy);
        if (classpackagingdata != null)
        {
            return classpackagingdata;
        } else
        {
            classloader = bestEffortLoadClass(classloader, stacktraceelementproxy);
            String s = getImplementationVersion(classloader);
            classloader = new ClassPackagingData(getCodeLocation(classloader), s, false);
            cache.put(stacktraceelementproxy, classloader);
            return classloader;
        }
    }

    private String getCodeLocation(String s, char c)
    {
        int i = s.lastIndexOf(c);
        if (isFolder(i, s))
        {
            return s.substring(s.lastIndexOf(c, i - 1) + 1);
        }
        if (i > 0)
        {
            return s.substring(i + 1);
        } else
        {
            return null;
        }
    }

    private boolean isFolder(int i, String s)
    {
        return i != -1 && i + 1 == s.length();
    }

    private Class loadClass(ClassLoader classloader, String s)
    {
        if (classloader == null)
        {
            return null;
        }
        try
        {
            classloader = classloader.loadClass(s);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            classloader.printStackTrace();
            return null;
        }
        return classloader;
    }

    public void calculate(IThrowableProxy ithrowableproxy)
    {
        for (; ithrowableproxy != null; ithrowableproxy = ithrowableproxy.getCause())
        {
            populateFrames(ithrowableproxy.getStackTraceElementProxyArray());
            IThrowableProxy aithrowableproxy[] = ithrowableproxy.getSuppressed();
            if (aithrowableproxy == null)
            {
                continue;
            }
            int j = aithrowableproxy.length;
            for (int i = 0; i < j; i++)
            {
                populateFrames(aithrowableproxy[i].getStackTraceElementProxyArray());
            }

        }

    }

    String getCodeLocation(Class class1)
    {
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        class1 = class1.getProtectionDomain().getCodeSource().getLocation();
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        String s;
        class1 = class1.toString();
        s = getCodeLocation(((String) (class1)), '/');
        if (s != null)
        {
            return s;
        }
        class1 = getCodeLocation(((String) (class1)), '\\');
        return class1;
        class1;
        return "na";
    }

    String getImplementationVersion(Class class1)
    {
        if (class1 == null)
        {
            class1 = "na";
        } else
        {
            class1 = class1.getPackage();
            if (class1 != null)
            {
                String s = class1.getImplementationVersion();
                class1 = s;
                if (s == null)
                {
                    return "na";
                }
            } else
            {
                return "na";
            }
        }
        return class1;
    }

    void populateFrames(StackTraceElementProxy astacktraceelementproxy[])
    {
        int j = STEUtil.findNumberOfCommonFrames((new Throwable("local stack reference")).getStackTrace(), astacktraceelementproxy);
        int k = astacktraceelementproxy.length;
        for (int i = 0; i < j; i++)
        {
            StackTraceElementProxy stacktraceelementproxy = astacktraceelementproxy[(k - j) + i];
            stacktraceelementproxy.setClassPackagingData(computeBySTEP(stacktraceelementproxy, null));
        }

        populateUncommonFrames(j, astacktraceelementproxy, null);
    }

    void populateUncommonFrames(int i, StackTraceElementProxy astacktraceelementproxy[], ClassLoader classloader)
    {
        int k = astacktraceelementproxy.length;
        for (int j = 0; j < k - i; j++)
        {
            StackTraceElementProxy stacktraceelementproxy = astacktraceelementproxy[j];
            stacktraceelementproxy.setClassPackagingData(computeBySTEP(stacktraceelementproxy, classloader));
        }

    }

}
