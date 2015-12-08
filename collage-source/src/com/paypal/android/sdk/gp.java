// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class gp
{

    private Context a;

    public gp(Context context)
    {
        a = context;
    }

    public final void a(Collection collection)
    {
        ActivityInfo aactivityinfo[];
        int i;
        int j;
        try
        {
            collection = new HashSet(collection);
            aactivityinfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 1).activities;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            throw new RuntimeException((new StringBuilder("Exception loading manifest")).append(collection.getMessage()).toString());
        }
        if (aactivityinfo == null) goto _L2; else goto _L1
_L1:
        j = aactivityinfo.length;
        i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        collection.remove(aactivityinfo[i].name);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        if (!collection.isEmpty())
        {
            throw new RuntimeException((new StringBuilder("Missing required activities in manifest:")).append(collection).toString());
        }
    }
}
