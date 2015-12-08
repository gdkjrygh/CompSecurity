// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;

class LockOrientationPostAPI9
{

    LockOrientationPostAPI9()
    {
    }

    static void setOrientation(Activity activity, String s)
    {
        if (s.equalsIgnoreCase("LandscapeRight"))
        {
            activity.setRequestedOrientation(8);
        } else
        if (s.equalsIgnoreCase("PortraitUpsideDown"))
        {
            activity.setRequestedOrientation(9);
            return;
        }
    }
}
