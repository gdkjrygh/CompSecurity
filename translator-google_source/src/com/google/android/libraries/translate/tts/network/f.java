// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{

    static final Pattern a = Pattern.compile("([\\?\\.\\,\\;\\:\\!][ ]+)|([\\u3001\\u3002\\uFF01\\uFF08\\uFF09\\uFF0C\\uFF0E\\uFF1A\\uFF1B\\uFF1F][ ]?)");
    private static final Pattern c = Pattern.compile(" ");
    final List b = new ArrayList();

    public f()
    {
    }

    private static boolean a(int i)
    {
        return i <= 100;
    }

    final void a(String s, Pattern pattern, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        pattern = pattern.matcher(s);
        int i;
        int k;
        for (i = 0; pattern.find(); i = k)
        {
            k = pattern.end();
            if (k > i)
            {
                arraylist.add(s.substring(i, k));
            }
        }

        if (s.length() > i)
        {
            arraylist.add(s.substring(i));
        }
        Iterator iterator = arraylist.iterator();
        s = "";
        while (iterator.hasNext()) 
        {
            String s1 = (String)iterator.next();
            pattern = String.valueOf(s);
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                pattern = pattern.concat(s2);
            } else
            {
                pattern = new String(pattern);
            }
            if (a(pattern.trim().length()))
            {
                s = String.valueOf(s);
                pattern = String.valueOf(s1);
                if (pattern.length() != 0)
                {
                    s = s.concat(pattern);
                } else
                {
                    s = new String(s);
                }
            } else
            {
                if (!TextUtils.isEmpty(s))
                {
                    b.add(s.trim());
                    s = "";
                }
                pattern = s1.trim();
                if (a(pattern.length()))
                {
                    s = s1;
                } else
                if (flag)
                {
                    int l = pattern.length();
                    int j = 0;
                    while (j < l) 
                    {
                        int i1 = Math.min(l, j + 100);
                        b.add(pattern.substring(j, i1));
                        j += 100;
                    }
                } else
                {
                    a(((String) (pattern)), c, true);
                }
            }
        }
        if (!TextUtils.isEmpty(s))
        {
            b.add(s);
        }
    }

}
