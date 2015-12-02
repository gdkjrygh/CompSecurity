// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net;

import com.alibaba.akita.net.io.ConnectResult;
import com.alibaba.akita.net.io.ConnectUrl;
import com.alibaba.akita.net.io.DnsDispatcher;
import com.alibaba.akita.net.io.HttpInvoker;
import com.alibaba.akita.net.io.InternetUtil;
import com.alibaba.akita.net.io.IpItem;
import com.alibaba.akita.net.io.SpdyEngine;
import com.alibaba.akita.net.proxy.InvokeSignature;
import id;
import ie;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import lv;
import lw;
import me;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonProcessingException;

// Referenced classes of package com.alibaba.akita.net:
//            IAENet, NetScene, NetReqResp, NetRequest, 
//            NetResponse

public class AENetApiImpl
    implements IAENet
{

    private static final String TAG = "AENetImpl";

    public AENetApiImpl()
    {
    }

    public Object request(NetScene netscene)
        throws id
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        LinkedList linkedlist;
        Object obj3;
        long l;
        Assert.assertNotNull("scene can not be null!", netscene);
        Assert.assertNotNull("rr can not be null!", netscene.rr);
        Assert.assertNotNull("url can not be null!", netscene.getUrl());
        l = System.currentTimeMillis();
        if (me.c(netscene.getCustomUrl()))
        {
            obj1 = ConnectUrl.build(netscene.getUrl());
        } else
        {
            obj1 = ConnectUrl.build(netscene.getCustomUrl());
        }
        s1 = ((ConnectUrl) (obj1)).url;
        obj3 = new ArrayList();
        if (netscene.rr.req.getParam() != null && netscene.rr.req.getParam().size() > 0)
        {
            Iterator iterator = netscene.rr.req.getParam().entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (entry.getValue() != null)
                {
                    ((ArrayList) (obj3)).add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue()));
                }
            } while (true);
        }
        ((ArrayList) (obj3)).add(new BasicNameValuePair("_aop_nonce", InternetUtil.getRandomId()));
        obj = netscene.getSignature();
        if (obj != null)
        {
            try
            {
                obj = (InvokeSignature)((Class) (obj)).getConstructors()[0].newInstance(new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                lw.a("AENetImpl", ((Throwable) (obj)), new Object[0]);
                obj = null;
            }
            if (obj != null)
            {
                String s = ((InvokeSignature) (obj)).signature(s1, ((ArrayList) (obj3)));
                obj = ((InvokeSignature) (obj)).getSignatureParamName();
                if (s != null && obj != null && s.length() > 0 && ((String) (obj)).length() > 0)
                {
                    ((ArrayList) (obj3)).add(new BasicNameValuePair(((String) (obj)), s));
                }
            }
        }
        obj2 = "";
        linkedlist = DnsDispatcher.getDispatcher().findCachedIp(((ConnectUrl) (obj1)).url);
        if (!netscene.getNetType().equalsIgnoreCase("GET")) goto _L2; else goto _L1
_L1:
        obj = new StringBuilder(s1);
        if (s1.contains("?"))
        {
            if (!s1.endsWith("&"))
            {
                ((StringBuilder) (obj)).append("&");
            }
        } else
        {
            ((StringBuilder) (obj)).append("?");
        }
        for (obj2 = ((ArrayList) (obj3)).iterator(); ((Iterator) (obj2)).hasNext(); ((StringBuilder) (obj)).append("&"))
        {
            obj3 = (NameValuePair)((Iterator) (obj2)).next();
            ((StringBuilder) (obj)).append(((NameValuePair) (obj3)).getName());
            ((StringBuilder) (obj)).append("=");
            ((StringBuilder) (obj)).append(((NameValuePair) (obj3)).getValue());
        }

        obj1.url = ((StringBuilder) (obj)).toString();
        if (!((ConnectUrl) (obj1)).aliDomain) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = linkedlist.size();
        if (linkedlist == null || j <= 0)
        {
            break MISSING_BLOCK_LABEL_1274;
        }
        i = 0;
_L9:
        if (i >= linkedlist.size())
        {
            break MISSING_BLOCK_LABEL_1274;
        }
        obj = (IpItem)linkedlist.get(i);
        obj1.ip = ((IpItem) (obj)).ip;
        boolean flag;
        if (i == j - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1.lastIp = flag;
        if (((ConnectUrl) (obj1)).spdy && ((IpItem) (obj)).spdy)
        {
            obj = SpdyEngine.get(((ConnectUrl) (obj1)));
        } else
        {
            obj = HttpInvoker.get(((ConnectUrl) (obj1)), ((ConnectUrl) (obj1)).downgrade);
        }
        if (obj == null || ((ConnectResult) (obj)).code != 0) goto _L6; else goto _L5
_L5:
        obj1 = ((ConnectResult) (obj)).result;
        DnsDispatcher.getDispatcher().handleResult(((ConnectResult) (obj)).ip, true);
        obj = obj1;
_L10:
        lw.a("AENetImpl", (new StringBuilder()).append(s1).append(" take time:").append(System.currentTimeMillis() - l).toString(), new Object[0]);
        obj1 = netscene.getResultType();
        if (!java/lang/String.equals(obj1)) goto _L8; else goto _L7
_L7:
        netscene.rr.resp.resp = obj;
_L17:
        netscene.onSceneEnd();
        netscene = ((NetScene) (netscene.getResponse()));
        return netscene;
_L6:
        obj2 = DnsDispatcher.getDispatcher();
        if (obj != null)
        {
            obj = ((ConnectResult) (obj)).ip;
        } else
        {
            obj = null;
        }
        ((DnsDispatcher) (obj2)).handleResult(((String) (obj)), false);
        i++;
          goto _L9
_L4:
        obj = HttpInvoker.get(((ConnectUrl) (obj1)), ((ConnectUrl) (obj1)).downgrade);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1274;
        }
        obj = ((ConnectResult) (obj)).result;
          goto _L10
_L2:
        if (!netscene.getNetType().equalsIgnoreCase("POST"))
        {
            break MISSING_BLOCK_LABEL_971;
        }
        if (!((ConnectUrl) (obj1)).aliDomain)
        {
            break MISSING_BLOCK_LABEL_945;
        }
        j = linkedlist.size();
        obj = obj2;
        if (linkedlist == null) goto _L10; else goto _L11
_L11:
        obj = obj2;
        if (j <= 0) goto _L10; else goto _L12
_L12:
        i = 0;
_L13:
        obj = obj2;
        if (i < linkedlist.size())
        {
label0:
            {
                obj = (IpItem)linkedlist.get(i);
                obj1.ip = ((IpItem) (obj)).ip;
                boolean flag1;
                if (i == j - 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj1.lastIp = flag1;
                if (((ConnectUrl) (obj1)).spdy && ((IpItem) (obj)).spdy)
                {
                    obj = SpdyEngine.post(((ConnectUrl) (obj1)), ((ArrayList) (obj3)));
                } else
                {
                    obj = HttpInvoker.post(((ConnectUrl) (obj1)), ((ArrayList) (obj3)), ((ConnectUrl) (obj1)).downgrade);
                }
                if (obj == null || ((ConnectResult) (obj)).code != 0)
                {
                    break label0;
                }
                obj1 = ((ConnectResult) (obj)).result;
                DnsDispatcher.getDispatcher().handleResult(((ConnectResult) (obj)).ip, true);
                obj = obj1;
            }
        }
          goto _L10
        DnsDispatcher dnsdispatcher = DnsDispatcher.getDispatcher();
        if (obj != null)
        {
            obj = ((ConnectResult) (obj)).ip;
        } else
        {
            obj = null;
        }
        dnsdispatcher.handleResult(((String) (obj)), false);
        i++;
          goto _L13
        obj1 = HttpInvoker.post(((ConnectUrl) (obj1)), ((ArrayList) (obj3)), ((ConnectUrl) (obj1)).downgrade);
        obj = obj2;
        if (obj1 != null)
        {
            obj = ((ConnectResult) (obj1)).result;
        }
          goto _L10
        if (!((ConnectUrl) (obj1)).aliDomain)
        {
            break MISSING_BLOCK_LABEL_1162;
        }
        j = linkedlist.size();
        obj = obj2;
        if (linkedlist == null) goto _L10; else goto _L14
_L14:
        obj = obj2;
        if (j <= 0) goto _L10; else goto _L15
_L15:
        i = 0;
_L16:
        obj = obj2;
        if (i < linkedlist.size())
        {
label1:
            {
                obj = (IpItem)linkedlist.get(i);
                obj1.ip = ((IpItem) (obj)).ip;
                boolean flag2;
                if (i == j - 1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                obj1.lastIp = flag2;
                if (((ConnectUrl) (obj1)).spdy && ((IpItem) (obj)).spdy)
                {
                    obj = SpdyEngine.post(((ConnectUrl) (obj1)), ((ArrayList) (obj3)));
                } else
                {
                    obj = HttpInvoker.post(((ConnectUrl) (obj1)), ((ArrayList) (obj3)), ((ConnectUrl) (obj1)).downgrade);
                }
                if (obj == null || ((ConnectResult) (obj)).code != 0)
                {
                    break label1;
                }
                obj1 = ((ConnectResult) (obj)).result;
                DnsDispatcher.getDispatcher().handleResult(((ConnectResult) (obj)).ip, true);
                obj = obj1;
            }
        }
          goto _L10
        DnsDispatcher dnsdispatcher1 = DnsDispatcher.getDispatcher();
        if (obj != null)
        {
            obj = ((ConnectResult) (obj)).ip;
        } else
        {
            obj = null;
        }
        dnsdispatcher1.handleResult(((String) (obj)), false);
        i++;
          goto _L16
        obj1 = HttpInvoker.post(((ConnectUrl) (obj1)), ((ArrayList) (obj3)), ((ConnectUrl) (obj1)).downgrade);
        obj = obj2;
        if (obj1 != null)
        {
            obj = ((ConnectResult) (obj1)).result;
        }
          goto _L10
_L8:
        try
        {
            netscene.rr.resp.resp = lv.a(((String) (obj)), ((Class) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (NetScene netscene)
        {
            lw.a("AENetImpl", ((String) (obj)), netscene, new Object[0]);
            throw new ie(1004, netscene.getMessage(), netscene, s1);
        }
        // Misplaced declaration of an exception variable
        catch (NetScene netscene)
        {
            throw new ie(1005, netscene.getMessage(), netscene, s1);
        }
        // Misplaced declaration of an exception variable
        catch (NetScene netscene)
        {
            throw new ie(1099, netscene.getMessage(), netscene, s1);
        }
          goto _L17
        obj = "";
          goto _L10
    }
}
