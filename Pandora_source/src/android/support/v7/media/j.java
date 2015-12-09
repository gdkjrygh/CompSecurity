// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.MediaRouter;

final class j
{
    public static final class a
    {

        public static CharSequence a(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getDescription();
        }

        public static boolean b(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).isConnecting();
        }
    }

    public static final class b
    {

        public static void a(Object obj, CharSequence charsequence)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setDescription(charsequence);
        }
    }


    public static Object a(Object obj)
    {
        return ((MediaRouter)obj).getDefaultRoute();
    }

    public static void a(Object obj, int i, Object obj1, int k)
    {
        ((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1, k);
    }
}
