// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.arist.activity:
//            LrcBrowseActivity

final class h
    implements Comparator
{

    final LrcBrowseActivity a;

    h(LrcBrowseActivity lrcbrowseactivity)
    {
        a = lrcbrowseactivity;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        return ((File) (obj)).getName().compareTo(((File) (obj1)).getName());
    }
}
