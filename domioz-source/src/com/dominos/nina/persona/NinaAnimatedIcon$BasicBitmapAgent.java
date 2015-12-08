// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.graphics.Bitmap;

class > extends >
{

    Bitmap getBitmap(int i)
    {
        return glob.map(i, null);
    }

    void releaseBitmap(Bitmap bitmap)
    {
        bitmap.recycle();
    }

    ( )
    {
        super();
    }
}
