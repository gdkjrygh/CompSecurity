// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            b

final class c
    implements android.view.View.OnClickListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void onClick(View view)
    {
        if (view == b.a(a) && b.b(a) != null)
        {
            view = Message.obtain(b.b(a));
        } else
        if (view == b.c(a) && b.d(a) != null)
        {
            view = Message.obtain(b.d(a));
        } else
        if (view == b.e(a) && b.f(a) != null)
        {
            view = Message.obtain(b.f(a));
        } else
        {
            view = null;
        }
        if (view != null)
        {
            view.sendToTarget();
        }
        b.h(a).obtainMessage(1, b.g(a)).sendToTarget();
    }
}
