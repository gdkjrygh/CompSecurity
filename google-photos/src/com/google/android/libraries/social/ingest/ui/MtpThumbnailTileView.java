// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.mtp.MtpDevice;
import android.util.AttributeSet;
import android.widget.Checkable;
import b;
import ndg;
import ndh;

// Referenced classes of package com.google.android.libraries.social.ingest.ui:
//            MtpImageView

public final class MtpThumbnailTileView extends MtpImageView
    implements Checkable
{

    private Paint a;
    private boolean b;
    private Bitmap c;

    public MtpThumbnailTileView(Context context)
    {
        super(context);
        c();
    }

    public MtpThumbnailTileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c();
    }

    public MtpThumbnailTileView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c();
    }

    private void c()
    {
        a = new Paint();
        a.setColor(getResources().getColor(b.Fr));
    }

    protected final Object a(MtpDevice mtpdevice, ndg ndg)
    {
        return ndh.a(mtpdevice, ndg);
    }

    protected final void a()
    {
        super.a();
        if (c != null)
        {
            ndh.a(c);
            c = null;
        }
    }

    protected final void a(Object obj)
    {
        c = (Bitmap)obj;
        setImageBitmap(c);
    }

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (isChecked())
        {
            canvas.drawRect(canvas.getClipBounds(), a);
        }
    }

    public final boolean isChecked()
    {
        return b;
    }

    public final void onMeasure(int i, int j)
    {
        super.onMeasure(i, i);
    }

    public final void setChecked(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
            invalidate();
        }
    }

    public final void toggle()
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }
}
