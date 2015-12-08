// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.simple.JSONValue;

// Referenced classes of package com.conviva.utils:
//            Settings, LivePassVersion

public abstract class PlatformUtils
{

    protected static PlatformUtils _instance = null;
    private static List logBuffer = new LinkedList();
    protected final String DEFAULT_CLIENT_ID = "0";
    private final int MAX_SIZE_LOGBUFFER = 32;
    public final String _PLATFORM = "Android";
    public String _PLATFORM_VER;
    protected final String _TAG = "CONVIVA";
    private boolean _isSendingPing;
    private String _pingUrl;
    private final Random _rand = new Random();
    protected int _referenceCount;
    protected Settings _settings;
    public String clientId;

    protected PlatformUtils(Settings settings)
        throws Exception
    {
        _referenceCount = 0;
        _settings = null;
        clientId = "0";
        _pingUrl = null;
        _isSendingPing = false;
        _PLATFORM_VER = null;
        _settings = settings;
        _referenceCount = 1;
        _pingUrl = null;
        _isSendingPing = false;
        _instance = this;
    }

    public static PlatformUtils getInstance()
        throws Exception
    {
        if (_instance == null)
        {
            throw new Exception("CreateUtils module has not been called");
        } else
        {
            return _instance;
        }
    }

    private void initPing()
    {
        if (_pingUrl == null)
        {
            String s = "";
            if (clientId != null)
            {
                s = (new StringBuilder()).append("&uuid=").append(clientId).toString();
            }
            _pingUrl = (new StringBuilder()).append(_settings.pingUrl).append("?comp=").append(_settings.pingComponentName).append("&clv=").append(LivePassVersion.getVersion3Str()).append("&cid=").append(_settings.customerKey).append(s).toString();
        }
    }

    private void onUncaughtException(String s, Exception exception)
    {
        try
        {
            ping((new StringBuilder()).append("Uncaught exception: ").append(exception.toString()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            err((new StringBuilder()).append("Caught exception while sending ping: ").append(s.toString()).toString());
        }
    }

    private String urlEncodeString(String s)
        throws UnsupportedEncodingException
    {
        return URLEncoder.encode(s, "UTF-8");
    }

    public void cleanup()
    {
        _referenceCount = _referenceCount - 1;
        if (_referenceCount > 0)
        {
            return;
        } else
        {
            _settings = null;
            _instance = null;
            return;
        }
    }

    public abstract void deleteLocalData();

    public double epochTimeMs()
    {
        return (double)(new Date()).getTime();
    }

    public void err(String s)
    {
        log((new StringBuilder()).append("ERROR: ").append(s).toString());
    }

    public List getLogs(int i)
    {
        List list = logBuffer;
        logBuffer = new LinkedList();
        return list;
    }

    public abstract Map getPlatformMetadata();

    public Settings getSettings()
    {
        return _settings;
    }

    public abstract void httpRequest(boolean flag, String s, String s1, String s2, CallableWithParameters.With1 with1);

    public abstract boolean inSleepingMode();

    public abstract boolean isVisible();

    public Map jsonDecode(String s)
    {
        try
        {
            s = (Map)JSONValue.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            err((new StringBuilder()).append("Failed to decode json string: ").append(s.toString()).toString());
            return null;
        }
        return s;
    }

    public String jsonEncode(Map map)
    {
        try
        {
            map = JSONValue.toJSONString(map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            err((new StringBuilder()).append("Failed to encode json object: ").append(map.toString()).toString());
            return null;
        }
        return map;
    }

    public void log(String s)
    {
        logConsole(s);
        String s1 = String.format("%.3f", new Object[] {
            Double.valueOf(epochTimeMs() / 1000D)
        });
        s = (new StringBuilder()).append("[").append(s1).append("] ").append(s).toString();
        if (logBuffer.size() >= 32)
        {
            logBuffer.remove(0);
        }
        logBuffer.add(s);
    }

    public abstract void logConsole(String s);

    public void logSession(String s, int i)
    {
        log((new StringBuilder()).append("sid=").append(i).append(" ").append(s).toString());
    }

    public int parseInt(String s, int i)
    {
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public void ping(String s)
    {
        if (_isSendingPing)
        {
            return;
        }
        try
        {
            _isSendingPing = true;
            initPing();
            s = (new StringBuilder()).append(_pingUrl).append("&d=").append(urlEncodeString(s)).toString();
            err((new StringBuilder()).append("Ping: ").append(s).toString());
            httpRequest(false, s, null, null, null);
            _isSendingPing = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            _isSendingPing = false;
        }
        err("Failed to send ping");
        return;
    }

    public int randInt()
    {
        return _rand.nextInt();
    }

    public int randUInt()
    {
        int i = Math.abs(randInt());
        if (i >= 0)
        {
            return i;
        } else
        {
            return 0;
        }
    }

    public void runProtected(Callable callable, String s)
    {
        try
        {
            callable.call();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            onUncaughtException(s, callable);
        }
    }

    public abstract void setClientIdFromServer(String s);

    public abstract void startFetchClientId();

}
