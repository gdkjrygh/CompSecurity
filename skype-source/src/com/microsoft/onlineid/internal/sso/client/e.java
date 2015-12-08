// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.sso.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class e
{

    public static final Comparator a = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (com.microsoft.onlineid.internal.sso.e)obj;
            obj1 = (com.microsoft.onlineid.internal.sso.e)obj1;
            int i;
            if (((com.microsoft.onlineid.internal.sso.e) (obj)).a().equals("com.microsoft.msa.authenticator"))
            {
                i = -1;
            } else
            {
                if (((com.microsoft.onlineid.internal.sso.e) (obj1)).a().equals("com.microsoft.msa.authenticator"))
                {
                    return 1;
                }
                int j = ((com.microsoft.onlineid.internal.sso.e) (obj1)).b() - ((com.microsoft.onlineid.internal.sso.e) (obj)).b();
                i = j;
                if (j == 0)
                {
                    return (int)(((com.microsoft.onlineid.internal.sso.e) (obj)).c() - ((com.microsoft.onlineid.internal.sso.e) (obj1)).c());
                }
            }
            return i;
        }

    };
    private final Context b;
    private final d c;

    public e(Context context)
    {
        b = context;
        c = new d(context);
    }

    private List c()
    {
        Object obj = new Intent("com.microsoft.msa.action.SSO_SERVICE");
        Object obj1 = b.getPackageManager().queryIntentServices(((Intent) (obj)), 128);
        obj = new ArrayList();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Object obj2 = (ResolveInfo)((Iterator) (obj1)).next();
            String s = ((ResolveInfo) (obj2)).serviceInfo.applicationInfo.packageName;
            obj2 = ((ResolveInfo) (obj2)).serviceInfo.metaData;
            int i = ((Bundle) (obj2)).getInt("com.microsoft.msa.service.sso_version");
            if (!c.a(s))
            {
                com.microsoft.onlineid.internal.c.d.b((new StringBuilder("Disallowing SSO with ")).append(s).append(" because it is not trusted.").toString());
            } else
            if (i <= 1)
            {
                com.microsoft.onlineid.internal.c.d.b((new StringBuilder("Disallowing  SSO with ")).append(s).append(" because its SSO version is ").append(i).append(".").toString());
            } else
            {
                try
                {
                    ((List) (obj)).add(new com.microsoft.onlineid.internal.sso.e(s, i, ((Bundle) (obj2)).getString("com.microsoft.msa.service.sdk_version"), b.getPackageManager().getPackageInfo(s, 0).firstInstallTime));
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Could not find package when querying for first install time: ")).append(s).toString(), namenotfoundexception);
                }
            }
        }

        com.microsoft.onlineid.a.a.a().a("SDK", "Total trusted SSO services", String.valueOf(((List) (obj)).size()));
        return ((List) (obj));
    }

    public final com.microsoft.onlineid.internal.sso.e a(String s)
    {
label0:
        {
            if (s == null)
            {
                break label0;
            }
            Iterator iterator = a().iterator();
            com.microsoft.onlineid.internal.sso.e e1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                e1 = (com.microsoft.onlineid.internal.sso.e)iterator.next();
            } while (!e1.a().equalsIgnoreCase(s));
            return e1;
        }
        return null;
    }

    public final List a()
    {
        List list = c();
        Collections.sort(list, a);
        com.microsoft.onlineid.internal.c.d.a((new StringBuilder("Available trusted/ordered SSO services: ")).append(Arrays.toString(list.toArray())).toString());
        return list;
    }

    protected final com.microsoft.onlineid.internal.sso.e b()
    {
        return new com.microsoft.onlineid.internal.sso.e(b.getPackageName(), 0, "", 0L);
    }

}
