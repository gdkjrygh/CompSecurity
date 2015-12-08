// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.RemoteException;
import android.view.TextureView;
import android.view.View;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.h;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            aq, bg

public abstract class a
    implements aq
{

    public final View a;
    public final Executor b;
    private final boolean c;
    private final View d;
    private final View e;
    private final bg f;

    public a(View view, View view1, View view2, boolean flag, Executor executor, bg bg1)
    {
        a = view;
        d = view1;
        e = view2;
        c = flag;
        b = executor;
        f = bg1;
    }

    public abstract void a(Bitmap bitmap, h h1);

    public final void a(Bitmap bitmap, boolean flag)
    {
        bitmap = new Canvas(bitmap);
        d.draw(bitmap);
        if (flag)
        {
            e.draw(bitmap);
        }
    }

    public final void a(h h1, Bitmap bitmap)
    {
        boolean flag;
        if (!f.a(0x3d0900))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                h1.a(bitmap);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (h h1)
            {
                throw new RuntimeRemoteException(h1);
            }
        }
        h1.a(com.google.android.m4b.maps.da.d.a(bitmap));
        return;
    }

    public final void b(Bitmap bitmap, h h1)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = a.getWidth();
        j = a.getHeight();
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
_L7:
        if (!c) goto _L4; else goto _L3
_L3:
        b.execute(new Runnable(bitmap1, h1) {

            private Bitmap a;
            private boolean b;
            private h c;
            private a d;

            public final void run()
            {
                int k = d.a.getWidth();
                int l = d.a.getHeight();
                Bitmap bitmap2;
                if (a.getWidth() != k || a.getHeight() != l)
                {
                    bitmap2 = Bitmap.createBitmap(k, l, android.graphics.Bitmap.Config.ARGB_8888);
                } else
                {
                    bitmap2 = a;
                }
                ((TextureView)d.a).getBitmap(bitmap2);
                d.a(bitmap2, b);
                d.a(c, bitmap2);
            }

            
            {
                d = a.this;
                a = bitmap;
                b = false;
                c = h1;
                super();
            }
        });
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (bitmap.getWidth() != i) goto _L6; else goto _L5
_L5:
        bitmap1 = bitmap;
        if (bitmap.getHeight() == j) goto _L7; else goto _L6
_L6:
        ab.a(5, "The Bitmap provided in the snapshot() method does not match the map's dimensions, hence another Bitmap is allocated with the right dimensions. If you think this is due to the fact that the map was resized, you can ignore this message. Otherwise, you should check the dimensions of the Bitmap passed to the method.");
        bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
          goto _L7
_L4:
        a(bitmap1, h1);
          goto _L8
        bitmap;
        throw bitmap;
          goto _L7
    }
}
