// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec;
import com.google.android.apps.wallet.http.HttpUrlConnectionFactory;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.io.BaseEncoding;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            HttpCaller, RpcException, MessageNanoPayloadSerializer

public class CrossbarEesClientService
{
    static final class UnauthorizedException extends Exception
    {

        private UnauthorizedException()
        {
        }

    }


    private static final String TAG = com/google/android/apps/wallet/rpc/CrossbarEesClientService.getSimpleName();
    private final String accountName;
    private final WalletGoogleAuthUtil authUtil;
    private final HttpUrlConnectionFactory connectionFactory;
    private final String encryptFileUrl;
    private final HttpCaller httpCaller;
    private final CloudServiceSpec serviceSpec;
    private final String userAgent;

    public CrossbarEesClientService(WalletGoogleAuthUtil walletgoogleauthutil, HttpUrlConnectionFactory httpurlconnectionfactory, String s, String s1, CloudServiceSpec cloudservicespec, MessageNanoPayloadSerializer messagenanopayloadserializer, CloudConfigurationManager cloudconfigurationmanager)
    {
        authUtil = walletgoogleauthutil;
        connectionFactory = httpurlconnectionfactory;
        accountName = s;
        userAgent = s1;
        httpCaller = new HttpCaller(messagenanopayloadserializer);
        serviceSpec = cloudservicespec;
        walletgoogleauthutil = String.valueOf(cloudconfigurationmanager.getCloudConfig().getWhiskyUrlPrefix());
        httpurlconnectionfactory = String.valueOf("cm/s/ees/encryptFile?s7e_mode=b64file&mime_type=image/jpeg&os_type=android");
        if (httpurlconnectionfactory.length() != 0)
        {
            walletgoogleauthutil = walletgoogleauthutil.concat(httpurlconnectionfactory);
        } else
        {
            walletgoogleauthutil = new String(walletgoogleauthutil);
        }
        encryptFileUrl = walletgoogleauthutil;
    }

    private static String getQuery(List list)
        throws UnsupportedEncodingException
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        list = list.iterator();
        while (list.hasNext()) 
        {
            NameValuePair namevaluepair = (NameValuePair)list.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(URLEncoder.encode(namevaluepair.getName(), "UTF-8"));
            stringbuilder.append("=");
            stringbuilder.append(URLEncoder.encode(namevaluepair.getValue(), "UTF-8"));
        }
        return stringbuilder.toString();
    }

    private com.google.wallet.proto.api.NanoWalletEes.EesEncryptFileResponse internalEncrypt(byte abyte0[])
        throws RpcException, UnauthorizedException, IOException, GoogleAuthException
    {
        byte abyte1[];
        String s;
        try
        {
            s = authUtil.getTokenWithNotification(accountName, serviceSpec.getOauthScope(), null);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RpcException(abyte0);
        }
        abyte1 = null;
        abyte0 = postEncryptRequest(abyte0, s);
        abyte1 = abyte0;
        if (abyte0.getResponseCode() != 401)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        abyte1 = abyte0;
        throw new UnauthorizedException();
        abyte0;
        if (abyte1 != null)
        {
            abyte1.disconnect();
        }
        throw abyte0;
        abyte1 = abyte0;
        com.google.wallet.proto.api.NanoWalletEes.EesEncryptFileResponse eesencryptfileresponse = (com.google.wallet.proto.api.NanoWalletEes.EesEncryptFileResponse)httpCaller.deserializeResponse(abyte0, new com.google.wallet.proto.api.NanoWalletEes.EesEncryptFileResponse());
        if (abyte0 != null)
        {
            abyte0.disconnect();
        }
        return eesencryptfileresponse;
    }

    private HttpURLConnection postEncryptRequest(byte abyte0[], String s)
        throws IOException
    {
        HttpURLConnection httpurlconnection = connectionFactory.get(new URL(encryptFileUrl));
        httpurlconnection.setRequestMethod("POST");
        s = String.valueOf(s);
        BufferedWriter bufferedwriter;
        if (s.length() != 0)
        {
            s = "Bearer ".concat(s);
        } else
        {
            s = new String("Bearer ");
        }
        httpurlconnection.setRequestProperty("Authorization", s);
        httpurlconnection.setRequestProperty("User-Agent", userAgent);
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setDoInput(true);
        httpurlconnection.setDoOutput(true);
        s = new ArrayList();
        s.add(new BasicNameValuePair("s7e_file", BaseEncoding.base64Url().encode(abyte0)));
        s.add(new BasicNameValuePair("s7e_keytype", "29"));
        abyte0 = httpurlconnection.getOutputStream();
        bufferedwriter = new BufferedWriter(new OutputStreamWriter(abyte0, "UTF-8"));
        bufferedwriter.write(getQuery(s));
        bufferedwriter.flush();
        bufferedwriter.close();
        abyte0.close();
        httpurlconnection.connect();
        return httpurlconnection;
    }

    public final com.google.wallet.proto.api.NanoWalletEes.EesEncryptFileResponse encrypt(byte abyte0[])
        throws RpcException
    {
        int i = 0;
        do
        {
            if (i < 2)
            {
                i++;
                com.google.wallet.proto.api.NanoWalletEes.EesEncryptFileResponse eesencryptfileresponse;
                try
                {
                    eesencryptfileresponse = internalEncrypt(abyte0);
                }
                catch (UnauthorizedException unauthorizedexception)
                {
                    String s1 = TAG;
                    String s = String.valueOf(encryptFileUrl);
                    if (s.length() != 0)
                    {
                        s = "failed to post ".concat(s);
                    } else
                    {
                        s = new String("failed to post ");
                    }
                    WLog.e(s1, s, unauthorizedexception);
                    continue;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw new RpcException(abyte0);
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw new RpcException(abyte0);
                }
                return eesencryptfileresponse;
            }
            abyte0 = String.valueOf(encryptFileUrl);
            if (abyte0.length() != 0)
            {
                abyte0 = "Received HTTP response 401 from ".concat(abyte0);
            } else
            {
                abyte0 = new String("Received HTTP response 401 from ");
            }
            throw new RpcException(abyte0);
        } while (true);
    }

}
