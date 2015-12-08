// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import java.util.HashMap;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.LOG;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

public class App extends CordovaPlugin
{

    public App()
    {
    }

    public void backHistory()
    {
        cordova.getActivity().runOnUiThread(new Runnable() {

            final App this$0;

            public void run()
            {
                webView.backHistory();
            }

            
            {
                this$0 = App.this;
                super();
            }
        });
    }

    public void cancelLoadUrl()
    {
        cordova.cancelLoadUrl();
    }

    public void clearCache()
    {
        webView.clearCache(true);
    }

    public void clearHistory()
    {
        webView.clearHistory();
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        org.apache.cordova.api.PluginResult.Status status = org.apache.cordova.api.PluginResult.Status.OK;
        if (!s.equals("clearCache")) goto _L2; else goto _L1
_L1:
        clearCache();
_L3:
        callbackcontext.sendPluginResult(new PluginResult(status, ""));
        return true;
_L2:
label0:
        {
            if (!s.equals("show"))
            {
                break label0;
            }
            cordova.getActivity().runOnUiThread(new Runnable() {

                final App this$0;

                public void run()
                {
                    webView.postMessage("spinner", "stop");
                }

            
            {
                this$0 = App.this;
                super();
            }
            });
        }
          goto _L3
label1:
        {
            if (!s.equals("loadUrl"))
            {
                break label1;
            }
            loadUrl(jsonarray.getString(0), jsonarray.optJSONObject(1));
        }
          goto _L3
label2:
        {
            if (!s.equals("cancelLoadUrl"))
            {
                break label2;
            }
            cancelLoadUrl();
        }
          goto _L3
label3:
        {
            if (!s.equals("clearHistory"))
            {
                break label3;
            }
            clearHistory();
        }
          goto _L3
label4:
        {
            if (!s.equals("backHistory"))
            {
                break label4;
            }
            backHistory();
        }
          goto _L3
        try
        {
label5:
            {
                if (!s.equals("overrideButton"))
                {
                    break label5;
                }
                overrideButton(jsonarray.getString(0), jsonarray.getBoolean(1));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION));
            return false;
        }
          goto _L3
        if (!s.equals("overrideBackbutton")) goto _L5; else goto _L4
_L4:
        overrideBackbutton(jsonarray.getBoolean(0));
          goto _L3
_L5:
        if (!s.equals("exitApp")) goto _L3; else goto _L6
_L6:
        exitApp();
          goto _L3
    }

    public void exitApp()
    {
        webView.postMessage("exit", null);
    }

    public boolean isBackbuttonOverridden()
    {
        return webView.isBackButtonBound();
    }

    public void loadUrl(String s, JSONObject jsonobject)
        throws JSONException
    {
        HashMap hashmap;
        int k;
        boolean flag2;
        boolean flag3;
        LOG.d("App", (new StringBuilder()).append("App.loadUrl(").append(s).append(",").append(jsonobject).append(")").toString());
        k = 0;
        int i = 0;
        flag3 = false;
        boolean flag = false;
        flag2 = false;
        boolean flag1 = false;
        hashmap = new HashMap();
        if (jsonobject != null)
        {
            JSONArray jsonarray = jsonobject.names();
            int j = 0;
            do
            {
                flag2 = flag1;
                flag3 = flag;
                k = i;
                if (j >= jsonarray.length())
                {
                    break;
                }
                String s1 = jsonarray.getString(j);
                if (s1.equals("wait"))
                {
                    k = jsonobject.getInt(s1);
                    flag3 = flag;
                    flag2 = flag1;
                } else
                if (s1.equalsIgnoreCase("openexternal"))
                {
                    flag3 = jsonobject.getBoolean(s1);
                    flag2 = flag1;
                    k = i;
                } else
                if (s1.equalsIgnoreCase("clearhistory"))
                {
                    flag2 = jsonobject.getBoolean(s1);
                    flag3 = flag;
                    k = i;
                } else
                {
                    Object obj = jsonobject.get(s1);
                    flag2 = flag1;
                    flag3 = flag;
                    k = i;
                    if (obj != null)
                    {
                        if (obj.getClass().equals(java/lang/String))
                        {
                            hashmap.put(s1, (String)obj);
                            flag2 = flag1;
                            flag3 = flag;
                            k = i;
                        } else
                        if (obj.getClass().equals(java/lang/Boolean))
                        {
                            hashmap.put(s1, (Boolean)obj);
                            flag2 = flag1;
                            flag3 = flag;
                            k = i;
                        } else
                        {
                            flag2 = flag1;
                            flag3 = flag;
                            k = i;
                            if (obj.getClass().equals(java/lang/Integer))
                            {
                                hashmap.put(s1, (Integer)obj);
                                flag2 = flag1;
                                flag3 = flag;
                                k = i;
                            }
                        }
                    }
                }
                j++;
                flag1 = flag2;
                flag = flag3;
                i = k;
            } while (true);
        }
        if (k <= 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        long l = k;
        wait(l);
        this;
        JVM INSTR monitorexit ;
_L2:
        webView.showWebPage(s, flag3, flag2, hashmap);
        return;
        jsonobject;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw jsonobject;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
        if (true) goto _L2; else goto _L3
_L3:
    }

    public void overrideBackbutton(boolean flag)
    {
        LOG.i("App", "WARNING: Back Button Default Behaviour will be overridden.  The backbutton event will be fired!");
        webView.bindButton(flag);
    }

    public void overrideButton(String s, boolean flag)
    {
        LOG.i("DroidGap", "WARNING: Volume Button Default Behaviour will be overridden.  The volume event will be fired!");
        webView.bindButton(s, flag);
    }
}
