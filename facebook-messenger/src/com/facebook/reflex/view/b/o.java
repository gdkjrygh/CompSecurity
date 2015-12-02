// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.reflex.a;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.reflex.view.b:
//            n

class o
    implements a
{

    private String a;
    private int b;
    private int c;
    private Bitmap d;
    private Canvas e;
    private boolean f;
    private int g;

    private o()
    {
        a = "";
        b = 0x80000000;
        c = 0x80000000;
        f = false;
        g = 0;
    }

    o(n n)
    {
        this();
    }

    public Bitmap a(int i, int j)
    {
        if (i <= b && j <= c)
        {
            boolean flag;
            if (!f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Trying to take canvas that is already taken");
            f = true;
            if (d == null)
            {
                d = Bitmap.createBitmap(b, c, android.graphics.Bitmap.Config.ARGB_8888);
                e = new Canvas(d);
            } else
            {
                e.clipRect(0.0F, 0.0F, i, j, android.graphics.Region.Op.REPLACE);
                e.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            }
            return d;
        } else
        {
            return Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
    }

    public void a(Context context)
    {
        if (b == 0x80000000)
        {
            context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            point.x = context.getWidth();
            point.y = context.getHeight();
            b = Math.max(point.x, point.y);
            c = Math.max(point.x, point.y);
        }
    }

    public void a(Bitmap bitmap)
    {
        if (bitmap != d)
        {
            bitmap.recycle();
            return;
        } else
        {
            f = false;
            return;
        }
    }
}
