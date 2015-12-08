// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import java.io.FileNotFoundException;

public final class hfr
    implements dhf, omb, opv
{

    private hfq a;
    private grg b;

    public hfr(am am)
    {
        this(((hfq) (new hfs(am))));
    }

    private hfr(hfq hfq1)
    {
        a = hfq1;
    }

    private gap a()
    {
        Object obj = b.h;
        if (obj != null)
        {
            obj = (elt)((ekp) (obj)).b(elt);
            if (obj != null)
            {
                return ((elt) (obj)).e();
            }
        }
        return null;
    }

    private boolean b()
    {
        if (ir.a())
        {
            gap gap1 = a();
            boolean flag;
            if (gap1 != null && gap1.e() && b.h.c() == euv.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (grg)olm1.a(grg);
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(b());
    }

    public final void b(MenuItem menuitem)
    {
        Object obj;
        if (!b())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = a();
        menuitem = a.a();
        ((ir) (menuitem)).a.a(2);
        obj = ((gap) (obj)).b();
        ((ir) (menuitem)).a.a("Image", ((android.net.Uri) (obj)), null);
_L1:
        return;
        menuitem;
        if (Log.isLoggable("PrintingMixin", 5))
        {
            Log.w("PrintingMixin", "Failed to print. Exception: ", menuitem);
            return;
        }
          goto _L1
    }
}
