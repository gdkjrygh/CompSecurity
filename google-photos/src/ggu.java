// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ggu
    implements android.view.View.OnClickListener
{

    private ggp a;

    ggu(ggp ggp1)
    {
        a = ggp1;
        super();
    }

    public final void onClick(View view)
    {
        if ((ggl)ggp.g(a).a("auto_backup_fragment") != null)
        {
            if (!ggp.c(a).d)
            {
                (new ghm()).a(a.h(), "continue_without_backup");
                return;
            } else
            {
                ggp.h(a);
                return;
            }
        } else
        {
            ggp.i(a);
            return;
        }
    }
}
