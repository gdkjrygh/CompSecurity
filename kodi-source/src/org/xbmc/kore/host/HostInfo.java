// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

public class HostInfo
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/host/HostInfo);
    private String address;
    private String auxImageHttpAddress;
    private int eventServerPort;
    private int httpPort;
    private int id;
    private String macAddress;
    private String name;
    private String password;
    private int protocol;
    private int tcpPort;
    private boolean useEventServer;
    private String username;
    private int wolPort;

    public HostInfo(int i, String s, String s1, int j, int k, int l, String s2, 
            String s3, String s4, int i1, boolean flag, int j1)
    {
        id = i;
        name = s;
        address = s1;
        if (!HostConnection.isValidProtocol(j))
        {
            throw new IllegalArgumentException("Invalid protocol specified.");
        } else
        {
            protocol = j;
            httpPort = k;
            tcpPort = l;
            username = s2;
            password = s3;
            macAddress = s4;
            wolPort = i1;
            useEventServer = flag;
            eventServerPort = j1;
            auxImageHttpAddress = (new StringBuilder()).append(getHttpURL()).append("/image/").toString();
            return;
        }
    }

    public HostInfo(String s, String s1, int i, int j, int k, String s2, String s3, 
            boolean flag, int l)
    {
        this(-1, s, s1, i, j, k, s2, s3, null, 9, flag, l);
    }

    public String getAddress()
    {
        return address;
    }

    public int getEventServerPort()
    {
        return eventServerPort;
    }

    public int getHttpPort()
    {
        return httpPort;
    }

    public String getHttpURL()
    {
        return (new StringBuilder()).append("http://").append(address).append(":").append(httpPort).toString();
    }

    public int getId()
    {
        return id;
    }

    public String getImageUrl(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (new StringBuilder()).append(auxImageHttpAddress).append(URLEncoder.encode(s, "UTF-8")).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public String getJsonRpcHttpEndpoint()
    {
        return (new StringBuilder()).append("http://").append(address).append(":").append(httpPort).append("/jsonrpc").toString();
    }

    public String getMacAddress()
    {
        return macAddress;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public int getProtocol()
    {
        return protocol;
    }

    public int getTcpPort()
    {
        return tcpPort;
    }

    public boolean getUseEventServer()
    {
        return useEventServer;
    }

    public String getUsername()
    {
        return username;
    }

    public int getWolPort()
    {
        return wolPort;
    }

    public void setMacAddress(String s)
    {
        macAddress = s;
    }

    public void setProtocol(int i)
    {
        if (!HostConnection.isValidProtocol(i))
        {
            throw new IllegalArgumentException("Invalid protocol specified.");
        } else
        {
            protocol = i;
            return;
        }
    }

    public void setUseEventServer(boolean flag)
    {
        useEventServer = flag;
    }

    public void setWolPort(int i)
    {
        wolPort = i;
    }

}
