// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;

// Referenced classes of package com.kik.cache:
//            ai

public final class b extends ai
{

    public b(long l)
    {
        super(l);
    }

    protected final void a(Object obj)
    {
        obj = (Bitmap)((SoftReference)obj).get();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
    }
}
