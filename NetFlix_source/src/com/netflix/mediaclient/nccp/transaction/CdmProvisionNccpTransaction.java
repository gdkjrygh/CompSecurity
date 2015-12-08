// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp.transaction;

import android.content.Context;
import android.util.Base64;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.nccp.BaseNccpTransaction;
import com.netflix.mediaclient.nccp.NccpResponse;
import com.netflix.mediaclient.nccp.NccpResponseHandler;
import com.netflix.mediaclient.nccp.RequestParameter;
import com.netflix.mediaclient.nccp.response.CdmProvisionNccpResponse;
import com.netflix.mediaclient.nccp.response.EmptyReponse;
import com.netflix.mediaclient.nccp.response.NccpTransactionApplicationError;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import java.util.ArrayList;
import java.util.List;

public class CdmProvisionNccpTransaction extends BaseNccpTransaction
{

    private byte keyRequest[];

    public CdmProvisionNccpTransaction(Context context, EsnProvider esnprovider, NccpResponseHandler nccpresponsehandler, byte abyte0[])
    {
        super(context, esnprovider, nccpresponsehandler);
        keyRequest = abyte0;
    }

    protected StringBuilder createCustomRequest(StringBuilder stringbuilder)
    {
        String s = Base64.encodeToString(keyRequest, 2);
        if (Log.isLoggable("nf_nccp", 3))
        {
            Log.d("nf_nccp", (new StringBuilder()).append("Key request encoded base64: ").append(s).toString());
        }
        stringbuilder.append("<nccp:cdmprovision>");
        stringbuilder.append("<nccp:cdmtype>MediaDrm.Widevine</nccp:cdmtype>");
        stringbuilder.append("<nccp:keyrequest>");
        stringbuilder.append(s);
        stringbuilder.append("</nccp:keyrequest>");
        stringbuilder.append("</nccp:cdmprovision>");
        return stringbuilder;
    }

    public String getName()
    {
        return "cdmprovision";
    }

    public List getRequestHeaders()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new RequestParameter("X-AuthenticationType", "NONE"));
        arraylist.add(new RequestParameter("X-AllowCompression", "false"));
        arraylist.add(new RequestParameter("Content-Type", "application/x-www-form-urlencoded"));
        arraylist.add(new RequestParameter("X-ESN", mEsn.getEsn()));
        arraylist.add(new RequestParameter("X-DeviceModel", mEsn.getDeviceModel()));
        return arraylist;
    }

    public NccpResponse processError(Throwable throwable)
    {
        return new NccpTransactionApplicationError(throwable, getName());
    }

    public NccpResponse processResponseBody(String s)
    {
        try
        {
            s = new CdmProvisionNccpResponse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_nccp", (new StringBuilder()).append("Failed to parse response for ").append(getName()).toString(), s);
            return new EmptyReponse(getName());
        }
        return s;
    }
}
