// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.SortedSet;

final class nce
    implements nbv
{

    private static final nbx a = new ncf();

    nce()
    {
    }

    public final nbw a(int i, int j)
    {
        return new nbw(i, j, a);
    }

    public final nbw a(Bitmap bitmap)
    {
        return new nbw(bitmap.getWidth(), bitmap.getHeight(), bitmap.getAllocationByteCount(), a);
    }

    public final nbw a(nbw nbw1, SortedSet sortedset, nby nby)
    {
        if (!sortedset.isEmpty())
        {
            return (nbw)sortedset.first();
        } else
        {
            return null;
        }
    }

    public final void a(nbw nbw1, Bitmap bitmap)
    {
        bitmap.reconfigure(nbw1.b, nbw1.a, android.graphics.Bitmap.Config.ARGB_8888);
    }

}
