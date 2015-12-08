// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import kik.android.util.bx;
import kik.android.widget.w;

// Referenced classes of package com.kik.cache:
//            ContactImageView, az, ba

public class SoftwareContactImageView extends ContactImageView
{

    private Paint a;
    private Paint b;

    public SoftwareContactImageView(Context context)
    {
        super(context);
        a = new az(this);
        b = new ba(this);
        g();
    }

    public SoftwareContactImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new az(this);
        b = new ba(this);
        g();
    }

    public SoftwareContactImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new az(this);
        b = new ba(this);
        g();
    }

    private void g()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setLayerType(1, null);
        }
    }

    protected final w a(Bitmap bitmap, String s)
    {
        if (b() || bitmap == null || !a())
        {
            return super.a(bitmap, s);
        }
        Object obj;
        try
        {
            obj = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(((Bitmap) (obj)));
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, a);
            canvas.drawCircle(bitmap.getWidth() - bitmap.getWidth() / 8, bitmap.getHeight() - bitmap.getHeight() / 8, bitmap.getWidth() / 6, b);
            obj = super.a(((Bitmap) (obj)), s);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            bx.a(outofmemoryerror);
            return super.a(bitmap, s);
        }
        return ((w) (obj));
    }
}
