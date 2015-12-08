// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

static final class b extends b
{

    private Method a;
    private Field b;

    public final void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        if (a != null && b != null)
        {
            try
            {
                b.setBoolean(view, true);
                a.invoke(view, null);
            }
            catch (Exception exception) { }
            super.a(slidingpanelayout, view);
            return;
        } else
        {
            view.invalidate();
            return;
        }
    }

    ()
    {
        try
        {
            a = android/view/View.getDeclaredMethod("getDisplayList", null);
        }
        catch (NoSuchMethodException nosuchmethodexception) { }
        try
        {
            b = android/view/View.getDeclaredField("mRecreateDisplayList");
            b.setAccessible(true);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return;
        }
    }
}
