// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, CordovaResourceApi, PluginManager

public class CordovaBridge
{

    private static final String LOG_TAG = "CordovaBridge";
    private volatile int expectedBridgeSecret;
    private NativeToJsMessageQueue jsMessageQueue;
    private String loadedUrl;
    private PluginManager pluginManager;

    public CordovaBridge(PluginManager pluginmanager, NativeToJsMessageQueue nativetojsmessagequeue)
    {
        expectedBridgeSecret = -1;
        pluginManager = pluginmanager;
        jsMessageQueue = nativetojsmessagequeue;
    }

    private boolean verifySecret(String s, int i)
        throws IllegalAccessException
    {
        if (!jsMessageQueue.isBridgeEnabled())
        {
            if (i == -1)
            {
                Log.d("CordovaBridge", (new StringBuilder()).append(s).append(" call made before bridge was enabled.").toString());
            } else
            {
                Log.d("CordovaBridge", (new StringBuilder()).append("Ignoring ").append(s).append(" from previous page load.").toString());
            }
            return false;
        }
        if (expectedBridgeSecret < 0 || i != expectedBridgeSecret)
        {
            throw new IllegalAccessException();
        } else
        {
            return true;
        }
    }

    void clearBridgeSecret()
    {
        expectedBridgeSecret = -1;
    }

    int generateBridgeSecret()
    {
        expectedBridgeSecret = (int)(Math.random() * 2147483647D);
        return expectedBridgeSecret;
    }

    public NativeToJsMessageQueue getMessageQueue()
    {
        return jsMessageQueue;
    }

    public String jsExec(int i, String s, String s1, String s2, String s3)
        throws JSONException, IllegalAccessException
    {
        if (!verifySecret("exec()", i))
        {
            return null;
        }
        if (s3 == null)
        {
            return "@Null arguments.";
        }
        jsMessageQueue.setPaused(true);
        CordovaResourceApi.jsThread = Thread.currentThread();
        pluginManager.exec(s, s1, s2, s3);
        s = jsMessageQueue.popAndEncode(false);
        jsMessageQueue.setPaused(false);
        return s;
        s;
        s.printStackTrace();
        jsMessageQueue.setPaused(false);
        return "";
        s;
        jsMessageQueue.setPaused(false);
        throw s;
    }

    public String jsRetrieveJsMessages(int i, boolean flag)
        throws IllegalAccessException
    {
        if (!verifySecret("retrieveJsMessages()", i))
        {
            return null;
        } else
        {
            return jsMessageQueue.popAndEncode(flag);
        }
    }

    public void jsSetNativeToJsBridgeMode(int i, int j)
        throws IllegalAccessException
    {
        if (!verifySecret("setNativeToJsBridgeMode()", i))
        {
            return;
        } else
        {
            jsMessageQueue.setBridgeMode(j);
            return;
        }
    }

    public String promptOnJsPrompt(String s, String s1, String s2)
    {
        if (s2 == null || s2.length() <= 3 || !s2.startsWith("gap:")) goto _L2; else goto _L1
_L1:
        s = new JSONArray(s2.substring(4));
        s1 = jsExec(s.getInt(0), s.getString(1), s.getString(2), s.getString(3), s1);
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
_L5:
        return s;
        s;
        s.printStackTrace();
_L3:
        return "";
        s;
        s.printStackTrace();
        if (true) goto _L3; else goto _L2
_L2:
        if (s2 != null && s2.startsWith("gap_bridge_mode:"))
        {
            try
            {
                jsSetNativeToJsBridgeMode(Integer.parseInt(s2.substring(16)), Integer.parseInt(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            return "";
        }
        if (s2 != null && s2.startsWith("gap_poll:"))
        {
            int i = Integer.parseInt(s2.substring(9));
            try
            {
                s1 = jsRetrieveJsMessages(i, "1".equals(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return "";
            }
            s = s1;
            if (s1 == null)
            {
                return "";
            }
        } else
        if (s2 != null && s2.startsWith("gap_init:"))
        {
            if (s.startsWith("file:") || s.startsWith("http") && loadedUrl.startsWith(s))
            {
                int j = Integer.parseInt(s2.substring(9));
                jsMessageQueue.setBridgeMode(j);
                j = generateBridgeSecret();
                return (new StringBuilder()).append("").append(j).toString();
            } else
            {
                Log.e("CordovaBridge", (new StringBuilder()).append("gap_init called from restricted origin: ").append(s).toString());
                return "";
            }
        } else
        {
            return null;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void reset(String s)
    {
        jsMessageQueue.reset();
        clearBridgeSecret();
        loadedUrl = s;
    }
}
