// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.app.AlertDialog;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMNotification, MMWebView, MMJSResponse

class val.arguments
    implements Callable
{

    final BridgeMMNotification this$0;
    final Map val$arguments;

    public MMJSResponse call()
    {
        Object obj = (MMWebView)mmWebViewRef.get();
        if (obj != null)
        {
            Object obj1 = ((MMWebView) (obj)).getActivity();
            obj = val$arguments;
            if (obj1 != null)
            {
                if (!((Activity) (obj1)).isFinishing())
                {
                    obj1 = (new android.app.it>(((android.content.Context) (obj1)))).ate();
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
                as.response = Integer.valueOf(BridgeMMNotification.access$000(BridgeMMNotification.this));
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

    ()
    {
        this$0 = final_bridgemmnotification;
        val$arguments = Map.this;
        super();
    }
}
