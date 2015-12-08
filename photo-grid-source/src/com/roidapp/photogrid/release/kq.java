// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            kr

final class kq extends BitmapDrawable
{

    private final WeakReference a;

    public kq(Resources resources, Bitmap bitmap, kr kr1)
    {
        super(resources, bitmap);
        a = new WeakReference(kr1);
    }

    public final kr a()
    {
        return (kr)a.get();
    }
}
