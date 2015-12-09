// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;

public final class ggg
{

    private final Context a;

    public ggg(Context context)
    {
        a = context;
    }

    public final ComponentName a(Intent intent)
    {
        Intent intent1;
label0:
        {
            intent1 = null;
            Object obj = a.getPackageManager();
            if (obj == null)
            {
                return null;
            }
            obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0).iterator();
            intent = intent1;
            while (((Iterator) (obj)).hasNext()) 
            {
                ActivityInfo activityinfo = ((ResolveInfo)((Iterator) (obj)).next()).activityInfo;
                if (activityinfo != null && "com.twitter.android".equals(activityinfo.packageName))
                {
                    intent = new ComponentName(activityinfo.packageName, activityinfo.name);
                    intent1 = intent;
                    if ("com.twitter.android.composer.TextFirstComposerActivity".equals(activityinfo.name))
                    {
                        break label0;
                    }
                }
            }
            intent1 = intent;
        }
        return intent1;
    }
}
