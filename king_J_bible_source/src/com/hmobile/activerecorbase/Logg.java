// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;

import android.util.Log;

public class Logg
{

    static int _startIdentLevel = -1;
    private static boolean _useIdents = false;
    static String idents[] = {
        "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", 
        "          ", "           ", "            ", "             ", "              ", "               "
    };

    public Logg()
    {
    }

    public static transient int d(String s, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return println(3, s, s2.replaceAll("%t", Long.toString(t())), aobj);
    }

    public static transient int d(String s, Throwable throwable, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.d(s, String.format(s2.replaceAll("%t", Long.toString(t())), aobj), throwable);
    }

    public static transient int e(String s, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.e(s, String.format(s2.replaceAll("%t", Long.toString(t())), aobj));
    }

    public static transient int e(String s, Throwable throwable, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.e(s, String.format(s2.replaceAll("%t", Long.toString(t())), aobj), throwable);
    }

    private static String getIdent()
    {
        if (_useIdents)
        {
            int j = Thread.currentThread().getStackTrace().length;
            j = Math.min(idents.length - 1, Math.max(0, j - 1 - _startIdentLevel));
            return idents[j];
        } else
        {
            return "";
        }
    }

    public static String getStackTraceString(Throwable throwable)
    {
        return Log.getStackTraceString(throwable);
    }

    public static transient int i(String s, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.i(s, String.format(s2.replaceAll("%t", Long.toString(t())), aobj));
    }

    public static transient int i(String s, Throwable throwable, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.i(s, String.format(s2.replaceAll("%t", Long.toString(t())), aobj), throwable);
    }

    public static void indents(boolean flag)
    {
        _useIdents = flag;
        _startIdentLevel = Math.max(Thread.currentThread().getStackTrace().length - 1, 0);
    }

    public static boolean isLoggable(String s, int j)
    {
        return Log.isLoggable(s, j);
    }

    public static transient int println(int j, String s, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.println(j, s, String.format(s2, aobj));
    }

    static long t()
    {
        return Thread.currentThread().getId();
    }

    public static transient int v(String s, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return println(2, s, s2.replaceAll("%t", Long.toString(t())), aobj);
    }

    public static transient int w(String s, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.w(s, String.format(s2.replaceAll("%t", Long.toString(t())), aobj));
    }

    public static transient int w(String s, Throwable throwable, String s1, Object aobj[])
    {
        String s2 = s1;
        if (_useIdents)
        {
            s2 = (new StringBuilder(String.valueOf(getIdent()))).append(s1).toString();
        }
        return Log.w(s, String.format(s2.replaceAll("%t", Long.toString(t())), aobj), throwable);
    }

}
