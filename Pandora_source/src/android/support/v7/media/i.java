// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class i
{
    public static final class a
        implements Runnable
    {

        private final DisplayManager a;
        private final Handler b;
        private Method c;
        private boolean d;

        public void a(int j)
        {
            if ((j & 2) == 0) goto _L2; else goto _L1
_L1:
            if (d) goto _L4; else goto _L3
_L3:
            if (c == null) goto _L6; else goto _L5
_L5:
            d = true;
            b.post(this);
_L4:
            return;
_L6:
            Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            return;
_L2:
            if (d)
            {
                d = false;
                b.removeCallbacks(this);
                return;
            }
            if (true) goto _L4; else goto _L7
_L7:
        }

        public void run()
        {
            if (d)
            {
                try
                {
                    c.invoke(a, new Object[0]);
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", illegalaccessexception);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", invocationtargetexception);
                }
                b.postDelayed(this, 15000L);
            }
        }

        public a(Context context, Handler handler)
        {
            if (android.os.Build.VERSION.SDK_INT != 17)
            {
                throw new UnsupportedOperationException();
            }
            a = (DisplayManager)context.getSystemService("display");
            b = handler;
            try
            {
                c = android/hardware/display/DisplayManager.getMethod("scanWifiDisplays", new Class[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
    }

    public static interface b
        extends h.a
    {

        public abstract void e(Object obj);
    }

    static class c extends h.b
    {

        public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            ((b)a).e(routeinfo);
        }

        public c(b b1)
        {
            super(b1);
        }
    }

    public static final class d
    {

        private Method a;
        private int b;

        public boolean a(Object obj)
        {
            obj = (android.media.MediaRouter.RouteInfo)obj;
            if (a == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            int j;
            int k;
            j = ((Integer)a.invoke(obj, new Object[0])).intValue();
            k = b;
            return j == k;
            obj;
_L2:
            return false;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public d()
        {
            if (android.os.Build.VERSION.SDK_INT != 17)
            {
                throw new UnsupportedOperationException();
            }
            try
            {
                b = android/media/MediaRouter$RouteInfo.getField("STATUS_CONNECTING").getInt(null);
                a = android/media/MediaRouter$RouteInfo.getMethod("getStatusCode", new Class[0]);
                return;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                return;
            }
        }
    }

    public static final class e
    {

        public static boolean a(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).isEnabled();
        }

        public static Display b(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getPresentationDisplay();
        }
    }


    public static Object a(b b1)
    {
        return new c(b1);
    }
}
