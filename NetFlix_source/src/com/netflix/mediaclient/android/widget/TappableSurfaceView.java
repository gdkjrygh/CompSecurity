// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NavigationBarListener

public class TappableSurfaceView extends SurfaceView
{
    public static interface SurfaceMeasureListener
    {

        public abstract void onSurfaceMeasureChange(int i, int j);
    }

    public static interface TapListener
    {

        public abstract void onTap(MotionEvent motionevent);
    }


    public static final int MODE_NORMAL = 0;
    public static final int MODE_SCALE = 3;
    public static final int MODE_STRETCH = 2;
    public static final int MODE_ZOOM = 1;
    private static final String TAG = "@@@";
    private final NavigationBarListener listener;
    private final List listeners = new ArrayList();
    private int mPheight;
    private int mPwidth;
    private float mScale;
    private int mVideoHeight;
    private int mVideoWidth;
    private int mode;
    private SurfaceMeasureListener surfaceMeasureListener;

    public TappableSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mPheight = 0;
        mPwidth = 0;
        mScale = 1.0F;
        mode = 0;
        listener = NavigationBarListener.getInstance(context, this);
        initSurface(context);
    }

    private void initSurface(Context context)
    {
        Log.d("@@@", "INIT_SURFACE");
    }

    public void addTapListener(TapListener taplistener)
    {
        if (taplistener != null)
        {
            listeners.add(taplistener);
        }
        if (listeners.size() > 0)
        {
            listener.startListening();
        }
    }

    public boolean canVideoBeZoomed()
    {
        if (Log.isLoggable("@@@", 3))
        {
            Log.w("@@@", (new StringBuilder()).append(mVideoWidth).append(" X ").append(mVideoHeight).append(", ").append(mPwidth).append(" X ").append(mPheight).toString());
        }
        while (mVideoWidth == 0 || mVideoHeight == 0 || mPwidth == 0 || mPheight == 0 || mVideoWidth * mPheight != mVideoHeight * mPwidth) 
        {
            return true;
        }
        return false;
    }

    public int getMode()
    {
        return mode;
    }

    public float getScale()
    {
        return mScale;
    }

    public int getVideoHeight()
    {
        return mVideoHeight;
    }

    public int getVideoWidth()
    {
        return mVideoWidth;
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        Log.i("@@@", "onMeasure");
        int ai[] = (ViewGroup)getParent();
        if (AndroidUtils.getAndroidVersion() < 16)
        {
            i = getDefaultSize(mVideoWidth, i);
            j = getDefaultSize(mVideoHeight, j);
        } else
        {
label0:
            {
                l = ai.getMeasuredWidth();
                int i1 = ai.getMeasuredHeight();
                if (l != 0)
                {
                    k = i1;
                    if (i1 != 0)
                    {
                        break label0;
                    }
                }
                l = getDefaultSize(mVideoWidth, i);
                k = getDefaultSize(mVideoHeight, j);
                Log.d("@@@", "use default size");
            }
            int j1;
label1:
            {
                if (l != 0)
                {
                    j1 = k;
                    if (k != 0)
                    {
                        break label1;
                    }
                }
                l = 1920;
                j1 = 1080;
                Log.d("@@@", "use hardcode size");
            }
            j = j1;
            i = l;
            if (Log.isLoggable("@@@", 3))
            {
                Log.d("@@@", (new StringBuilder()).append("parent size: ").append(l).append(" x ").append(j1).toString());
                j = j1;
                i = l;
            }
        }
        mPheight = j;
        mPwidth = i;
        k = j;
        l = i;
        if (mVideoWidth > 0)
        {
            k = j;
            l = i;
            if (mVideoHeight > 0)
            {
                if (mVideoWidth * j > mVideoHeight * i)
                {
                    Log.d("@@@", "image too tall, correcting");
                    k = (mVideoHeight * i) / mVideoWidth;
                    l = i;
                } else
                if (mVideoWidth * j < mVideoHeight * i)
                {
                    Log.d("@@@", "image too wide, correcting");
                    l = (mVideoWidth * j) / mVideoHeight;
                    k = j;
                } else
                {
                    k = j;
                    l = i;
                    if (Log.isLoggable("@@@", 3))
                    {
                        Log.d("@@@", (new StringBuilder()).append("aspect ratio is correct: ").append(i).append("/").append(j).append("=").append(mVideoWidth).append("/").append(mVideoHeight).toString());
                        k = j;
                        l = i;
                    }
                }
            }
        }
        Log.d("@@@", (new StringBuilder()).append("aspect ratio corrected: ").append(l).append("x").append(k).toString());
        mode;
        JVM INSTR tableswitch 0 3: default 188
    //                   0 581
    //                   1 666
    //                   2 188
    //                   3 598;
           goto _L1 _L2 _L3 _L1 _L4
_L3:
        break MISSING_BLOCK_LABEL_666;
_L1:
        Log.i("@@@", "Stretch to full screen ...");
        j = mPwidth;
        i = mPheight;
_L6:
        ai = new int[2];
        getLocationOnScreen(ai);
        if (Log.isLoggable("@@@", 3))
        {
            Log.d("@@@", (new StringBuilder()).append("setting size: ").append(j).append('x').append(i).append(", start coordinates: ").append(ai[0]).append(", ").append(ai[1]).toString());
        }
        setMeasuredDimension(j, i);
        if (surfaceMeasureListener != null)
        {
            surfaceMeasureListener.onSurfaceMeasureChange(j, i);
        }
        return;
_L2:
        Log.i("@@@", "Follow Aspect ration");
        i = k;
        j = l;
        continue; /* Loop/switch isn't completed */
_L4:
        Log.i("@@@", "Scale surface");
        i = k;
        j = l;
        if (l != 0)
        {
            i = k;
            j = l;
            if (k != 0)
            {
                i = k;
                j = l;
                if (mScale > 0.0F)
                {
                    j = (int)((float)l * mScale);
                    i = (int)((float)k * mScale);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        Log.i("@@@", "Zoomin ...");
        i = k;
        j = l;
        if (l != 0)
        {
            i = k;
            j = l;
            if (k != 0)
            {
                float f = (float)mPwidth / (float)l;
                float f1 = (float)mPheight / (float)k;
                if (f >= f1)
                {
                    j = mPwidth;
                    i = (int)((float)k * f);
                } else
                {
                    i = mPheight;
                    j = (int)((float)l * f1);
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Log.d("TAP", (new StringBuilder()).append("onTouchEvent ").append(motionevent).toString());
        if (motionevent.getAction() == 1)
        {
            processOnTouchEvent(motionevent);
        }
        return true;
    }

    void processOnTouchEvent(MotionEvent motionevent)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((TapListener)iterator.next()).onTap(motionevent)) { }
    }

    public boolean removeTapListener(TapListener taplistener)
    {
        boolean flag;
        if (taplistener == null)
        {
            flag = false;
        } else
        {
            boolean flag1 = listeners.remove(taplistener);
            flag = flag1;
            if (listeners.size() <= 0)
            {
                listener.stopListening();
                return flag1;
            }
        }
        return flag;
    }

    public void setMode(int i)
    {
        if (i >= 0 && i <= 2)
        {
            mScale = 1.0F;
            mode = i;
            requestLayout();
            return;
        } else
        {
            Log.w("@@@", "Invalid mode");
            return;
        }
    }

    public void setScale(float f)
    {
        if (f > 0.0F)
        {
            mode = 3;
            mScale = f;
            requestLayout();
            return;
        } else
        {
            Log.w("@@@", "Invalid mode");
            return;
        }
    }

    public void setSurfaceMeasureListener(SurfaceMeasureListener surfacemeasurelistener)
    {
        surfaceMeasureListener = surfacemeasurelistener;
    }

    public void setVideoHeight(int i)
    {
        mVideoHeight = i;
    }

    public void setVideoWidth(int i)
    {
        mVideoWidth = i;
    }
}
