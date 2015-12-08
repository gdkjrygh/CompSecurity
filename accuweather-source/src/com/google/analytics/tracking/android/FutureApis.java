// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.io.File;

// Referenced classes of package com.google.analytics.tracking.android:
//            Log

class FutureApis
{

    private FutureApis()
    {
    }

    static boolean setOwnerOnlyReadWrite(String s)
    {
        if (version() < 9)
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

    public static int version()
    {
        int i;
        try
        {
            i = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.e((new StringBuilder()).append("Invalid version number: ").append(android.os.Build.VERSION.SDK).toString());
            return 0;
        }
        return i;
    }
}
