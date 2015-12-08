// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            s, u, o

class t extends s
{

    boolean o;

    t(Context context, Window window, o o1)
    {
        super(context, window, o1);
        o = true;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new u(this, callback);
    }
}
