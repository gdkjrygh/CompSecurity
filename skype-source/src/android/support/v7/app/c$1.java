// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            c

final class a
    implements android.view..OnClickListener
{

    final c a;

    public final void onClick(View view)
    {
        if (view == c.a(a) && c.b(a) != null)
        {
            view = Message.obtain(c.b(a));
        } else
        if (view == c.c(a) && c.d(a) != null)
        {
            view = Message.obtain(c.d(a));
        } else
        if (view == c.e(a) && c.f(a) != null)
        {
            view = Message.obtain(c.f(a));
        } else
        {
            view = null;
        }
        if (view != null)
        {
            view.sendToTarget();
        }
        c.h(a).obtainMessage(1, c.g(a)).sendToTarget();
    }

    stener(c c1)
    {
        a = c1;
        super();
    }
}
