// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import com.worklight.utils.Base64;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLProcedureInvocationResult;
import com.worklight.wlclient.api.WLResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.KeyPair;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common.security:
//            WLDeviceAuthManager

class DefaultCsrRequestListener
    implements WLRequestListener
{

    private KeyPair keyPair;

    public DefaultCsrRequestListener(KeyPair keypair)
    {
        keyPair = null;
        keyPair = keypair;
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLDeviceAuthManager.getInstance().csrCertificateRecieveFailed(wlfailresponse.getResponseText());
    }

    public void onSuccess(WLResponse wlresponse)
    {
        try
        {
            Object obj = new WLProcedureInvocationResult(wlresponse);
            ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(Base64.decode(((WLProcedureInvocationResult) (obj)).getResponseText().getBytes()));
            wlresponse = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(bytearrayinputstream);
            bytearrayinputstream.close();
            obj = ((JSONObject)((WLProcedureInvocationResult) (obj)).getInvocationContext()).getString("provisioningEntity");
            WLDeviceAuthManager.getInstance().saveCertificate(((String) (obj)), keyPair, wlresponse);
            keyPair = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WLResponse wlresponse)
        {
            WLDeviceAuthManager.getInstance().csrCertificateRecieveFailed(wlresponse.getLocalizedMessage());
        }
    }
}
