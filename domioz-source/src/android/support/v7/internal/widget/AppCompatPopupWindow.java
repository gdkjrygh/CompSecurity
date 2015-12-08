// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            az, z

public class AppCompatPopupWindow extends PopupWindow
{

    private final boolean a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = az.a(context, attributeset, l.aK, i);
        a = context.a(l.aN, false);
        setBackgroundDrawable(context.a(l.aM));
        context.b();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        context = android/widget/PopupWindow.getDeclaredField("mAnchor");
        context.setAccessible(true);
        attributeset = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
        attributeset.setAccessible(true);
        attributeset.set(this, new z(context, this, (android.view.ViewTreeObserver.OnScrollChangedListener)attributeset.get(this)));
        return;
        context;
        Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", context);
        return;
    }

    public void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            k = j;
            if (a)
            {
                k = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, k);
    }

    public void showAsDropDown(View view, int i, int j, int k)
    {
        int i1 = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            i1 = j;
            if (a)
            {
                i1 = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, i1, k);
    }

    public void update(View view, int i, int j, int k, int i1)
    {
        if (android.os.Build.VERSION.SDK_INT < 21 && a)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, k, i1);
    }
}
