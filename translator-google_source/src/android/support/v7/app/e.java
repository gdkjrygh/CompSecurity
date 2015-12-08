// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            d

final class e
    implements android.view.View.OnClickListener
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void onClick(View view)
    {
        if (view == a.n && a.p != null)
        {
            view = Message.obtain(a.p);
        } else
        if (view == a.q && a.s != null)
        {
            view = Message.obtain(a.s);
        } else
        if (view == a.t && a.v != null)
        {
            view = Message.obtain(a.v);
        } else
        {
            view = null;
        }
        if (view != null)
        {
            view.sendToTarget();
        }
        a.M.obtainMessage(1, a.b).sendToTarget();
    }
}
