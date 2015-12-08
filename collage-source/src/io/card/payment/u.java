// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.card.payment:
//            CardScanner, a

class u
{

    private static final boolean a;
    private static Boolean b;

    u()
    {
    }

    public static Rect a(Point point, int i, int j)
    {
        return new Rect(point.x - i / 2, point.y - j / 2, point.x + i / 2, point.y + j / 2);
    }

    public static String a(ResolveInfo resolveinfo, Class class1)
    {
        Object obj;
        boolean flag;
        flag = true;
        obj = null;
        if (resolveinfo != null) goto _L2; else goto _L1
_L1:
        resolveinfo = String.format("Didn't find %s in the AndroidManifest.xml", new Object[] {
            class1.getName()
        });
_L4:
        if (resolveinfo != null)
        {
            Log.e("card.io", resolveinfo);
        }
        return resolveinfo;
_L2:
        if ((resolveinfo.activityInfo.configChanges & 0x80) != 128)
        {
            flag = false;
        }
        resolveinfo = obj;
        if (!flag)
        {
            resolveinfo = (new StringBuilder()).append(class1.getName()).append(" requires attribute android:configChanges=\"orientation\"").toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Paint paint)
    {
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setShadowLayer(1.5F, 0.5F, 0.0F, Color.HSVToColor(200, new float[] {
            0.0F, 0.0F, 0.0F
        }));
    }

    public static boolean a()
    {
        if (b == null)
        {
            b = Boolean.valueOf(c());
        }
        return b.booleanValue();
    }

    public static boolean a(Context context)
    {
        return !a && context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public static void b()
    {
        (new StringBuilder("Native memory stats: ")).append((new StringBuilder("(free/alloc'd/total)")).append(Debug.getNativeHeapFreeSize()).append("/").append(Debug.getNativeHeapAllocatedSize()).append("/").append(Debug.getNativeHeapSize()).toString());
    }

    private static boolean c()
    {
        Object obj;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            Log.w("card.io", "- Android SDK too old. Minimum Android 2.2 / API level 8+ (Froyo) required");
            return false;
        }
        if (!CardScanner.a())
        {
            Log.w("card.io", "- Processor type is not supported");
            return false;
        }
        try
        {
            obj = Camera.open();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("card.io", (new StringBuilder("- Error opening camera: ")).append(obj).toString());
            throw new a();
        }
        if (obj == null)
        {
            Log.w("card.io", "- No camera found");
            return false;
        }
        List list = ((Camera) (obj)).getParameters().getSupportedPreviewSizes();
        ((Camera) (obj)).release();
        obj = list.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj)).next();
        if (size.width != 640 || size.height != 480) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (!flag)
        {
            Log.w("card.io", "- Camera resolution is insufficient");
            return false;
        } else
        {
            return true;
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        io/card/payment/u.getSimpleName();
        a = Build.MODEL.equals("DROID2");
    }
}
