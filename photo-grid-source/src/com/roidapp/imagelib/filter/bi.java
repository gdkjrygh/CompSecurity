// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.a.h;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.e.a;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.GPUImageAlphaBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageColorFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageFilterGroup;
import jp.co.cyberagent.android.gpuimage.GPUImageHueFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageLuminosityFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageMultiplyBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageNormalBlendColorFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageOverlayBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageOverlayColorBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageSaturationFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageScreenBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageSimpleSketchFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageSketchFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageThresholdFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageToneCurveFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageTwoInputFilter;
import jp.co.cyberagent.android.gpuimage.Rotation;

public final class bi
    implements a
{

    private static Integer o[] = {
        Integer.valueOf(640), Integer.valueOf(320)
    };
    private IFilterInfo a;
    private int b;
    private b c;
    private GPUImageFilter d;
    private Context e;
    private boolean f;
    private InputStream g;
    private Bitmap h;
    private Bitmap i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int p;
    private int q;
    private boolean r;
    private boolean s;

    public bi(Context context)
    {
        b = 0;
        c = new b();
        j = true;
        k = false;
        l = false;
        m = true;
        n = false;
        p = 100;
        q = 0;
        r = false;
        s = false;
        e = context;
    }

    private static GPUImageFilter b(b b1)
    {
        GPUImageColorFilter gpuimagecolorfilter = new GPUImageColorFilter();
        gpuimagecolorfilter.setBrightness(c(b1.c()));
        gpuimagecolorfilter.setContrast(d(b1.b + 100));
        gpuimagecolorfilter.setSaturation(e(b1.c + 100));
        gpuimagecolorfilter.setHue((float)b1.d() - 180F);
        return gpuimagecolorfilter;
    }

    static float c(int i1)
    {
        return 2.0F * ((float)i1 / 300F) - 1.0F;
    }

    static float d(int i1)
    {
        if (i1 > 100)
        {
            return 3F * ((float)(i1 - 100) / 100F) + 1.0F;
        } else
        {
            return ((float)i1 / 100F) * 1.0F + 0.0F;
        }
    }

    static float e(int i1)
    {
        return 2.0F * ((float)i1 / 200F) + 0.0F;
    }

    public static float f(int i1)
    {
        float f1 = 1.0F;
        if (i1 > 0)
        {
            f1 = 1.0F + (float)i1 / 100F;
        } else
        if (i1 < 0)
        {
            return ((float)i1 + 100F) / 100F;
        }
        return f1;
    }

    static float g(int i1)
    {
        return (float)i1 - 180F;
    }

    private GPUImageAlphaBlendFilter h(int i1)
    {
        GPUImageAlphaBlendFilter gpuimagealphablendfilter;
        boolean flag;
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = true;
        flag = true;
        gpuimagealphablendfilter = new GPUImageAlphaBlendFilter(true);
        gpuimagealphablendfilter.setMix(1.0F - (float)p / 100F);
        if (!k) goto _L2; else goto _L1
_L1:
        Rotation rotation = Rotation.NORMAL;
        q;
        JVM INSTR lookupswitch 3: default 80
    //                   90: 114
    //                   180: 121
    //                   270: 128;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_128;
_L7:
        if (h.c == h.a)
        {
            if (i1 % 2 != 0)
            {
                rotation = Rotation.NORMAL;
            }
            if (h.g)
            {
                flag = false;
            }
            gpuimagealphablendfilter.setRotation(rotation, false, flag);
            return gpuimagealphablendfilter;
        }
        break MISSING_BLOCK_LABEL_142;
_L4:
        rotation = Rotation.ROTATION_90;
          goto _L7
_L5:
        rotation = Rotation.ROTATION_180;
          goto _L7
        rotation = Rotation.ROTATION_270;
          goto _L7
        if (i1 % 2 != 0)
        {
            rotation = Rotation.NORMAL;
        }
        if (i1 % 2 != 0) goto _L9; else goto _L8
_L8:
        flag = flag2;
        if (!h.g)
        {
            flag = false;
        }
_L10:
        gpuimagealphablendfilter.setRotation(rotation, false, flag);
        return gpuimagealphablendfilter;
_L9:
        flag = flag2;
        if (h.g)
        {
            flag = false;
        }
        if (true) goto _L10; else goto _L2
_L2:
        Rotation rotation1 = Rotation.NORMAL;
        boolean flag1;
        if (n)
        {
            flag1 = flag3;
        } else
        {
            flag1 = false;
        }
        gpuimagealphablendfilter.setRotation(rotation1, false, flag1);
        return gpuimagealphablendfilter;
    }

    public final int a()
    {
        return p;
    }

    public final Bitmap a(Bitmap bitmap)
    {
        ImageLibrary.a().a("processImage");
        if (f && bitmap != null)
        {
            GPUImage gpuimage = new GPUImage(e);
            gpuimage.setImage(bitmap);
            if (a == null)
            {
                bitmap = (GPUImageFilterGroup)a(0, bitmap.getWidth(), bitmap.getHeight(), c, false);
            } else
            if (a instanceof CloudFilterInfo)
            {
                bitmap = (GPUImageFilterGroup)a((CloudFilterInfo)a, bitmap.getWidth(), bitmap.getHeight(), c);
            } else
            {
                bitmap = (GPUImageFilterGroup)a(a.a(), bitmap.getWidth(), bitmap.getHeight(), c, false);
            }
            bitmap.setDarkCorner(n);
            gpuimage.setFilter(bitmap);
            bitmap = gpuimage.getBitmapWithFilterApplied();
            if (bitmap == null)
            {
                throw new IllegalArgumentException("create PBuffer failed");
            } else
            {
                com.roidapp.imagelib.b.c.a(h);
                return bitmap;
            }
        } else
        {
            com.roidapp.imagelib.b.c.a(h);
            return bitmap;
        }
    }

    public final GPUImageFilter a(int i1, int j1, int k1, b b1, boolean flag)
    {
        ArrayList arraylist;
        int l1;
        arraylist = new ArrayList();
        l1 = Math.min(j1, k1);
        if (n)
        {
            GPUImageMultiplyBlendFilter gpuimagemultiplyblendfilter = new GPUImageMultiplyBlendFilter();
            gpuimagemultiplyblendfilter.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.ae, l1, l1 * l1));
            arraylist.add(gpuimagemultiplyblendfilter);
        }
        i1;
        JVM INSTR tableswitch 0 46: default 272
    //                   0 272
    //                   1 3489
    //                   2 3573
    //                   3 3657
    //                   4 3741
    //                   5 3825
    //                   6 3927
    //                   7 4011
    //                   8 4095
    //                   9 4179
    //                   10 4279
    //                   11 4379
    //                   12 4479
    //                   13 4579
    //                   14 4679
    //                   15 4763
    //                   16 4865
    //                   17 4967
    //                   18 5051
    //                   19 5153
    //                   20 5175
    //                   21 5320
    //                   22 2567
    //                   23 2736
    //                   24 2826
    //                   25 2971
    //                   26 3159
    //                   27 3249
    //                   28 3394
    //                   29 1606
    //                   30 1719
    //                   31 1842
    //                   32 2009
    //                   33 2076
    //                   34 2216
    //                   35 2382
    //                   36 2472
    //                   37 750
    //                   38 871
    //                   39 992
    //                   40 1113
    //                   41 1227
    //                   42 1347
    //                   43 1537
    //                   44 637
    //                   45 505
    //                   46 362;
           goto _L1 _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47
_L1:
        if (j)
        {
            arraylist.add(b(b1));
        }
        if (m)
        {
            arraylist.add(h(arraylist.size()));
        }
        if (k && arraylist.size() % 2 == 0)
        {
            arraylist.add(new GPUImageFilter());
        }
        return new GPUImageFilterGroup(arraylist);
_L47:
        GPUImageSaturationFilter gpuimagesaturationfilter = new GPUImageSaturationFilter();
        gpuimagesaturationfilter.setSaturation(f(-100));
        GPUImageToneCurveFilter gpuimagetonecurvefilter18 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter18.setFromCurveFileInputStream(e.getResources().openRawResource(i.I));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter8 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter8.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        GPUImageNormalBlendColorFilter gpuimagenormalblendcolorfilter1 = new GPUImageNormalBlendColorFilter();
        gpuimagenormalblendcolorfilter1.setColor("#ff63ce", 0.08F);
        arraylist.add(gpuimagesaturationfilter);
        arraylist.add(gpuimagetonecurvefilter18);
        arraylist.add(gpuimageoverlayblendfilter8);
        arraylist.add(gpuimagenormalblendcolorfilter1);
        continue; /* Loop/switch isn't completed */
_L46:
        GPUImageThresholdFilter gpuimagethresholdfilter = new GPUImageThresholdFilter();
        GPUImageToneCurveFilter gpuimagetonecurvefilter19 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter19.setFromCurveFileInputStream(e.getResources().openRawResource(i.w));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter9 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter9.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        GPUImageSaturationFilter gpuimagesaturationfilter19 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter19.setSaturation(f(-100));
        arraylist.add(gpuimagesaturationfilter19);
        arraylist.add(gpuimageoverlayblendfilter9);
        arraylist.add(gpuimagetonecurvefilter19);
        arraylist.add(gpuimagethresholdfilter);
        continue; /* Loop/switch isn't completed */
_L45:
        GPUImageToneCurveFilter gpuimagetonecurvefilter = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter.setFromCurveFileInputStream(e.getResources().openRawResource(i.as));
        GPUImageSaturationFilter gpuimagesaturationfilter6 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter6.setSaturation(f(-100));
        GPUImageScreenBlendFilter gpuimagescreenblendfilter4 = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter4.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.bh, l1, l1 * l1));
        arraylist.add(gpuimagetonecurvefilter);
        arraylist.add(gpuimagesaturationfilter6);
        arraylist.add(gpuimagescreenblendfilter4);
        continue; /* Loop/switch isn't completed */
_L38:
        GPUImageToneCurveFilter gpuimagetonecurvefilter1 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter1.setFromCurveFileInputStream(e.getResources().openRawResource(i.A));
        GPUImageSaturationFilter gpuimagesaturationfilter7 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter7.setSaturation(f(-20));
        GPUImageHueFilter gpuimagehuefilter5 = new GPUImageHueFilter();
        gpuimagehuefilter5.setHue(3F);
        GPUImageLuminosityFilter gpuimageluminosityfilter6 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter6.setLuminosity(27);
        arraylist.add(gpuimagetonecurvefilter1);
        arraylist.add(gpuimageluminosityfilter6);
        arraylist.add(gpuimagesaturationfilter7);
        arraylist.add(gpuimagehuefilter5);
        continue; /* Loop/switch isn't completed */
_L39:
        GPUImageToneCurveFilter gpuimagetonecurvefilter2 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter2.setFromCurveFileInputStream(e.getResources().openRawResource(i.q));
        GPUImageSaturationFilter gpuimagesaturationfilter8 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter8.setSaturation(f(-17));
        GPUImageHueFilter gpuimagehuefilter6 = new GPUImageHueFilter();
        gpuimagehuefilter6.setHue(3F);
        GPUImageLuminosityFilter gpuimageluminosityfilter7 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter7.setLuminosity(20);
        arraylist.add(gpuimageluminosityfilter7);
        arraylist.add(gpuimagesaturationfilter8);
        arraylist.add(gpuimagehuefilter6);
        arraylist.add(gpuimagetonecurvefilter2);
        continue; /* Loop/switch isn't completed */
_L40:
        GPUImageToneCurveFilter gpuimagetonecurvefilter3 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter3.setFromCurveFileInputStream(e.getResources().openRawResource(i.aw));
        GPUImageSaturationFilter gpuimagesaturationfilter9 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter9.setSaturation(f(-22));
        GPUImageHueFilter gpuimagehuefilter7 = new GPUImageHueFilter();
        gpuimagehuefilter7.setHue(3F);
        GPUImageLuminosityFilter gpuimageluminosityfilter8 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter8.setLuminosity(27);
        arraylist.add(gpuimageluminosityfilter8);
        arraylist.add(gpuimagesaturationfilter9);
        arraylist.add(gpuimagehuefilter7);
        arraylist.add(gpuimagetonecurvefilter3);
        continue; /* Loop/switch isn't completed */
_L41:
        GPUImageToneCurveFilter gpuimagetonecurvefilter4 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter4.setFromCurveFileInputStream(e.getResources().openRawResource(i.i));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter3 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter3.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.bg, l1, l1 * l1));
        GPUImageNormalBlendColorFilter gpuimagenormalblendcolorfilter = new GPUImageNormalBlendColorFilter();
        gpuimagenormalblendcolorfilter.setColor("#773d0a", 0.12F);
        arraylist.add(gpuimagetonecurvefilter4);
        arraylist.add(gpuimagenormalblendcolorfilter);
        arraylist.add(gpuimageoverlayblendfilter3);
        continue; /* Loop/switch isn't completed */
_L42:
        GPUImageToneCurveFilter gpuimagetonecurvefilter5 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter5.setFromCurveFileInputStream(e.getResources().openRawResource(i.D));
        GPUImageSaturationFilter gpuimagesaturationfilter10 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter10.setSaturation(f(2));
        GPUImageHueFilter gpuimagehuefilter8 = new GPUImageHueFilter();
        gpuimagehuefilter8.setHue(18F);
        GPUImageLuminosityFilter gpuimageluminosityfilter9 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter9.setLuminosity(2);
        arraylist.add(gpuimageluminosityfilter9);
        arraylist.add(gpuimagesaturationfilter10);
        arraylist.add(gpuimagehuefilter8);
        arraylist.add(gpuimagetonecurvefilter5);
        continue; /* Loop/switch isn't completed */
_L43:
        GPUImageSaturationFilter gpuimagesaturationfilter1 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter1.setSaturation(f(20));
        GPUImageHueFilter gpuimagehuefilter1 = new GPUImageHueFilter();
        gpuimagehuefilter1.setHue(10F);
        GPUImageToneCurveFilter gpuimagetonecurvefilter25 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter25.setFromCurveFileInputStream(e.getResources().openRawResource(i.f));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter11 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter11.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        GPUImageScreenBlendFilter gpuimagescreenblendfilter6 = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter6.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.bf, l1, l1 * l1));
        b(gpuimagescreenblendfilter6);
        arraylist.add(gpuimagesaturationfilter1);
        arraylist.add(gpuimagehuefilter1);
        arraylist.add(gpuimagetonecurvefilter25);
        arraylist.add(gpuimagescreenblendfilter6);
        arraylist.add(gpuimageoverlayblendfilter11);
        continue; /* Loop/switch isn't completed */
_L44:
        GPUImageSaturationFilter gpuimagesaturationfilter2 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter2.setSaturation(f(-100));
        GPUImageToneCurveFilter gpuimagetonecurvefilter20 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter20.setFromCurveFileInputStream(e.getResources().openRawResource(i.c));
        arraylist.add(gpuimagetonecurvefilter20);
        arraylist.add(gpuimagesaturationfilter2);
        continue; /* Loop/switch isn't completed */
_L30:
        GPUImageSaturationFilter gpuimagesaturationfilter3 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter3.setSaturation(f(30));
        GPUImageToneCurveFilter gpuimagetonecurvefilter21 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter21.setFromCurveFileInputStream(e.getResources().openRawResource(i.z));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter10 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter10.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(gpuimagesaturationfilter3);
        arraylist.add(gpuimagetonecurvefilter21);
        arraylist.add(gpuimageoverlayblendfilter10);
        continue; /* Loop/switch isn't completed */
_L31:
        GPUImageToneCurveFilter gpuimagetonecurvefilter6 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter6.setFromCurveFileInputStream(e.getResources().openRawResource(i.F));
        GPUImageSaturationFilter gpuimagesaturationfilter11 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter11.setSaturation(f(10));
        GPUImageHueFilter gpuimagehuefilter9 = new GPUImageHueFilter();
        gpuimagehuefilter9.setHue(-10F);
        GPUImageOverlayColorBlendFilter gpuimageoverlaycolorblendfilter = new GPUImageOverlayColorBlendFilter();
        gpuimageoverlaycolorblendfilter.setColor("#957574");
        arraylist.add(gpuimagetonecurvefilter6);
        arraylist.add(gpuimagesaturationfilter11);
        arraylist.add(gpuimagehuefilter9);
        arraylist.add(gpuimageoverlaycolorblendfilter);
        continue; /* Loop/switch isn't completed */
_L32:
        GPUImageSaturationFilter gpuimagesaturationfilter4 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter4.setSaturation(f(20));
        GPUImageHueFilter gpuimagehuefilter2 = new GPUImageHueFilter();
        gpuimagehuefilter2.setHue(10F);
        GPUImageToneCurveFilter gpuimagetonecurvefilter26 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter26.setFromCurveFileInputStream(e.getResources().openRawResource(i.av));
        GPUImageOverlayColorBlendFilter gpuimageoverlaycolorblendfilter1 = new GPUImageOverlayColorBlendFilter();
        gpuimageoverlaycolorblendfilter1.setColor("#8c8168");
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter12 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter12.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(gpuimagesaturationfilter4);
        arraylist.add(gpuimagehuefilter2);
        arraylist.add(gpuimagetonecurvefilter26);
        arraylist.add(gpuimageoverlaycolorblendfilter1);
        arraylist.add(gpuimageoverlayblendfilter12);
        continue; /* Loop/switch isn't completed */
_L33:
        GPUImageHueFilter gpuimagehuefilter = new GPUImageHueFilter();
        gpuimagehuefilter.setHue(-2F);
        GPUImageToneCurveFilter gpuimagetonecurvefilter22 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter22.setFromCurveFileInputStream(e.getResources().openRawResource(i.h));
        arraylist.add(gpuimagehuefilter);
        arraylist.add(gpuimagetonecurvefilter22);
        continue; /* Loop/switch isn't completed */
_L34:
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        GPUImageSaturationFilter gpuimagesaturationfilter12 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter12.setSaturation(f(13));
        GPUImageHueFilter gpuimagehuefilter10 = new GPUImageHueFilter();
        gpuimagehuefilter10.setHue(18F);
        GPUImageToneCurveFilter gpuimagetonecurvefilter28 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter28.setFromCurveFileInputStream(e.getResources().openRawResource(i.e));
        arraylist.add(gpuimageoverlayblendfilter);
        arraylist.add(gpuimagehuefilter10);
        arraylist.add(gpuimagesaturationfilter12);
        arraylist.add(gpuimagetonecurvefilter28);
        continue; /* Loop/switch isn't completed */
_L35:
        GPUImageLuminosityFilter gpuimageluminosityfilter = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter.setLuminosity(6);
        GPUImageHueFilter gpuimagehuefilter3 = new GPUImageHueFilter();
        gpuimagehuefilter3.setHue(-10F);
        GPUImageSaturationFilter gpuimagesaturationfilter14 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter14.setSaturation(f(-10));
        GPUImageToneCurveFilter gpuimagetonecurvefilter29 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter29.setFromCurveFileInputStream(e.getResources().openRawResource(i.p));
        GPUImageScreenBlendFilter gpuimagescreenblendfilter7 = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter7.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.al, l1, l1 * l1));
        arraylist.add(gpuimageluminosityfilter);
        arraylist.add(gpuimagesaturationfilter14);
        arraylist.add(gpuimagehuefilter3);
        arraylist.add(gpuimagetonecurvefilter29);
        arraylist.add(gpuimagescreenblendfilter7);
        continue; /* Loop/switch isn't completed */
_L36:
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter1 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter1.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aP, l1, l1 * l1));
        a(((GPUImageTwoInputFilter) (gpuimageoverlayblendfilter1)));
        GPUImageToneCurveFilter gpuimagetonecurvefilter23 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter23.setFromCurveFileInputStream(e.getResources().openRawResource(i.C));
        arraylist.add(gpuimageoverlayblendfilter1);
        arraylist.add(gpuimagetonecurvefilter23);
        continue; /* Loop/switch isn't completed */
_L37:
        GPUImageToneCurveFilter gpuimagetonecurvefilter7 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter7.setFromCurveFileInputStream(e.getResources().openRawResource(i.a));
        GPUImageLuminosityFilter gpuimageluminosityfilter1 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter1.setLuminosity(-10);
        GPUImageSaturationFilter gpuimagesaturationfilter15 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter15.setSaturation(f(-100));
        arraylist.add(gpuimagetonecurvefilter7);
        arraylist.add(gpuimageluminosityfilter1);
        arraylist.add(gpuimagesaturationfilter15);
        continue; /* Loop/switch isn't completed */
_L23:
        GPUImageToneCurveFilter gpuimagetonecurvefilter8 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter8.setFromCurveFileInputStream(e.getResources().openRawResource(i.y));
        GPUImageLuminosityFilter gpuimageluminosityfilter2 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter2.setLuminosity(-5);
        GPUImageSaturationFilter gpuimagesaturationfilter16 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter16.setSaturation(f(14));
        GPUImageNormalBlendColorFilter gpuimagenormalblendcolorfilter2 = new GPUImageNormalBlendColorFilter();
        gpuimagenormalblendcolorfilter2.setColor("#fcc5b5", 0.27F);
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter13 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter13.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aI, l1, l1 * l1));
        arraylist.add(gpuimagetonecurvefilter8);
        arraylist.add(gpuimageluminosityfilter2);
        arraylist.add(gpuimagesaturationfilter16);
        arraylist.add(gpuimagenormalblendcolorfilter2);
        arraylist.add(gpuimageoverlayblendfilter13);
        continue; /* Loop/switch isn't completed */
_L24:
        GPUImageToneCurveFilter gpuimagetonecurvefilter9 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter9.setFromCurveFileInputStream(e.getResources().openRawResource(i.E));
        GPUImageScreenBlendFilter gpuimagescreenblendfilter3 = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter3.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aS, l1, l1 * l1));
        b(gpuimagescreenblendfilter3);
        arraylist.add(gpuimagetonecurvefilter9);
        arraylist.add(gpuimagescreenblendfilter3);
        continue; /* Loop/switch isn't completed */
_L25:
        GPUImageToneCurveFilter gpuimagetonecurvefilter10 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter10.setFromCurveFileInputStream(e.getResources().openRawResource(i.au));
        GPUImageLuminosityFilter gpuimageluminosityfilter3 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter3.setLuminosity(-3);
        GPUImageSaturationFilter gpuimagesaturationfilter17 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter17.setSaturation(f(12));
        GPUImageScreenBlendFilter gpuimagescreenblendfilter5 = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter5.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.bm, l1, l1 * l1));
        b(gpuimagescreenblendfilter5);
        arraylist.add(gpuimagetonecurvefilter10);
        arraylist.add(gpuimageluminosityfilter3);
        arraylist.add(gpuimagesaturationfilter17);
        arraylist.add(gpuimagescreenblendfilter5);
        continue; /* Loop/switch isn't completed */
_L26:
        (new GPUImageLuminosityFilter()).setLuminosity(9);
        GPUImageSaturationFilter gpuimagesaturationfilter5 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter5.setSaturation(f(-12));
        GPUImageHueFilter gpuimagehuefilter4 = new GPUImageHueFilter();
        gpuimagehuefilter4.setHue(10F);
        GPUImageToneCurveFilter gpuimagetonecurvefilter27 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter27.setFromCurveFileInputStream(e.getResources().openRawResource(i.d));
        GPUImageNormalBlendColorFilter gpuimagenormalblendcolorfilter3 = new GPUImageNormalBlendColorFilter();
        gpuimagenormalblendcolorfilter3.setColor("#85ecff", 0.12F);
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter14 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter14.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.i, l1, l1 * l1));
        a(((GPUImageTwoInputFilter) (gpuimageoverlayblendfilter14)));
        arraylist.add(gpuimagesaturationfilter5);
        arraylist.add(gpuimagehuefilter4);
        arraylist.add(gpuimagetonecurvefilter27);
        arraylist.add(gpuimagenormalblendcolorfilter3);
        arraylist.add(gpuimageoverlayblendfilter14);
        continue; /* Loop/switch isn't completed */
_L27:
        GPUImageScreenBlendFilter gpuimagescreenblendfilter = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aj, l1, l1 * l1));
        a(((GPUImageTwoInputFilter) (gpuimagescreenblendfilter)));
        GPUImageToneCurveFilter gpuimagetonecurvefilter24 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter24.setFromCurveFileInputStream(e.getResources().openRawResource(i.o));
        arraylist.add(gpuimagescreenblendfilter);
        arraylist.add(gpuimagetonecurvefilter24);
        continue; /* Loop/switch isn't completed */
_L28:
        GPUImageScreenBlendFilter gpuimagescreenblendfilter1 = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter1.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aN, l1, l1 * l1));
        a(((GPUImageTwoInputFilter) (gpuimagescreenblendfilter1)));
        GPUImageLuminosityFilter gpuimageluminosityfilter4 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter4.setLuminosity(14);
        GPUImageSaturationFilter gpuimagesaturationfilter18 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter18.setSaturation(f(-20));
        GPUImageToneCurveFilter gpuimagetonecurvefilter30 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter30.setFromCurveFileInputStream(e.getResources().openRawResource(i.B));
        arraylist.add(gpuimagescreenblendfilter1);
        arraylist.add(gpuimageluminosityfilter4);
        arraylist.add(gpuimagesaturationfilter18);
        arraylist.add(gpuimagetonecurvefilter30);
        continue; /* Loop/switch isn't completed */
_L29:
        GPUImageToneCurveFilter gpuimagetonecurvefilter11 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter11.setFromCurveFileInputStream(e.getResources().openRawResource(i.b));
        GPUImageSaturationFilter gpuimagesaturationfilter13 = new GPUImageSaturationFilter();
        gpuimagesaturationfilter13.setSaturation(f(-100));
        GPUImageLuminosityFilter gpuimageluminosityfilter5 = new GPUImageLuminosityFilter();
        gpuimageluminosityfilter5.setLuminosity(33);
        arraylist.add(gpuimageluminosityfilter5);
        arraylist.add(gpuimagesaturationfilter13);
        arraylist.add(gpuimagetonecurvefilter11);
        continue; /* Loop/switch isn't completed */
_L2:
        GPUImageToneCurveFilter gpuimagetonecurvefilter12 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter12.setFromCurveFileInputStream(e.getResources().openRawResource(i.m));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter4 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter4.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(gpuimageoverlayblendfilter4);
        arraylist.add(gpuimagetonecurvefilter12);
        continue; /* Loop/switch isn't completed */
_L3:
        GPUImageToneCurveFilter gpuimagetonecurvefilter13 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter13.setFromCurveFileInputStream(e.getResources().openRawResource(i.at));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter5 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter5.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(gpuimageoverlayblendfilter5);
        arraylist.add(gpuimagetonecurvefilter13);
        continue; /* Loop/switch isn't completed */
_L4:
        GPUImageToneCurveFilter gpuimagetonecurvefilter14 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter14.setFromCurveFileInputStream(e.getResources().openRawResource(i.K));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter6 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter6.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(gpuimageoverlayblendfilter6);
        arraylist.add(gpuimagetonecurvefilter14);
        continue; /* Loop/switch isn't completed */
_L5:
        GPUImageToneCurveFilter gpuimagetonecurvefilter15 = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter15.setFromCurveFileInputStream(e.getResources().openRawResource(i.ar));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter7 = new GPUImageOverlayBlendFilter();
        gpuimageoverlayblendfilter7.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aY, l1, l1 * l1));
        arraylist.add(gpuimageoverlayblendfilter7);
        arraylist.add(gpuimagetonecurvefilter15);
        continue; /* Loop/switch isn't completed */
_L6:
        Object obj = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj);
        obj = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj)).setFromCurveFileInputStream(e.getResources().openRawResource(i.t));
        arraylist.add(obj);
        arraylist.add(new GPUImageSaturationFilter(0.5F));
        continue; /* Loop/switch isn't completed */
_L7:
        Object obj1 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj1)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aY, l1, l1 * l1));
        arraylist.add(obj1);
        obj1 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj1)).setFromCurveFileInputStream(e.getResources().openRawResource(i.k));
        arraylist.add(obj1);
        continue; /* Loop/switch isn't completed */
_L8:
        Object obj2 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj2)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aY, l1, l1 * l1));
        arraylist.add(obj2);
        obj2 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj2)).setFromCurveFileInputStream(e.getResources().openRawResource(i.s));
        arraylist.add(obj2);
        continue; /* Loop/switch isn't completed */
_L9:
        Object obj3 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj3)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj3);
        obj3 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj3)).setFromCurveFileInputStream(e.getResources().openRawResource(i.n));
        arraylist.add(obj3);
        continue; /* Loop/switch isn't completed */
_L10:
        arraylist.add(new GPUImageSaturationFilter(0.0F));
        Object obj4 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj4)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aY, l1, l1 * l1));
        arraylist.add(obj4);
        obj4 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj4)).setFromCurveFileInputStream(e.getResources().openRawResource(i.H));
        arraylist.add(obj4);
        continue; /* Loop/switch isn't completed */
_L11:
        arraylist.add(new GPUImageSaturationFilter(0.0F));
        Object obj5 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj5)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj5);
        obj5 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj5)).setFromCurveFileInputStream(e.getResources().openRawResource(i.g));
        arraylist.add(obj5);
        continue; /* Loop/switch isn't completed */
_L12:
        arraylist.add(new GPUImageSaturationFilter(0.0F));
        Object obj6 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj6)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj6);
        obj6 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj6)).setFromCurveFileInputStream(e.getResources().openRawResource(i.G));
        arraylist.add(obj6);
        continue; /* Loop/switch isn't completed */
_L13:
        arraylist.add(new GPUImageSaturationFilter(0.0F));
        Object obj7 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj7)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj7);
        obj7 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj7)).setFromCurveFileInputStream(e.getResources().openRawResource(i.x));
        arraylist.add(obj7);
        continue; /* Loop/switch isn't completed */
_L14:
        arraylist.add(new GPUImageSaturationFilter(0.0F));
        Object obj8 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj8)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj8);
        obj8 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj8)).setFromCurveFileInputStream(e.getResources().openRawResource(i.r));
        arraylist.add(obj8);
        continue; /* Loop/switch isn't completed */
_L15:
        Object obj9 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj9)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj9);
        obj9 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj9)).setFromCurveFileInputStream(e.getResources().openRawResource(i.u));
        arraylist.add(obj9);
        continue; /* Loop/switch isn't completed */
_L16:
        arraylist.add(new GPUImageSaturationFilter(1.4F));
        Object obj10 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj10)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj10);
        obj10 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj10)).setFromCurveFileInputStream(e.getResources().openRawResource(i.l));
        arraylist.add(obj10);
        continue; /* Loop/switch isn't completed */
_L17:
        Object obj11 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj11)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj11);
        arraylist.add(new GPUImageSaturationFilter(0.8F));
        obj11 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj11)).setFromCurveFileInputStream(e.getResources().openRawResource(i.J));
        arraylist.add(obj11);
        continue; /* Loop/switch isn't completed */
_L18:
        Object obj12 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj12)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aX, l1, l1 * l1));
        arraylist.add(obj12);
        obj12 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj12)).setFromCurveFileInputStream(e.getResources().openRawResource(i.j));
        arraylist.add(obj12);
        continue; /* Loop/switch isn't completed */
_L19:
        arraylist.add(new GPUImageSaturationFilter(0.5F));
        Object obj13 = new GPUImageOverlayBlendFilter();
        ((GPUImageTwoInputFilter) (obj13)).setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.aY, l1, l1 * l1));
        arraylist.add(obj13);
        obj13 = new GPUImageToneCurveFilter();
        ((GPUImageToneCurveFilter) (obj13)).setFromCurveFileInputStream(e.getResources().openRawResource(i.v));
        arraylist.add(obj13);
        continue; /* Loop/switch isn't completed */
_L20:
        arraylist.add(new GPUImageSketchFilter(j1, k1, flag));
        continue; /* Loop/switch isn't completed */
_L21:
        arraylist.add(new GPUImageSimpleSketchFilter(j1, k1));
        if (g != null)
        {
            GPUImageToneCurveFilter gpuimagetonecurvefilter16 = new GPUImageToneCurveFilter();
            gpuimagetonecurvefilter16.setFromCurveFileInputStream(g);
            arraylist.add(gpuimagetonecurvefilter16);
        }
        if (i != null && !i.isRecycled())
        {
            GPUImageScreenBlendFilter gpuimagescreenblendfilter2 = new GPUImageScreenBlendFilter();
            gpuimagescreenblendfilter2.setBitmap(i);
            arraylist.add(gpuimagescreenblendfilter2);
        }
        if (h != null && !h.isRecycled())
        {
            GPUImageMultiplyBlendFilter gpuimagemultiplyblendfilter1 = new GPUImageMultiplyBlendFilter();
            gpuimagemultiplyblendfilter1.setBitmap(h);
            arraylist.add(gpuimagemultiplyblendfilter1);
        }
        continue; /* Loop/switch isn't completed */
_L22:
        if (h != null && !h.isRecycled())
        {
            GPUImageOverlayBlendFilter gpuimageoverlayblendfilter2 = new GPUImageOverlayBlendFilter();
            gpuimageoverlayblendfilter2.setBitmap(h);
            arraylist.add(gpuimageoverlayblendfilter2);
        }
        if (g != null)
        {
            GPUImageToneCurveFilter gpuimagetonecurvefilter17 = new GPUImageToneCurveFilter();
            gpuimagetonecurvefilter17.setFromCurveFileInputStream(g);
            arraylist.add(gpuimagetonecurvefilter17);
        }
        if (true) goto _L1; else goto _L48
_L48:
    }

    public final GPUImageFilter a(CloudFilterInfo cloudfilterinfo, int i1, int j1, b b1)
    {
        com.roidapp.imagelib.filter.a.b b2;
        i1 = Math.min(i1, j1);
        b2 = new com.roidapp.imagelib.filter.a.b();
        b2.a(0, Integer.valueOf(i1));
        b2.a(1, Integer.valueOf(i1 * i1));
        cloudfilterinfo.b;
        JVM INSTR tableswitch 1021 1023: default 68
    //                   1021 76
    //                   1022 93
    //                   1023 110;
           goto _L1 _L2 _L3 _L4
_L1:
        cloudfilterinfo = null;
_L6:
        if (cloudfilterinfo == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        cloudfilterinfo = new com.roidapp.imagelib.filter.a.a.b(this, e, cloudfilterinfo);
        continue; /* Loop/switch isn't completed */
_L3:
        cloudfilterinfo = new com.roidapp.imagelib.filter.a.a.a(this, e, cloudfilterinfo);
        continue; /* Loop/switch isn't completed */
_L4:
        cloudfilterinfo = new com.roidapp.imagelib.filter.a.a.c(this, e, cloudfilterinfo);
        if (true) goto _L6; else goto _L5
_L5:
        cloudfilterinfo = cloudfilterinfo.a(b2);
        if (n)
        {
            GPUImageMultiplyBlendFilter gpuimagemultiplyblendfilter = new GPUImageMultiplyBlendFilter();
            gpuimagemultiplyblendfilter.setBitmap(com.roidapp.imagelib.b.d.a(e.getResources(), f.ae, i1, i1 * i1));
            cloudfilterinfo.add(0, gpuimagemultiplyblendfilter);
        }
        if (j)
        {
            cloudfilterinfo.add(b(b1));
        }
        if (m)
        {
            cloudfilterinfo.add(h(cloudfilterinfo.size()));
        }
        if (k && cloudfilterinfo.size() % 2 == 0)
        {
            cloudfilterinfo.add(new GPUImageFilter());
        }
        return new GPUImageFilterGroup(cloudfilterinfo);
    }

    public final void a(int i1)
    {
        p = i1;
    }

    public final void a(int i1, boolean flag, boolean flag1)
    {
        q = i1;
        r = flag;
        s = flag1;
    }

    public final void a(b b1)
    {
        c = b1;
    }

    public final void a(b b1, int i1)
    {
        c = b1;
        b = i1;
    }

    public final void a(IFilterInfo ifilterinfo)
    {
        a = ifilterinfo;
    }

    public final void a(InputStream inputstream)
    {
        g = inputstream;
    }

    public final void a(String s1)
    {
        if (s1 != null)
        {
            try
            {
                h = com.roidapp.imagelib.b.d.a(s1, o[0].intValue(), o[0].intValue() * o[0].intValue());
                return;
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                com.roidapp.imagelib.b.c.a(h);
                try
                {
                    h = com.roidapp.imagelib.b.d.a(s1, o[1].intValue(), o[1].intValue() * o[1].intValue());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.roidapp.imagelib.b.c.a(h);
                    s1.printStackTrace();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.roidapp.imagelib.b.c.a(h);
                }
                s1.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.roidapp.imagelib.b.c.a(h);
            }
            s1.printStackTrace();
            return;
        } else
        {
            h = null;
            return;
        }
    }

    public final void a(GPUImageFilter gpuimagefilter)
    {
        d = gpuimagefilter;
    }

    public final void a(GPUImageTwoInputFilter gpuimagetwoinputfilter)
    {
        Rotation rotation;
        boolean flag;
        flag = false;
        rotation = Rotation.NORMAL;
        q;
        JVM INSTR lookupswitch 3: default 44
    //                   90: 69
    //                   180: 76
    //                   270: 83;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_83;
_L5:
        if (k)
        {
            if (n)
            {
                gpuimagetwoinputfilter.setRotation(rotation, r, true);
                return;
            }
            if (!r)
            {
                flag = true;
            }
            gpuimagetwoinputfilter.setRotation(rotation, flag, true);
            return;
        } else
        if (l)
        {
            if (n)
            {
                gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, true);
                return;
            } else
            {
                gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, false);
                return;
            }
        } else
        {
            gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, false);
            return;
        }
_L2:
        rotation = Rotation.ROTATION_90;
          goto _L5
_L3:
        rotation = Rotation.ROTATION_180;
          goto _L5
        rotation = Rotation.ROTATION_270;
          goto _L5
    }

    public final void a(boolean flag)
    {
        k = flag;
    }

    public final void b()
    {
        j = false;
    }

    public final void b(int i1)
    {
        b = i1;
    }

    public final void b(String s1)
    {
        if (s1 != null)
        {
            try
            {
                i = com.roidapp.imagelib.b.d.a(s1, o[0].intValue(), o[0].intValue() * o[0].intValue());
                return;
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                com.roidapp.imagelib.b.c.a(h);
                try
                {
                    i = com.roidapp.imagelib.b.d.a(s1, o[1].intValue(), o[1].intValue() * o[1].intValue());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.roidapp.imagelib.b.c.a(i);
                    s1.printStackTrace();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.roidapp.imagelib.b.c.a(i);
                }
                s1.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.roidapp.imagelib.b.c.a(i);
            }
            s1.printStackTrace();
            return;
        } else
        {
            i = null;
            return;
        }
    }

    public final void b(GPUImageTwoInputFilter gpuimagetwoinputfilter)
    {
        Rotation rotation;
        boolean flag;
        flag = false;
        rotation = Rotation.NORMAL;
        q;
        JVM INSTR lookupswitch 3: default 44
    //                   90: 75
    //                   180: 82
    //                   270: 89;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_89;
_L5:
        if (k)
        {
            if (n)
            {
                if (!r)
                {
                    flag = true;
                }
                gpuimagetwoinputfilter.setRotation(rotation, flag, true);
                return;
            } else
            {
                gpuimagetwoinputfilter.setRotation(rotation, r, true);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_107;
_L2:
        rotation = Rotation.ROTATION_90;
          goto _L5
_L3:
        rotation = Rotation.ROTATION_180;
          goto _L5
        rotation = Rotation.ROTATION_270;
          goto _L5
        if (l)
        {
            if (n)
            {
                if (h.c == h.a)
                {
                    gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, false);
                    return;
                } else
                {
                    gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, false);
                    return;
                }
            }
            if (h.c != h.a)
            {
                gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, true);
                return;
            }
        } else
        if (n)
        {
            gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, false);
            return;
        }
        gpuimagetwoinputfilter.setRotation(Rotation.NORMAL, false, true);
        return;
    }

    public final void b(boolean flag)
    {
        n = flag;
    }

    public final void c()
    {
        l = true;
    }

    public final void c(String s1)
    {
        if (s1.equalsIgnoreCase("sketch_filter"))
        {
            b = 20;
            return;
        }
        if (s1.equalsIgnoreCase("color_filter"))
        {
            b = 21;
            return;
        } else
        {
            b = 0;
            return;
        }
    }

    public final void c(boolean flag)
    {
        f = flag;
    }

    public final boolean d()
    {
        return n;
    }

    public final void e()
    {
        m = true;
    }

    public final int f()
    {
        return b;
    }

    public final b g()
    {
        return c;
    }

    public final GPUImageFilter h()
    {
        return d;
    }

    public final IFilterInfo i()
    {
        return a;
    }

    public final void j()
    {
        if (d != null && (d instanceof GPUImageFilterGroup))
        {
            Iterator iterator = ((GPUImageFilterGroup)d).getFilters().iterator();
            while (iterator.hasNext()) 
            {
                GPUImageFilter gpuimagefilter = (GPUImageFilter)iterator.next();
                if (gpuimagefilter instanceof GPUImageAlphaBlendFilter)
                {
                    ((GPUImageAlphaBlendFilter)gpuimagefilter).setMix(1.0F - (float)p / 100F);
                }
            }
        }
    }

}
