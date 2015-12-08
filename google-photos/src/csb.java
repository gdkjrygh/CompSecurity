// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicInteger;

public final class csb extends csa
{

    private Bitmap b;

    public csb(Bitmap bitmap)
    {
        b = (Bitmap)b.a(bitmap, "bitmap", null);
    }

    protected final void c()
    {
        b.recycle();
    }

    public final Bitmap d()
    {
        if (super.a.get() <= 0)
        {
            throw new ao();
        } else
        {
            return b;
        }
    }
}
