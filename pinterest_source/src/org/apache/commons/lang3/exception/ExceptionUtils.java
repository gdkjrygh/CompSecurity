// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

public class ExceptionUtils
{

    private static final String CAUSE_METHOD_NAMES[] = {
        "getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", 
        "getLinkedCause", "getThrowable"
    };
    static final String WRAPPED_MARKER = " [wrapped] ";

    public ExceptionUtils()
    {
    }

    public static Throwable getCause(Throwable throwable)
    {
        return getCause(throwable, CAUSE_METHOD_NAMES);
    }

    public static Throwable getCause(Throwable throwable, String as[])
    {
        if (throwable != null)
        {
            String as1[] = as;
            if (as == null)
            {
                as1 = CAUSE_METHOD_NAMES;
            }
            int j = as1.length;
            int i = 0;
            while (i < j) 
            {
                as = as1[i];
                if (as != null)
                {
                    as = getCauseUsingMethodName(throwable, as);
                    if (as != null)
                    {
                        return as;
                    }
                }
                i++;
            }
        }
        return null;
    }

    private static Throwable getCauseUsingMethodName(Throwable throwable, String s)
    {
        try
        {
            s = throwable.getClass().getMethod(s, new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        if (s == null || !java/lang/Throwable.isAssignableFrom(s.getReturnType()))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throwable = (Throwable)s.invoke(throwable, new Object[0]);
        return throwable;
        throwable;
_L2:
        return null;
        throwable;
        continue; /* Loop/switch isn't completed */
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String[] getDefaultCauseMethodNames()
    {
        return (String[])ArrayUtils.clone(CAUSE_METHOD_NAMES);
    }

    public static String getMessage(Throwable throwable)
    {
        if (throwable == null)
        {
            return "";
        } else
        {
            String s = ClassUtils.getShortClassName(throwable, null);
            throwable = throwable.getMessage();
            return (new StringBuilder()).append(s).append(": ").append(StringUtils.defaultString(throwable)).toString();
        }
    }

    public static Throwable getRootCause(Throwable throwable)
    {
        throwable = getThrowableList(throwable);
        if (throwable.size() < 2)
        {
            return null;
        } else
        {
            return (Throwable)throwable.get(throwable.size() - 1);
        }
    }

    public static String getRootCauseMessage(Throwable throwable)
    {
        Throwable throwable1 = getRootCause(throwable);
        if (throwable1 != null)
        {
            throwable = throwable1;
        }
        return getMessage(throwable);
    }

    public static String[] getRootCauseStackTrace(Throwable throwable)
    {
        if (throwable == null)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        Throwable athrowable[] = getThrowables(throwable);
        int j = athrowable.length;
        ArrayList arraylist = new ArrayList();
        throwable = getStackFrameList(athrowable[j - 1]);
        int i = j;
        do
        {
            int k = i - 1;
            if (k >= 0)
            {
                Object obj;
                if (k != 0)
                {
                    obj = getStackFrameList(athrowable[k - 1]);
                    removeCommonFrames(throwable, ((List) (obj)));
                } else
                {
                    obj = throwable;
                }
                if (k == j - 1)
                {
                    arraylist.add(athrowable[k].toString());
                } else
                {
                    arraylist.add((new StringBuilder(" [wrapped] ")).append(athrowable[k].toString()).toString());
                }
                for (i = 0; i < throwable.size(); i++)
                {
                    arraylist.add(throwable.get(i));
                }

                i = k;
                throwable = ((Throwable) (obj));
            } else
            {
                return (String[])arraylist.toArray(new String[arraylist.size()]);
            }
        } while (true);
    }

    static List getStackFrameList(Throwable throwable)
    {
        throwable = new StringTokenizer(getStackTrace(throwable), SystemUtils.LINE_SEPARATOR);
        ArrayList arraylist = new ArrayList();
        boolean flag = false;
label0:
        do
        {
            do
            {
                if (!throwable.hasMoreTokens())
                {
                    break label0;
                }
                String s = throwable.nextToken();
                int i = s.indexOf("at");
                if (i == -1 || !s.substring(0, i).trim().isEmpty())
                {
                    continue label0;
                }
                flag = true;
                arraylist.add(s);
            } while (true);
        } while (!flag);
        return arraylist;
    }

    static String[] getStackFrames(String s)
    {
        s = new StringTokenizer(s, SystemUtils.LINE_SEPARATOR);
        ArrayList arraylist = new ArrayList();
        for (; s.hasMoreTokens(); arraylist.add(s.nextToken())) { }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public static String[] getStackFrames(Throwable throwable)
    {
        if (throwable == null)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        } else
        {
            return getStackFrames(getStackTrace(throwable));
        }
    }

    public static String getStackTrace(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter, true));
        return stringwriter.getBuffer().toString();
    }

    public static int getThrowableCount(Throwable throwable)
    {
        return getThrowableList(throwable).size();
    }

    public static List getThrowableList(Throwable throwable)
    {
        ArrayList arraylist;
        for (arraylist = new ArrayList(); throwable != null && !arraylist.contains(throwable); throwable = getCause(throwable))
        {
            arraylist.add(throwable);
        }

        return arraylist;
    }

    public static Throwable[] getThrowables(Throwable throwable)
    {
        throwable = getThrowableList(throwable);
        return (Throwable[])throwable.toArray(new Throwable[throwable.size()]);
    }

    private static int indexOf(Throwable throwable, Class class1, int i, boolean flag)
    {
        if (throwable != null && class1 != null) goto _L2; else goto _L1
_L1:
        i = -1;
_L4:
        return i;
_L2:
        int j = i;
        if (i < 0)
        {
            j = 0;
        }
        throwable = getThrowables(throwable);
        if (j >= throwable.length)
        {
            return -1;
        }
        i = j;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        do
        {
            if (j >= throwable.length)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            i = j;
            if (class1.isAssignableFrom(throwable[j].getClass()))
            {
                break;
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L6:
        i++;
_L3:
        if (i >= throwable.length)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (!class1.equals(throwable[i].getClass())) goto _L6; else goto _L5
_L5:
        return i;
        return -1;
    }

    public static int indexOfThrowable(Throwable throwable, Class class1)
    {
        return indexOf(throwable, class1, 0, false);
    }

    public static int indexOfThrowable(Throwable throwable, Class class1, int i)
    {
        return indexOf(throwable, class1, i, false);
    }

    public static int indexOfType(Throwable throwable, Class class1)
    {
        return indexOf(throwable, class1, 0, true);
    }

    public static int indexOfType(Throwable throwable, Class class1, int i)
    {
        return indexOf(throwable, class1, i, true);
    }

    public static void printRootCauseStackTrace(Throwable throwable)
    {
        printRootCauseStackTrace(throwable, System.err);
    }

    public static void printRootCauseStackTrace(Throwable throwable, PrintStream printstream)
    {
        if (throwable == null)
        {
            return;
        }
        if (printstream == null)
        {
            throw new IllegalArgumentException("The PrintStream must not be null");
        }
        throwable = getRootCauseStackTrace(throwable);
        int j = throwable.length;
        for (int i = 0; i < j; i++)
        {
            printstream.println(throwable[i]);
        }

        printstream.flush();
    }

    public static void printRootCauseStackTrace(Throwable throwable, PrintWriter printwriter)
    {
        if (throwable == null)
        {
            return;
        }
        if (printwriter == null)
        {
            throw new IllegalArgumentException("The PrintWriter must not be null");
        }
        throwable = getRootCauseStackTrace(throwable);
        int j = throwable.length;
        for (int i = 0; i < j; i++)
        {
            printwriter.println(throwable[i]);
        }

        printwriter.flush();
    }

    public static void removeCommonFrames(List list, List list1)
    {
        if (list == null || list1 == null)
        {
            throw new IllegalArgumentException("The List must not be null");
        }
        int i = list.size();
        int j = list1.size() - 1;
        for (i--; i >= 0 && j >= 0; i--)
        {
            if (((String)list.get(i)).equals((String)list1.get(j)))
            {
                list.remove(i);
            }
            j--;
        }

    }

}
