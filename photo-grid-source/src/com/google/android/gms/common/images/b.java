// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.vu;

final class b extends vu
{

    protected final int a(Object obj)
    {
        obj = (Bitmap)obj;
        return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
    }
}
