// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android:
//            bc

final class i
    implements FilenameFilter
{

    private String a;

    i(bc bc, String s)
    {
        a = s;
        super();
    }

    public final boolean accept(File file, String s)
    {
        return s.startsWith(a);
    }
}
