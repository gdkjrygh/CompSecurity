// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Comparator;

final class val.pm
    implements Comparator
{

    final PackageManager val$pm;

    public final int compare(ResolveInfo resolveinfo, ResolveInfo resolveinfo1)
    {
        return ((String)val$pm.getApplicationLabel(resolveinfo.activityInfo.applicationInfo)).compareTo((String)val$pm.getApplicationLabel(resolveinfo1.activityInfo.applicationInfo));
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((ResolveInfo)obj, (ResolveInfo)obj1);
    }

    ()
    {
        val$pm = packagemanager;
        super();
    }
}
