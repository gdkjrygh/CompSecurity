// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.view.Display;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.util:
//            bx

public final class u
{

    public static final int a[] = {
        0x15f900, 0x9c400, 0x27100
    };
    private static final b b = org.c.c.a("CameraUtils");

    public static int a()
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return 1;
        } else
        {
            return Camera.getNumberOfCameras();
        }
    }

    public static int a(int i)
    {
        int j;
        if (i == 90)
        {
            j = 270;
        } else
        {
            j = i;
            if (i == 270)
            {
                return 90;
            }
        }
        return j;
    }

    public static int a(int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            Camera.getCameraInfo(j, camerainfo);
            if (camerainfo.facing == 1)
            {
                return (360 - (camerainfo.orientation + i) % 360) % 360;
            } else
            {
                return ((camerainfo.orientation - i) + 360) % 360;
            }
        } else
        {
            return ((90 - i) + 360) % 360;
        }
    }

    public static int a(Activity activity)
    {
        if (activity != null) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        switch (activity.getWindowManager().getDefaultDisplay().getRotation())
        {
        default:
            return 0;

        case 1: // '\001'
            return 90;

        case 2: // '\002'
            return 180;

        case 3: // '\003'
            return 270;

        case 0: // '\0'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        boolean flag = true;
        double d1 = options.outWidth;
        double d2 = options.outHeight;
        int k;
        int l;
        if (j < 0)
        {
            k = 1;
        } else
        {
            k = (int)Math.ceil(Math.sqrt((d1 * d2) / (double)j));
        }
        if (i < 0)
        {
            l = 128;
        } else
        {
            l = (int)Math.min(Math.floor(d1 / (double)i), Math.floor(d2 / (double)i));
        }
        if (l >= k)
        {
            if (j < 0 && i < 0)
            {
                k = 1;
            } else
            if (i >= 0)
            {
                k = l;
            }
        }
        if (k <= 8)
        {
            i = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (i >= k)
                {
                    break;
                }
                i <<= 1;
            } while (true);
        } else
        {
            j = ((k + 7) / 8) * 8;
        }
        return j;
    }

    public static int a(android.hardware.Camera.CameraInfo camerainfo, int i)
    {
        int j;
label0:
        {
            j = 0;
            if (i != -1)
            {
                j = camerainfo.orientation;
                if (camerainfo.facing != 1)
                {
                    break label0;
                }
                j = ((j - i) + 360) % 360;
            }
            return j;
        }
        return (j + i) % 360;
    }

    public static Bitmap a(String s)
    {
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        if (options.mCancel || options.outWidth == -1)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (options.outHeight == -1)
        {
            return null;
        }
        options.inSampleSize = b(options, 400, 80);
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        s = BitmapFactory.decodeFile(s, options);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        int i = Math.max(s.getWidth(), s.getHeight());
        if (i < 400)
        {
            return s;
        }
        float f = 400F / (float)i;
        s = Bitmap.createScaledBitmap(s, (int)((float)s.getWidth() * f), (int)(f * (float)s.getHeight()), true);
        return s;
        s;
        bx.a(s);
        return null;
    }

    public static Bitmap a(byte abyte0[], int i)
    {
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        if (options.mCancel || options.outWidth == -1)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (options.outHeight == -1)
        {
            return null;
        }
        options.inSampleSize = a(options, -1, i);
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        return abyte0;
        abyte0;
        return null;
    }

    public static Bitmap a(byte abyte0[], int i, int j, int k, int l)
    {
        Object obj = new ByteArrayOutputStream();
        (new YuvImage(abyte0, l, i, j, null)).compressToJpeg(new Rect(0, 0, i, j), 80, ((java.io.OutputStream) (obj)));
        abyte0 = ((ByteArrayOutputStream) (obj)).toByteArray();
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        obj = new Matrix();
        ((Matrix) (obj)).postRotate(k);
        abyte0 = Bitmap.createBitmap(abyte0, 0, 0, i, j, ((Matrix) (obj)), true);
        return abyte0;
        abyte0;
_L2:
        kik.android.util.bx.b(abyte0);
        return null;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Point a(Activity activity, Point point)
    {
        if (activity == null)
        {
            return new Point(0, 0);
        }
        activity = activity.getWindowManager().getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            activity.getSize(point);
            return point;
        } else
        {
            point.set(activity.getWidth(), activity.getHeight());
            return point;
        }
    }

    public static android.hardware.Camera.Size a(Activity activity, List list, double d1)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((android.hardware.Camera.Size) (obj));
_L2:
        obj = null;
        double d2 = 1.7976931348623157E+308D;
        activity = a(activity, new Point());
        int i = Math.max(Math.min(((Point) (activity)).x, ((Point) (activity)).y), 1280);
        Iterator iterator = list.iterator();
        activity = ((Activity) (obj));
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (android.hardware.Camera.Size)iterator.next();
            if (Math.abs((double)((android.hardware.Camera.Size) (obj)).width / (double)((android.hardware.Camera.Size) (obj)).height - d1) <= 0.10000000000000001D && (double)Math.abs(((android.hardware.Camera.Size) (obj)).height - i) < d2)
            {
                d2 = Math.abs(((android.hardware.Camera.Size) (obj)).height - i);
                activity = ((Activity) (obj));
            }
        } while (true);
        obj = activity;
        if (activity != null)
        {
            continue;
        }
        b.a("No preview size match the aspect ratio");
        d1 = 1.7976931348623157E+308D;
        iterator = list.iterator();
        do
        {
            obj = activity;
            if (!iterator.hasNext())
            {
                continue;
            }
            list = (android.hardware.Camera.Size)iterator.next();
            if ((double)Math.abs(((android.hardware.Camera.Size) (list)).height - i) < d1)
            {
                d1 = Math.abs(((android.hardware.Camera.Size) (list)).height - i);
                activity = list;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static android.hardware.Camera.Size a(List list)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (list != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
_L4:
        return ((android.hardware.Camera.Size) (obj));
_L2:
        int i = 0x7fffffff;
        Iterator iterator = list.iterator();
        list = ((List) (obj));
        do
        {
            obj = list;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (android.hardware.Camera.Size)iterator.next();
            if (Math.abs(1.3333333333333333D - (double)((android.hardware.Camera.Size) (obj)).width / (double)((android.hardware.Camera.Size) (obj)).height) <= 0.001D && Math.max(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height) <= 1280 && ((android.hardware.Camera.Size) (obj)).width * ((android.hardware.Camera.Size) (obj)).height <= i && Math.min(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height) >= 480)
            {
                i = ((android.hardware.Camera.Size) (obj)).width;
                int j = ((android.hardware.Camera.Size) (obj)).height;
                list = ((List) (obj));
                i *= j;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] a(android.hardware.Camera.Parameters parameters)
    {
        if (parameters == null)
        {
            return null;
        } else
        {
            android.hardware.Camera.Size size = parameters.getPreviewSize();
            float f = (float)ImageFormat.getBitsPerPixel(parameters.getPreviewFormat()) / 8F;
            int i = size.width;
            return new byte[(int)((float)(size.height * i) * f)];
        }
    }

    public static int b()
    {
        int l = Camera.getNumberOfCameras();
        int i = 0;
        int j;
        int k;
        for (j = -1; i < l; j = k)
        {
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            Camera.getCameraInfo(i, camerainfo);
            k = j;
            if (j == -1)
            {
                k = j;
                if (camerainfo.facing == 0)
                {
                    k = i;
                }
            }
            i++;
        }

        return j;
    }

    public static int b(int i, int j)
    {
        boolean flag = true;
        if (j != -1) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            j = (((i + 45) / 90) * 90) % 360;
        }
        return j;
_L2:
        int k = Math.abs(i - j);
        if (Math.min(k, 360 - k) < 50)
        {
            flag = false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int b(Activity activity)
    {
        if (activity != null)
        {
            int i = activity.getWindowManager().getDefaultDisplay().getRotation();
            activity = activity.getResources().getConfiguration();
            if ((i == 0 || i == 2) && ((Configuration) (activity)).orientation == 2 || (i == 1 || i == 3) && ((Configuration) (activity)).orientation == 1)
            {
                return 2;
            }
        }
        return 1;
    }

    private static int b(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int k;
        int i1;
        k = 1;
        i1 = 1;
        if (i >= 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        float f;
        int l;
        l = j;
        if (j < 0)
        {
            l = 0;
        }
        f = Math.max(options.outWidth, options.outHeight);
        j = 1;
_L5:
        i1 = k;
        if (f / (float)k <= (float)i) goto _L1; else goto _L3
_L3:
        if (j < 8)
        {
            j <<= 1;
        } else
        {
            j = (j / 8 + 1) * 8;
        }
        i1 = k;
        if (f / (float)j < (float)(i - l)) goto _L1; else goto _L4
_L4:
        k = j;
          goto _L5
    }

    public static Bitmap b(byte abyte0[], int i)
    {
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        if (options.mCancel || options.outWidth == -1)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (options.outHeight == -1)
        {
            return null;
        }
        options.inSampleSize = b(options, i, (int)((float)i * 0.2F));
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        int j = Math.max(abyte0.getWidth(), abyte0.getHeight());
        if (j < i)
        {
            return abyte0;
        }
        float f = (float)i / (float)j;
        abyte0 = Bitmap.createScaledBitmap(abyte0, (int)((float)abyte0.getWidth() * f), (int)(f * (float)abyte0.getHeight()), true);
        return abyte0;
        abyte0;
        bx.a(abyte0);
        return null;
    }

    public static android.hardware.Camera.Size b(Activity activity, List list, double d1)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((android.hardware.Camera.Size) (obj));
_L2:
        obj = null;
        double d2 = 1.7976931348623157E+308D;
        activity = a(activity, new Point());
        int i = Math.min(((Point) (activity)).x, ((Point) (activity)).y);
        Iterator iterator = list.iterator();
        activity = ((Activity) (obj));
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (android.hardware.Camera.Size)iterator.next();
            if (Math.abs((double)((android.hardware.Camera.Size) (obj)).width / (double)((android.hardware.Camera.Size) (obj)).height - d1) <= 0.001D && (double)Math.abs(((android.hardware.Camera.Size) (obj)).height - i) < d2)
            {
                d2 = Math.abs(((android.hardware.Camera.Size) (obj)).height - i);
                activity = ((Activity) (obj));
            }
        } while (true);
        obj = activity;
        if (activity != null)
        {
            continue;
        }
        b.a("No preview size match the aspect ratio");
        d1 = 1.7976931348623157E+308D;
        iterator = list.iterator();
        do
        {
            obj = activity;
            if (!iterator.hasNext())
            {
                continue;
            }
            list = (android.hardware.Camera.Size)iterator.next();
            if ((double)Math.abs(((android.hardware.Camera.Size) (list)).height - i) < d1)
            {
                d1 = Math.abs(((android.hardware.Camera.Size) (list)).height - i);
                activity = list;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Camera b(int i)
    {
        while (android.os.Build.VERSION.SDK_INT < 9 || i >= a() && i < 0) 
        {
            return null;
        }
        Camera camera;
        try
        {
            camera = Camera.open(i);
        }
        catch (RuntimeException runtimeexception)
        {
            bx.a(runtimeexception, 5);
            return null;
        }
        return camera;
    }

    public static int[] b(List list)
    {
        if (list == null || list.size() == 0)
        {
            return null;
        }
        Iterator iterator = list.iterator();
        int i = 0x61a80;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int ai1[] = (int[])iterator.next();
            int j = ai1[0];
            if (ai1[1] >= 30000 && j <= 30000 && j < i)
            {
                i = j;
            }
        } while (true);
        int k = 0;
        int j1 = 0;
        int l;
        int i1;
        for (l = -1; k < list.size(); l = i1)
        {
            int ai[] = (int[])list.get(k);
            int i2 = ai[0];
            int l1 = ai[1];
            int k1 = j1;
            i1 = l;
            if (i2 == i)
            {
                k1 = j1;
                i1 = l;
                if (j1 < l1)
                {
                    k1 = l1;
                    i1 = k;
                }
            }
            k++;
            j1 = k1;
        }

        if (l >= 0)
        {
            return (int[])list.get(l);
        } else
        {
            return null;
        }
    }

    public static int c()
    {
        int l = Camera.getNumberOfCameras();
        int i = 0;
        int j;
        int k;
        for (j = -1; i < l; j = k)
        {
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            Camera.getCameraInfo(i, camerainfo);
            k = j;
            if (j == -1)
            {
                k = j;
                if (camerainfo.facing == 1)
                {
                    k = i;
                }
            }
            i++;
        }

        return j;
    }

    public static boolean d()
    {
        return a() > 0;
    }

}
