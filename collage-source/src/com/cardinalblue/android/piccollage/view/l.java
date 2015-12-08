// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.cardinalblue.android.piccollage.model.gson.ImageScrapModel;
import java.io.File;
import pl.droidsonroids.gif.c;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            g

public class l extends g
{

    l(Context context, ContentValues contentvalues)
        throws com.cardinalblue.android.piccollage.model.k.a, NullPointerException
    {
        super(context, contentvalues);
    }

    l(Context context, Bitmap bitmap)
    {
        super(context, bitmap, new File(""));
    }

    l(Context context, ImageScrapModel imagescrapmodel)
        throws IllegalArgumentException
    {
        super(context, imagescrapmodel);
    }

    public void a(int i)
    {
    }

    public void a(Canvas canvas)
    {
        while (o || b == null && f == null || a == null) 
        {
            return;
        }
        if (f != null)
        {
            f.draw(canvas);
            return;
        } else
        {
            canvas.drawBitmap(b, null, a, e);
            return;
        }
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(boolean flag)
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public int d()
    {
        return 0;
    }
}
