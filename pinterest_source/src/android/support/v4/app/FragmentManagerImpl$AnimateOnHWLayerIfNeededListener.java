// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl

class mView
    implements android.view.animation.mView
{

    private android.view.animation.mOrignalListener mOrignalListener;
    private boolean mShouldRunOnHWLayer;
    private View mView;

    public void onAnimationEnd(Animation animation)
    {
    /* block-local class not found */
    class _cls2 {}

        if (mView != null && mShouldRunOnHWLayer)
        {
            mView.post(new _cls2());
        }
        if (mOrignalListener != null)
        {
            mOrignalListener.mOrignalListener(animation);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
        if (mOrignalListener != null)
        {
            mOrignalListener.mOrignalListener(animation);
        }
    }

    public void onAnimationStart(Animation animation)
    {
        if (mView != null)
        {
            mShouldRunOnHWLayer = FragmentManagerImpl.shouldRunOnHWLayer(mView, animation);
    /* block-local class not found */
    class _cls1 {}

            if (mShouldRunOnHWLayer)
            {
                mView.post(new _cls1());
            }
        }
        if (mOrignalListener != null)
        {
            mOrignalListener.mOrignalListener(animation);
        }
    }


    public _cls1(View view, Animation animation)
    {
        mOrignalListener = null;
        mShouldRunOnHWLayer = false;
        mView = null;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            mView = view;
            return;
        }
    }

    public mView(View view, Animation animation, android.view.animation.mView mview)
    {
        mOrignalListener = null;
        mShouldRunOnHWLayer = false;
        mView = null;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            mOrignalListener = mview;
            mView = view;
            return;
        }
    }
}
