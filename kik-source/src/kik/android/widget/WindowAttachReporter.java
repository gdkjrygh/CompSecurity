// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class WindowAttachReporter extends FrameLayout
{
    public static abstract class a
    {

        public a()
        {
        }
    }


    private a a;

    public WindowAttachReporter(Context context)
    {
        this(context, null);
    }

    public WindowAttachReporter(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WindowAttachReporter(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(a a1)
    {
        a = a1;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }
}
