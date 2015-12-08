// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.TintManager;
import android.view.KeyEvent;
import android.view.MotionEvent;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

private class this._cls0 extends ContentFrameLayout
{

    final AppCompatDelegateImplV7 this$0;

    private boolean isOutOfBounds(int i, int j)
    {
        return i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return AppCompatDelegateImplV7.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && isOutOfBounds((int)motionevent.getX(), (int)motionevent.getY()))
        {
            AppCompatDelegateImplV7.access$1400(AppCompatDelegateImplV7.this, 0);
            return true;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public void setBackgroundResource(int i)
    {
        setBackgroundDrawable(TintManager.getDrawable(getContext(), i));
    }

    public (Context context)
    {
        this$0 = AppCompatDelegateImplV7.this;
        super(context);
    }
}
