// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.widget.PopupWindowCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.widget:
//            TintTypedArray

public class AppCompatPopupWindow extends PopupWindow
{

    private static final boolean COMPAT_OVERLAP_ANCHOR;
    private static final String TAG = "AppCompatPopupWindow";
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.PopupWindow, i, 0);
        if (context.hasValue(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor))
        {
            setSupportOverlapAnchor(context.getBoolean(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor, false));
        }
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

    public boolean getSupportOverlapAnchor()
    {
        if (COMPAT_OVERLAP_ANCHOR)
        {
            return mOverlapAnchor;
        } else
        {
            return PopupWindowCompat.getOverlapAnchor(this);
        }
    }

    public void setSupportOverlapAnchor(boolean flag)
    {
        if (COMPAT_OVERLAP_ANCHOR)
        {
            mOverlapAnchor = flag;
            return;
        } else
        {
            PopupWindowCompat.setOverlapAnchor(this, flag);
            return;
        }
    }

    public void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (COMPAT_OVERLAP_ANCHOR)
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
        if (COMPAT_OVERLAP_ANCHOR)
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
        if (COMPAT_OVERLAP_ANCHOR && mOverlapAnchor)
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
        COMPAT_OVERLAP_ANCHOR = flag;
    }
}
