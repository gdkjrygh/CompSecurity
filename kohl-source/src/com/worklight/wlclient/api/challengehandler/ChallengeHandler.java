// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api.challengehandler;

import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.wlclient.AsynchronousRequestSender;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.WLProcedureInvocationData;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.worklight.wlclient.api.challengehandler:
//            BaseChallengeHandler

public abstract class ChallengeHandler extends BaseChallengeHandler
    implements WLResponseListener
{

    private static Logger logger = Logger.getInstance("ChallengeHandler");

    public ChallengeHandler(String s)
    {
        super(s);
    }

    private void addGetParams(HttpGet httpget, Map map)
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        basichttpparams.setParameter("isAjaxRequest", "true");
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); basichttpparams.setParameter(s, map.get(s)))
        {
            s = (String)iterator.next();
        }

        httpget.setParams(basichttpparams);
    }

    private void addPostParams(HttpPost httppost, Map map)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("isAjaxRequest", "true"));
        if (map != null)
        {
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)map.get(s))))
            {
                s = (String)iterator.next();
            }

        }
        try
        {
            map = new UrlEncodedFormEntity(arraylist, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (HttpPost httppost)
        {
            logger.error(httppost.getMessage(), httppost);
            throw new RuntimeException(httppost);
        }
        httppost.setEntity(map);
    }

    public abstract boolean isCustomResponse(WLResponse wlresponse);

    public void submitAdapterAuthentication(WLProcedureInvocationData wlprocedureinvocationdata, WLRequestOptions wlrequestoptions)
    {
        WLRequestOptions wlrequestoptions1 = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            wlrequestoptions1 = new WLRequestOptions();
        }
        wlrequestoptions1.setFromChallenge(true);
        WLClient.getInstance().sendInvoke(wlprocedureinvocationdata, this, wlrequestoptions1);
    }

    protected void submitLoginForm(String s, Map map, Map map1, int i, String s1)
    {
        logger.debug("Request [login]");
        if (s.indexOf("http") != 0 || s.indexOf(":") <= 0)
        {
            String s3 = WLConfig.getInstance().getAppURL().toExternalForm();
            String s2 = s;
            if (s3.charAt(s3.length() - 1) != '/')
            {
                continue; /* Loop/switch isn't completed */
            }
            s2 = s;
            if (s.length() <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            s2 = s;
            if (s.charAt(0) == '/')
            {
                s2 = s.substring(1);
            }
            s = (new StringBuilder()).append(s3).append(s2).toString();
        }
        if (!s1.equalsIgnoreCase("post")) goto _L2; else goto _L1
_L1:
        s = new HttpPost(s);
        addPostParams((HttpPost)s, map);
_L4:
        s.addHeader("x-wl-app-version", WLConfig.getInstance().getApplicationVersion());
        if (map1 != null)
        {
            for (map = map1.keySet().iterator(); map.hasNext(); s.addHeader(s1, (String)map1.get(s1)))
            {
                s1 = (String)map.next();
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (s1.equalsIgnoreCase("get"))
        {
            s = new HttpGet(s);
            addGetParams((HttpGet)s, map);
        } else
        {
            throw new RuntimeException("CustomChallengeHandler.submitLoginForm: invalid request method.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        AsynchronousRequestSender.getInstance().sendCustomRequestAsync(s, i, this);
        return;
    }

    protected void submitSuccess(WLResponse wlresponse)
    {
        this;
        JVM INSTR monitorenter ;
        activeRequest.removeExpectedAnswer(getRealm());
        activeRequest = null;
        releaseWaitingList();
        this;
        JVM INSTR monitorexit ;
        return;
        wlresponse;
        this;
        JVM INSTR monitorexit ;
        throw wlresponse;
    }

}
