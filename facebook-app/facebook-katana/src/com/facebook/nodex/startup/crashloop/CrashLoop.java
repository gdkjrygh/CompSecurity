// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.crashloop;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CrashLoop
{

    public static final String a = com/facebook/nodex/startup/crashloop/CrashLoop.getSimpleName();
    private final Context b;
    private final PackageManager c;
    private final ComponentName d;
    private final ComponentName e;

    public CrashLoop(Context context)
    {
        b = context;
        c = context.getPackageManager();
        d = new ComponentName(b, com/facebook/nodex/startup/crashloop/CrashLoop$TransactionInProgress);
        e = new ComponentName(b, com/facebook/nodex/startup/crashloop/CrashLoop$LastState);
    }

    private PackageInfo a(int j)
    {
        return c.getPackageInfo(b.getPackageName(), j);
    }

    private List a(ComponentInfo acomponentinfo[])
    {
        LinkedList linkedlist = new LinkedList();
        if (acomponentinfo == null)
        {
            return linkedlist;
        }
        String s = (new StringBuilder()).append(b.getPackageName()).append(":nodex").toString();
        int k = acomponentinfo.length;
        int j = 0;
        while (j < k) 
        {
            ComponentInfo componentinfo = acomponentinfo[j];
            boolean flag;
            if (componentinfo.metaData != null)
            {
                flag = componentinfo.metaData.getBoolean("crash.loop.exclude", false);
            } else
            {
                flag = false;
            }
            if (s.equals(componentinfo.processName))
            {
                flag = true;
            }
            if (!flag)
            {
                linkedlist.add(componentinfo);
            }
            j++;
        }
        return linkedlist;
    }

    private void a(int j, boolean flag)
    {
        c.setComponentEnabledSetting(d, 1, 1);
        ComponentName componentname;
        for (Iterator iterator = e().iterator(); iterator.hasNext(); c.setComponentEnabledSetting(componentname, j, 1))
        {
            componentname = (ComponentName)iterator.next();
            Log.e(a, (new StringBuilder("Changing state for ")).append(componentname.getClassName()).toString());
        }

        c.setComponentEnabledSetting(e, j, 1);
        if (flag)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        c.setComponentEnabledSetting(d, 2, j);
    }

    private List e()
    {
        Object obj = new ArrayList();
        ((List) (obj)).addAll(f());
        ((List) (obj)).addAll(g());
        ((List) (obj)).addAll(h());
        ((List) (obj)).addAll(i());
        Collections.sort(((List) (obj)), new ComponentInfoComparator((byte)0));
        ArrayList arraylist = new ArrayList();
        ComponentInfo componentinfo;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new ComponentName(componentinfo.packageName, componentinfo.name)))
        {
            componentinfo = (ComponentInfo)((Iterator) (obj)).next();
        }

        return arraylist;
    }

    private List f()
    {
        return a(a(642).receivers);
    }

    private List g()
    {
        return a(a(641).activities);
    }

    private List h()
    {
        return a(a(648).providers);
    }

    private List i()
    {
        return a(a(644).services);
    }

    public final void a()
    {
        try
        {
            a(2, true);
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException(namenotfoundexception);
        }
    }

    public final void b()
    {
        try
        {
            a(0, false);
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException(namenotfoundexception);
        }
    }

    public final boolean c()
    {
        return c.getComponentEnabledSetting(e) == 2;
    }

    public final boolean d()
    {
        int j = c.getComponentEnabledSetting(d);
        return j == 0 || j == 2;
    }


    private class ComponentInfoComparator
        implements Comparator
    {

        private static int a(ComponentInfo componentinfo, ComponentInfo componentinfo1)
        {
            return componentinfo.name.compareTo(componentinfo1.name);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((ComponentInfo)obj, (ComponentInfo)obj1);
        }

        private ComponentInfoComparator()
        {
        }

        ComponentInfoComparator(byte byte0)
        {
            this();
        }
    }

}
