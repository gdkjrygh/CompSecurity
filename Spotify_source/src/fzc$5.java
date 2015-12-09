// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.provider.PaymentState;

final class ang.Object
    implements an
{

    private final String a[] = {
        "current_user", "streaming_rule_shuffle", "product_type", "can_stream", "product_expiry", "payment_state"
    };
    private fzc b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtw.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst() && !fzc.c(b))
        {
            fzc.b(b, gcw.a(((Cursor) (obj)), 1));
            fzc.c(b, gcw.a(((Cursor) (obj)), 3));
            fzc.a(b, ((Cursor) (obj)).getString(4));
            fzc.a(b, new PaymentState(((Cursor) (obj)).getString(5)));
            fzc.l(b);
            String s = ((Cursor) (obj)).getString(2);
            fzc.b(b, s);
            obj = ((Cursor) (obj)).getString(0);
            fzc.c(b, ((String) (obj)));
            fzc.m(b);
            fzc.g(b);
            fzc.i(b);
        }
    }

    (fzc fzc1)
    {
        b = fzc1;
        super();
    }
}
