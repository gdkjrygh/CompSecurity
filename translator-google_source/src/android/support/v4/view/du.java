// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            eg, dq, bt

final class du
    implements eg
{

    dq a;

    du(dq dq1)
    {
        a = dq1;
    }

    public final void a(View view)
    {
        if (dq.d(a) >= 0)
        {
            bt.a(view, 2, null);
        }
        if (dq.a(a) != null)
        {
            dq.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof eg)
        {
            obj = (eg)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((eg) (obj)).a(view);
        }
    }

    public final void b(View view)
    {
        if (dq.d(a) >= 0)
        {
            bt.a(view, dq.d(a), null);
            dq.c(a);
        }
        if (dq.b(a) != null)
        {
            dq.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof eg)
        {
            obj = (eg)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((eg) (obj)).b(view);
        }
    }

    public final void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof eg)
        {
            obj = (eg)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((eg) (obj)).c(view);
        }
    }
}
