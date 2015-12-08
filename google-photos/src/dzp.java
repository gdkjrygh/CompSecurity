// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;

final class dzp extends mtf
{

    private final nql a;
    private final nqn b;
    private final int c;

    dzp(nql nql1, nqn nqn1, int i)
    {
        super("com.google.android.apps.photos.assistant.remote.SyncNotifications");
        a = nql1;
        b = nqn1;
        c = i;
    }

    protected final mue a(Context context)
    {
        noz noz1;
        long l = noy.a();
        noz noz2 = noz.a(context, 3, "RemoteNotificationSrc", new String[0]);
        noz1 = noz.a(context, 5, "RemoteNotificationSrc", new String[0]);
        b.a(false);
        nqk nqk1 = nqk.a;
        nqx nqx1 = nqx.a;
        a.a(c, nqk1, nqx1);
        int i = 0;
        nqv nqv1;
        do
        {
            if (i >= 10 || !a.a(c, nqk1))
            {
                break;
            }
            nqv1 = a.b(c, nqk1, nqx1);
            i++;
        } while (nqv1.a == nqw.a);
        if (noz2.a())
        {
            noy.a("duration", l);
        }
        ((gcc)olm.a(context, gcc)).a(c, get.f);
_L2:
        return new mue(true);
        context;
        if (noz1.a())
        {
            context = String.valueOf("Error performing all photos delta sync during remote notification syncing for account: ");
            int j = c;
            (new StringBuilder(String.valueOf(context).length() + 11)).append(context).append(j);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
