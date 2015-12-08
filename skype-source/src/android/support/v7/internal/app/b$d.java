// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.g;
import android.view.Menu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.app:
//            b

private final class init> extends g
{

    final b a;

    public final View onCreatePanelView(int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 26;
           goto _L1 _L2
_L1:
        Menu menu;
        return super.onCreatePanelView(i);
_L2:
        if (onPreparePanel(i, null, menu = b.c(a).s()) && onMenuOpened(i, menu))
        {
            return b.a(a, menu);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean onPreparePanel(int i, View view, Menu menu)
    {
        boolean flag = super.onPreparePanel(i, view, menu);
        if (flag && !b.b(a))
        {
            b.c(a).l();
            b.d(a);
        }
        return flag;
    }

    public (b b1, android.view.ow.Callback callback)
    {
        a = b1;
        super(callback);
    }
}
