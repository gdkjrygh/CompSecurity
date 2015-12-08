// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.token;

import android.support.v4.util.j;
import android.text.TextUtils;
import com.microsoft.onlineid.g;
import com.skype.SkyLib;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.token:
//            MsaTokenRequestCallback

public class MsaTokenRequest
{

    private static final String SECURITY_SCOPE_POLICY = "MBI_SSL";
    private final EventSubscriberBinder eventBinder;
    private final SkyLib lib;
    private final Logger log = Logger.getLogger(com/skype/android/app/token/MsaTokenRequest.getSimpleName());
    private final j tokenCallbackSparseArray = new j();

    public MsaTokenRequest(EventBus eventbus, SkyLib skylib)
    {
        lib = skylib;
        eventBinder = new EventSubscriberBinder(eventbus, this);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAuthTokenResult onauthtokenresult)
    {
        if (!onauthtokenresult.getSuccess()) goto _L2; else goto _L1
_L1:
        int i;
        i = onauthtokenresult.getRequest_id();
        log.info((new StringBuilder("Token received for token request id ")).append(i).toString());
        MsaTokenRequestCallback msatokenrequestcallback;
        synchronized (tokenCallbackSparseArray)
        {
            msatokenrequestcallback = (MsaTokenRequestCallback)tokenCallbackSparseArray.a(i);
            tokenCallbackSparseArray.b(i);
        }
        if (msatokenrequestcallback != null) goto _L4; else goto _L3
_L3:
        log.severe(String.format("Token result from request Id %d ignored as its MsaTokenRequestCallback is not found.", new Object[] {
            Integer.valueOf(i)
        }));
_L6:
        synchronized (tokenCallbackSparseArray)
        {
            if (tokenCallbackSparseArray.a() == 0)
            {
                eventBinder.unbind();
            }
        }
        return;
        onauthtokenresult;
        j1;
        JVM INSTR monitorexit ;
        throw onauthtokenresult;
        Exception exception;
        exception;
        synchronized (tokenCallbackSparseArray)
        {
            if (tokenCallbackSparseArray.a() == 0)
            {
                eventBinder.unbind();
            }
        }
        throw exception;
_L4:
        msatokenrequestcallback.onMsaTokenRetrieved(onauthtokenresult.getToken());
        continue; /* Loop/switch isn't completed */
_L2:
        log.severe("Failed to get token.");
        if (true) goto _L6; else goto _L5
_L5:
        exception1;
        onauthtokenresult;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        onauthtokenresult;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public void requestTicket(String s, MsaTokenRequestCallback msatokenrequestcallback)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Scope must be non empty.");
        }
        if (msatokenrequestcallback == null)
        {
            throw new IllegalArgumentException("Non null MsaTokenRequestCallback required.");
        }
        synchronized (tokenCallbackSparseArray)
        {
            if (tokenCallbackSparseArray.a() == 0)
            {
                eventBinder.bind();
            }
        }
        obj = (new g(s, "MBI_SSL")).toString();
        int i = lib.requestAccessToken(com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt(), ((String) (obj)), true);
        synchronized (tokenCallbackSparseArray)
        {
            tokenCallbackSparseArray.b(i, msatokenrequestcallback);
        }
        log.info(String.format("Requested MSA token for scope %s with request id %d.", new Object[] {
            obj, Integer.valueOf(i)
        }));
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        msatokenrequestcallback;
        s;
        JVM INSTR monitorexit ;
        throw msatokenrequestcallback;
    }
}
