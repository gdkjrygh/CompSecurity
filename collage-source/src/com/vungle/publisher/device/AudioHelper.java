// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.device;

import android.media.AudioManager;

public class AudioHelper
{

    public AudioManager a;

    public AudioHelper()
    {
    }

    public final float a(float f)
    {
        int i = a();
        if (i == 0)
        {
            return -1F;
        } else
        {
            return f / (float)i;
        }
    }

    public final int a()
    {
        return a.getStreamMaxVolume(3);
    }

    public final void a(boolean flag)
    {
        AudioManager audiomanager = a;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        audiomanager.setStreamMute(3, flag);
    }

    public final int b()
    {
        return a.getStreamVolume(3);
    }

    public final float c()
    {
        return a(b());
    }
}
