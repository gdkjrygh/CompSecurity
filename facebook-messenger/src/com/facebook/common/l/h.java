// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class h
{

    private final Context a;

    public h(Context context)
    {
        a = context;
    }

    public String a(String s)
    {
        return a(s, a.getPackageName());
    }

    public String a(String s, String s1)
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
            Log.e(com/facebook/common/l/h.getName(), "Error reading <meta-data> from AndroidManifest.xml.", s);
            return null;
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
