// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.utils;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class MarketContext extends ContextWrapper
{

    public MarketContext(Context context)
    {
        super(context);
    }

    private ResolveInfo a(List list)
    {
        if (list == null)
        {
            return null;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            ResolveInfo resolveinfo = (ResolveInfo)list.next();
            if (resolveinfo != null && resolveinfo.isDefault)
            {
                return resolveinfo;
            }
        }

        return null;
    }

    private List a(Intent intent)
    {
        PackageManager packagemanager = getPackageManager();
        if (packagemanager != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((intent = packagemanager.queryIntentActivities(intent, 0)) == null) goto _L1; else goto _L3
_L3:
        return intent;
        intent;
        intent = null;
        if (true) goto _L3; else goto _L4
_L4:
    }

    private void a(Intent intent, String s)
    {
        List list = a(intent);
        if (list != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        Object obj = a(list);
        if (obj != null)
        {
            intent.setClassName(((ResolveInfo) (obj)).activityInfo.packageName, ((ResolveInfo) (obj)).activityInfo.name);
            return;
        }
        obj = list.iterator();
        ResolveInfo resolveinfo;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
        } while (resolveinfo.activityInfo == null || !resolveinfo.activityInfo.packageName.equalsIgnoreCase(s));
        intent.setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
        flag = true;
_L4:
        if (!flag)
        {
            s = (ResolveInfo)list.get(0);
            intent.setClassName(((ResolveInfo) (s)).activityInfo.packageName, ((ResolveInfo) (s)).activityInfo.name);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public Context getApplicationContext()
    {
        return this;
    }

    public void registerComponentCallbacks(ComponentCallbacks componentcallbacks)
    {
        PicksMob.getInstance().getContext().registerComponentCallbacks(componentcallbacks);
    }

    public void startActivity(Intent intent)
    {
        Intent intent1;
        Object obj;
        if (intent == null)
        {
            super.startActivity(intent);
            return;
        }
        obj = intent.getData();
        intent.addFlags(0x10000000);
        intent.addFlags(0x10000);
        intent1 = new Intent(intent);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (((Uri) (obj)).toString() != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        throw new Exception("null uri");
        obj = ((Uri) (obj)).toString().toLowerCase(Locale.getDefault());
        if (!intent.getAction().equals("android.intent.action.VIEW"))
        {
            throw new Exception("not view action");
        }
        if (!((String) (obj)).startsWith("http://") && !((String) (obj)).startsWith("https://")) goto _L2; else goto _L1
_L1:
        if (!((String) (obj)).startsWith("https://play.google.com/store/apps/details") && !((String) (obj)).startsWith("http://play.google.com/store/apps/details")) goto _L4; else goto _L3
_L3:
        a(intent, "com.android.vending");
_L5:
        super.startActivity(intent);
        return;
_L4:
        try
        {
            a(intent, "com.android.browser");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            super.startActivity(intent1);
            return;
        }
          goto _L5
_L2:
        if (!((String) (obj)).startsWith("market://")) goto _L5; else goto _L6
_L6:
        a(intent, "com.android.vending");
          goto _L5
    }

    public void unregisterComponentCallbacks(ComponentCallbacks componentcallbacks)
    {
        PicksMob.getInstance().getContext().unregisterComponentCallbacks(componentcallbacks);
    }
}
