// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public interface BitmapTransformation
{

    public abstract void drawFocusedOverlay(Canvas canvas, int i, int j);

    public abstract void drawPressedOverlay(Canvas canvas, int i, int j);

    public abstract int getTransformationInset(int i, int j);

    public abstract Bitmap transform(Bitmap bitmap, int i, int j);
}
