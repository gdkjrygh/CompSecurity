// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsUncaughtExceptionHandler

final class 
    implements Comparator
{

    public int a(File file, File file1)
    {
        return file1.getName().compareTo(file.getName());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }

    ()
    {
    }
}
