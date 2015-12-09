// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;

final class gh
{

    public static void a(Context context, ComponentName componentname)
    {
        ((AudioManager)context.getSystemService("audio")).unregisterMediaButtonEventReceiver(componentname);
    }
}
