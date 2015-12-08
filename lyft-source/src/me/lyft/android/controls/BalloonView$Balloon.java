// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.graphics.Bitmap;

public class bitmap
{

    private Bitmap bitmap;
    private int height;
    private float opacity;
    private float speed;
    private int width;
    private float x;
    private float y;

    static bitmap createBalloon(float f, float f1, Bitmap bitmap1, float f2, float f3)
    {
        bitmap1 = new <init>(bitmap1.getWidth(), bitmap1.getHeight(), f3, f2, bitmap1);
        bitmap1.x = f;
        bitmap1.y = (float)((y) (bitmap1)).height + f1;
        return bitmap1;
    }

    public void updateBalloon(float f, float f1, Bitmap bitmap1, float f2, float f3)
    {
        bitmap = bitmap1;
        width = bitmap1.getWidth();
        height = bitmap1.getHeight();
        opacity = f3;
        speed = f2;
        x = f;
        y = (float)height + f1;
    }







/*
    static float access$324( , float f)
    {
        f = .y - f;
        .y = f;
        return f;
    }

*/



    public y(int i, int j, float f, float f1, Bitmap bitmap1)
    {
        width = i;
        height = j;
        opacity = f;
        speed = f1;
        bitmap = bitmap1;
    }
}
