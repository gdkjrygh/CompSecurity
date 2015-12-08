// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class go
{

    public go()
    {
    }

    public static Intent a(Context context, Map map)
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj = null;
        obj2 = (ActivityManager)context.getSystemService("activity");
        obj3 = (String)map.get("u");
        if (!TextUtils.isEmpty(((CharSequence) (obj3)))) goto _L2; else goto _L1
_L1:
        map = obj;
_L4:
        return map;
_L2:
        Object obj1 = Uri.parse(((String) (obj3)));
        boolean flag = Boolean.parseBoolean((String)map.get("use_first_package"));
        boolean flag1 = Boolean.parseBoolean((String)map.get("use_running_process"));
        Intent intent;
        if ("http".equalsIgnoreCase(((Uri) (obj1)).getScheme()))
        {
            map = ((Uri) (obj1)).buildUpon().scheme("https").build();
        } else
        if ("https".equalsIgnoreCase(((Uri) (obj1)).getScheme()))
        {
            map = ((Uri) (obj1)).buildUpon().scheme("http").build();
        } else
        {
            map = null;
        }
        obj3 = new ArrayList();
        intent = a(((Uri) (obj1)));
        map = a(((Uri) (map)));
        obj1 = a(context, intent, ((ArrayList) (obj3)));
        if (obj1 != null)
        {
            return a(intent, ((ResolveInfo) (obj1)));
        }
        if (map == null)
        {
            break; /* Loop/switch isn't completed */
        }
        map = a(context, ((Intent) (map)));
        if (map == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = a(intent, ((ResolveInfo) (map)));
        map = ((Map) (obj1));
        if (a(context, ((Intent) (obj1))) != null) goto _L4; else goto _L3
_L3:
        if (((ArrayList) (obj3)).size() == 0)
        {
            return intent;
        }
        if (!flag1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        context = ((ActivityManager) (obj2)).getRunningAppProcesses();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        map = ((ArrayList) (obj3)).iterator();
_L6:
        if (!map.hasNext())
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj1 = (ResolveInfo)map.next();
        obj2 = context.iterator();
_L8:
        if (!((Iterator) (obj2)).hasNext()) goto _L6; else goto _L5
_L5:
        if (!((android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj2)).next()).processName.equals(((ResolveInfo) (obj1)).activityInfo.packageName)) goto _L8; else goto _L7
_L7:
        return a(intent, ((ResolveInfo) (obj1)));
        if (flag)
        {
            return a(intent, (ResolveInfo)((ArrayList) (obj3)).get(0));
        } else
        {
            return intent;
        }
    }

    private static Intent a(Intent intent, ResolveInfo resolveinfo)
    {
        intent = new Intent(intent);
        intent.setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
        return intent;
    }

    private static Intent a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(0x10000000);
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
            return intent;
        }
    }

    private static ResolveInfo a(Context context, Intent intent)
    {
        return a(context, intent, new ArrayList());
    }

    private static ResolveInfo a(Context context, Intent intent, ArrayList arraylist)
    {
        List list;
        int i;
        context = context.getPackageManager();
        if (context == null)
        {
            return null;
        }
        list = context.queryIntentActivities(intent, 0x10000);
        context = context.resolveActivity(intent, 0x10000);
        if (list == null || context == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        i = 0;
_L3:
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        intent = (ResolveInfo)list.get(i);
        if (context == null || !((ResolveInfo) (context)).activityInfo.name.equals(((ResolveInfo) (intent)).activityInfo.name)) goto _L2; else goto _L1
_L1:
        arraylist.addAll(list);
        return context;
_L2:
        i++;
          goto _L3
        context = null;
          goto _L1
    }
}
