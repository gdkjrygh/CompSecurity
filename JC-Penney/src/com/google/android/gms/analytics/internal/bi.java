// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import java.io.File;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            i

public class bi
{

    public static int a()
    {
        int j;
        try
        {
            j = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException numberformatexception)
        {
            i.a("Invalid version number", android.os.Build.VERSION.SDK);
            return 0;
        }
        return j;
    }

    public static boolean a(String s)
    {
        if (a() < 9)
        {
            return false;
        } else
        {
            s = new File(s);
            s.setReadable(false, false);
            s.setWritable(false, false);
            s.setReadable(true, true);
            s.setWritable(true, true);
            return true;
        }
    }
}
