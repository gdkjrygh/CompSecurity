// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Vibrator;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMJSResponse, MMWebView

class BridgeMMNotification extends MMJSObject
    implements android.content.DialogInterface.OnClickListener
{

    private String ALERT;
    private String VIBRATE;
    private int index;

    BridgeMMNotification()
    {
        ALERT = "alert";
        VIBRATE = "vibrate";
    }

    public MMJSResponse alert(final Map arguments)
    {
        this;
        JVM INSTR monitorenter ;
        arguments = runOnUiThreadFuture(new Callable() {

            final BridgeMMNotification this$0;
            final Map val$arguments;

            public MMJSResponse call()
            {
                Object obj = (MMWebView)mmWebViewRef.get();
                if (obj != null)
                {
                    Object obj1 = ((MMWebView) (obj)).getActivity();
                    obj = arguments;
                    if (obj1 != null)
                    {
                        if (!((Activity) (obj1)).isFinishing())
                        {
                            obj1 = (new android.app.AlertDialog.Builder(((Context) (obj1)))).create();
                            if (((Map) (obj)).containsKey("title"))
                            {
                                ((AlertDialog) (obj1)).setTitle((CharSequence)((Map) (obj)).get("title"));
                            }
                            if (((Map) (obj)).containsKey("message"))
                            {
                                ((AlertDialog) (obj1)).setMessage((CharSequence)((Map) (obj)).get("message"));
                            }
                            if (((Map) (obj)).containsKey("cancelButton"))
                            {
                                ((AlertDialog) (obj1)).setButton(-2, (CharSequence)((Map) (obj)).get("cancelButton"), BridgeMMNotification.this);
                            }
                            if (((Map) (obj)).containsKey("buttons"))
                            {
                                String as[] = ((String)((Map) (obj)).get("buttons")).split(",");
                                if (as.length > 0)
                                {
                                    ((AlertDialog) (obj1)).setButton(-3, as[0], BridgeMMNotification.this);
                                }
                                if (as.length > 1)
                                {
                                    ((AlertDialog) (obj1)).setButton(-1, as[1], BridgeMMNotification.this);
                                }
                            }
                            ((AlertDialog) (obj1)).show();
                        }
                        as = new MMJSResponse();
                        as.result = 1;
                        as.response = Integer.valueOf(index);
                        return as;
                    }
                }
                return null;
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMNotification.this;
                arguments = map;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return arguments;
        arguments;
        throw arguments;
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if (ALERT.equals(s))
        {
            mmjsresponse = alert(map);
        } else
        if (VIBRATE.equals(s))
        {
            return vibrate(map);
        }
        return mmjsresponse;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        index = 0;
        if (i != -3)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        index = 1;
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        index = 2;
        dialoginterface.cancel();
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        dialoginterface;
        throw dialoginterface;
    }

    public MMJSResponse vibrate(Map map)
    {
        Context context = (Context)contextRef.get();
        long l = 0L;
        if (map.containsKey("duration"))
        {
            l = (long)((double)Float.parseFloat((String)map.get("duration")) * 1000D);
        }
        if (context != null && l > 0L)
        {
            if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0)
            {
                ((Vibrator)context.getSystemService("vibrator")).vibrate(l);
                return MMJSResponse.responseWithSuccess((new StringBuilder()).append("Vibrating for ").append(l).toString());
            } else
            {
                return MMJSResponse.responseWithError("The required permissions to vibrate are not set.");
            }
        } else
        {
            return null;
        }
    }

}
