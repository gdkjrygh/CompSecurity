// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

public class j extends Canvas
{

    private static j a;

    public j()
    {
    }

    public static j a()
    {
        if (a == null)
        {
            a = new j();
        }
        return a;
    }

    public boolean clipPath(Path path)
    {
        return true;
    }

    public boolean clipPath(Path path, android.graphics.Region.Op op)
    {
        return true;
    }

    public boolean clipRect(float f, float f1, float f2, float f3)
    {
        return true;
    }

    public boolean clipRect(float f, float f1, float f2, float f3, android.graphics.Region.Op op)
    {
        return true;
    }

    public boolean clipRect(int i, int k, int l, int i1)
    {
        return true;
    }

    public boolean clipRect(Rect rect)
    {
        return true;
    }

    public boolean clipRect(Rect rect, android.graphics.Region.Op op)
    {
        return true;
    }

    public boolean clipRect(RectF rectf)
    {
        return true;
    }

    public boolean clipRect(RectF rectf, android.graphics.Region.Op op)
    {
        return true;
    }

    public boolean clipRegion(Region region)
    {
        return true;
    }

    public boolean clipRegion(Region region, android.graphics.Region.Op op)
    {
        return true;
    }

    public void concat(Matrix matrix)
    {
    }

    public void drawARGB(int i, int k, int l, int i1)
    {
    }

    public void drawArc(RectF rectf, float f, float f1, boolean flag, Paint paint)
    {
    }

    public void drawBitmap(Bitmap bitmap, float f, float f1, Paint paint)
    {
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint)
    {
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect1, Paint paint)
    {
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectf, Paint paint)
    {
    }

    public void drawBitmap(int ai[], int i, int k, float f, float f1, int l, int i1, 
            boolean flag, Paint paint)
    {
    }

    public void drawBitmap(int ai[], int i, int k, int l, int i1, int j1, int k1, 
            boolean flag, Paint paint)
    {
    }

    public void drawBitmapMesh(Bitmap bitmap, int i, int k, float af[], int l, int ai[], int i1, 
            Paint paint)
    {
    }

    public void drawCircle(float f, float f1, float f2, Paint paint)
    {
    }

    public void drawColor(int i)
    {
    }

    public void drawColor(int i, android.graphics.PorterDuff.Mode mode)
    {
    }

    public void drawLine(float f, float f1, float f2, float f3, Paint paint)
    {
    }

    public void drawLines(float af[], int i, int k, Paint paint)
    {
    }

    public void drawLines(float af[], Paint paint)
    {
    }

    public void drawOval(RectF rectf, Paint paint)
    {
    }

    public void drawPaint(Paint paint)
    {
    }

    public void drawPath(Path path, Paint paint)
    {
    }

    public void drawPicture(Picture picture)
    {
    }

    public void drawPicture(Picture picture, Rect rect)
    {
    }

    public void drawPicture(Picture picture, RectF rectf)
    {
    }

    public void drawPoint(float f, float f1, Paint paint)
    {
    }

    public void drawPoints(float af[], int i, int k, Paint paint)
    {
    }

    public void drawPoints(float af[], Paint paint)
    {
    }

    public void drawPosText(String s, float af[], Paint paint)
    {
    }

    public void drawPosText(char ac[], int i, int k, float af[], Paint paint)
    {
    }

    public void drawRGB(int i, int k, int l)
    {
    }

    public void drawRect(float f, float f1, float f2, float f3, Paint paint)
    {
    }

    public void drawRect(Rect rect, Paint paint)
    {
    }

    public void drawRect(RectF rectf, Paint paint)
    {
    }

    public void drawRoundRect(RectF rectf, float f, float f1, Paint paint)
    {
    }

    public void drawText(CharSequence charsequence, int i, int k, float f, float f1, Paint paint)
    {
    }

    public void drawText(String s, float f, float f1, Paint paint)
    {
    }

    public void drawText(String s, int i, int k, float f, float f1, Paint paint)
    {
    }

    public void drawText(char ac[], int i, int k, float f, float f1, Paint paint)
    {
    }

    public void drawTextOnPath(String s, Path path, float f, float f1, Paint paint)
    {
    }

    public void drawTextOnPath(char ac[], int i, int k, Path path, float f, float f1, Paint paint)
    {
    }

    public void drawVertices(android.graphics.Canvas.VertexMode vertexmode, int i, float af[], int k, float af1[], int l, int ai[], 
            int i1, short aword0[], int j1, int k1, Paint paint)
    {
    }

    public boolean getClipBounds(Rect rect)
    {
        return true;
    }

    public int getHeight()
    {
        return 0;
    }

    public void getMatrix(Matrix matrix)
    {
    }

    public int getSaveCount()
    {
        return 1;
    }

    public int getWidth()
    {
        return 0;
    }

    public boolean isHardwareAccelerated()
    {
        return false;
    }

    public boolean isOpaque()
    {
        return true;
    }

    public boolean quickReject(float f, float f1, float f2, float f3, android.graphics.Canvas.EdgeType edgetype)
    {
        return false;
    }

    public boolean quickReject(Path path, android.graphics.Canvas.EdgeType edgetype)
    {
        return false;
    }

    public boolean quickReject(RectF rectf, android.graphics.Canvas.EdgeType edgetype)
    {
        return false;
    }

    public void restore()
    {
    }

    public void restoreToCount(int i)
    {
    }

    public void rotate(float f)
    {
    }

    public int save()
    {
        return 1;
    }

    public int save(int i)
    {
        return 1;
    }

    public int saveLayer(float f, float f1, float f2, float f3, Paint paint, int i)
    {
        return 1;
    }

    public int saveLayer(RectF rectf, Paint paint, int i)
    {
        return 1;
    }

    public int saveLayerAlpha(float f, float f1, float f2, float f3, int i, int k)
    {
        return 1;
    }

    public int saveLayerAlpha(RectF rectf, int i, int k)
    {
        return 1;
    }

    public void scale(float f, float f1)
    {
    }

    public void setBitmap(Bitmap bitmap)
    {
    }

    public void setMatrix(Matrix matrix)
    {
    }

    public void skew(float f, float f1)
    {
    }

    public void translate(float f, float f1)
    {
    }
}
