// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v4.widget.l;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            p

public final class e extends PopupWindow
{

    private static final boolean a;
    private boolean b;

    public e(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = p.a(context, attributeset, android.support.v7.appcompat.a.k.PopupWindow, i);
        if (context.g(android.support.v7.appcompat.a.k.PopupWindow_overlapAnchor))
        {
            boolean flag = context.a(android.support.v7.appcompat.a.k.PopupWindow_overlapAnchor, false);
            if (a)
            {
                b = flag;
            } else
            {
                l.a(this, flag);
            }
        }
        setBackgroundDrawable(context.a(android.support.v7.appcompat.a.k.PopupWindow_android_popupBackground));
        context.b();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = android/widget/PopupWindow.getDeclaredField("mAnchor");
        context.setAccessible(true);
        attributeset = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
        attributeset.setAccessible(true);
        attributeset.set(this, new android.view.ViewTreeObserver.OnScrollChangedListener(context, this, (android.view.ViewTreeObserver.OnScrollChangedListener)attributeset.get(this)) {

            final Field a;
            final PopupWindow b;
            final android.view.ViewTreeObserver.OnScrollChangedListener c;

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
        int j1 = j;
        if (a)
        {
            j1 = j;
            if (b)
            {
                j1 = j - view.getHeight();
            }
        }
        super.update(view, i, j1, k, i1);
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
