// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;

public abstract class avf
    implements anl
{

    private final aqm b;

    public avf(Context context)
    {
        this(aly.b(context).a);
    }

    private avf(aqm aqm)
    {
        b = aqm;
    }

    protected abstract Bitmap a(aqm aqm, Bitmap bitmap, int i, int j);

    public final aqa a(aqa aqa1, int i, int j)
    {
        if (!bag.a(i, j))
        {
            throw new IllegalArgumentException((new StringBuilder(128)).append("Cannot apply transformation on width: ").append(i).append(" or height: ").append(j).append(" less than or equal to zero and not Target.SIZE_ORIGINAL").toString());
        }
        Bitmap bitmap = (Bitmap)aqa1.b();
        int k = i;
        if (i == 0x80000000)
        {
            k = bitmap.getWidth();
        }
        i = j;
        if (j == 0x80000000)
        {
            i = bitmap.getHeight();
        }
        Bitmap bitmap1 = a(b, bitmap, k, i);
        if (bitmap.equals(bitmap1))
        {
            return aqa1;
        } else
        {
            return ave.a(bitmap1, b);
        }
    }
}
