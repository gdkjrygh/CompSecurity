// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.imagecrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.MotionEvent;
import me.lyft.android.common.Preconditions;

// Referenced classes of package me.lyft.android.infrastructure.imagecrop:
//            CropTouchPoint

public class CropTouchManager
{

    private static final float MAXIMUM_SCALE = 2F;
    public static final float VIEWPORT_HEIGHT_RATIO = 0.625F;
    private Bitmap bitmap;
    private boolean horizontalDragEnabled;
    private Rect imageBounds;
    private final int maxNumberOfTouchPoints;
    private float minimumScale;
    private final CropTouchPoint points[];
    private final CropTouchPoint previousPoints[];
    private boolean verticalDragEnabled;
    private int viewportHeight;
    private int viewportWidth;

    public CropTouchManager(Context context, int i)
    {
        horizontalDragEnabled = true;
        verticalDragEnabled = true;
        minimumScale = 0.5F;
        maxNumberOfTouchPoints = i;
        points = new CropTouchPoint[i];
        previousPoints = new CropTouchPoint[i];
    }

    public static int getMaxMoves(int i, int j)
    {
        return (i - j) / 2;
    }

    public static int getTop(int i, int j)
    {
        return i / 2 - j / 2;
    }

    private static CropTouchPoint getVector(CropTouchPoint croptouchpoint, CropTouchPoint croptouchpoint1)
    {
        Preconditions.checkNotNull(croptouchpoint);
        Preconditions.checkNotNull(croptouchpoint1);
        return CropTouchPoint.subtract(croptouchpoint1, croptouchpoint);
    }

    private void setCurrentAndPreviousPoints(MotionEvent motionevent)
    {
        int i = 0;
        while (i < maxNumberOfTouchPoints) 
        {
            if (i < motionevent.getPointerCount())
            {
                int j = motionevent.getPointerId(i);
                float f;
                float f1;
                CropTouchPoint croptouchpoint;
                if (isHorizontalDragEnabled())
                {
                    f = motionevent.getX(i);
                } else
                {
                    f = 0.0F;
                }
                if (isVerticalDragEnabled())
                {
                    f1 = motionevent.getY(i);
                } else
                {
                    f1 = 0.0F;
                }
                croptouchpoint = new CropTouchPoint(f, f1);
                if (points[j] == null)
                {
                    points[j] = croptouchpoint;
                } else
                {
                    if (previousPoints[j] != null)
                    {
                        previousPoints[j].copy(points[j]);
                    } else
                    {
                        previousPoints[j] = new CropTouchPoint(croptouchpoint);
                    }
                    points[j].copy(croptouchpoint);
                }
            } else
            {
                CropTouchPoint acroptouchpoint[] = previousPoints;
                points[i] = null;
                acroptouchpoint[i] = null;
            }
            i++;
        }
    }

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public Rect getImageBounds()
    {
        return imageBounds;
    }

    public int getPressCount()
    {
        int j = 0;
        CropTouchPoint acroptouchpoint[] = points;
        int l = acroptouchpoint.length;
        for (int i = 0; i < l;)
        {
            int k = j;
            if (acroptouchpoint[i] != null)
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    public CropTouchPoint getPreviousVector(int i, int j)
    {
        if (previousPoints[i] == null || previousPoints[j] == null)
        {
            return getVector(points[i], points[j]);
        } else
        {
            return getVector(previousPoints[i], previousPoints[j]);
        }
    }

    public CropTouchPoint getVector(int i, int j)
    {
        return getVector(points[i], points[j]);
    }

    public int getViewportHeight()
    {
        return viewportHeight;
    }

    public int getViewportWidth()
    {
        return viewportWidth;
    }

    public boolean isHorizontalDragEnabled()
    {
        return horizontalDragEnabled;
    }

    public boolean isPressed(int i)
    {
        return points[i] != null;
    }

    public boolean isVerticalDragEnabled()
    {
        return verticalDragEnabled;
    }

    public CropTouchPoint moveDelta(int i)
    {
        if (isPressed(i))
        {
            CropTouchPoint croptouchpoint;
            if (previousPoints[i] != null)
            {
                croptouchpoint = previousPoints[i];
            } else
            {
                croptouchpoint = points[i];
            }
            return CropTouchPoint.subtract(points[i], croptouchpoint);
        } else
        {
            return new CropTouchPoint();
        }
    }

    public void setBitmap(Bitmap bitmap1)
    {
        bitmap = bitmap1;
    }

    public void setImageBounds(Rect rect)
    {
        imageBounds = rect;
    }

    public void setMinimumScale()
    {
        float f = (float)bitmap.getWidth() / (float)bitmap.getHeight();
        float f1 = (float)getViewportWidth() / (float)getViewportHeight();
        if (bitmap.getWidth() < getViewportWidth())
        {
            horizontalDragEnabled = false;
            minimumScale = 1.0F;
            return;
        }
        if (bitmap.getHeight() < getViewportHeight())
        {
            verticalDragEnabled = false;
            minimumScale = 1.0F;
            return;
        }
        if (f > f1)
        {
            minimumScale = (float)getViewportHeight() / (float)bitmap.getHeight();
            return;
        } else
        {
            minimumScale = (float)getViewportWidth() / (float)bitmap.getWidth();
            return;
        }
    }

    public void setViewport(int i)
    {
        viewportWidth = i;
        viewportHeight = (int)((float)i * 0.625F);
    }

    public void update(MotionEvent motionevent)
    {
        int i = motionevent.getAction() & 0xff;
        if (i == 6 || i == 1)
        {
            int j = motionevent.getAction() >> 8;
            motionevent = previousPoints;
            points[j] = null;
            motionevent[j] = null;
            return;
        } else
        {
            setCurrentAndPreviousPoints(motionevent);
            return;
        }
    }

    public float updateScale(float f)
    {
        CropTouchPoint croptouchpoint = getVector(0, 1);
        CropTouchPoint croptouchpoint1 = getPreviousVector(0, 1);
        float f2 = croptouchpoint.getLength();
        float f3 = croptouchpoint1.getLength();
        float f1 = f;
        if (f3 != 0.0F)
        {
            f1 = f * (f2 / f3);
        }
        if (f1 < minimumScale)
        {
            f = minimumScale;
        } else
        {
            f = f1;
        }
        if (f > 2.0F)
        {
            return 2.0F;
        } else
        {
            return f;
        }
    }
}
