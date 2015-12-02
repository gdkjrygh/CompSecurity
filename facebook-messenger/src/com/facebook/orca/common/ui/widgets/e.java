// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.view.View;
import com.facebook.widget.f;

public abstract class e extends f
{

    boolean a;

    public e(Context context)
    {
        super(context);
        a = true;
    }

    static void a(e e1, boolean flag)
    {
        e1.setCanConvert(flag);
    }

    private void setCanConvert(boolean flag)
    {
        a = flag;
    }

    public boolean a()
    {
        return a;
    }

    public abstract View getInnerRow();
}
