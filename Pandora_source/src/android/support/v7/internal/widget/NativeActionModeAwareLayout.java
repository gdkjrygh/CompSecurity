// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.widget.LinearLayout;

public class NativeActionModeAwareLayout extends LinearLayout
{
    public static interface a
    {

        public abstract android.view.ActionMode.Callback a(android.view.ActionMode.Callback callback);
    }


    private a a;

    public NativeActionModeAwareLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setActionModeForChildListener(a a1)
    {
        a = a1;
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        android.view.ActionMode.Callback callback1 = callback;
        if (a != null)
        {
            callback1 = a.a(callback);
        }
        return super.startActionModeForChild(view, callback1);
    }
}
