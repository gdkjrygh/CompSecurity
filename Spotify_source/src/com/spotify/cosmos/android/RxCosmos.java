// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import dmz;
import duh;
import dup;
import hew;
import hfv;
import hfw;
import hgv;
import hkf;
import hkh;

// Referenced classes of package com.spotify.cosmos.android:
//            Router

public class RxCosmos
{

    private RxCosmos()
    {
    }

    public static hew getRouter(Context context)
    {
        Intent intent = new Intent("com.spotify.mobile.service.action.COSMOS_PROXY");
        intent.setPackage(context.getPackageName());
        return (new hgv(duh.a(context, intent).c(new hfw() {

            public final Router call(IBinder ibinder)
            {
                return (Router)ibinder;
            }

            public final volatile Object call(Object obj)
            {
                return call((IBinder)obj);
            }

        }).b(((dup)dmz.a(dup)).c()), new hfv() {

            public final hkh call()
            {
                return hkf.e();
            }

            public final volatile Object call()
            {
                return call();
            }

        })).e();
    }
}
