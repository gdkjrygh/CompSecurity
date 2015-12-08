// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.internal.mw;

// Referenced classes of package com.google.android.gms.wallet:
//            h

final class g
    implements i
{

    g()
    {
    }

    public final com.google.android.gms.common.api.h a(Context context, Looper looper, h h1, Object obj, n n, o o)
    {
        obj = (com.google.android.gms.wallet.h)obj;
        ap.b(context instanceof Activity, "An Activity must be used for Wallet APIs");
        Activity activity = (Activity)context;
        if (obj != null)
        {
            context = ((Context) (obj));
        } else
        {
            context = new com.google.android.gms.wallet.h((byte)0);
        }
        return new mw(activity, looper, n, o, ((com.google.android.gms.wallet.h) (context)).a, h1.a(), ((com.google.android.gms.wallet.h) (context)).b);
    }
}
