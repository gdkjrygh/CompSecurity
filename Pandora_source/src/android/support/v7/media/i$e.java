// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.view.Display;

// Referenced classes of package android.support.v7.media:
//            i

public static final class teInfo
{

    public static boolean a(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).isEnabled();
    }

    public static Display b(Object obj)
    {
        return ((android.media.aRouter.RouteInfo)obj).getPresentationDisplay();
    }
}
