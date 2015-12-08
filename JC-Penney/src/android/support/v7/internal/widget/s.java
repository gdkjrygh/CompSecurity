// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v4.widget.ae;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            am, t

public class s extends PopupWindow
{

    private static final boolean a;
    private boolean b;

    public s(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = am.a(context, attributeset, k.PopupWindow, i, 0);
        if (context.d(k.PopupWindow_overlapAnchor))
        {
            a(context.a(k.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(context.a(k.PopupWindow_android_popupBackground));
        context.b();
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            a(this);
        }
    }

    private static void a(PopupWindow popupwindow)
    {
        try
        {
            Field field = android/widget/PopupWindow.getDeclaredField("mAnchor");
            field.setAccessible(true);
            Field field1 = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
            field1.setAccessible(true);
            field1.set(popupwindow, new t(field, popupwindow, (android.view.ViewTreeObserver.OnScrollChangedListener)field1.get(popupwindow)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PopupWindow popupwindow)
        {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", popupwindow);
        }
    }

    public void a(boolean flag)
    {
        if (a)
        {
            b = flag;
            return;
        } else
        {
            ae.a(this, flag);
            return;
        }
    }

    public void showAsDropDown(View view, int i, int j)
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
        super.showAsDropDown(view, i, l);
    }

    public void showAsDropDown(View view, int i, int j, int l)
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
        super.showAsDropDown(view, i, i1, l);
    }

    public void update(View view, int i, int j, int l, int i1)
    {
        if (a && b)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, l, i1);
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
