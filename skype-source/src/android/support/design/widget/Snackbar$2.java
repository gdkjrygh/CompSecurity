// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            Snackbar, n

final class a
    implements sBehavior.a
{

    final Snackbar a;

    public final void a()
    {
        Snackbar.a(a);
    }

    public final void a(int i)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            n.a().d(Snackbar.b(a));
            return;

        case 0: // '\0'
            n.a().e(Snackbar.b(a));
            return;
        }
    }

    sBehavior.a(Snackbar snackbar)
    {
        a = snackbar;
        super();
    }
}
