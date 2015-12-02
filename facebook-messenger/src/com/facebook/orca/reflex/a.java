// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.view.View;
import com.facebook.reflex.Widget;
import com.facebook.reflex.view.b.r;

public class a extends com.facebook.orca.common.ui.a.a
{

    public a()
    {
    }

    private Widget a(View view)
    {
        if (view instanceof r)
        {
            return ((r)view).getBackingWidget();
        } else
        {
            return null;
        }
    }

    public void a(View view, float f)
    {
        Widget widget = a(view);
        if (widget != null)
        {
            widget.b(f);
            return;
        } else
        {
            super.a(view, f);
            return;
        }
    }
}
