// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api.challengehandler;

import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseChallengeHandler
{

    protected WLRequest activeRequest;
    private String realm;
    private List requestWaitingList;

    protected BaseChallengeHandler(String s)
    {
        activeRequest = null;
        requestWaitingList = new ArrayList();
        realm = s;
    }

    public void clearChallengeRequests()
    {
        this;
        JVM INSTR monitorenter ;
        activeRequest = null;
        clearWaitingList();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void clearWaitingList()
    {
        this;
        JVM INSTR monitorenter ;
        requestWaitingList.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String getRealm()
    {
        return realm;
    }

    public abstract void handleChallenge(Object obj);

    public void releaseWaitingList()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = requestWaitingList.iterator(); iterator.hasNext(); ((WLRequest)iterator.next()).removeExpectedAnswer(realm)) { }
        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        throw exception;
        clearWaitingList();
        this;
        JVM INSTR monitorexit ;
    }

    public void startHandleChallenge(WLRequest wlrequest, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (wlrequest.getOptions().isFromChallenge())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (activeRequest == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        requestWaitingList.add(wlrequest);
        this;
        JVM INSTR monitorexit ;
        return;
        activeRequest = wlrequest;
        this;
        JVM INSTR monitorexit ;
        handleChallenge(obj);
        return;
        wlrequest;
        this;
        JVM INSTR monitorexit ;
        throw wlrequest;
    }

    protected void submitFailure(WLResponse wlresponse)
    {
        if (activeRequest.shouldFailOnChallengeCancel())
        {
            activeRequest.processFailureResponse(new WLFailResponse(WLErrorCode.CHALLENGE_HANDLING_CANCELED, WLErrorCode.CHALLENGE_HANDLING_CANCELED.getDescription(), activeRequest.getOptions()));
        }
        clearChallengeRequests();
    }
}
