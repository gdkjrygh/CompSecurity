// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            c, a, f, IAppNotifier

public class AppSdk
    implements Closeable
{

    public static final int ERROR_CHANGED_DEVICE_ID = 14;
    public static final int ERROR_CHANGED_NUID = 15;
    public static final int ERROR_EXCEPTION = 22;
    public static final int ERROR_FAILED_ACCESSING_DB = 13;
    public static final int ERROR_FAILED_CREATE_URL_STRING = 1;
    public static final int ERROR_FAILED_GENERATING_PING = 6;
    public static final int ERROR_FAILED_HTTP_SEND = 9;
    public static final int ERROR_FAILED_PARSING_CONFIG = 3;
    public static final int ERROR_FAILED_PARSING_METADATA = 5;
    public static final int ERROR_FAILED_PARSING_PLAY = 4;
    public static final int ERROR_FAILED_PROCESSOR_START = 7;
    public static final int ERROR_FAILED_PROCESS_ID3 = 8;
    public static final int ERROR_FAILED_PROCESS_PLAYHEAD_POS = 20;
    public static final int ERROR_FAILED_PROCESS_STOP = 21;
    public static final int ERROR_FAILED_RECEIVE_CONFIG = 2;
    public static final int ERROR_FAILED_SDK_SUSPEND = 17;
    public static final int ERROR_FAILED_SENDING_PING = 10;
    public static final int ERROR_FAILED_SENDING_STATION_ID = 12;
    public static final int ERROR_FAILED_SENDING_TSV = 11;
    public static final int ERROR_INVALID_PARAMETERS = 18;
    public static final int ERROR_INVALID_STATE = 19;
    public static final int ERROR_SDK_NOT_INITIALIZED = 16;
    public static final int EVENT_FATAL = 2003;
    public static final int EVENT_INITIATE = 2000;
    public static final int EVENT_SHUTDOWN = 2002;
    public static final int EVENT_STARTUP = 2001;
    private static f a = null;
    private static AppSdk b = null;
    private static a c = null;
    private static boolean d = false;
    private static boolean e = false;

    private AppSdk(Context context, String s, IAppNotifier iappnotifier)
    {
        com.nielsen.app.sdk.c.a(iappnotifier);
        e = false;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.isEmpty() || context == null) goto _L2; else goto _L3
_L3:
        boolean flag;
        s = a(s);
        flag = s.toLowerCase(Locale.getDefault()).contains("\"nol_devdebug\":\"true\"");
        d = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: getInstance API - ")).append(s).toString());
        if (c == null)
        {
            c = com.nielsen.app.sdk.a.a(context, s, null);
        }
        if (a == null && c != null)
        {
            a = f.a(s, context);
        }
        if (c != null && a != null)
        {
            c.a(a);
            e = true;
        }
_L9:
label0:
        {
            {
                if (!d)
                {
                    break label0;
                }
                s = new StringBuilder("Nielsen AppSDK: getInstance API - ");
                if (e)
                {
                    context = "SUCCESS";
                } else
                {
                    context = "FAILED";
                }
                context = s.append(context).toString();
            }
            Log.d("AppSdk", context);
        }
_L4:
        return;
_L2:
        Log.d("AppSdk", "Nielsen AppSDK: getInstance API - FAILED; empty or null JSON string or empty context");
        continue; /* Loop/switch isn't completed */
        context;
        Log.e("AppSdk", (new StringBuilder("Nielsen AppSDK: getInstance API - JSON EXCEPTION; ")).append(context.getMessage()).toString());
        if (d)
        {
            s = new StringBuilder("Nielsen AppSDK: getInstance API - ");
            if (e)
            {
                context = "SUCCESS";
            } else
            {
                context = "FAILED";
            }
            context = s.append(context).toString();
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
        context;
        Log.e("AppSdk", (new StringBuilder("Nielsen AppSDK: getInstance API - EXCEPTION; ")).append(context.getMessage()).toString());
        if (d)
        {
            s = new StringBuilder("Nielsen AppSDK: getInstance API - ");
            if (e)
            {
                context = "SUCCESS";
            } else
            {
                context = "FAILED";
            }
            context = s.append(context).toString();
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
        context;
        Log.e("AppSdk", (new StringBuilder("Nielsen AppSDK: getInstance API - ERROR; ")).append(context.getMessage()).toString());
        if (!d) goto _L4; else goto _L5
_L5:
        s = new StringBuilder("Nielsen AppSDK: getInstance API - ");
        if (e)
        {
            context = "SUCCESS";
        } else
        {
            context = "FAILED";
        }
        context = s.append(context).toString();
        if (true) goto _L7; else goto _L6
_L6:
        break MISSING_BLOCK_LABEL_446;
_L7:
        break MISSING_BLOCK_LABEL_173;
        s;
        if (d)
        {
            iappnotifier = new StringBuilder("Nielsen AppSDK: getInstance API - ");
            if (e)
            {
                context = "SUCCESS";
            } else
            {
                context = "FAILED";
            }
            Log.d("AppSdk", iappnotifier.append(context).toString());
        }
        throw s;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static String a(String s)
    {
        if (d)
        {
            Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: trimJSONString API - JSON input : ")).append(s).toString());
        }
        s = new JSONObject(s);
        JSONObject jsonobject = new JSONObject();
        String s1;
        String s2;
        for (Iterator iterator = s.keys(); iterator.hasNext(); jsonobject.put(s1.trim(), s2.trim()))
        {
            s1 = (String)iterator.next();
            s2 = s.getString(s1);
        }

        s = jsonobject.toString();
        if (d)
        {
            Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: trimJSONString API - JSON output : ")).append(s).toString());
        }
        return s;
    }

    static boolean a()
    {
        return d;
    }

    public static AppSdk getInstance(Context context, String s, IAppNotifier iappnotifier)
    {
        com/nielsen/app/sdk/AppSdk;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new AppSdk(context, s, iappnotifier);
        }
        try
        {
            if (!e)
            {
                com.nielsen.app.sdk.c.c(16);
                b.close();
                b = null;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        context = b;
        com/nielsen/app/sdk/AppSdk;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static String getLastError()
    {
        String s1 = com.nielsen.app.sdk.a.e();
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: getLastError API - ");
            String s;
            if (s1 != null && !s1.isEmpty())
            {
                s = s1;
            } else
            {
                s = "NONE";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return s1;
    }

    public static String getLastEvent()
    {
        String s1 = com.nielsen.app.sdk.a.d();
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: getLastEvent API - ");
            String s;
            if (s1 != null && !s1.isEmpty())
            {
                s = s1;
            } else
            {
                s = "NONE";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return s1;
    }

    public static String getMeterVersion()
    {
        String s1 = com.nielsen.app.sdk.a.f();
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: getMeterVersion API - ");
            String s;
            if (s1 != null && !s1.isEmpty())
            {
                s = s1;
            } else
            {
                s = "NONE";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return s1;
    }

    public static boolean isValid()
    {
        if (c == null)
        {
            e = false;
        }
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: isValid API - ");
            String s;
            if (e)
            {
                s = "TRUE";
            } else
            {
                s = "FALSE";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return e;
    }

    public AppSdk appDisableApi(boolean flag)
    {
        Object obj;
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: appDisableApi API - ");
            StringBuilder stringbuilder1;
            if (flag)
            {
                obj = "TRUE";
            } else
            {
                obj = "FALSE";
            }
            Log.d("AppSdk", stringbuilder.append(((String) (obj))).toString());
        }
        obj = null;
        if (c == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        if (c.a(flag))
        {
            obj = b;
        }
        if (d)
        {
            stringbuilder1 = new StringBuilder("Nielsen AppSDK: appDisableApi API - ");
            String s;
            if (obj == null)
            {
                s = "FAILED";
            } else
            {
                s = "SUCCESS";
            }
            Log.d("AppSdk", stringbuilder1.append(s).toString());
        }
        return ((AppSdk) (obj));
    }

    public void close()
    {
        if (d)
        {
            Log.d("AppSdk", "Nielsen AppSDK: close API");
        }
        if (a != null)
        {
            a.close();
            a = null;
        }
        if (c != null)
        {
            e = false;
            c.close();
            c = null;
        }
    }

    public String getDeviceId()
    {
        String s = "";
        if (c == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        {
            s = c.h();
        }
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: getDeviceId API - ");
            String s1;
            if (s != null && !s.isEmpty())
            {
                s1 = s;
            } else
            {
                s1 = "NONE";
            }
            Log.d("AppSdk", stringbuilder.append(s1).toString());
        }
        return s;
    }

    public String getNielsenId()
    {
        String s = "";
        if (c == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        {
            s = c.g();
        }
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: getNielsenId API - ");
            String s1;
            if (s != null && !s.isEmpty())
            {
                s1 = s;
            } else
            {
                s1 = "NONE";
            }
            Log.d("AppSdk", stringbuilder.append(s1).toString());
        }
        return s;
    }

    public AppSdk loadMetadata(String s)
    {
        Object obj;
        StringBuilder stringbuilder;
        if (d)
        {
            stringbuilder = new StringBuilder("Nielsen AppSDK: loadMetadata API - ");
            if (s != null && !s.isEmpty())
            {
                obj = s;
            } else
            {
                obj = "EMPTY";
            }
            Log.d("AppSdk", stringbuilder.append(((String) (obj))).toString());
        }
        stringbuilder = null;
        if (s != null && (s == null || !s.isEmpty())) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(18);
        obj = stringbuilder;
_L4:
        if (d)
        {
            stringbuilder = new StringBuilder("Nielsen AppSDK: loadMetadata API - ");
            if (obj == null)
            {
                s = "FAILED";
            } else
            {
                s = "SUCCESS";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return ((AppSdk) (obj));
_L2:
        obj = stringbuilder;
        if (c == null) goto _L4; else goto _L3
_L3:
        s = a(s);
        obj = stringbuilder;
        if (!c.a(s)) goto _L4; else goto _L5
_L5:
        obj = b;
          goto _L4
        s;
        Log.e("AppSdk", (new StringBuilder("Nielsen AppSDK: loadMetadata API - JSON EXCEPTION; ")).append(s.getMessage()).toString());
        obj = stringbuilder;
          goto _L4
        s;
        Log.e("AppSdk", (new StringBuilder("Nielsen AppSDK: loadMetadata API - EXCEPTION; ")).append(s.getMessage()).toString());
        obj = stringbuilder;
          goto _L4
    }

    public AppSdk play(String s)
    {
        String s1;
        Object obj;
        if (d)
        {
            obj = new StringBuilder("Nielsen AppSDK: play API - ");
            if (s != null && !s.isEmpty())
            {
                s1 = s;
            } else
            {
                s1 = "EMPTY";
            }
            Log.d("AppSdk", ((StringBuilder) (obj)).append(s1).toString());
        }
        s1 = null;
        obj = a(s);
        if (c != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
        s = s1;
_L4:
        if (d)
        {
            obj = new StringBuilder("Nielsen AppSDK: play API - ");
            if (s == null)
            {
                s1 = "FAILED";
            } else
            {
                s1 = "SUCCESS";
            }
            Log.d("AppSdk", ((StringBuilder) (obj)).append(s1).toString());
        }
        return s;
_L2:
        s = s1;
        if (!c.c(((String) (obj)))) goto _L4; else goto _L3
_L3:
        s = b;
          goto _L4
        s;
        Log.e("AppSdk", (new StringBuilder("Nielsen AppSDK: play API - JSON EXCEPTION; ")).append(s.getMessage()).toString());
        s = s1;
          goto _L4
        s;
        Log.e("AppSdk", (new StringBuilder("Nielsen AppSDK: play API - EXCEPTION; ")).append(s.getMessage()).toString());
        s = s1;
          goto _L4
    }

    public AppSdk sendID3(String s)
    {
        Object obj;
        StringBuilder stringbuilder;
        if (d)
        {
            stringbuilder = new StringBuilder("Nielsen AppSDK: sendID3 API - ");
            if (s != null && !s.isEmpty())
            {
                obj = s;
            } else
            {
                obj = "EMPTY";
            }
            Log.d("AppSdk", stringbuilder.append(((String) (obj))).toString());
        }
        stringbuilder = null;
        if (c != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
        obj = stringbuilder;
_L4:
        if (d && obj != null)
        {
            Log.d("AppSdk", "Nielsen AppSDK: sendID3 API - SUCCESS");
        }
        return ((AppSdk) (obj));
_L2:
        obj = stringbuilder;
        try
        {
            if (c.b(s))
            {
                obj = b;
            }
        }
        catch (Exception exception)
        {
            if (d)
            {
                exception = (new StringBuilder("Nielsen AppSDK: sendID3 API - FAILED - ")).append(exception.getMessage()).append(" - ");
                if (s == null || s.isEmpty())
                {
                    s = "EMPTY";
                }
                Log.d("AppSdk", exception.append(s).toString());
            }
            com.nielsen.app.sdk.c.c(18);
            exception = stringbuilder;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public AppSdk setPlayheadPosition(long l)
    {
        AppSdk appsdk = null;
        if (c != null) goto _L2; else goto _L1
_L1:
        com.nielsen.app.sdk.c.c(16);
_L4:
        if (d && appsdk == null)
        {
            Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: setPlayheadPosition API - FAILED; ")).append(String.valueOf(l)).toString());
        }
        return appsdk;
_L2:
        if (c.a(l))
        {
            appsdk = b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public AppSdk stop()
    {
        boolean flag = true;
        boolean flag1 = false;
        if (d)
        {
            Log.d("AppSdk", "Nielsen AppSDK: stop API");
        }
        Object obj;
        if (c == null)
        {
            com.nielsen.app.sdk.c.c(16);
            obj = null;
        } else
        {
            obj = new boolean[1];
            obj[0] = false;
            if (c.a(((boolean []) (obj))) && obj[0])
            {
                c = null;
                flag = flag1;
            } else
            {
                flag = true;
            }
            obj = b;
        }
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: stop API - ");
            String s;
            if (flag)
            {
                s = "BACKGROUND";
            } else
            {
                s = "STOPPED";
            }
            stringbuilder = stringbuilder.append(s).append(" - ");
            if (obj == null)
            {
                s = "FAILED";
            } else
            {
                s = "SUCCESS";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return ((AppSdk) (obj));
    }

    public AppSdk suspend()
    {
        AppSdk appsdk;
        if (c == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        if (!c.a())
        {
            c = null;
            b = null;
        }
        appsdk = b;
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: suspend API - ");
            String s;
            if (b == null)
            {
                s = "TERMINATED";
            } else
            {
                s = "BACKGROUND";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return appsdk;
    }

    public AppSdk userOptOut(String s)
    {
        Object obj;
        if (d)
        {
            StringBuilder stringbuilder = new StringBuilder("Nielsen AppSDK: userOptOut API - ");
            if (s != null && !s.isEmpty())
            {
                obj = s;
            } else
            {
                obj = "NULL";
            }
            Log.d("AppSdk", stringbuilder.append(((String) (obj))).toString());
        }
        obj = null;
        if (c == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        if (s == null || s.isEmpty())
        {
            if (d)
            {
                Log.d("AppSdk", "Nielsen AppSDK: userOptOut API - FAILED; empty or null parameter");
            }
            com.nielsen.app.sdk.c.c(18);
        } else
        if (c.d(s))
        {
            obj = b;
        }
        if (d)
        {
            stringbuilder = new StringBuilder("Nielsen AppSDK: userOptOut API - ");
            if (obj == null)
            {
                s = "FAILED";
            } else
            {
                s = "SUCCESS";
            }
            Log.d("AppSdk", stringbuilder.append(s).toString());
        }
        return ((AppSdk) (obj));
    }

    public String userOptOutURLString()
    {
        String s = "";
        if (c == null)
        {
            com.nielsen.app.sdk.c.c(16);
        } else
        {
            s = c.i();
        }
        if (d && s != null && !s.isEmpty())
        {
            Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: userOptOutURLString API - SUCCESS; ")).append(s).toString());
        }
        return s;
    }

}
