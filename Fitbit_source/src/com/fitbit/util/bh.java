// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.fitbit.util:
//            d, al

public class bh
{

    public static final String a = "";

    public bh()
    {
    }

    public static Spannable a(String s, int i, int j, int k, int l)
    {
        if (s.length() < k || s.length() == 0)
        {
            return new SpannableString(s);
        } else
        {
            SpannableString spannablestring = new SpannableString(s);
            spannablestring.setSpan(new StyleSpan(j), 0, k, 17);
            spannablestring.setSpan(new ForegroundColorSpan(i), k, l, 17);
            spannablestring.setSpan(new ForegroundColorSpan(0), l, s.length(), 17);
            return spannablestring;
        }
    }

    public static String a(Context context, int i)
    {
        return context.getResources().getString(i).toUpperCase();
    }

    public static transient String a(Context context, int i, String as[])
    {
        if (context == null)
        {
            return null;
        } else
        {
            return String.format(context.getString(i), (Object[])as);
        }
    }

    public static String a(String s)
    {
        String s1 = s;
        if (s.length() > 0)
        {
            s1 = (new StringBuilder()).append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).toString();
        }
        return s1;
    }

    public static String a(String s, int i)
    {
        if (i < 0 || i >= s.length())
        {
            return s;
        } else
        {
            StringBuffer stringbuffer = new StringBuffer(s.length() - 1);
            stringbuffer.append(s.substring(0, i)).append(s.substring(i + 1));
            return stringbuffer.toString();
        }
    }

    public static String a(Collection collection, String s)
    {
        Iterator iterator = collection.iterator();
        collection = "";
        while (iterator.hasNext()) 
        {
            String s1 = (String)iterator.next();
            StringBuilder stringbuilder = (new StringBuilder()).append(collection);
            if (collection.length() == 0)
            {
                collection = s1;
            } else
            {
                collection = (new StringBuilder()).append(s).append(s1).toString();
            }
            collection = stringbuilder.append(collection).toString();
        }
        return collection;
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static boolean a(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            return false;
        } else
        {
            return s.equals(s1);
        }
    }

    public static boolean a(String s, String s1, boolean flag)
    {
        if (s == s1)
        {
            return true;
        }
        if (s != null)
        {
            if (flag)
            {
                return s.equalsIgnoreCase(s1);
            } else
            {
                return s.equals(s1);
            }
        }
        if (flag)
        {
            return s1.equalsIgnoreCase(s);
        } else
        {
            return s1.equals(s);
        }
    }

    public static byte[] a(String s, String s1, d.a a1)
    {
        byte abyte0[] = s.getBytes();
        s = s1.getBytes();
        abyte0 = com.fitbit.util.d.a(abyte0, s.length);
        s1 = new byte[s1.length()];
        for (int i = 0; i < s.length; i++)
        {
            s1[i] = a1.a(abyte0[i], s[i]);
        }

        return s1;
    }

    public static String b(Context context, int i)
    {
        return a(context.getResources().getString(i).toLowerCase());
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c1 = s.charAt(i);
            stringbuilder.append((new StringBuilder()).append(c1).append("\n").toString());
        }

        return stringbuilder.toString();
    }

    public static boolean b(String s, String s1)
    {
        return a(s, s1, false);
    }

    public static int c(String s)
    {
        if (s != null)
        {
            return s.length() * 2;
        } else
        {
            return 0;
        }
    }

    public static boolean c(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            java.util.Locale locale = al.a();
            return s.toLowerCase(al.a()).startsWith(s1.toLowerCase(locale));
        }
    }

    public static String d(String s)
    {
        return s.replaceAll("^\\s+", "");
    }

    public static String e(String s)
    {
        return s.replaceAll("\\s+$", "");
    }

    public static String f(String s)
    {
        if (s == null)
        {
            return "";
        }
        if (s.length() == 0)
        {
            return "";
        } else
        {
            return s.replaceAll("\\p{So}+", "");
        }
    }
}
