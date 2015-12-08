// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.sensors.CameraManager;

// Referenced classes of package com.google.android.apps.unveil.ui:
//            a, b

public class CameraWrappingLayout extends FrameLayout
{

    Alignment a;
    private final af b;
    private CameraManager c;
    private b d;
    private int e;
    private boolean f;
    private ScaleType g;
    private Matrix h;
    private boolean i;

    public CameraWrappingLayout(Context context)
    {
        super(context);
        b = new af();
        f = true;
        a = Alignment.TOP;
        g = ScaleType.FIT;
        i = false;
    }

    public CameraWrappingLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new af();
        f = true;
        a = Alignment.TOP;
        g = ScaleType.FIT;
        i = false;
    }

    public CameraWrappingLayout(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = new af();
        f = true;
        a = Alignment.TOP;
        g = ScaleType.FIT;
        i = false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        c.onConfigurationChanged(configuration);
    }

    public void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        if (f) goto _L2; else goto _L1
_L1:
        b.e("onLayout not enabled. Skipping camera initialization.", new Object[0]);
        super.onLayout(flag, j, k, l, i1);
_L14:
        return;
_L2:
        Object obj2;
        b.b("onLayout: %b, %d, %d, %d, %d", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1)
        });
        if (!flag && c.h)
        {
            b.b("Already previewing or no layout needed, but recursing anyway.", new Object[0]);
        }
        obj2 = new Size(l - j, i1 - k);
        b.b("Full view size: %s", new Object[] {
            obj2
        });
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        c.setFullScreenDisplaySize(((Size) (obj2)));
        if (e != 90 && e != 270)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = c.a(((Size) (obj2)).height, ((Size) (obj2)).width);
_L4:
        if (obj == null)
        {
            b.c("Preview size was null!", new Object[0]);
            super.onLayout(flag, j, k, l, i1);
            return;
        }
        break MISSING_BLOCK_LABEL_263;
        obj = c.a(((Size) (obj2)).width, ((Size) (obj2)).height);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        j = e;
        if (g == ScaleType.FILL)
        {
            obj1 = obj2;
        } else
        {
            float f1;
            if (j == 90 || j == 270)
            {
                f1 = (float)((Size) (obj)).height / (float)((Size) (obj)).width;
            } else
            {
                f1 = (float)((Size) (obj)).width / (float)((Size) (obj)).height;
            }
            if (f1 > (float)((Size) (obj2)).width / (float)((Size) (obj2)).height)
            {
                j = ((Size) (obj2)).width;
                k = (int)((float)((Size) (obj2)).width / f1);
            } else
            {
                j = (int)(f1 * (float)((Size) (obj2)).height);
                k = ((Size) (obj2)).height;
            }
            obj1 = new Size(j, k);
        }
        k = (((Size) (obj2)).width - ((Size) (obj1)).width) / 2;
        l = (((Size) (obj2)).height - ((Size) (obj1)).height) / 2;
        h = ImageUtils.a(((Size) (obj)), ((Size) (obj1)), e);
        if (i)
        {
            obj2 = new Matrix();
            ((Matrix) (obj2)).postScale(-1F, 1.0F);
            ((Matrix) (obj2)).postTranslate(((Size) (obj)).width, 0.0F);
            h.preConcat(((Matrix) (obj2)));
        }
        a.a[a.ordinal()];
        JVM INSTR tableswitch 1 3: default 412
    //                   1 673
    //                   2 687
    //                   3 435;
           goto _L5 _L6 _L7 _L8
_L5:
        b.e("Error: unsupported alignment %s", new Object[] {
            a.name()
        });
_L8:
        h.postTranslate(k, l);
_L11:
        j = 0;
_L10:
        if (j >= getChildCount())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = getChildAt(j);
        switch (a.a[a.ordinal()])
        {
        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_727;

        default:
            b.e("Error: unsupported alignment %s", new Object[] {
                a.name()
            });
            // fall through

        case 3: // '\003'
            ((View) (obj)).layout(k, l, ((Size) (obj1)).width + k, ((Size) (obj1)).height + l);
            break;
        }
_L12:
        j++;
        if (true) goto _L10; else goto _L9
_L6:
        h.postTranslate(k, 0.0F);
          goto _L11
_L7:
        h.postTranslate(k, l << 1);
          goto _L11
_L9:
        ((View) (obj)).layout(k, 0, ((Size) (obj1)).width + k, ((Size) (obj1)).height);
          goto _L12
        ((View) (obj)).layout(k, l << 1, ((Size) (obj1)).width + k, (l << 1) + ((Size) (obj1)).height);
          goto _L12
        if (d == null) goto _L14; else goto _L13
_L13:
        d.a(((Size) (obj1)), h);
        return;
    }

    public void setAlignment(Alignment alignment)
    {
        a = alignment;
    }

    public void setCameraLayoutHandler(b b1)
    {
        d = b1;
    }

    public void setCameraManager(CameraManager cameramanager)
    {
        c = cameramanager;
    }

    public void setMirrored(boolean flag)
    {
        i = flag;
    }

    public void setRotation(int j)
    {
        e = j;
    }

    public void setScaleType(ScaleType scaletype)
    {
        g = scaletype;
    }

    private class Alignment extends Enum
    {

        public static final Alignment BOTTOM;
        public static final Alignment CENTER;
        public static final Alignment TOP;
        private static final Alignment a[];

        public static Alignment valueOf(String s)
        {
            return (Alignment)Enum.valueOf(com/google/android/apps/unveil/ui/CameraWrappingLayout$Alignment, s);
        }

        public static Alignment[] values()
        {
            return (Alignment[])a.clone();
        }

        static 
        {
            TOP = new Alignment("TOP", 0);
            CENTER = new Alignment("CENTER", 1);
            BOTTOM = new Alignment("BOTTOM", 2);
            a = (new Alignment[] {
                TOP, CENTER, BOTTOM
            });
        }

        private Alignment(String s, int j)
        {
            super(s, j);
        }
    }


    private class ScaleType extends Enum
    {

        public static final ScaleType FILL;
        public static final ScaleType FIT;
        private static final ScaleType a[];

        public static ScaleType valueOf(String s)
        {
            return (ScaleType)Enum.valueOf(com/google/android/apps/unveil/ui/CameraWrappingLayout$ScaleType, s);
        }

        public static ScaleType[] values()
        {
            return (ScaleType[])a.clone();
        }

        static 
        {
            FIT = new ScaleType("FIT", 0);
            FILL = new ScaleType("FILL", 1);
            a = (new ScaleType[] {
                FIT, FILL
            });
        }

        private ScaleType(String s, int j)
        {
            super(s, j);
        }
    }

}
