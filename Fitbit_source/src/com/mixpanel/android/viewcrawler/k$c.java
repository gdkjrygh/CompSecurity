// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            k, h

private static class eption
    implements Callable
{

    private h a;
    private final List b = new ArrayList();
    private final DisplayMetrics c = new DisplayMetrics();
    private final a d = new <init>();
    private final int e = 160;

    private void a(eption eption)
    {
        Boolean boolean1;
        View view;
        view = eption.b;
        float f;
        float f1;
        Object obj;
        Bitmap bitmap;
        int i;
        int j;
        int l;
        int i1;
        try
        {
            obj = android/view/View.getDeclaredMethod("createSnapshot", new Class[] {
                android/graphics/Bitmap$Config, Integer.TYPE, Boolean.TYPE
            });
            ((Method) (obj)).setAccessible(true);
            obj = (Bitmap)((Method) (obj)).invoke(view, new Object[] {
                android.graphics.ap.Config.RGB_565, Integer.valueOf(-1), Boolean.valueOf(false)
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            if (g.b)
            {
                Log.v("MixpanelAPI.Snapshot", "Can't call createSnapshot, will use drawCache", nosuchmethodexception);
            }
            nosuchmethodexception = null;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.d("MixpanelAPI.Snapshot", "Can't call createSnapshot with arguments", illegalargumentexception);
            illegalargumentexception = null;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            Log.e("MixpanelAPI.Snapshot", "Exception when calling createSnapshot", invocationtargetexception);
            invocationtargetexception = null;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            Log.e("MixpanelAPI.Snapshot", "Can't access createSnapshot, using drawCache", illegalaccessexception);
            illegalaccessexception = null;
        }
        catch (ClassCastException classcastexception)
        {
            Log.e("MixpanelAPI.Snapshot", "createSnapshot didn't return a bitmap?", classcastexception);
            classcastexception = null;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean1 = Boolean.valueOf(view.isDrawingCacheEnabled());
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        bitmap = view.getDrawingCache();
        obj = bitmap;
_L5:
        f = 1.0F;
        f1 = f;
        if (obj != null)
        {
            i = ((Bitmap) (obj)).getDensity();
            if (i != 0)
            {
                f = 160F / (float)i;
            }
            i = ((Bitmap) (obj)).getWidth();
            j = ((Bitmap) (obj)).getHeight();
            l = (int)((double)((float)((Bitmap) (obj)).getWidth() * f) + 0.5D);
            i1 = (int)((double)((float)((Bitmap) (obj)).getHeight() * f) + 0.5D);
            f1 = f;
            if (i > 0)
            {
                f1 = f;
                if (j > 0)
                {
                    f1 = f;
                    if (l > 0)
                    {
                        f1 = f;
                        if (i1 > 0)
                        {
                            d.a(l, i1, 160, ((Bitmap) (obj)));
                            f1 = f;
                        }
                    }
                }
            }
        }
        if (boolean1 != null && !boolean1.booleanValue())
        {
            view.setDrawingCacheEnabled(false);
        }
        eption.d = f1;
        eption.c = d;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        boolean1 = null;
_L3:
        if (g.b)
        {
            Log.v("MixpanelAPI.Snapshot", (new StringBuilder()).append("Can't take a bitmap snapshot of view ").append(view).append(", skipping for now.").toString(), runtimeexception);
        }
        continue; /* Loop/switch isn't completed */
        runtimeexception;
        if (true) goto _L3; else goto _L2
_L2:
        boolean1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public List a()
        throws Exception
    {
        b.clear();
        Object obj;
        for (Iterator iterator = a.a().iterator(); iterator.hasNext(); b.add(obj))
        {
            obj = (Activity)iterator.next();
            String s = obj.getClass().getCanonicalName();
            View view = ((Activity) (obj)).getWindow().getDecorView().getRootView();
            ((Activity) (obj)).getWindowManager().getDefaultDisplay().getMetrics(c);
            obj = new <init>(s, view);
        }

        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            a((a)b.get(i));
        }

        return b;
    }

    public void a(h h1)
    {
        a = h1;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    public eption()
    {
    }
}
