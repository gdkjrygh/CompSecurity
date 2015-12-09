// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

// Referenced classes of package com.miteksystems.misnap:
//            r, c

final class b
{

    private int a[];
    private int b;
    private boolean c;
    private boolean d;
    private SoftReference e;
    private Handler f;
    private int g;
    private long h;
    private Bitmap i;
    private android.graphics.BitmapFactory.Options j;

    b(ImageView imageview, int ai[], int k)
    {
        i = null;
        f = new Handler();
        a = ai;
        b = 0;
        e = new SoftReference(imageview);
        c = false;
        d = false;
        g = 1000 / k;
        h = System.currentTimeMillis();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            j = new android.graphics.BitmapFactory.Options();
            j.inBitmap = i;
            j.inInputShareable = true;
            j.inPurgeable = true;
            j.inSampleSize = 1;
            i = BitmapFactory.decodeResource(imageview.getResources(), a[0], j);
            imageview.setImageBitmap(i);
            return;
        } else
        {
            imageview.setImageResource(a[0]);
            return;
        }
    }

    static void a(b b1, Runnable runnable)
    {
        b1.a(runnable);
    }

    private void a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        int l;
        l = a[b];
        k = b + 1;
        b = k;
        if (k < a.length) goto _L2; else goto _L1
_L1:
        c = false;
        k = -1;
_L7:
        if (c) goto _L4; else goto _L3
_L3:
        d = false;
_L9:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        k = (int)(System.currentTimeMillis() - h) / g;
        if (b >= a.length - 2 || k - 2 <= b) goto _L6; else goto _L5
_L5:
        if (k > a.length)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        k -= 2;
_L8:
        (new StringBuilder("skipping ")).append(k - b).append(" frames").toString();
        b = k;
_L6:
        k = a[b];
          goto _L7
        k = a.length - 2;
          goto _L8
_L4:
        ImageView imageview = (ImageView)e.get();
        if (imageview != null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        d = false;
          goto _L9
        runnable;
        throw runnable;
        f.postDelayed(runnable, g - 10);
        runnable = imageview.getResources();
        if (l != k)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        boolean flag = r.a;
          goto _L9
        if (i != null)
        {
            boolean flag1 = r.a;
            i = BitmapFactory.decodeResource(runnable, k, j);
            imageview.setImageBitmap(i);
            imageview.postInvalidate();
        }
        if (i != null) goto _L9; else goto _L10
_L10:
        boolean flag2 = r.a;
        imageview.setImageResource(k);
          goto _L9
        runnable;
        if (r.a)
        {
            runnable.printStackTrace();
        }
        if (i != null)
        {
            i.recycle();
            i = null;
        }
        if (i != null) goto _L9; else goto _L11
_L11:
        boolean flag3 = r.a;
        imageview.setImageResource(k);
          goto _L9
        runnable;
        if (i == null)
        {
            boolean flag4 = r.a;
            imageview.setImageResource(k);
        }
        throw runnable;
          goto _L7
    }

    final boolean a()
    {
        return d;
    }

    final void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        c = true;
        flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = true;
        c c1 = new c(this);
        f.post(c1);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        this;
        JVM INSTR monitorenter ;
        d = false;
        c = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
