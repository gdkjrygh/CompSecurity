// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.text.TextUtils;
import com.google.android.apps.unveil.c;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.v;
import com.google.android.apps.unveil.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            FakeCamera, CameraProxy

public class StaticImageCamera extends FakeCamera
{

    private static final String LOCAL_ROOT_PATH = "/sdcard/goggles_data/static_images";
    public static final String STATIC_IMAGE_DIRECTORY = "static_images";
    public static final String STATIC_IMAGE_KEY = "static_image";
    private static final af logger = new af();
    private Bitmap internalBitmap;
    private int rVal;
    private FakeCamera.RawFrame rawFrame;
    private Bitmap scaledImage;
    private int step;

    private StaticImageCamera(Handler handler, Map map, Resources resources)
    {
        super(handler, map, resources);
        rVal = 0;
        step = -1;
    }

    private static Bitmap createScaledImage(Bitmap bitmap, int i, int j)
    {
        RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth() - 1, bitmap.getHeight() - 1);
        RectF rectf1 = new RectF(0.0F, 0.0F, i - 1, j - 1);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.START);
        matrix.mapRect(rectf);
        return Bitmap.createScaledBitmap(bitmap, (int)rectf.width(), (int)rectf.height(), true);
    }

    private static ImageSequenceCamera.StringPair[] getStaticImages(PreferenceActivity preferenceactivity)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        String as1[] = (new File("/sdcard/goggles_data/static_images")).list();
        if (as1 != null)
        {
            int k = as1.length;
            int i = 0;
            while (i < k) 
            {
                String s2 = as1[i];
                String s = String.valueOf("sdcard:");
                String s4 = String.valueOf(s2);
                if (s4.length() != 0)
                {
                    s = s.concat(s4);
                } else
                {
                    s = new String(s);
                }
                s4 = String.valueOf("sdcard:/sdcard/goggles_data/static_images/");
                s2 = String.valueOf(s2);
                if (s2.length() != 0)
                {
                    s2 = s4.concat(s2);
                } else
                {
                    s2 = new String(s4);
                }
                arraylist.add(new ImageSequenceCamera.StringPair(s, s2));
                i++;
            }
        }
        String as[] = preferenceactivity.getAssets().list("static_images");
        if (as == null) goto _L2; else goto _L1
_L1:
        int l = as.length;
        int j = 0;
_L9:
        if (j >= l) goto _L2; else goto _L3
_L3:
        String s1 = as[j];
        String s3;
        preferenceactivity = String.valueOf("assets:");
        s3 = String.valueOf(s1);
        if (s3.length() == 0) goto _L5; else goto _L4
_L4:
        preferenceactivity = preferenceactivity.concat(s3);
_L6:
        s3 = String.valueOf("assets:static_images/");
        s1 = String.valueOf(s1);
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        s1 = s3.concat(s1);
_L7:
        arraylist.add(new ImageSequenceCamera.StringPair(preferenceactivity, s1));
        j++;
        continue; /* Loop/switch isn't completed */
_L5:
        preferenceactivity = new String(preferenceactivity);
          goto _L6
        s1 = new String(s3);
          goto _L7
        preferenceactivity;
        logger.e("Couldn't list assets directory!", new Object[0]);
_L2:
        return (ImageSequenceCamera.StringPair[])arraylist.toArray(new ImageSequenceCamera.StringPair[arraylist.size()]);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void initializePreferences(PreferenceActivity preferenceactivity)
    {
        int i = 0;
        ImageSequenceCamera.StringPair astringpair[] = getStaticImages(preferenceactivity);
        if (astringpair.length == 0)
        {
            preferenceactivity.findPreference(preferenceactivity.getString(g.camera_static_image_key)).setEnabled(false);
            return;
        }
        preferenceactivity = (ListPreference)preferenceactivity.findPreference(preferenceactivity.getString(g.camera_static_image_key));
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (int j = astringpair.length; i < j; i++)
        {
            ImageSequenceCamera.StringPair stringpair = astringpair[i];
            arraylist.add(stringpair.first);
            arraylist1.add(stringpair.second);
        }

        preferenceactivity.setEntries((CharSequence[])arraylist.toArray(new String[arraylist.size()]));
        preferenceactivity.setEntryValues((CharSequence[])arraylist1.toArray(new String[arraylist.size()]));
    }

    public static CameraProxy open(Handler handler, Map map, Resources resources)
    {
        if (camera == null)
        {
            camera = new StaticImageCamera(handler, map, resources);
        }
        return camera;
    }

    protected FakeCamera.RawFrame generateFrame()
    {
        int i;
        int j;
        i = getWidth();
        j = getHeight();
        if (internalBitmap != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        internalBitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        obj1 = getExtraValue("static_image", "");
        if (!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L4; else goto _L3
_L3:
        Object obj;
        logger.b("Loading default image.", new Object[0]);
        obj = BitmapFactory.decodeStream(resources.openRawResource(c.android_logo));
_L6:
        scaledImage = createScaledImage(((Bitmap) (obj)), getWidth(), getHeight());
        ((Bitmap) (obj)).recycle();
        rawFrame = new FakeCamera.RawFrame(this, internalBitmap);
_L2:
        obj = new Canvas(internalBitmap);
        ((Canvas) (obj)).drawARGB(255, rVal, rVal / 2, rVal);
        float f = (float)rVal / 255F;
        f = ((float)i * f) / 5F;
        float f1 = (float)rVal / 255F;
        f1 = ((float)j * f1) / 5F;
        ((Canvas) (obj)).drawBitmap(scaledImage, f, f1, null);
        rawFrame.loadRgb(internalBitmap);
        if (rVal == 254 || rVal == 0)
        {
            step = -step;
        }
        rVal = (rVal + step) % 255;
        return rawFrame;
_L4:
        boolean flag;
        logger.b("Loading image %s.", new Object[] {
            obj1
        });
        flag = v.a(((String) (obj1)));
        obj = obj1;
        if (flag)
        {
            obj = v.b(((String) (obj1)));
        }
        obj1 = BitmapFactory.decodeStream(v.a(resources, flag, ((String) (obj))));
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        logger.f("Failed to decode asset %s; switching to default image", new Object[] {
            obj
        });
        obj = BitmapFactory.decodeStream(resources.openRawResource(c.android_logo));
        if (true) goto _L6; else goto _L5
_L5:
    }

}
