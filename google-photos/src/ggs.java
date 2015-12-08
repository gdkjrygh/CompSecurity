// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListView;

final class ggs
    implements android.view.View.OnClickListener
{

    private ggp a;

    ggs(ggp ggp1)
    {
        a = ggp1;
        super();
    }

    public final void onClick(View view)
    {
        view = a;
        boolean flag;
        if (ggp.e(a).getVisibility() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ggp.a(view, flag);
    }
}
