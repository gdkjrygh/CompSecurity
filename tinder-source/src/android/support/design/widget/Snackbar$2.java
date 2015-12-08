// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            Snackbar, e

final class a
    implements a
{

    final Snackbar a;

    public final void a()
    {
        e e1;
        a a1;
        Snackbar snackbar = a;
        e1 = e.a();
        a1 = snackbar.c;
        Object obj = e1.a;
        obj;
        JVM INSTR monitorenter ;
        if (e1.d(a1))
        {
            e.a(e1.b);
        }
        Exception exception;
        boolean flag;
        if (e1.c != null && e1.c.a(a1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        e.a(e1.c);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            e.a().b(Snackbar.a(a));
            return;

        case 0: // '\0'
            e.a().c(Snackbar.a(a));
            return;
        }
    }

    (Snackbar snackbar)
    {
        a = snackbar;
        super();
    }
}
