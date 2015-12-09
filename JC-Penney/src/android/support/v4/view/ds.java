// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ec, dn, bq

class ds
    implements ec
{

    dn a;

    ds(dn dn1)
    {
        a = dn1;
    }

    public void a(View view)
    {
        if (dn.c(a) >= 0)
        {
            bq.a(view, 2, null);
        }
        if (dn.a(a) != null)
        {
            dn.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ec)
        {
            obj = (ec)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ec) (obj)).a(view);
        }
    }

    public void b(View view)
    {
        if (dn.c(a) >= 0)
        {
            bq.a(view, dn.c(a), null);
            dn.a(a, -1);
        }
        if (dn.b(a) != null)
        {
            dn.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ec)
        {
            obj = (ec)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ec) (obj)).b(view);
        }
    }

    public void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ec)
        {
            obj = (ec)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ec) (obj)).c(view);
        }
    }
}
