// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            PartionsController

public class BottomInfoView extends FrameLayout
{

    PartionsController a;
    boolean b;
    private View c;

    public BottomInfoView(Context context)
    {
        super(context);
        b = false;
        c();
    }

    public BottomInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c();
    }

    public BottomInfoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
        c();
    }

    private void c()
    {
        c = View.inflate(getContext(), 0x7f030036, this);
        a = new PartionsController((ViewGroup)c);
    }

    public void a()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public void b()
    {
        a.c();
    }
}
