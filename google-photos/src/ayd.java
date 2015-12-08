// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ayd
{

    private final Context a;

    public ayd(Context context)
    {
        a = context;
    }

    private static ayc a(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", s);
        }
        s = ((String) (((Class) (obj)).newInstance()));
        if (!(s instanceof ayc))
        {
            s = String.valueOf(s);
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 44)).append("Expected instanceof GlideModule, but found: ").append(s).toString());
        } else
        {
            return (ayc)s;
        }
        s;
_L2:
        obj = String.valueOf(obj);
        throw new RuntimeException((new StringBuilder(String.valueOf(obj).length() + 53)).append("Unable to instantiate GlideModule implementation for ").append(((String) (obj))).toString(), s);
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final List a()
    {
        Object obj = new ArrayList();
        try
        {
            ApplicationInfo applicationinfo = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128);
            if (applicationinfo.metaData != null)
            {
                Iterator iterator = applicationinfo.metaData.keySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator.next();
                    if ("GlideModule".equals(applicationinfo.metaData.get(s)))
                    {
                        ((List) (obj)).add(a(s));
                    }
                } while (true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", ((Throwable) (obj)));
        }
        return ((List) (obj));
    }
}
