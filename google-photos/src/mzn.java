// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import junit.framework.Assert;

public final class mzn extends mzw
{

    private final Bitmap g;

    public mzn(Bitmap bitmap)
    {
        this(bitmap, false);
    }

    private mzn(Bitmap bitmap, boolean flag)
    {
        boolean flag1 = false;
        super(false);
        flag = flag1;
        if (bitmap != null)
        {
            flag = flag1;
            if (!bitmap.isRecycled())
            {
                flag = true;
            }
        }
        Assert.assertTrue(flag);
        g = bitmap;
    }

    protected final void a(Bitmap bitmap)
    {
    }

    protected final Bitmap aC_()
    {
        return g;
    }
}
