// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bzd
    implements android.view.View.OnClickListener
{

    private bza a;

    bzd(bza bza1)
    {
        a = bza1;
        super();
    }

    public final void onClick(View view)
    {
        view = a;
        if (((bza) (view)).a != null)
        {
            boolean flag = ((bza) (view)).a.b();
            if (!flag)
            {
                long l;
                if (((bza) (view)).b != null)
                {
                    l = ((bza) (view)).b.e;
                } else
                {
                    l = 0L;
                }
                view.a(l);
            }
            view = ((bza) (view)).a;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.a(flag);
        }
    }
}
