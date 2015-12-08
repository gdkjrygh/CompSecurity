// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            h

class k extends k
{

    final h b;

    final ActionMode a(android.view.onMode.Callback callback)
    {
        callback = new android.support.v7.internal.view.<init>(b.a, callback);
        android.support.v7.view.a a1 = b.a(callback);
        if (a1 != null)
        {
            return callback.b(a1);
        } else
        {
            return null;
        }
    }

    public ActionMode onWindowStartingActionMode(android.view.onMode.Callback callback)
    {
        if (b.m())
        {
            return a(callback);
        } else
        {
            return super.onWindowStartingActionMode(callback);
        }
    }

    k(h h1, android.view.ow.Callback callback)
    {
        b = h1;
        super(h1, callback);
    }
}
