// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package crittercism.android:
//            v

public static final class a
    implements FilenameFilter
{

    private String a;

    public final boolean accept(File file, String s)
    {
        return s.endsWith(a);
    }

    public (String s)
    {
        a = new String();
        if (s != null)
        {
            a = s;
        }
    }
}
