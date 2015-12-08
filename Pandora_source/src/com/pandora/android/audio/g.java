// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.media.AudioManager;
import java.lang.reflect.Method;
import p.df.a;

// Referenced classes of package com.pandora.android.audio:
//            d

public class g
{

    private static boolean a = false;
    private static Method b;
    private static Method c;

    public g()
    {
    }

    public static void a(AudioManager audiomanager, d d1)
    {
        if (!a)
        {
            return;
        }
        try
        {
            b.invoke(audiomanager, new Object[] {
                d1.b()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AudioManager audiomanager)
        {
            p.df.a.c("RemoteControlHelper", audiomanager.getMessage(), audiomanager);
        }
    }

    public static void b(AudioManager audiomanager, d d1)
    {
        if (!a)
        {
            return;
        }
        try
        {
            c.invoke(audiomanager, new Object[] {
                d1.b()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AudioManager audiomanager)
        {
            p.df.a.c("RemoteControlHelper", audiomanager.getMessage(), audiomanager);
        }
    }

    static 
    {
        try
        {
            Class class1 = com.pandora.android.audio.d.a(com/pandora/android/audio/g.getClassLoader());
            b = android/media/AudioManager.getMethod("registerRemoteControlClient", new Class[] {
                class1
            });
            c = android/media/AudioManager.getMethod("unregisterRemoteControlClient", new Class[] {
                class1
            });
            a = true;
        }
        catch (ClassNotFoundException classnotfoundexception) { }
        catch (NoSuchMethodException nosuchmethodexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        catch (SecurityException securityexception) { }
    }
}
