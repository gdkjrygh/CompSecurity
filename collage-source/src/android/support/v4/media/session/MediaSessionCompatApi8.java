// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;

class MediaSessionCompatApi8
{

    MediaSessionCompatApi8()
    {
    }

    public static void registerMediaButtonEventReceiver(Context context, ComponentName componentname)
    {
        ((AudioManager)context.getSystemService("audio")).registerMediaButtonEventReceiver(componentname);
    }

    public static void unregisterMediaButtonEventReceiver(Context context, ComponentName componentname)
    {
        ((AudioManager)context.getSystemService("audio")).unregisterMediaButtonEventReceiver(componentname);
    }
}
