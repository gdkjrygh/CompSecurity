// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            CollectionService

final class e extends JsonCallbackReceiver
{

    private ssaging a;
    private String b;
    private Flags c;
    private com.spotify.mobile.android.util. d;
    private Semaphore e;
    private CollectionService f;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ver.ErrorCause errorcause)
    {
        CollectionService.a(f, a, sult.d, c, d);
        e.release();
    }

    protected final void onResolved(Response response, Object obj)
    {
        int i = response.getStatus();
        if (i >= 200 && i <= 299)
        {
            obj = f;
            ssaging ssaging = a;
            if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(b))
            {
                response = sult.a;
            } else
            {
                response = sult.b;
            }
            CollectionService.a(((CollectionService) (obj)), ssaging, response, c, d);
        } else
        {
            obj = f;
            ssaging ssaging1 = a;
            if (i == 507)
            {
                response = sult.c;
            } else
            {
                response = sult.d;
            }
            CollectionService.a(((CollectionService) (obj)), ssaging1, response, c, d);
        }
        e.release();
    }

    ssaging(CollectionService collectionservice, Handler handler, Class class1, ssaging ssaging, String s, Flags flags, com.spotify.mobile.android.util. , 
            Semaphore semaphore)
    {
        f = collectionservice;
        a = ssaging;
        b = s;
        c = flags;
        d = ;
        e = semaphore;
        super(handler, class1);
    }
}
