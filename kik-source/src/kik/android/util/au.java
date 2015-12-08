// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

public final class au
{

    public static boolean a(Intent intent, Context context)
    {
        context = context.getPackageManager().queryIntentActivities(intent, 64);
        if (context == null || context.size() <= 0)
        {
            return false;
        }
        if (intent.getData() == null)
        {
            return true;
        }
        intent = intent.getData().getScheme();
        if (intent == null || !intent.startsWith("http"))
        {
            return true;
        }
        for (intent = context.iterator(); intent.hasNext();)
        {
            context = ((ResolveInfo)intent.next()).filter;
            if (context != null)
            {
                int i = context.countDataAuthorities();
                int j = context.countDataPaths();
                if (context.countDataTypes() + (i + j) > 0)
                {
                    return true;
                }
            }
        }

        return false;
    }
}
