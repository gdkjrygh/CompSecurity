// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            q, s, m

final class r extends q
{

    private boolean n;

    r(Context context, Window window, m m)
    {
        super(context, window, m);
        n = true;
    }

    static boolean a(r r1)
    {
        return r1.n;
    }

    final android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new s(this, callback);
    }
}
