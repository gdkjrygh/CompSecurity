// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.as;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            an, w

public final class v extends PopupWindow
{

    private static final boolean a;
    private boolean b;

    public v(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = an.a(context, attributeset, l.PopupWindow, i);
        if (context.e(l.PopupWindow_overlapAnchor))
        {
            boolean flag = context.a(l.PopupWindow_overlapAnchor, false);
            if (a)
            {
                b = flag;
            } else
            {
                as.a(this, flag);
            }
        }
        setBackgroundDrawable(context.a(l.PopupWindow_android_popupBackground));
        ((an) (context)).a.recycle();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        context = android/widget/PopupWindow.getDeclaredField("mAnchor");
        context.setAccessible(true);
        attributeset = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
        attributeset.setAccessible(true);
        attributeset.set(this, new w(context, this, (android.view.ViewTreeObserver.OnScrollChangedListener)attributeset.get(this)));
        return;
        context;
    }

    public final void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (a)
        {
            k = j;
            if (b)
            {
                k = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, k);
    }

    public final void showAsDropDown(View view, int i, int j, int k)
    {
        int i1 = j;
        if (a)
        {
            i1 = j;
            if (b)
            {
                i1 = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, i1, k);
    }

    public final void update(View view, int i, int j, int k, int i1)
    {
        if (a && b)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, k, i1);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
