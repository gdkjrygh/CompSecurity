// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.ActionMode;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            h, d

final class i extends h
{
    final class a extends h.a
    {

        final i c;

        public final ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
        {
            return null;
        }

        public final ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int j)
        {
            if (!c.m()) goto _L2; else goto _L1
_L1:
            j;
            JVM INSTR tableswitch 0 0: default 28
        //                       0 35;
               goto _L2 _L3
_L2:
            return super.onWindowStartingActionMode(callback, j);
_L3:
            return a(callback);
        }

        a(android.view.Window.Callback callback)
        {
            c = i.this;
            super(i.this, callback);
        }
    }


    i(Context context, Window window, d d)
    {
        super(context, window, d);
    }

    final android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new a(callback);
    }
}
