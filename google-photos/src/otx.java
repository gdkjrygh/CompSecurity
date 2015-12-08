// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class otx
    implements android.view.View.OnClickListener
{

    private ott a;

    public otx(ott ott1)
    {
        a = ott1;
        super();
    }

    public final void onClick(View view)
    {
        view = a;
        if (((ott) (view)).d != null)
        {
            boolean flag = ((ott) (view)).d.b();
            if (!flag && ((ott) (view)).d.f() >= view.d())
            {
                view.a(view.c());
            }
            view = ((ott) (view)).d;
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
