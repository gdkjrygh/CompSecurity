// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class jbt
    implements dhf
{

    private jbr a;

    jbt(jbr jbr1)
    {
        a = jbr1;
        super();
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag;
        if (jbr.a(a) != null && jbr.a(a).a() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
    }

    public final void b(MenuItem menuitem)
    {
        jbr.b(a);
    }
}
