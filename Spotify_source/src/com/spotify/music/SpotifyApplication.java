// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import android.app.Application;
import c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SpotifyApplication extends c
{

    public SpotifyApplication()
    {
    }

    public void onCreate()
    {
        super.onCreate();
        Class.forName("gmm").getMethod("onCreate", new Class[] {
            android/app/Application
        }).invoke(null, new Object[] {
            this
        });
        return;
        Object obj;
        obj;
_L2:
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
