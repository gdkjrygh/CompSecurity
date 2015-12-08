// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.h;
import com.appboy.ui.a.b;
import com.appboy.ui.activities.AppboyFeedActivity;

public class m
    implements h
{

    private static final String a;

    public m()
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
            com.appboy.f.a.a(a, "The AppboyFeedActivity is not registered in the manifest. Ignoring request to display the news feed.");
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/m.getName()
        });
    }
}
