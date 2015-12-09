// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.RelaunchActivity;

// Referenced classes of package com.netflix.mediaclient.ui.login:
//            AccountActivity

public class LogoutActivity extends AccountActivity
{
    private class LogoutHandler extends LoggingManagerCallback
    {

        final LogoutActivity this$0;

        public void onLogoutComplete(int i)
        {
            super.onLogoutComplete(i);
            if (i == 0)
            {
                handleLogoutComplete();
                return;
            } else
            {
                Log.e("LogoutActivity", (new StringBuilder()).append("Could not log user out - status code: ").append(i).toString());
                Toast.makeText(getApplicationContext(), 0x7f0c015e, 1).show();
                finish();
                return;
            }
        }

        public LogoutHandler()
        {
            this$0 = LogoutActivity.this;
            super("LogoutActivity");
        }
    }


    private static final String TAG = "LogoutActivity";

    public LogoutActivity()
    {
    }

    public static Intent create(Context context)
    {
        return new Intent(context, com/netflix/mediaclient/ui/login/LogoutActivity);
    }

    private void handleLogoutComplete()
    {
        Log.i("LogoutActivity", "Handling logout completion...");
        Toast.makeText(getApplicationContext(), 0x7f0c015f, 1).show();
        relaunchApp(this, "handleLogoutComplete()");
    }

    public static void relaunchApp(NetflixActivity netflixactivity, String s)
    {
        ServiceManager servicemanager = netflixactivity.getServiceManager();
        if (servicemanager != null)
        {
            servicemanager.flushCaches();
        }
        NetflixActivity.finishAllActivities(netflixactivity);
        netflixactivity.startActivity(RelaunchActivity.createStartIntent(netflixactivity, s));
    }

    public static void showLogoutDialog(Activity activity)
    {
        (new android.app.AlertDialog.Builder(activity)).setMessage(0x7f0c015d).setNegativeButton(0x7f0c0101, null).setPositiveButton(0x7f0c0141, new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                activity.startActivity(LogoutActivity.create(activity));
                activity.finish();
            }

            
            {
                activity = activity1;
                super();
            }
        }).show();
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final LogoutActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                servicemanager.logoutUser(new LogoutHandler());
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
            }

            
            {
                this$0 = LogoutActivity.this;
                super();
            }
        };
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.logout;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

}
