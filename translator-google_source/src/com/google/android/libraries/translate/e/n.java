// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.content.Context;
import android.content.res.Resources;

public final class n
{

    public static String a(Context context, int i, String s, String s1)
    {
        Resources resources = context.getResources();
        String s2 = String.valueOf(resources.getResourceName(i));
        s2 = (new StringBuilder(String.valueOf(s2).length() + 1)).append(s2).append("_").toString();
        String s3 = s.replace('-', '_');
        s = String.valueOf(s2);
        String s4 = String.valueOf(s3);
        int j;
        int k;
        if (s4.length() != 0)
        {
            s = s.concat(s4);
        } else
        {
            s = new String(s);
        }
        k = resources.getIdentifier(s, null, null);
        j = k;
        if (k == 0)
        {
            j = k;
            if (s3.length() > 3)
            {
                s = String.valueOf(s2);
                s2 = String.valueOf(s3.substring(0, 2));
                if (s2.length() != 0)
                {
                    s = s.concat(s2);
                } else
                {
                    s = new String(s);
                }
                j = resources.getIdentifier(s, null, null);
            }
        }
        if (j == 0 && s1 != null)
        {
            return s1;
        }
        if (j != 0)
        {
            i = j;
        }
        return context.getString(i);
    }

    public static transient String a(Context context, int i, int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder(context.getString(i));
        for (i = 0; i <= 0; i++)
        {
            int j = ai[0];
            stringbuilder.append("\n\n");
            stringbuilder.append(context.getString(j));
        }

        return stringbuilder.toString();
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return s.trim();
        }
    }
}
