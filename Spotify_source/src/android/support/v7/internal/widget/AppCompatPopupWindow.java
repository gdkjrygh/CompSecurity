// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import pp;
import sr;
import wc;

public class AppCompatPopupWindow extends PopupWindow
{

    private static final boolean a;
    private boolean b;

    public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = wc.a(context, attributeset, sr.aV, i);
        if (context.e(sr.aX))
        {
            boolean flag = context.a(sr.aX, false);
            if (a)
            {
                b = flag;
            } else
            {
                pp.a(this, flag);
            }
        }
        setBackgroundDrawable(context.a(sr.aW));
        ((wc) (context)).a.recycle();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        context = android/widget/PopupWindow.getDeclaredField("mAnchor");
        context.setAccessible(true);
        attributeset = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
        attributeset.setAccessible(true);
        attributeset.set(this, new android.view.ViewTreeObserver.OnScrollChangedListener(context, this, (android.view.ViewTreeObserver.OnScrollChangedListener)attributeset.get(this)) {

            private Field a;
            private PopupWindow b;
            private android.view.ViewTreeObserver.OnScrollChangedListener c;

            public final void onScrollChanged()
            {
                WeakReference weakreference = (WeakReference)a.get(b);
                if (weakreference == null)
                {
                    break MISSING_BLOCK_LABEL_38;
                }
                if (weakreference.get() == null)
                {
                    return;
                }
                try
                {
                    c.onScrollChanged();
                    return;
                }
                catch (IllegalAccessException illegalaccessexception) { }
            }

            
            {
                a = field;
                b = popupwindow;
                c = onscrollchangedlistener;
                super();
            }
        });
        return;
        context;
        Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", context);
        return;
    }

    public void showAsDropDown(View view, int i, int j)
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

    public void showAsDropDown(View view, int i, int j, int k)
    {
        int l = j;
        if (a)
        {
            l = j;
            if (b)
            {
                l = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, l, k);
    }

    public void update(View view, int i, int j, int k, int l)
    {
        if (a && b)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, k, l);
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
