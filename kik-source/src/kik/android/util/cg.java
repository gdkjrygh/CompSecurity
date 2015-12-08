// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package kik.android.util:
//            ce

final class cg
    implements FilenameFilter
{

    final ce a;

    cg(ce ce1)
    {
        a = ce1;
        super();
    }

    public final boolean accept(File file, String s)
    {
        if (s != null && !s.startsWith(ce.a(a)))
        {
            if (s.startsWith("KikPreferences"))
            {
                return s.equals("KikPreferences.xml");
            }
            if (!s.contains("KikUltraPersistence") && !s.contains("crashlytics") && !s.contains("fabric") && !s.contains("mixpanel"))
            {
                return true;
            }
        }
        return false;
    }
}
