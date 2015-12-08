// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.appboy.d;
import com.appboy.g;
import com.appboy.ui.a.b;
import com.appboy.ui.activities.AppboyFeedActivity;

public class k
    implements g
{

    private static final String a;

    public k()
    {
    }

    public final void a(Context context)
    {
        ComponentName componentname = new ComponentName(context, com/appboy/ui/activities/AppboyFeedActivity);
        try
        {
            context.getPackageManager().getActivityInfo(componentname, 1);
            (new b(new Intent(context, com/appboy/ui/activities/AppboyFeedActivity))).a(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/k.getName()
        });
    }
}
