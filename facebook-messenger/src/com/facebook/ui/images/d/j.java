// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.ui.images.d:
//            g, h

public class j
    implements g
{

    private final h a;
    private final int b;
    private final int c;
    private List d;
    private int e;
    private int f;

    public j(h h1, int i, int k)
    {
        a = h1;
        b = i;
        c = k;
        a(i, k);
    }

    private void a(int i, int k)
    {
        Rect rect = new Rect(0, 0, i, k);
        d = a.a(rect);
        e = rect.width();
        f = rect.height();
    }

    public Bitmap a(Bitmap bitmap)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            bitmap = ((g)iterator.next()).a(bitmap);
        }

        return bitmap;
    }
}
