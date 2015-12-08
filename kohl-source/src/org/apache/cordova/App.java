// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaPlugin, CordovaInterface, PluginResult, CallbackContext, 
//            CordovaWebView, LOG

public class App extends CordovaPlugin
{

    protected static final String TAG = "CordovaApp";
    private BroadcastReceiver telephonyReceiver;

    public App()
    {
    }

    private void initTelephonyReceiver()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PHONE_STATE");
        telephonyReceiver = new BroadcastReceiver() {

            final App this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state"))
                {
                    context = intent.getStringExtra("state");
                    if (context.equals(TelephonyManager.EXTRA_STATE_RINGING))
                    {
                        LOG.i("CordovaApp", "Telephone RINGING");
                        webView.postMessage("telephone", "ringing");
                    } else
                    {
                        if (context.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
                        {
                            LOG.i("CordovaApp", "Telephone OFFHOOK");
                            webView.postMessage("telephone", "offhook");
                            return;
                        }
                        if (context.equals(TelephonyManager.EXTRA_STATE_IDLE))
                        {
                            LOG.i("CordovaApp", "Telephone IDLE");
                            webView.postMessage("telephone", "idle");
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = App.this;
                super();
            }
        };
        cordova.getActivity().registerReceiver(telephonyReceiver, intentfilter);
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

    public void clearCache()
    {
        cordova.getActivity().runOnUiThread(new Runnable() {

            final App this$0;

            public void run()
            {
                webView.clearCache(true);
            }

            
            {
                this$0 = App.this;
                super();
            }
        });
    }

    public void clearHistory()
    {
        cordova.getActivity().runOnUiThread(new Runnable() {

            final App this$0;

            public void run()
            {
                webView.clearHistory();
            }

            
            {
                this$0 = App.this;
                super();
            }
        });
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        PluginResult.Status status = PluginResult.Status.OK;
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
        if (!s.equals("loadUrl")) goto _L5; else goto _L4
_L4:
        loadUrl(jsonarray.getString(0), jsonarray.optJSONObject(1));
          goto _L3
_L5:
        if (s.equals("cancelLoadUrl")) goto _L3; else goto _L6
_L6:
        if (!s.equals("clearHistory"))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        clearHistory();
          goto _L3
label1:
        {
            if (!s.equals("backHistory"))
            {
                break label1;
            }
            backHistory();
        }
          goto _L3
        try
        {
label2:
            {
                if (!s.equals("overrideButton"))
                {
                    break label2;
                }
                overrideButton(jsonarray.getString(0), jsonarray.getBoolean(1));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            callbackcontext.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
            return false;
        }
          goto _L3
        if (!s.equals("overrideBackbutton")) goto _L8; else goto _L7
_L7:
        overrideBackbutton(jsonarray.getBoolean(0));
          goto _L3
_L8:
        if (!s.equals("exitApp")) goto _L3; else goto _L9
_L9:
        exitApp();
          goto _L3
    }

    public void exitApp()
    {
        webView.postMessage("exit", null);
    }

    public boolean isBackbuttonOverridden()
    {
        return webView.isButtonPlumbedToJs(4);
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

    public void onDestroy()
    {
        cordova.getActivity().unregisterReceiver(telephonyReceiver);
    }

    public void overrideBackbutton(boolean flag)
    {
        LOG.i("App", "WARNING: Back Button Default Behavior will be overridden.  The backbutton event will be fired!");
        webView.setButtonPlumbedToJs(4, flag);
    }

    public void overrideButton(String s, boolean flag)
    {
        LOG.i("App", "WARNING: Volume Button Default Behavior will be overridden.  The volume event will be fired!");
        if (s.equals("volumeup"))
        {
            webView.setButtonPlumbedToJs(24, flag);
        } else
        if (s.equals("volumedown"))
        {
            webView.setButtonPlumbedToJs(25, flag);
            return;
        }
    }

    public void pluginInitialize()
    {
        initTelephonyReceiver();
    }
}
