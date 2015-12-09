// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl

static class mView
    implements android.view.animation.mView
{

    private android.view.animation.mOrignalListener mOrignalListener;
    private boolean mShouldRunOnHWLayer;
    private View mView;

    public void onAnimationEnd(Animation animation)
    {
        if (mView != null && mShouldRunOnHWLayer)
        {
            mView.post(new Runnable() {

                final FragmentManagerImpl.AnimateOnHWLayerIfNeededListener this$0;

                public void run()
                {
                    ViewCompat.setLayerType(mView, 0, null);
                }

            
            {
                this$0 = FragmentManagerImpl.AnimateOnHWLayerIfNeededListener.this;
                super();
            }
            });
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
            if (mShouldRunOnHWLayer)
            {
                mView.post(new Runnable() {

                    final FragmentManagerImpl.AnimateOnHWLayerIfNeededListener this$0;

                    public void run()
                    {
                        ViewCompat.setLayerType(mView, 2, null);
                    }

            
            {
                this$0 = FragmentManagerImpl.AnimateOnHWLayerIfNeededListener.this;
                super();
            }
                });
            }
        }
        if (mOrignalListener != null)
        {
            mOrignalListener.mOrignalListener(animation);
        }
    }


    public _cls2.this._cls0(View view, Animation animation)
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
