// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.c;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook.common.c:
//            f, h

public class g
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd-HHmmss");

    public g()
    {
    }

    public static f a(File file)
    {
        String as[];
        as = file.getName().split("-", 3);
        if (as.length != 3)
        {
            return null;
        }
        String s;
        if ("UNKNOWN".equals(as[1]))
        {
            s = null;
        } else
        {
            s = as[1];
        }
        try
        {
            return new f(file, a.parse(as[2]), s);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
    }

    public static File a(File file, String s, String s1, Date date)
    {
        if (s1 == null)
        {
            s1 = "UNKNOWN";
        }
        date = a(date);
        return new File(file, (new StringBuilder()).append(s).append("-").append(s1).append("-").append(date).toString());
    }

    public static String a(Date date)
    {
        return a.format(date);
    }

    public static void a(List list)
    {
        Collections.sort(list, new h());
    }

}
