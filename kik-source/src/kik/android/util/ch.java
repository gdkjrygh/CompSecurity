// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package kik.android.util:
//            ce

final class ch
    implements FilenameFilter
{

    final ce a;

    ch(ce ce)
    {
        a = ce;
        super();
    }

    public final boolean accept(File file, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (s.startsWith("KikPreferences"))
            {
                flag = flag1;
                if (!s.equals("KikPreferences.xml"))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
