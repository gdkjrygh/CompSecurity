// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public final class eep
    implements dyb, jcc, omb, opn, ops, opv
{

    public eer a;
    public hgo b;
    public int c;
    public ArrayList d;
    private eeq e;
    private dxz f;
    private Context g;
    private jbz h;

    public eep(opd opd1)
    {
        opd1.a(this);
    }

    public final String a()
    {
        return "assistant.ui.dismiss.UndoableDismissAction";
    }

    public final void a(long l, dui dui1)
    {
        eer eer1 = new eer(l, dui1);
        d.add(eer1);
        if (!f.a(dui1))
        {
            return;
        }
        dxy dxy1 = (dxy)f.a.a(dui1.c());
        boolean flag;
        if (dxy1 != null && dxy1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            h.a(new eet(eer1));
            return;
        } else
        {
            e.a(l);
            f.a(g, dui1);
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = context;
        f = (dxz)olm1.a(dxz);
        e = (eeq)olm1.a(eeq);
        if (bundle != null)
        {
            a = (eer)bundle.getParcelable("current_pending_dismiss");
            d = bundle.getParcelableArrayList("pending_dismiss_list");
        }
        if (d == null)
        {
            d = new ArrayList();
        }
        h = (jbz)olm1.a(jbz);
        h.a(this);
    }

    public final void a(jby jby1)
    {
        a = (eer)jby1.b();
        long l = a.a;
        c = e.b(l);
        if (c != -1)
        {
            b = e.c(l);
        }
        e.a(l);
    }

    public final void a(jby jby1, Exception exception)
    {
        Toast.makeText(g, b.kX, 0).show();
    }

    public final void b(jby jby1)
    {
    }

    public final void c()
    {
        h.b(this);
    }

    public final void c(jby jby1)
    {
        d.remove(jby1.b());
        if (a != null && a.equals(jby1.b()) && c != -1 && b != null)
        {
            e.a(c, b);
            a = null;
        }
    }

    public final void e(Bundle bundle)
    {
        if (a != null)
        {
            bundle.putParcelable("current_pending_dismiss", a);
        }
        if (!d.isEmpty())
        {
            bundle.putParcelableArrayList("pending_dismiss_list", d);
        }
    }
}
