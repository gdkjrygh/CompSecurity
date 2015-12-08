// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.view.View;
import android.widget.TextView;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

// Referenced classes of package com.fitbit.friends.ui:
//            MessagesFragment

private static class <init>
{

    private final LoadablePicassoImageView a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;

    static LoadablePicassoImageView a(<init> <init>1)
    {
        return <init>1.a;
    }

    static TextView b(a a1)
    {
        return a1.e;
    }

    static TextView c(e e1)
    {
        return e1.b;
    }

    static TextView d(b b1)
    {
        return b1.c;
    }

    static TextView e(c c1)
    {
        return c1.d;
    }

    private geView(View view)
    {
        a = (LoadablePicassoImageView)view.findViewById(0x7f1100be);
        b = (TextView)view.findViewById(0x7f11011f);
        c = (TextView)view.findViewById(0x7f1100c1);
        d = (TextView)view.findViewById(0x7f1102b5);
        e = (TextView)view.findViewById(0x7f110370);
    }

    e(View view, e e1)
    {
        this(view);
    }
}
