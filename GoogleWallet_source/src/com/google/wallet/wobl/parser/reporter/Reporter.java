// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.reporter;

import com.google.wallet.wobl.exception.WoblException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.IllegalFormatException;

// Referenced classes of package com.google.wallet.wobl.parser.reporter:
//            Environment, ReportLevel, FormattingLogger

public class Reporter
{

    private Reporter()
    {
    }

    private static String getCallerClassName()
    {
        StackTraceElement astacktraceelement[] = (new Exception()).getStackTrace();
        String s1 = com/google/wallet/wobl/parser/reporter/Reporter.getName();
        int i = astacktraceelement.length - 1;
        do
        {
label0:
            {
label1:
                {
                    if (i >= 0)
                    {
                        if (!astacktraceelement[i].getClassName().equals(s1))
                        {
                            break label0;
                        }
                        if (i != astacktraceelement.length - 1)
                        {
                            break label1;
                        }
                    }
                    return null;
                }
                String s = astacktraceelement[i + 1].getClassName();
                return s.substring(s.lastIndexOf('.') + 1);
            }
            i--;
        } while (true);
    }

    public static void report(ReportLevel reportlevel, WoblException woblexception)
        throws WoblException
    {
        ReportLevel reportlevel1 = Environment.getMinLevelForThrowing();
        ReportLevel reportlevel2 = Environment.getMinLoggingLevel();
        if (reportlevel != null)
        {
            if (reportlevel1 != null && reportlevel.compareTo(reportlevel1) >= 0)
            {
                throw woblexception;
            }
            if (reportlevel2 != null && reportlevel.compareTo(reportlevel2) >= 0)
            {
                Object obj = getCallerClassName();
                static class _cls1
                {

                    static final int $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[];

                    static 
                    {
                        $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel = new int[ReportLevel.values().length];
                        try
                        {
                            $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[ReportLevel.ERROR.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[ReportLevel.WARN.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[ReportLevel.INFO.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (obj != null)
                {
                    obj = FormattingLogger.getLogger(((String) (obj)));
                } else
                {
                    obj = FormattingLogger.getLogger(com/google/wallet/wobl/parser/reporter/Reporter);
                }
                switch (_cls1..SwitchMap.com.google.wallet.wobl.parser.reporter.ReportLevel[reportlevel.ordinal()])
                {
                default:
                    ((FormattingLogger) (obj)).info(woblexception, woblexception.getMessage());
                    return;

                case 1: // '\001'
                    ((FormattingLogger) (obj)).error(woblexception, woblexception.getMessage());
                    return;

                case 2: // '\002'
                    ((FormattingLogger) (obj)).warn(woblexception, woblexception.getMessage());
                    break;
                }
                return;
            }
        }
    }

    public static transient void report(ReportLevel reportlevel, Class class1, String s, Object aobj[])
        throws WoblException
    {
        try
        {
            report(reportlevel, (WoblException)class1.getConstructor(new Class[] {
                java/lang/String
            }).newInstance(new Object[] {
                String.format(s, aobj)
            }));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportLevel reportlevel)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportLevel reportlevel)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportLevel reportlevel)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportLevel reportlevel)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportLevel reportlevel)
        {
            return;
        }
    }
}
