// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Window;

final class tp
    implements wk
{

    private td a;

    tp(td td1)
    {
        a = td1;
        super();
    }

    public final void a(vu vu1, boolean flag)
    {
label0:
        {
            vu vu2 = vu1.k();
            td td1;
            boolean flag1;
            if (vu2 != vu1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            td1 = a;
            if (flag1)
            {
                vu1 = vu2;
            }
            vu1 = td1.a(vu1);
            if (vu1 != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                a.a(((to) (vu1)).a, vu1, vu2);
                a.a(vu1, true);
            }
            return;
        }
        a.a(vu1, flag);
    }

    public final boolean a_(vu vu1)
    {
        if (vu1 == null && a.h)
        {
            android.view.Window.Callback callback = ((sv) (a)).b.getCallback();
            if (callback != null && !((sv) (a)).n)
            {
                callback.onMenuOpened(108, vu1);
            }
        }
        return true;
    }
}
