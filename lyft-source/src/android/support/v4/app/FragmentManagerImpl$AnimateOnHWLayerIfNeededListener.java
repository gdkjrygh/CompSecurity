// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl

class mView
    implements android.view.animation.mView
{

    private boolean mShouldRunOnHWLayer;
    private View mView;

    public void onAnimationEnd(Animation animation)
    {
        if (mShouldRunOnHWLayer)
        {
            mView.post(new Runnable() {

                final FragmentManagerImpl.AnimateOnHWLayerIfNeededListener this$0;

                public void run()
                {
                    ViewCompat.a(mView, 0, null);
                }

            
            {
                this$0 = FragmentManagerImpl.AnimateOnHWLayerIfNeededListener.this;
                super();
            }
            });
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        mShouldRunOnHWLayer = FragmentManagerImpl.shouldRunOnHWLayer(mView, animation);
        if (mShouldRunOnHWLayer)
        {
            mView.post(new Runnable() {

                final FragmentManagerImpl.AnimateOnHWLayerIfNeededListener this$0;

                public void run()
                {
                    ViewCompat.a(mView, 2, null);
                }

            
            {
                this$0 = FragmentManagerImpl.AnimateOnHWLayerIfNeededListener.this;
                super();
            }
            });
        }
    }


    public _cls2.this._cls0(View view, Animation animation)
    {
        mShouldRunOnHWLayer = false;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            mView = view;
            return;
        }
    }
}
