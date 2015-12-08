// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.gcoreclient.cast.remotedisplay.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.view.Display;
import jva;
import lym;

public class CastRemoteDisplayLocalServiceDelegator extends jva
{

    public lym a;

    public CastRemoteDisplayLocalServiceDelegator()
    {
    }

    private static lym a(String s)
    {
        lym lym1;
        try
        {
            lym1 = (lym)Class.forName(s).newInstance();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            String s1 = String.valueOf("Implementation of GcoreCastRemoteDisplayLocalService does not exist at ");
            String s4 = String.valueOf(classnotfoundexception);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 27 + String.valueOf(s).length() + String.valueOf(s4).length())).append(s1).append(s).append(". Original error message: \n").append(s4).toString());
        }
        catch (InstantiationException instantiationexception)
        {
            String s2 = String.valueOf("Implementation of GcoreCastRemoteDisplayLocalService at ");
            String s5 = String.valueOf(instantiationexception);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s2).length() + 53 + String.valueOf(s).length() + String.valueOf(s5).length())).append(s2).append(s).append(" could not be instantiated. Original error message: \n").append(s5).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            String s3 = String.valueOf("Implementation of GcoreCastRemoteDisplayLocalService at ");
            String s6 = String.valueOf(illegalaccessexception);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s3).length() + 48 + String.valueOf(s).length() + String.valueOf(s6).length())).append(s3).append(s).append(" could not be accessed.Original error message: \n").append(s6).toString());
        }
        return lym1;
    }

    public final void a(Display display)
    {
        a.a(display);
    }

    public void onCreate()
    {
        super.onCreate();
        Context context = getApplicationContext();
        Object obj;
        try
        {
            obj = new ComponentName(context, com/google/android/libraries/gcoreclient/cast/remotedisplay/impl/CastRemoteDisplayLocalServiceDelegator);
            obj = context.getPackageManager().getServiceInfo(((ComponentName) (obj)), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException("Didn't declare CastRemoteDisplayLocalServiceDelegator as your CastRemoteDisplayLocalService service.");
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((ServiceInfo) (obj)).metaData;
        }
        if (obj != null)
        {
            a = a(((Bundle) (obj)).getString("gcoreclient.cast.GcoreCastRemoteDisplayLocalService"));
        }
        a.a(context);
    }
}
