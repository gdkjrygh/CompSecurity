// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

final class beq extends Handler
{

    private bem a;

    beq(bem bem1)
    {
        a = bem1;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (message.what == bfa.d.f)
        {
            bem.d(a);
            mry.a(bem.e(a), 31, (new msn()).a(new msm(pwu.A)).a(bem.f(a)));
        }
        if (message.what == bfa.e.f)
        {
            if (bem.g(a))
            {
                bem.h(a);
            } else
            {
                bem.i(a);
            }
            mry.a(bem.j(a), 3, (new msn()).a(new msm(pwu.A)).a(bem.k(a)));
        }
    }
}
