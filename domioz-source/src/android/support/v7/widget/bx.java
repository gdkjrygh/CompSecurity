// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            bw, RecyclerView, bj

final class bx extends a
{

    final bw b;

    bx(bw bw1)
    {
        b = bw1;
        super();
    }

    public final void a(View view, f f)
    {
        super.a(view, f);
        if (!b.b.g() && b.b.b() != null)
        {
            b.b.b().a(view, f);
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        boolean flag1 = false;
        boolean flag;
        if (super.a(view, i, bundle))
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (!b.b.g())
            {
                flag = flag1;
                if (b.b.b() != null)
                {
                    view = b.b.b();
                    bundle = ((bj) (view)).i.a;
                    view = ((bj) (view)).i.e;
                    return false;
                }
            }
        }
        return flag;
    }
}
