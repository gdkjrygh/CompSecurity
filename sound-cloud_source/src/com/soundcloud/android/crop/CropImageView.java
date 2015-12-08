// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.crop:
//            ImageViewTouchBase, HighlightView, RotateBitmap, CropImageActivity

public class CropImageView extends ImageViewTouchBase
{

    Context context;
    ArrayList highlightViews;
    private float lastX;
    private float lastY;
    private int motionEdge;
    HighlightView motionHighlightView;
    private int validPointerId;

    public CropImageView(Context context1)
    {
        super(context1);
        highlightViews = new ArrayList();
    }

    public CropImageView(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        highlightViews = new ArrayList();
    }

    public CropImageView(Context context1, AttributeSet attributeset, int i)
    {
        super(context1, attributeset, i);
        highlightViews = new ArrayList();
    }

    private void centerBasedOnHighlightView(HighlightView highlightview)
    {
        Rect rect = highlightview.drawRect;
        float f = rect.width();
        float f1 = rect.height();
        float f2 = getWidth();
        float f3 = getHeight();
        f = Math.max(1.0F, Math.min((f2 / f) * 0.6F, (f3 / f1) * 0.6F) * getScale());
        if ((double)(Math.abs(f - getScale()) / f) > 0.10000000000000001D)
        {
            float af[] = new float[2];
            af[0] = highlightview.cropRect.centerX();
            af[1] = highlightview.cropRect.centerY();
            getUnrotatedMatrix().mapPoints(af);
            zoomTo(f, af[0], af[1], 300F);
        }
        ensureVisible(highlightview);
    }

    private void ensureVisible(HighlightView highlightview)
    {
        highlightview = highlightview.drawRect;
        int i = Math.max(0, getLeft() - ((Rect) (highlightview)).left);
        int l = Math.min(0, getRight() - ((Rect) (highlightview)).right);
        int j = Math.max(0, getTop() - ((Rect) (highlightview)).top);
        int k = Math.min(0, getBottom() - ((Rect) (highlightview)).bottom);
        if (i == 0)
        {
            i = l;
        }
        if (j == 0)
        {
            j = k;
        }
        if (i != 0 || j != 0)
        {
            panBy(i, j);
        }
    }

    public void add(HighlightView highlightview)
    {
        highlightViews.add(highlightview);
        invalidate();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile Matrix getUnrotatedMatrix()
    {
        return super.getUnrotatedMatrix();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (Iterator iterator = highlightViews.iterator(); iterator.hasNext(); ((HighlightView)iterator.next()).draw(canvas)) { }
    }

    public volatile boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return super.onKeyDown(i, keyevent);
    }

    public volatile boolean onKeyUp(int i, KeyEvent keyevent)
    {
        return super.onKeyUp(i, keyevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (bitmapDisplayed.getBitmap() != null)
        {
            Iterator iterator = highlightViews.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                HighlightView highlightview = (HighlightView)iterator.next();
                highlightview.matrix.set(getUnrotatedMatrix());
                highlightview.invalidate();
                if (highlightview.hasFocus())
                {
                    centerBasedOnHighlightView(highlightview);
                }
            } while (true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (((CropImageActivity)context).isSaving())
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 46
    //                   1 163
    //                   2 200;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        Object obj = highlightViews.iterator();
        HighlightView highlightview;
        int i;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            highlightview = (HighlightView)((Iterator) (obj)).next();
            i = highlightview.getHit(motionevent.getX(), motionevent.getY());
        } while (i == 1);
        motionEdge = i;
        motionHighlightView = highlightview;
        lastX = motionevent.getX();
        lastY = motionevent.getY();
        validPointerId = motionevent.getPointerId(motionevent.getActionIndex());
        obj = motionHighlightView;
        if (i == 32)
        {
            motionevent = HighlightView.ModifyMode.Move;
        } else
        {
            motionevent = HighlightView.ModifyMode.Grow;
        }
        ((HighlightView) (obj)).setMode(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        if (motionHighlightView != null)
        {
            centerBasedOnHighlightView(motionHighlightView);
            motionHighlightView.setMode(HighlightView.ModifyMode.None);
        }
        motionHighlightView = null;
        center();
        continue; /* Loop/switch isn't completed */
_L4:
        if (motionHighlightView != null && motionevent.getPointerId(motionevent.getActionIndex()) == validPointerId)
        {
            motionHighlightView.handleMotion(motionEdge, motionevent.getX() - lastX, motionevent.getY() - lastY);
            lastX = motionevent.getX();
            lastY = motionevent.getY();
        }
        if (getScale() == 1.0F)
        {
            center();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void postTranslate(float f, float f1)
    {
        super.postTranslate(f, f1);
        HighlightView highlightview;
        for (Iterator iterator = highlightViews.iterator(); iterator.hasNext(); highlightview.invalidate())
        {
            highlightview = (HighlightView)iterator.next();
            highlightview.matrix.postTranslate(f, f1);
        }

    }

    public volatile void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
    }

    public volatile void setImageBitmapResetBase(Bitmap bitmap, boolean flag)
    {
        super.setImageBitmapResetBase(bitmap, flag);
    }

    public volatile void setImageRotateBitmapResetBase(RotateBitmap rotatebitmap, boolean flag)
    {
        super.setImageRotateBitmapResetBase(rotatebitmap, flag);
    }

    public volatile void setRecycler(ImageViewTouchBase.Recycler recycler)
    {
        super.setRecycler(recycler);
    }

    protected void zoomIn()
    {
        super.zoomIn();
        HighlightView highlightview;
        for (Iterator iterator = highlightViews.iterator(); iterator.hasNext(); highlightview.invalidate())
        {
            highlightview = (HighlightView)iterator.next();
            highlightview.matrix.set(getUnrotatedMatrix());
        }

    }

    protected void zoomOut()
    {
        super.zoomOut();
        HighlightView highlightview;
        for (Iterator iterator = highlightViews.iterator(); iterator.hasNext(); highlightview.invalidate())
        {
            highlightview = (HighlightView)iterator.next();
            highlightview.matrix.set(getUnrotatedMatrix());
        }

    }

    protected void zoomTo(float f, float f1, float f2)
    {
        super.zoomTo(f, f1, f2);
        HighlightView highlightview;
        for (Iterator iterator = highlightViews.iterator(); iterator.hasNext(); highlightview.invalidate())
        {
            highlightview = (HighlightView)iterator.next();
            highlightview.matrix.set(getUnrotatedMatrix());
        }

    }
}
