// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzie
{

    private static int zza(StackTraceElement astacktraceelement[], StackTraceElement astacktraceelement1[])
    {
        int i = 0;
        int j = astacktraceelement1.length;
        int k = astacktraceelement.length;
        do
        {
            k--;
            if (k < 0)
            {
                break;
            }
            j--;
            if (j < 0 || !astacktraceelement1[j].equals(astacktraceelement[k]))
            {
                break;
            }
            i++;
        } while (true);
        return i;
    }

    public static String zznn()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Throwable throwable = new Throwable();
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        stringbuilder.append("Async stack trace:");
        int k = astacktraceelement.length;
        for (int i = 0; i < k; i++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i];
            stringbuilder.append("\n\tat ").append(stacktraceelement);
        }

        for (throwable = throwable.getCause(); throwable != null;)
        {
            stringbuilder.append("\nCaused by: ");
            stringbuilder.append(throwable);
            StackTraceElement astacktraceelement1[] = throwable.getStackTrace();
            int l = zza(astacktraceelement1, astacktraceelement);
            for (int j = 0; j < astacktraceelement1.length - l; j++)
            {
                stringbuilder.append((new StringBuilder()).append("\n\tat ").append(astacktraceelement1[j]).toString());
            }

            if (l > 0)
            {
                stringbuilder.append((new StringBuilder()).append("\n\t... ").append(l).append(" more").toString());
            }
            throwable = throwable.getCause();
            astacktraceelement = astacktraceelement1;
        }

        return stringbuilder.toString();
    }
}
