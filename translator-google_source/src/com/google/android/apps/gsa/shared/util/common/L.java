// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.common;

import android.util.Log;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class L
{

    private static transient String a(String s, Object aobj[])
    {
        String s1;
        if (s == null)
        {
            s1 = "null";
        } else
        {
            s1 = s;
            if (aobj != null)
            {
                s1 = s;
                if (aobj.length != 0)
                {
                    for (int i = 0; i < aobj.length; i++)
                    {
                        if (aobj[i] != null && aobj[i].getClass().isArray())
                        {
                            String s2 = Arrays.deepToString(new Object[] {
                                aobj[i]
                            });
                            aobj[i] = s2.substring(1, s2.length() - 1);
                        }
                    }

                    String s3;
                    try
                    {
                        s3 = String.format(Locale.US, s, aobj);
                    }
                    catch (IllegalFormatException illegalformatexception)
                    {
                        s = String.valueOf(s);
                        aobj = String.valueOf(Arrays.toString(aobj));
                        if (((String) (aobj)).length() != 0)
                        {
                            return s.concat(((String) (aobj)));
                        } else
                        {
                            return new String(s);
                        }
                    }
                    return s3;
                }
            }
        }
        return s1;
    }

    public static transient void a(int i, String s, String s1, Object aobj[])
    {
        String s2 = s;
        if (s.length() > 23)
        {
            s2 = s.substring(0, 23);
            a(5, s2, "Tag [%s] is too long; truncated to [%s]", new Object[] {
                s, s2
            });
        }
        if (!Log.isLoggable(s2, i))
        {
            return;
        } else
        {
            a(s1, aobj);
            return;
        }
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        a(6, s, s1, aobj);
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        a(6, s, s1, aobj);
    }
}
