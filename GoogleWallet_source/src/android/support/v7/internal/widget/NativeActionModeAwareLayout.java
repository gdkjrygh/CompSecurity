// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ContentFrameLayout

public class NativeActionModeAwareLayout extends ContentFrameLayout
{
    public static interface OnActionModeForChildListener
    {

        public abstract ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback);
    }


    private OnActionModeForChildListener mActionModeForChildListener;

    public NativeActionModeAwareLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setActionModeForChildListener(OnActionModeForChildListener onactionmodeforchildlistener)
    {
        mActionModeForChildListener = onactionmodeforchildlistener;
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        if (mActionModeForChildListener != null)
        {
            return mActionModeForChildListener.startActionModeForChild(view, callback);
        } else
        {
            return super.startActionModeForChild(view, callback);
        }
    }
}
