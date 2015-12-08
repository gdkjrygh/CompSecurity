// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.slyce.report.mpmetrics.ab;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.android.slyce.report.c:
//            aj, am, aa

class al
    implements Callable
{

    private aa a;
    private final List b = new ArrayList();
    private final DisplayMetrics c = new DisplayMetrics();
    private final aj d = new aj();
    private final int e = 160;

    public al()
    {
    }

    private void a(am am1)
    {
        Boolean boolean1;
        View view;
        view = am1.b;
        float f;
        float f1;
        Object obj;
        Bitmap bitmap;
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = android/view/View.getDeclaredMethod("createSnapshot", new Class[] {
                android/graphics/Bitmap$Config, Integer.TYPE, Boolean.TYPE
            });
            ((Method) (obj)).setAccessible(true);
            obj = (Bitmap)((Method) (obj)).invoke(view, new Object[] {
                android.graphics.Bitmap.Config.RGB_565, Integer.valueOf(-1), Boolean.valueOf(false)
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            if (ab.a)
            {
                Log.v("MixpanelAPI.ViewSnapshot", "Can't call createSnapshot, will use drawCache", nosuchmethodexception);
            }
            nosuchmethodexception = null;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.d("MixpanelAPI.ViewSnapshot", "Can't call createSnapshot with arguments", illegalargumentexception);
            illegalargumentexception = null;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            Log.e("MixpanelAPI.ViewSnapshot", "Exception when calling createSnapshot", invocationtargetexception);
            invocationtargetexception = null;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            Log.e("MixpanelAPI.ViewSnapshot", "Can't access createSnapshot, using drawCache", illegalaccessexception);
            illegalaccessexception = null;
        }
        catch (ClassCastException classcastexception)
        {
            Log.e("MixpanelAPI.ViewSnapshot", "createSnapshot didn't return a bitmap?", classcastexception);
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
            k = (int)((double)((float)((Bitmap) (obj)).getWidth() * f) + 0.5D);
            l = (int)((double)((float)((Bitmap) (obj)).getHeight() * f) + 0.5D);
            f1 = f;
            if (i > 0)
            {
                f1 = f;
                if (j > 0)
                {
                    f1 = f;
                    if (k > 0)
                    {
                        f1 = f;
                        if (l > 0)
                        {
                            d.a(k, l, 160, ((Bitmap) (obj)));
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
        am1.d = f1;
        am1.c = d;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        boolean1 = null;
_L3:
        if (ab.a)
        {
            Log.v("MixpanelAPI.ViewSnapshot", (new StringBuilder()).append("Can't take a bitmap snapshot of view ").append(view).append(", skipping for now.").toString(), runtimeexception);
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
    {
        b.clear();
        Object obj;
        for (Iterator iterator = a.a().iterator(); iterator.hasNext(); b.add(obj))
        {
            obj = (Activity)iterator.next();
            String s = obj.getClass().getCanonicalName();
            View view = ((Activity) (obj)).getWindow().getDecorView().getRootView();
            ((Activity) (obj)).getWindowManager().getDefaultDisplay().getMetrics(c);
            obj = new am(s, view);
        }

        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            a((am)b.get(i));
        }

        return b;
    }

    public void a(aa aa1)
    {
        a = aa1;
    }

    public Object call()
    {
        return a();
    }
}
