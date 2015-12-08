// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.card.payment:
//            CardScanner, CameraUnavailableException, OverlayView

class Util
{

    private static final String TAG = io/card/payment/Util.getSimpleName();
    private static final boolean TORCH_BLACK_LISTED;
    private static Boolean sHardwareSupported;

    Util()
    {
    }

    public static boolean deviceSupportsTorch(Context context)
    {
        return !TORCH_BLACK_LISTED && context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public static String getNativeMemoryStats()
    {
        return (new StringBuilder("(free/alloc'd/total)")).append(Debug.getNativeHeapFreeSize()).append("/").append(Debug.getNativeHeapAllocatedSize()).append("/").append(Debug.getNativeHeapSize()).toString();
    }

    private static boolean hardwareSupportCheck()
    {
        Object obj;
        Log.i("card.io", "Checking hardware support...");
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            Log.w("card.io", "- Android SDK too old. Minimum Android 2.2 / API level 8+ (Froyo) required");
            return false;
        }
        if (!CardScanner.processorSupported())
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
            throw new CameraUnavailableException();
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

    public static boolean hardwareSupported()
    {
        if (sHardwareSupported == null)
        {
            sHardwareSupported = Boolean.valueOf(hardwareSupportCheck());
        }
        return sHardwareSupported.booleanValue();
    }

    public static boolean hasConfigFlag(int i, int j)
    {
        return (i & j) == j;
    }

    public static void logNativeMemoryStats()
    {
        Log.d("MEMORY", (new StringBuilder("Native memory stats: ")).append(getNativeMemoryStats()).toString());
    }

    public static String manifestHasConfigChange(ResolveInfo resolveinfo, Class class1)
    {
        String s = null;
        if (resolveinfo != null) goto _L2; else goto _L1
_L1:
        s = String.format("Didn't find %s in the AndroidManifest.xml", new Object[] {
            class1.getName()
        });
_L4:
        if (s != null)
        {
            Log.e("card.io", s);
        }
        return s;
_L2:
        if (!hasConfigFlag(resolveinfo.activityInfo.configChanges, 128))
        {
            s = (new StringBuilder()).append(class1.getName()).append(" requires attribute android:configChanges=\"orientation\"").toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Rect rectGivenCenter(Point point, int i, int j)
    {
        return new Rect(point.x - i / 2, point.y - j / 2, point.x + i / 2, point.y + j / 2);
    }

    public static void setupTextPaintStyle(Paint paint)
    {
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setShadowLayer(1.5F, 0.5F, 0.0F, Color.HSVToColor(200, new float[] {
            0.0F, 0.0F, 0.0F
        }));
    }

    static void writeCapturedCardImageIfNecessary(Intent intent, Intent intent1, OverlayView overlayview)
    {
        if (intent.getBooleanExtra("io.card.payment.returnCardImage", false) && overlayview != null && overlayview.getBitmap() != null)
        {
            intent = new ByteArrayOutputStream();
            overlayview.getBitmap().compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, intent);
            intent1.putExtra("io.card.payment.capturedCardImage", intent.toByteArray());
        }
    }

    static 
    {
        TORCH_BLACK_LISTED = Build.MODEL.equals("DROID2");
    }
}
