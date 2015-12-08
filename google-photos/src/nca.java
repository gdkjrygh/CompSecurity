// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.SortedSet;

final class nca
    implements nbv
{

    private static final nbx a = new ncb();

    nca()
    {
    }

    public final nbw a(int i, int j)
    {
        return new nbw(i, j, a);
    }

    public final nbw a(Bitmap bitmap)
    {
        return a(bitmap.getWidth(), bitmap.getHeight());
    }

    public final nbw a(nbw nbw1, SortedSet sortedset, nby nby1)
    {
        for (sortedset = sortedset.iterator(); sortedset.hasNext();)
        {
            nbw nbw2 = (nbw)sortedset.next();
            if (nbw2.b >= nbw1.b && nbw2.a >= nbw1.a && (nby1 == nby.b || nbw2.b == nbw1.b && nbw2.a == nbw1.a))
            {
                return nbw2;
            }
        }

        return null;
    }

    public final void a(nbw nbw1, Bitmap bitmap)
    {
    }

}
