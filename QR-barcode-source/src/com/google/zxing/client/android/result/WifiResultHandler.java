// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.widget.Toast;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.common.executor.AsyncTaskExecInterface;
import com.google.zxing.client.android.common.executor.AsyncTaskExecManager;
import com.google.zxing.client.android.wifi.WifiConfigManager;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.WifiParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class WifiResultHandler extends ResultHandler
{

    private final CaptureActivity parent;
    private final AsyncTaskExecInterface taskExec = (AsyncTaskExecInterface)(new AsyncTaskExecManager()).build();

    public WifiResultHandler(CaptureActivity captureactivity, ParsedResult parsedresult)
    {
        super(captureactivity, parsedresult);
        parent = captureactivity;
    }

    public int getButtonCount()
    {
        return 1;
    }

    public int getButtonText(int i)
    {
        return com.google.zxing.client.android.R.string.button_wifi;
    }

    public CharSequence getDisplayContents()
    {
        WifiParsedResult wifiparsedresult = (WifiParsedResult)getResult();
        StringBuilder stringbuilder = new StringBuilder(50);
        ParsedResult.maybeAppend((new StringBuilder(String.valueOf(parent.getString(com.google.zxing.client.android.R.string.wifi_ssid_label)))).append('\n').append(wifiparsedresult.getSsid()).toString(), stringbuilder);
        ParsedResult.maybeAppend((new StringBuilder(String.valueOf(parent.getString(com.google.zxing.client.android.R.string.wifi_type_label)))).append('\n').append(wifiparsedresult.getNetworkEncryption()).toString(), stringbuilder);
        return stringbuilder.toString();
    }

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_wifi;
    }

    public void handleButtonPress(int i)
    {
        if (i == 0)
        {
            WifiParsedResult wifiparsedresult = (WifiParsedResult)getResult();
            WifiManager wifimanager = (WifiManager)getActivity().getSystemService("wifi");
            final Activity activity = getActivity();
            activity.runOnUiThread(new Runnable() {

                final WifiResultHandler this$0;
                private final Activity val$activity;

                public void run()
                {
                    Toast.makeText(activity.getApplicationContext(), com.google.zxing.client.android.R.string.wifi_changing_network, 0).show();
                }

            
            {
                this$0 = WifiResultHandler.this;
                activity = activity1;
                super();
            }
            });
            taskExec.execute(new WifiConfigManager(wifimanager), new WifiParsedResult[] {
                wifiparsedresult
            });
            parent.restartPreviewAfterDelay(0L);
        }
    }
}
