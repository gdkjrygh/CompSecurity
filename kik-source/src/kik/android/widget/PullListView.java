// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package kik.android.widget:
//            TransparentListView

public final class PullListView extends TransparentListView
{

    public PullListView(Context context)
    {
        super(context);
    }

    public PullListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PullListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final void onOverScrolled(int i, int j, boolean flag, boolean flag1)
    {
        getParent();
        super.onOverScrolled(i, j, flag, flag1);
    }
}
