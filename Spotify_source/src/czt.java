// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

final class czt
    implements Callable
{

    czh a;
    private final List b = new ArrayList();
    private final DisplayMetrics c = new DisplayMetrics();
    private final czr d = new czr();

    public czt()
    {
    }

    private List a()
    {
        int i;
        int j;
        b.clear();
        Object obj1;
        for (Iterator iterator = a.b().iterator(); iterator.hasNext(); b.add(obj1))
        {
            obj1 = (Activity)iterator.next();
            String s = obj1.getClass().getCanonicalName();
            View view = ((Activity) (obj1)).getWindow().getDecorView().getRootView();
            ((Activity) (obj1)).getWindowManager().getDefaultDisplay().getMetrics(c);
            obj1 = new czu(s, view);
        }

        j = b.size();
        i = 0;
_L2:
        Boolean boolean1;
        View view1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        czu czu1 = (czu)b.get(i);
        view1 = czu1.b;
        float f;
        float f1;
        Object obj;
        Bitmap bitmap;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            obj = android/view/View.getDeclaredMethod("createSnapshot", new Class[] {
                android/graphics/Bitmap$Config, Integer.TYPE, Boolean.TYPE
            });
            ((Method) (obj)).setAccessible(true);
            obj = (Bitmap)((Method) (obj)).invoke(view1, new Object[] {
                android.graphics.Bitmap.Config.RGB_565, Integer.valueOf(-1), Boolean.valueOf(false)
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            if (cxi.a)
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
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_547;
        }
        boolean1 = Boolean.valueOf(view1.isDrawingCacheEnabled());
        view1.setDrawingCacheEnabled(true);
        view1.buildDrawingCache(true);
        bitmap = view1.getDrawingCache();
        obj = bitmap;
_L3:
        f = 1.0F;
        f1 = f;
        if (obj != null)
        {
            k = ((Bitmap) (obj)).getDensity();
            if (k != 0)
            {
                f = 160F / (float)k;
            }
            k = ((Bitmap) (obj)).getWidth();
            l = ((Bitmap) (obj)).getHeight();
            i1 = (int)((double)((float)((Bitmap) (obj)).getWidth() * f) + 0.5D);
            j1 = (int)((double)((float)((Bitmap) (obj)).getHeight() * f) + 0.5D);
            f1 = f;
            if (k > 0)
            {
                f1 = f;
                if (l > 0)
                {
                    f1 = f;
                    if (i1 > 0)
                    {
                        f1 = f;
                        if (j1 > 0)
                        {
                            d.a(i1, j1, ((Bitmap) (obj)));
                            f1 = f;
                        }
                    }
                }
            }
        }
        if (boolean1 != null && !boolean1.booleanValue())
        {
            view1.setDrawingCacheEnabled(false);
        }
        czu1.d = f1;
        czu1.c = d;
        i++;
        if (true) goto _L2; else goto _L1
        RuntimeException runtimeexception;
        runtimeexception;
        boolean1 = null;
_L4:
        if (cxi.a)
        {
            Log.v("MixpanelAPI.Snapshot", (new StringBuilder("Can't take a bitmap snapshot of view ")).append(view1).append(", skipping for now.").toString(), runtimeexception);
        }
          goto _L3
_L1:
        return b;
        runtimeexception;
          goto _L4
        boolean1 = null;
          goto _L3
    }

    public final Object call()
    {
        return a();
    }
}
