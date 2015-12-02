// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.manifest;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;

public class ManifestReader
{

    private final Context a;

    public ManifestReader(Context context)
    {
        a = context;
    }

    private static void a(Exception exception)
    {
        Log.e(com/facebook/common/manifest/ManifestReader.getName(), "Error reading <meta-data> from AndroidManifest.xml.", exception);
    }

    public final String a(String s)
    {
        return a(s, a.getPackageName());
    }

    public final String a(String s, String s1)
    {
        Object obj = null;
        ApplicationInfo applicationinfo;
        try
        {
            applicationinfo = a.getPackageManager().getApplicationInfo(s1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(((Exception) (s)));
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s.getCause() instanceof DeadObjectException)
            {
                a(((Exception) (s)));
                return null;
            } else
            {
                throw s;
            }
        }
        s1 = obj;
        if (applicationinfo != null)
        {
            s1 = obj;
            if (applicationinfo.metaData != null)
            {
                s = ((String) (applicationinfo.metaData.get(s)));
                s1 = obj;
                if (s != null)
                {
                    s1 = s.toString();
                }
            }
        }
        return s1;
    }
}
