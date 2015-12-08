// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            TintTypedArray

public class AppCompatPopupWindow extends PopupWindow
{

    private final boolean mOverlapAnchor;

    public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.PopupWindow, i, 0);
        mOverlapAnchor = context.getBoolean(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor, false);
        setBackgroundDrawable(context.getDrawable(android.support.v7.appcompat.R.styleable.PopupWindow_android_popupBackground));
        context.recycle();
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            wrapOnScrollChangedListener(this);
        }
    }

    private static void wrapOnScrollChangedListener(PopupWindow popupwindow)
    {
        try
        {
            Field field = android/widget/PopupWindow.getDeclaredField("mAnchor");
            field.setAccessible(true);
            Field field1 = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
            field1.setAccessible(true);
            field1.set(popupwindow, new android.view.ViewTreeObserver.OnScrollChangedListener(field, popupwindow, (android.view.ViewTreeObserver.OnScrollChangedListener)field1.get(popupwindow)) {

                final Field val$fieldAnchor;
                final android.view.ViewTreeObserver.OnScrollChangedListener val$originalListener;
                final PopupWindow val$popup;

                public void onScrollChanged()
                {
                    WeakReference weakreference = (WeakReference)fieldAnchor.get(popup);
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
                        originalListener.onScrollChanged();
                        return;
                    }
                    catch (IllegalAccessException illegalaccessexception) { }
                }

            
            {
                fieldAnchor = field;
                popup = popupwindow;
                originalListener = onscrollchangedlistener;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PopupWindow popupwindow)
        {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", popupwindow);
        }
    }

    public void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            k = j;
            if (mOverlapAnchor)
            {
                k = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, k);
    }

    public void showAsDropDown(View view, int i, int j, int k)
    {
        int l = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            l = j;
            if (mOverlapAnchor)
            {
                l = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, l, k);
    }

    public void update(View view, int i, int j, int k, int l)
    {
        int i1 = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            i1 = j;
            if (mOverlapAnchor)
            {
                i1 = j - view.getHeight();
            }
        }
        super.update(view, i, i1, k, l);
    }
}
