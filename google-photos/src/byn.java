// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class byn
    implements dcp
{

    private byh a;

    byn(byh byh1)
    {
        a = byh1;
        super();
    }

    public final void a()
    {
        if (byh.c(a) != null)
        {
            com.google.android.apps.moviemaker.ui.ActionBarShadow actionbarshadow = byh.c(a);
            boolean flag;
            if (!byh.d(a).a.j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            czx.a(actionbarshadow, flag, 400);
        }
    }
}
