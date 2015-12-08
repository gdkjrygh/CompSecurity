// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

// Referenced classes of package org.chromium.content.browser:
//            PositionObserver

public class ViewPositionObserver
    implements PositionObserver
{

    private final ArrayList mListeners = new ArrayList();
    private final int mPosition[] = new int[2];
    private android.view.ViewTreeObserver.OnPreDrawListener mPreDrawListener;
    private View mView;

    public ViewPositionObserver(View view)
    {
        mView = view;
        updatePosition();
        mPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() {

            final ViewPositionObserver this$0;

            public boolean onPreDraw()
            {
                updatePosition();
                return true;
            }

            
            {
                this$0 = ViewPositionObserver.this;
                super();
            }
        };
    }

    private void notifyListeners()
    {
        for (int i = 0; i < mListeners.size(); i++)
        {
            ((PositionObserver.Listener)mListeners.get(i)).onPositionChanged(mPosition[0], mPosition[1]);
        }

    }

    private void updatePosition()
    {
        int i = mPosition[0];
        int j = mPosition[1];
        mView.getLocationInWindow(mPosition);
        if (mPosition[0] != i || mPosition[1] != j)
        {
            notifyListeners();
        }
    }

    public void addListener(PositionObserver.Listener listener)
    {
        if (mListeners.contains(listener))
        {
            return;
        }
        if (mListeners.isEmpty())
        {
            mView.getViewTreeObserver().addOnPreDrawListener(mPreDrawListener);
            updatePosition();
        }
        mListeners.add(listener);
    }

    public void clearListener()
    {
        mListeners.clear();
    }

    public int getPositionX()
    {
        updatePosition();
        return mPosition[0];
    }

    public int getPositionY()
    {
        updatePosition();
        return mPosition[1];
    }

    public void removeListener(PositionObserver.Listener listener)
    {
        if (mListeners.contains(listener))
        {
            mListeners.remove(listener);
            if (mListeners.isEmpty())
            {
                mView.getViewTreeObserver().removeOnPreDrawListener(mPreDrawListener);
                return;
            }
        }
    }

}
