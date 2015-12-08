// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.analytics:
//            ExceptionParser, aa

public class StandardExceptionParser
    implements ExceptionParser
{

    private final TreeSet xd = new TreeSet();

    public StandardExceptionParser(Context context, Collection collection)
    {
        setIncludedPackages(context, collection);
    }

    protected StackTraceElement getBestStackTraceElement(Throwable throwable)
    {
        throwable = throwable.getStackTrace();
        if (throwable == null || throwable.length == 0)
        {
            return null;
        }
        int j = throwable.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            StackTraceElement stacktraceelement = throwable[i];
            String s = stacktraceelement.getClassName();
            for (Iterator iterator = xd.iterator(); iterator.hasNext();)
            {
                if (s.startsWith((String)iterator.next()))
                {
                    return stacktraceelement;
                }
            }

            i++;
        } while (true);
        return throwable[0];
    }

    protected Throwable getCause(Throwable throwable)
    {
        for (; throwable.getCause() != null; throwable = throwable.getCause()) { }
        return throwable;
    }

    public String getDescription(String s, Throwable throwable)
    {
        return getDescription(getCause(throwable), getBestStackTraceElement(getCause(throwable)), s);
    }

    protected String getDescription(Throwable throwable, StackTraceElement stacktraceelement, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(throwable.getClass().getSimpleName());
        if (stacktraceelement != null)
        {
            String as[] = stacktraceelement.getClassName().split("\\.");
            String s1 = "unknown";
            throwable = s1;
            if (as != null)
            {
                throwable = s1;
                if (as.length > 0)
                {
                    throwable = as[as.length - 1];
                }
            }
            stringbuilder.append(String.format(" (@%s:%s:%s)", new Object[] {
                throwable, stacktraceelement.getMethodName(), Integer.valueOf(stacktraceelement.getLineNumber())
            }));
        }
        if (s != null)
        {
            stringbuilder.append(String.format(" {%s}", new Object[] {
                s
            }));
        }
        return stringbuilder.toString();
    }

    public void setIncludedPackages(Context context, Collection collection)
    {
        HashSet hashset;
        xd.clear();
        hashset = new HashSet();
        if (collection != null)
        {
            hashset.addAll(collection);
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        collection = context.getApplicationContext().getPackageName();
        xd.add(collection);
        context = context.getApplicationContext().getPackageManager().getPackageInfo(collection, 15).activities;
        if (context == null) goto _L2; else goto _L3
_L3:
        int j = context.length;
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(((ActivityInfo) (context[i])).packageName);
        i++;
        if (true) goto _L4; else goto _L2
        context;
        aa.B("No package found");
_L2:
        context = hashset.iterator();
label0:
        do
        {
            if (context.hasNext())
            {
                collection = (String)context.next();
                Iterator iterator = xd.iterator();
                boolean flag = true;
                do
                {
label1:
                    {
                        if (iterator.hasNext())
                        {
                            String s = (String)iterator.next();
                            if (collection.startsWith(s))
                            {
                                break label1;
                            }
                            if (s.startsWith(collection))
                            {
                                xd.remove(s);
                            }
                        }
                        if (flag)
                        {
                            xd.add(collection);
                        }
                        continue label0;
                    }
                    flag = false;
                } while (true);
            }
            return;
        } while (true);
    }
}
