// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;
import java.util.List;

public class t
{

    private final PackageManager a;
    private final ApplicationInfo b;

    public t(PackageManager packagemanager, ApplicationInfo applicationinfo)
    {
        a = packagemanager;
        b = applicationinfo;
    }

    public List a(Intent intent)
    {
        int i = b.uid;
        Object obj = a.queryIntentActivities(intent, 64);
        intent = es.e();
        obj = ((Iterable) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ActivityInfo activityinfo = ((ResolveInfo)((Iterator) (obj)).next()).activityInfo;
            int j = activityinfo.applicationInfo.uid;
            if (i == j || a.checkSignatures(i, j) == 0)
            {
                intent.b(activityinfo);
            }
        } while (true);
        return intent.b();
    }
}
