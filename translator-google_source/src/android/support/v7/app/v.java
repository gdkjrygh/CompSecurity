// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            t, w, o

final class v extends t
{

    v(Context context, Window window, o o)
    {
        super(context, window, o);
    }

    final android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new w(this, callback);
    }
}
