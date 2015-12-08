// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.BindEvent;
import com.netflix.mediaclient.event.nrdp.registration.ActivateEvent;
import com.netflix.mediaclient.event.nrdp.registration.DeactivatedEvent;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.javabridge.ui.Callback;
import com.netflix.mediaclient.javabridge.ui.Device;
import com.netflix.mediaclient.javabridge.ui.DeviceAccount;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.javabridge.ui.Registration;
import com.netflix.mediaclient.javabridge.ui.Storage;
import com.netflix.mediaclient.javabridge.ui.android.registration.CreateAccountCompleteCommand;
import com.netflix.mediaclient.javabridge.ui.android.registration.DeactivateCompleteCommand;
import com.netflix.mediaclient.javabridge.ui.android.registration.SelectedAccountCompleteCommand;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdObject

public final class NativeRegistration extends NativeNrdObject
    implements Registration
{

    public static final String CMD_RESULT_EVENT_activateComplete = "activateComplete";
    public static final String CMD_RESULT_EVENT_bindComplete = "bindComplete";
    public static final String CMD_RESULT_EVENT_createAccountComplete = "createdAccount";
    public static final String CMD_RESULT_EVENT_deactivateComplete = "deactivate";
    public static final String CMD_RESULT_EVENT_selectAccountComplete = "selectedAccount";
    public static final String METHOD_createDeviceAccount = "createDeviceAccount";
    public static final String METHOD_deactivate = "deactivate";
    public static final String METHOD_deactivateAll = "deactivateAll";
    public static final String METHOD_emailActivate = "emailActivate";
    public static final String METHOD_esnMigration = "esnMigration";
    public static final String METHOD_getDeviceTokens = "getDeviceTokens";
    public static final String METHOD_massDeactivationCheck = "massDeactivationCheck";
    public static final String METHOD_ping = "ping";
    public static final String METHOD_selectDeviceAccount = "selectDeviceAccount";
    public static final String METHOD_setActivationTokens = "setActivationTokens";
    public static final String METHOD_setUILanguages = "setUILanguages";
    public static final String METHOD_tokenActivate = "tokenActivate";
    public static final String METHOD_unselectDeviceAccount = "unselectDeviceAccount";
    private static final String TAG = "nf_reg";
    private List accounts;
    private ActivationTokens activationTokens;
    private String currentDeviceAccount;
    private boolean registered;

    public NativeRegistration(Bridge bridge)
    {
        super(bridge);
        accounts = new ArrayList();
    }

    private int handleEvent(JSONObject jsonobject)
        throws Exception
    {
        JSONObject jsonobject1 = getJSONObject(jsonobject, "data", null);
        String s = getString(jsonobject, "name", null);
        if (jsonobject1 != null && jsonobject1.has("idx"))
        {
            Log.w("nf_reg", "handleEvent data !null");
            if ("deactivate".equals(s))
            {
                return handleCallback(new DeactivateCompleteCommand(jsonobject1));
            }
            if ("createdAccount".equals(s))
            {
                return handleCallback(new CreateAccountCompleteCommand(jsonobject1));
            }
            if ("selectedAccount".equals(s))
            {
                return handleCallback(new SelectedAccountCompleteCommand(jsonobject1));
            }
        }
        if (jsonobject.has("name"))
        {
            return handleEventByName(jsonobject);
        } else
        {
            Log.w("nf_reg", "Nobody to handle!");
            return 1;
        }
    }

    private int handleEventByName(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = getJSONObject(jsonobject, "data", null);
        jsonobject = getString(jsonobject, "name", null);
        if (!"bind".equals(jsonobject) && !"activate".endsWith(jsonobject) || 1 != handleNccpEvent(jsonobject, jsonobject1))
        {
            Log.d("nf_reg", (new StringBuilder()).append("Received a event: ").append(jsonobject).toString());
            if ("bind".equals(jsonobject))
            {
                return handleListener(jsonobject, new BindEvent(jsonobject1));
            }
            if ("activateComplete".equals(jsonobject) || "activate".equals(jsonobject))
            {
                return handleListener(jsonobject, new ActivateEvent(jsonobject1));
            }
            if ("deactivated".equals(jsonobject))
            {
                return handleListener(jsonobject, new DeactivatedEvent(jsonobject1));
            }
            if (Log.isLoggable("nf_reg", 5))
            {
                Log.w("nf_reg", (new StringBuilder()).append("Nobody to handle by name ").append(jsonobject).toString());
                return 1;
            }
        }
        return 1;
    }

    private int handlePropertyUpdate(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1;
        jsonobject1 = getJSONObject(jsonobject, "properties", null);
        if (jsonobject1 == null)
        {
            Log.w("nf_reg", "handlePropertyUpdate:: properties does not exist");
            return 0;
        }
        if (jsonobject1.has("registered"))
        {
            registered = jsonobject1.getBoolean("registered");
        }
        if (jsonobject1.has("currentDeviceAccount"))
        {
            currentDeviceAccount = getString(jsonobject1, "currentDeviceAccount", null);
            if (currentDeviceAccount != null && jsonobject1.has("registered"))
            {
                registered = getBoolean(jsonobject1, "registered", false);
            }
        }
        jsonobject = accounts;
        jsonobject;
        JVM INSTR monitorenter ;
        if (!jsonobject1.has("deviceAccounts")) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        accounts.clear();
        jsonarray = getJSONArray(jsonobject1, "deviceAccounts");
        int i = 0;
_L3:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        DeviceAccount deviceaccount = new DeviceAccount(jsonarray.getJSONObject(i));
        if (Log.isLoggable("nf_reg", 3))
        {
            Log.d("nf_reg", (new StringBuilder()).append("Account ").append(i).append(": ").append(deviceaccount).toString());
        }
        accounts.add(deviceaccount);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        jsonobject;
        JVM INSTR monitorexit ;
        if (jsonobject1.has("appResetRequired"))
        {
            Log.d("nf_reg", "handlePropertyUpdate:: appResetRequired");
            handleListener("appResetRequired", null);
        }
        return 1;
        Exception exception;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void createDeviceAccount(Callback callback)
    {
        invokeMethodWithCallback("registration", "createDeviceAccount", null, callback);
    }

    public void deactivate(DeviceAccount deviceaccount, Callback callback)
    {
        if (deviceaccount == null || deviceaccount.getAccountKey() == null)
        {
            throw new IllegalArgumentException("Dak is null!");
        }
        bridge.getNrdp().getStorage().clear(deviceaccount.getAccountKey());
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("key", deviceaccount.getAccountKey());
            invokeMethodWithCallback("registration", "deactivate", jsonobject, callback);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DeviceAccount deviceaccount)
        {
            Log.e("nf_reg", "Deactivate device account failed because of ", deviceaccount);
        }
    }

    public void deactivateAll(Callback callback)
    {
        bridge.getNrdp().getDevice().factoryReset(callback);
    }

    public void emailActivate(String s, String s1)
    {
        if (currentDeviceAccount != null)
        {
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("email", s);
                jsonobject.put("passwd", s1);
                bridge.getNrdProxy().invokeMethod("registration", "emailActivate", jsonobject.toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("nf_reg", "emailActivate failed with ", s);
            }
            return;
        } else
        {
            Log.e("nf_reg", "Failed with token activate. Current device account is NOT set!");
            return;
        }
    }

    public void esnMigration()
    {
        bridge.getNrdProxy().invokeMethod("registration", "esnMigration", null);
    }

    public ActivationTokens getActivationTokens()
    {
        return activationTokens;
    }

    public DeviceAccount getCurrentDeviceAccount()
    {
        Object obj = currentDeviceAccount;
        if (obj != null && !"".equals(((String) (obj)).trim())) goto _L2; else goto _L1
_L1:
        Log.d("nf_reg", "Device account is NOT selected!");
        obj = null;
_L4:
        return ((DeviceAccount) (obj));
_L2:
        Iterator iterator = accounts.iterator();
        DeviceAccount deviceaccount;
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            deviceaccount = (DeviceAccount)iterator.next();
        } while (!((String) (obj)).equals(deviceaccount.getAccountKey()));
        obj = deviceaccount;
        if (Log.isLoggable("nf_reg", 3))
        {
            Log.d("nf_reg", (new StringBuilder()).append("Selected device account ").append(deviceaccount).toString());
            return deviceaccount;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("nf_reg", 5))
        {
            Log.w("nf_reg", (new StringBuilder()).append("Account is not found for key ").append(((String) (obj))).toString());
        }
        return null;
    }

    public DeviceAccount[] getDeviceAccounts()
    {
        return (DeviceAccount[])accounts.toArray(new DeviceAccount[accounts.size()]);
    }

    public void getDeviceTokens()
    {
        bridge.getNrdProxy().invokeMethod("registration", "getDeviceTokens", null);
    }

    public String getName()
    {
        return "registration";
    }

    public String getPath()
    {
        return "nrdp.registration";
    }

    public String[] getUILanguages()
    {
        DeviceAccount deviceaccount = getCurrentDeviceAccount();
        if (deviceaccount != null && deviceaccount.getLanguages() != null)
        {
            return deviceaccount.getLanguages();
        } else
        {
            return bridge.getNrdp().getDevice().getUILanguages();
        }
    }

    protected int handleNccpEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        if (Log.isLoggable("nf_reg", 3))
        {
            Log.d("nf_reg", (new StringBuilder()).append("NCCP event ").append(s).toString());
        }
        if (jsonobject.has("origin") && jsonobject.getString("origin").equalsIgnoreCase("complete"))
        {
            Log.d("nf_reg", "NCCP event with origin equal complete. Ignore.");
            return 1;
        } else
        {
            Log.d("nf_reg", "NCCP event: handle by implementation");
            return 0;
        }
    }

    public boolean isRegistered()
    {
        return registered;
    }

    public void massDeactivationCheck()
    {
        bridge.getNrdProxy().invokeMethod("registration", "massDeactivationCheck", null);
    }

    public void ping()
    {
        bridge.getNrdProxy().invokeMethod("registration", "ping", null);
    }

    public int processUpdate(JSONObject jsonobject)
    {
        int i;
        try
        {
            String s = getString(jsonobject, "type", null);
            if (Log.isLoggable("nf_reg", 3))
            {
                Log.d("nf_reg", (new StringBuilder()).append("processUpdate: handle type ").append(s).toString());
            }
            if (!"PropertyUpdate".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_103;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf_reg", "Failed with JSON", jsonobject);
            return 1;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (Log.isLoggable("nf_reg", 3))
        {
            Log.d("nf_reg", (new StringBuilder()).append("processUpdate: handle prop update ").append(jsonobject.toString()).toString());
        }
        return handlePropertyUpdate(jsonobject);
        Log.d("nf_reg", "processUpdate: handle event");
        i = handleEvent(jsonobject);
        return i;
    }

    public void selectDeviceAccount(DeviceAccount deviceaccount, Callback callback)
    {
        if (deviceaccount == null || deviceaccount.getAccountKey() == null)
        {
            throw new IllegalArgumentException("Dak is null!");
        }
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("key", deviceaccount.getAccountKey());
            invokeMethodWithCallback("registration", "selectDeviceAccount", jsonobject, callback);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DeviceAccount deviceaccount)
        {
            Log.e("nf_reg", "Create device account failed because of ", deviceaccount);
        }
    }

    public void setActivationTokens(ActivationTokens activationtokens)
    {
        activationTokens = activationtokens;
        if (activationtokens == null)
        {
            Log.w("nf_reg", "setActivationTokens:: tokens are null!");
            return;
        } else
        {
            bridge.getNrdProxy().invokeMethod("registration", "setActivationTokens", activationtokens.toJSON().toString());
            return;
        }
    }

    public void setUILanguages(String as[])
    {
        DeviceAccount deviceaccount = getCurrentDeviceAccount();
        if (deviceaccount == null)
        {
            Log.w("nf_reg", "Current account is NULL! UI languages can not be set!");
            return;
        } else
        {
            deviceaccount.setLanguages(as);
            as = StringUtils.joinArray(as);
            bridge.getNrdProxy().invokeMethod("registration", "setUILanguages", (new StringBuilder()).append("{languages:").append(as).append("}").toString());
            return;
        }
    }

    public void tokenActivate(ActivationTokens activationtokens)
    {
        if (currentDeviceAccount != null)
        {
            bridge.getNrdProxy().invokeMethod("registration", "tokenActivate", activationtokens.toJSON().toString());
            return;
        } else
        {
            Log.e("nf_reg", "Failed with token activate. Current device account is NOT set!");
            return;
        }
    }

    public void unselectDeviceAccount(Callback callback)
    {
        invokeMethodWithCallback("registration", "unselectDeviceAccount", null, callback);
    }
}
