// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.api.WLRequestOptions;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import org.apache.http.protocol.BasicHttpContext;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common.security:
//            WLProvisioningDelegate, WLDeviceAuthManager, DefaultCsrRequestListener

public class ProvisioningDelegateImpl
    implements WLProvisioningDelegate
{

    protected static final String PROVISIONING_ENTITY = "provisioningEntity";
    protected static final String REALM = "realm";
    DefaultCsrRequestListener listener;

    public ProvisioningDelegateImpl()
    {
        listener = null;
    }

    public void sendCSR(String s, Context context)
    {
        try
        {
            Object obj = WLDeviceAuthManager.getInstance().generateKeyPair();
            Object obj2 = new JSONObject(s);
            Object obj1 = ((JSONObject) (obj2)).getString("realm");
            obj2 = ((JSONObject) (obj2)).getString("provisioningEntity");
            String s1 = WLDeviceAuthManager.getInstance().createCsrHeader(((java.security.KeyPair) (obj)), s);
            s = new WLRequestOptions();
            s.addHeader("csr", s1);
            s.addHeader("realm", ((String) (obj1)));
            obj1 = new JSONObject();
            ((JSONObject) (obj1)).put("provisioningEntity", obj2);
            s.setInvocationContext(obj1);
            listener = new DefaultCsrRequestListener(((java.security.KeyPair) (obj)));
            obj = new BasicHttpContext();
            obj1 = new WLConfig(context);
            (new WLRequest(listener, ((org.apache.http.protocol.HttpContext) (obj)), s, ((WLConfig) (obj1)), context)).makeRequest("provisioning", true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }
}
