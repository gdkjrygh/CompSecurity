// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import java.util.List;

final class idt
    implements emm, gfz, iet
{

    private boolean a;
    private List b;
    private idq c;

    idt(idq idq1)
    {
        c = idq1;
        super();
    }

    private void b()
    {
        if (idq.d(c) != null && b != null && a)
        {
            b.a(idq.e(c), b.a(idq.f(c), pwt.G, idq.d(c)));
            idq.i(c).a(iwg.a(new ieu(idq.g(c), idq.h(c))).b(new iev()).b(new ifb()), b);
        }
    }

    public final void a()
    {
        a = true;
        b();
    }

    public final void a(elb elb1)
    {
        try
        {
            idq.a(c, (ekq)elb1.a());
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1) { }
        if (idq.b(c).a())
        {
            idq.b(c);
        }
        Toast.makeText(idq.c(c), b.yK, 1).show();
        c.O_().finish();
    }

    public final void a(List list)
    {
        b = list;
        b();
    }
}
