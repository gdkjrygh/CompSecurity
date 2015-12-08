// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            i

final class k extends k
{

    final i c;

    public final ActionMode onWindowStartingActionMode(android.view.onMode.Callback callback)
    {
        return null;
    }

    public final ActionMode onWindowStartingActionMode(android.view.onMode.Callback callback, int j)
    {
        if (!c.m()) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 0: default 28
    //                   0 35;
           goto _L2 _L3
_L2:
        return super.onWindowStartingActionMode(callback, j);
_L3:
        return a(callback);
    }

    k(i j, android.view.ow.Callback callback)
    {
        c = j;
        super(j, callback);
    }
}
