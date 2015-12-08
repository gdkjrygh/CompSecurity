// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import org.apache.http.client.HttpResponseException;

// Referenced classes of package io.card.payment:
//            f, P

final class aj extends f
{

    private P a;

    aj(P p)
    {
        a = p;
        super();
    }

    public final void a(String s)
    {
        a.authorizeScanSuccessful();
    }

    public final void a(Throwable throwable)
    {
        if (throwable instanceof HttpResponseException)
        {
            if (((HttpResponseException)throwable).getStatusCode() == 401)
            {
                a.authorizeScanUnsuccessful();
                return;
            } else
            {
                a.authorizeScanFailed(throwable);
                return;
            }
        } else
        {
            a.authorizeScanFailed(throwable);
            return;
        }
    }
}
