// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.reflex:
//            a

final class c
    implements a
{

    c()
    {
    }

    public Bitmap a(int i, int j)
    {
        return Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public void a(Bitmap bitmap)
    {
        bitmap.recycle();
    }
}
