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
        if (throwable != null) goto _L2; else goto _L1
_L1:
        as = null;
_L6:
        return as;
_L2:
        String as1[];
        int i;
        int j;
        as1 = as;
        if (as == null)
        {
            as1 = CAUSE_METHOD_NAMES;
        }
        j = as1.length;
        i = 0;
_L7:
        if (i >= j) goto _L4; else goto _L3
_L3:
        Throwable throwable1;
        as = as1[i];
        if (as == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        throwable1 = getCauseUsingMethodName(throwable, as);
        as = throwable1;
        if (throwable1 != null) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return null;
    }

    private static Throwable getCauseUsingMethodName(Throwable throwable, String s)
    {
        Object obj = null;
        try
        {
            s = throwable.getClass().getMethod(s, new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = obj;
        }
        if (s == null || !java/lang/Throwable.isAssignableFrom(s.getReturnType()))
        {
            break MISSING_BLOCK_LABEL_47;
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
        Throwable throwable2 = getRootCause(throwable);
        Throwable throwable1 = throwable2;
        if (throwable2 == null)
        {
            throwable1 = throwable;
        }
        return getMessage(throwable1);
    }

    public static String[] getRootCauseStackTrace(Throwable throwable)
    {
        ArrayList arraylist;
        if (throwable == null)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        Throwable athrowable[] = getThrowables(throwable);
        int k = athrowable.length;
        arraylist = new ArrayList();
        throwable = getStackFrameList(athrowable[k - 1]);
        int i = k;
        do
        {
label0:
            {
                Throwable throwable1 = throwable;
                int l = i - 1;
                if (l < 0)
                {
                    break label0;
                }
                throwable = throwable1;
                if (l != 0)
                {
                    throwable = getStackFrameList(athrowable[l - 1]);
                    removeCommonFrames(throwable1, throwable);
                }
                Throwable throwable2 = throwable;
                int j;
                if (l == k - 1)
                {
                    arraylist.add(athrowable[l].toString());
                } else
                {
                    arraylist.add((new StringBuilder()).append(" [wrapped] ").append(athrowable[l].toString()).toString());
                }
                j = 0;
                do
                {
                    i = l;
                    throwable = throwable2;
                    if (j >= throwable1.size())
                    {
                        break;
                    }
                    arraylist.add(throwable1.get(j));
                    j++;
                } while (true);
            }
        } while (true);
        return (String[])arraylist.toArray(new String[arraylist.size()]);
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
                if (i == -1 || s.substring(0, i).trim().length() != 0)
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
label0:
        {
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
            if (flag)
            {
                do
                {
                    if (j >= throwable.length)
                    {
                        break label0;
                    }
                    i = j;
                    if (class1.isAssignableFrom(throwable[j].getClass()))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    j++;
                } while (true);
            }
            do
            {
                if (j >= throwable.length)
                {
                    break label0;
                }
                i = j;
                if (class1.equals(throwable[j].getClass()))
                {
                    break;
                }
                j++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
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
        int j = list.size() - 1;
        for (int i = list1.size() - 1; j >= 0 && i >= 0; i--)
        {
            if (((String)list.get(j)).equals((String)list1.get(i)))
            {
                list.remove(j);
            }
            j--;
        }

    }

}
