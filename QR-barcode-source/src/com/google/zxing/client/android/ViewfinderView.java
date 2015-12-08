// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.camera.CameraManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ViewfinderView extends View
{

    private static final long ANIMATION_DELAY = 80L;
    private static final int CURRENT_POINT_OPACITY = 160;
    private static final int MAX_RESULT_POINTS = 20;
    private static final int POINT_SIZE = 6;
    private static final int SCANNER_ALPHA[];
    private CameraManager cameraManager;
    private final int laserColor;
    private List lastPossibleResultPoints;
    private final int maskColor;
    private final Paint paint = new Paint(1);
    private List possibleResultPoints;
    private Bitmap resultBitmap;
    private final int resultColor;
    private final int resultPointColor;
    private int scannerAlpha;

    public ViewfinderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = getResources();
        maskColor = context.getColor(R.color.viewfinder_mask);
        resultColor = context.getColor(R.color.result_view);
        laserColor = context.getColor(R.color.viewfinder_laser);
        resultPointColor = context.getColor(R.color.possible_result_points);
        scannerAlpha = 0;
        possibleResultPoints = new ArrayList(5);
        lastPossibleResultPoints = null;
    }

    public void addPossibleResultPoint(ResultPoint resultpoint)
    {
        List list = possibleResultPoints;
        list;
        JVM INSTR monitorenter ;
        int i;
        list.add(resultpoint);
        i = list.size();
        if (i <= 20)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        list.subList(0, i - 10).clear();
        list;
        JVM INSTR monitorexit ;
        return;
        resultpoint;
        list;
        JVM INSTR monitorexit ;
        throw resultpoint;
    }

    public void drawResultBitmap(Bitmap bitmap)
    {
        resultBitmap = bitmap;
        invalidate();
    }

    public void drawViewfinder()
    {
        Bitmap bitmap = resultBitmap;
        resultBitmap = null;
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        invalidate();
    }

    public void onDraw(Canvas canvas)
    {
        float f;
        float f1;
        Rect rect;
        Object obj;
        Object obj1;
        int i;
        int j;
        while (cameraManager == null || (rect = cameraManager.getFramingRect()) == null) 
        {
            return;
        }
        j = canvas.getWidth();
        int k = canvas.getHeight();
        obj = paint;
        if (resultBitmap != null)
        {
            i = resultColor;
        } else
        {
            i = maskColor;
        }
        ((Paint) (obj)).setColor(i);
        canvas.drawRect(0.0F, 0.0F, j, rect.top, paint);
        canvas.drawRect(0.0F, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, j, rect.bottom + 1, paint);
        canvas.drawRect(0.0F, rect.bottom + 1, j, k, paint);
        if (resultBitmap != null)
        {
            paint.setAlpha(160);
            canvas.drawBitmap(resultBitmap, null, rect, paint);
            return;
        }
        paint.setColor(laserColor);
        paint.setAlpha(SCANNER_ALPHA[scannerAlpha]);
        scannerAlpha = (scannerAlpha + 1) % SCANNER_ALPHA.length;
        i = rect.height() / 2 + rect.top;
        canvas.drawRect(rect.left + 2, i - 1, rect.right - 1, i + 2, paint);
        obj = cameraManager.getFramingRectInPreview();
        f = (float)rect.width() / (float)((Rect) (obj)).width();
        f1 = (float)rect.height() / (float)((Rect) (obj)).height();
        obj1 = possibleResultPoints;
        obj = lastPossibleResultPoints;
        i = rect.left;
        j = rect.top;
        if (!((List) (obj1)).isEmpty()) goto _L2; else goto _L1
_L1:
        lastPossibleResultPoints = null;
_L10:
        if (obj == null) goto _L4; else goto _L3
_L3:
        paint.setAlpha(80);
        paint.setColor(resultPointColor);
        obj;
        JVM INSTR monitorenter ;
        obj1 = ((List) (obj)).iterator();
_L8:
        if (((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        obj;
        JVM INSTR monitorexit ;
_L4:
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        return;
_L2:
        possibleResultPoints = new ArrayList(5);
        lastPossibleResultPoints = ((List) (obj1));
        paint.setAlpha(160);
        paint.setColor(resultPointColor);
        obj1;
        JVM INSTR monitorenter ;
        Iterator iterator = ((List) (obj1)).iterator();
_L7:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_537;
        }
        obj1;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        canvas;
        obj1;
        JVM INSTR monitorexit ;
        throw canvas;
        ResultPoint resultpoint1 = (ResultPoint)iterator.next();
        canvas.drawCircle((int)(resultpoint1.getX() * f) + i, (int)(resultpoint1.getY() * f1) + j, 6F, paint);
          goto _L7
_L6:
        ResultPoint resultpoint = (ResultPoint)((Iterator) (obj1)).next();
        canvas.drawCircle((int)(resultpoint.getX() * f) + i, (int)(resultpoint.getY() * f1) + j, 3F, paint);
          goto _L8
        canvas;
        obj;
        JVM INSTR monitorexit ;
        throw canvas;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void setCameraManager(CameraManager cameramanager)
    {
        cameraManager = cameramanager;
    }

    static 
    {
        int ai[] = new int[8];
        ai[1] = 64;
        ai[2] = 128;
        ai[3] = 192;
        ai[4] = 255;
        ai[5] = 192;
        ai[6] = 128;
        ai[7] = 64;
        SCANNER_ALPHA = ai;
    }
}
