// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

static class mRecreateDisplayList extends e
{

    private Method mGetDisplayList;
    private Field mRecreateDisplayList;

    public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
    {
        if (mGetDisplayList != null && mRecreateDisplayList != null)
        {
            try
            {
                mRecreateDisplayList.setBoolean(view, true);
                mGetDisplayList.invoke(view, null);
            }
            catch (Exception exception) { }
            super.invalidateChildRegion(slidingpanelayout, view);
            return;
        } else
        {
            view.invalidate();
            return;
        }
    }

    e()
    {
        try
        {
            mGetDisplayList = android/view/View.getDeclaredMethod("getDisplayList", null);
        }
        catch (NoSuchMethodException nosuchmethodexception) { }
        try
        {
            mRecreateDisplayList = android/view/View.getDeclaredField("mRecreateDisplayList");
            mRecreateDisplayList.setAccessible(true);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return;
        }
    }
}
