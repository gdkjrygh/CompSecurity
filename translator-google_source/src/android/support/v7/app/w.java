// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            u, t, v

final class w extends u
{

    final v c;

    w(v v, android.view.Window.Callback callback)
    {
        c = v;
        super(v, callback);
    }

    public final ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
    {
        return null;
    }

    public final ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
    {
        if (!((t) (c)).o) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 0: default 28
    //                   0 35;
           goto _L2 _L3
_L2:
        return super.onWindowStartingActionMode(callback, i);
_L3:
        return a(callback);
    }
}
