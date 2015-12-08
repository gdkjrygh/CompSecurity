// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.LaunchActivity;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

private class listener
    implements ManagerStatusListener
{

    private final ManagerStatusListener listener;
    final NetflixActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.d("NetflixActivity", (new StringBuilder()).append("onManagerReady, status: ").append(i).toString());
        mIsTablet = servicemanager.isTablet();
        if (!NetflixService.isServiceReady(i))
        {
            startLaunchActivityIfVisible();
        }
        ((NetflixApplication)getApplication()).refreshLocale(servicemanager.getCurrentAppLocale());
        if (NetflixActivity.access$000(NetflixActivity.this) != null)
        {
            NetflixActivity.access$000(NetflixActivity.this).onManagerReady();
        }
        if (NetflixActivity.access$100(NetflixActivity.this) != null)
        {
            NetflixActivity.access$100(NetflixActivity.this).onManagerReady(servicemanager, i);
            if (NetflixActivity.access$200(NetflixActivity.this))
            {
                NetflixActivity.access$202(NetflixActivity.this, false);
                handler.postDelayed(new Runnable() {

                    final NetflixActivity.DefaultManagerStatusListener this$1;

                    public void run()
                    {
                        expandMiniPlayerIfVisible();
                    }

            
            {
                this$1 = NetflixActivity.DefaultManagerStatusListener.this;
                super();
            }
                }, 400L);
            }
        }
        android.app.DialogFragment dialogfragment = getDialogFragment();
        if (dialogfragment instanceof ManagerStatusListener)
        {
            ((ManagerStatusListener)dialogfragment).onManagerReady(servicemanager, i);
        }
        NetflixActivity.access$300(NetflixActivity.this);
        NetflixActivity.access$400(NetflixActivity.this);
        if (showMdxInMenu())
        {
            invalidateOptionsMenu();
        }
        if (listener != null)
        {
            listener.onManagerReady(servicemanager, i);
        }
        if (!(NetflixActivity.this instanceof LaunchActivity))
        {
            servicemanager.getClientLogging().getApplicationPerformanceMetricsLogging().endUiStartupSession(true, null);
        }
        servicemanager.getClientLogging().setDataContext(getDataContext());
        reportUiViewChanged(getUiScreen());
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        Log.d("NetflixActivity", (new StringBuilder()).append("onManagerUnavailable, status: ").append(i).toString());
        if (NetflixActivity.access$100(NetflixActivity.this) != null)
        {
            NetflixActivity.access$100(NetflixActivity.this).onManagerUnavailable(servicemanager, i);
        }
        android.app.DialogFragment dialogfragment = getDialogFragment();
        if (dialogfragment instanceof ManagerStatusListener)
        {
            ((ManagerStatusListener)dialogfragment).onManagerUnavailable(servicemanager, i);
        }
        if (listener != null)
        {
            listener.onManagerUnavailable(servicemanager, i);
        }
        startLaunchActivityIfVisible();
        if (shouldFinishOnManagerError())
        {
            Log.d("NetflixActivity", (new StringBuilder()).append(getClass().getSimpleName()).append(": Finishing activity because manager error occured...").toString());
            finish();
        }
    }

    public _cls1.this._cls1(ManagerStatusListener managerstatuslistener)
    {
        this$0 = NetflixActivity.this;
        super();
        listener = managerstatuslistener;
    }
}
