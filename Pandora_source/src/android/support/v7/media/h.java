// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.media.MediaRouter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class android.support.v7.media.h
{
    public static interface a
    {

        public abstract void a(int i, Object obj);

        public abstract void a(Object obj);

        public abstract void a(Object obj, Object obj1);

        public abstract void a(Object obj, Object obj1, int i);

        public abstract void b(int i, Object obj);

        public abstract void b(Object obj);

        public abstract void c(Object obj);

        public abstract void d(Object obj);
    }

    static class b extends android.media.MediaRouter.Callback
    {

        protected final a a;

        public void onRouteAdded(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            a.a(routeinfo);
        }

        public void onRouteChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            a.c(routeinfo);
        }

        public void onRouteGrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup, int i)
        {
            a.a(routeinfo, routegroup, i);
        }

        public void onRouteRemoved(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            a.b(routeinfo);
        }

        public void onRouteSelected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
        {
            a.a(i, routeinfo);
        }

        public void onRouteUngrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup)
        {
            a.a(routeinfo, routegroup);
        }

        public void onRouteUnselected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
        {
            a.b(i, routeinfo);
        }

        public void onRouteVolumeChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            a.d(routeinfo);
        }

        public b(a a1)
        {
            a = a1;
        }
    }

    public static final class c
    {

        private Method a;

        public Object a(Object obj)
        {
            obj = (MediaRouter)obj;
            if (a == null)
            {
                break MISSING_BLOCK_LABEL_28;
            }
            Object obj1 = a.invoke(obj, new Object[0]);
            return obj1;
            Object obj2;
            obj2;
_L2:
            return ((MediaRouter) (obj)).getRouteAt(0);
            obj2;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public c()
        {
            if (android.os.Build.VERSION.SDK_INT < 16 || android.os.Build.VERSION.SDK_INT > 17)
            {
                throw new UnsupportedOperationException();
            }
            try
            {
                a = android/media/MediaRouter.getMethod("getSystemAudioRoute", new Class[0]);
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
        }
    }

    public static final class d
    {

        public static int a(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getSupportedTypes();
        }

        public static CharSequence a(Object obj, Context context)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getName(context);
        }

        public static void a(Object obj, int i)
        {
            ((android.media.MediaRouter.RouteInfo)obj).requestSetVolume(i);
        }

        public static void a(Object obj, Object obj1)
        {
            ((android.media.MediaRouter.RouteInfo)obj).setTag(obj1);
        }

        public static int b(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getPlaybackType();
        }

        public static void b(Object obj, int i)
        {
            ((android.media.MediaRouter.RouteInfo)obj).requestUpdateVolume(i);
        }

        public static int c(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getPlaybackStream();
        }

        public static int d(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getVolume();
        }

        public static int e(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getVolumeMax();
        }

        public static int f(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getVolumeHandling();
        }

        public static Object g(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getTag();
        }
    }

    public static final class e
    {

        private Method a;

        public void a(Object obj, int i, Object obj1)
        {
            obj = (MediaRouter)obj;
            obj1 = (android.media.MediaRouter.RouteInfo)obj1;
            if ((((android.media.MediaRouter.RouteInfo) (obj1)).getSupportedTypes() & 0x800000) == 0)
            {
                if (a != null)
                {
                    try
                    {
                        a.invoke(obj, new Object[] {
                            Integer.valueOf(i), obj1
                        });
                        return;
                    }
                    catch (IllegalAccessException illegalaccessexception)
                    {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", illegalaccessexception);
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", invocationtargetexception);
                    }
                } else
                {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            ((MediaRouter) (obj)).selectRoute(i, ((android.media.MediaRouter.RouteInfo) (obj1)));
        }

        public e()
        {
            if (android.os.Build.VERSION.SDK_INT < 16 || android.os.Build.VERSION.SDK_INT > 17)
            {
                throw new UnsupportedOperationException();
            }
            try
            {
                a = android/media/MediaRouter.getMethod("selectRouteInt", new Class[] {
                    Integer.TYPE, android/media/MediaRouter$RouteInfo
                });
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
        }
    }

    public static final class f
    {

        public static void a(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackType(i);
        }

        public static void a(Object obj, CharSequence charsequence)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setName(charsequence);
        }

        public static void a(Object obj, Object obj1)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeCallback((android.media.MediaRouter.VolumeCallback)obj1);
        }

        public static void b(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackStream(i);
        }

        public static void c(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolume(i);
        }

        public static void d(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeMax(i);
        }

        public static void e(Object obj, int i)
        {
            ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeHandling(i);
        }
    }

    public static interface g
    {

        public abstract void a(Object obj, int i);

        public abstract void b(Object obj, int i);
    }

    static class h extends android.media.MediaRouter.VolumeCallback
    {

        protected final g a;

        public void onVolumeSetRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
        {
            a.a(routeinfo, i);
        }

        public void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
        {
            a.b(routeinfo, i);
        }

        public h(g g1)
        {
            a = g1;
        }
    }


    public static Object a(Context context)
    {
        return context.getSystemService("media_router");
    }

    public static Object a(a a1)
    {
        return new b(a1);
    }

    public static Object a(g g1)
    {
        return new h(g1);
    }

    public static Object a(Object obj, int i)
    {
        return ((MediaRouter)obj).getSelectedRoute(i);
    }

    public static Object a(Object obj, String s, boolean flag)
    {
        return ((MediaRouter)obj).createRouteCategory(s, flag);
    }

    public static List a(Object obj)
    {
        obj = (MediaRouter)obj;
        int j = ((MediaRouter) (obj)).getRouteCount();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((MediaRouter) (obj)).getRouteAt(i));
        }

        return arraylist;
    }

    public static void a(Object obj, int i, Object obj1)
    {
        ((MediaRouter)obj).selectRoute(i, (android.media.MediaRouter.RouteInfo)obj1);
    }

    public static void a(Object obj, Object obj1)
    {
        ((MediaRouter)obj).removeCallback((android.media.MediaRouter.Callback)obj1);
    }

    public static Object b(Object obj, Object obj1)
    {
        return ((MediaRouter)obj).createUserRoute((android.media.MediaRouter.RouteCategory)obj1);
    }

    public static void b(Object obj, int i, Object obj1)
    {
        ((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1);
    }

    public static void c(Object obj, Object obj1)
    {
        ((MediaRouter)obj).addUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
    }

    public static void d(Object obj, Object obj1)
    {
        ((MediaRouter)obj).removeUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
    }
}
