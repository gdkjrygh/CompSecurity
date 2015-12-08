// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view:
//            ViewPropertyAnimatorCompatSet

class mProxyEndCount extends ViewPropertyAnimatorListenerAdapter
{

    private int mProxyEndCount;
    private boolean mProxyStarted;
    final ViewPropertyAnimatorCompatSet this$0;

    public void onAnimationEnd(View view)
    {
        int i = mProxyEndCount + 1;
        mProxyEndCount = i;
        if (i == ViewPropertyAnimatorCompatSet.access$200(ViewPropertyAnimatorCompatSet.this).size())
        {
            if (ViewPropertyAnimatorCompatSet.access$000(ViewPropertyAnimatorCompatSet.this) != null)
            {
                ViewPropertyAnimatorCompatSet.access$000(ViewPropertyAnimatorCompatSet.this).onAnimationEnd(null);
            }
            onEnd();
        }
    }

    public void onAnimationStart(View view)
    {
        if (!mProxyStarted)
        {
            mProxyStarted = true;
            if (ViewPropertyAnimatorCompatSet.access$000(ViewPropertyAnimatorCompatSet.this) != null)
            {
                ViewPropertyAnimatorCompatSet.access$000(ViewPropertyAnimatorCompatSet.this).onAnimationStart(null);
                return;
            }
        }
    }

    void onEnd()
    {
        mProxyEndCount = 0;
        mProxyStarted = false;
        ViewPropertyAnimatorCompatSet.access$100(ViewPropertyAnimatorCompatSet.this);
    }

    ()
    {
        this$0 = ViewPropertyAnimatorCompatSet.this;
        super();
        mProxyStarted = false;
        mProxyEndCount = 0;
    }
}
