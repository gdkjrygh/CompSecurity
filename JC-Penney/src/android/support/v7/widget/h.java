// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.b.b;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.s;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            a

class h extends s
{

    final a c;

    public h(a a1, Context context, g g1, View view, boolean flag)
    {
        c = a1;
        super(context, g1, view, flag, b.actionOverflowMenuStyle);
        a(0x800005);
        a(a1.g);
    }

    public void onDismiss()
    {
        super.onDismiss();
        a.c(c).close();
        a.a(c, null);
    }
}
