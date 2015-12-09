// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.os.SystemClock;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFrag;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            HomeActivity, SlidingMenuAdapter, SocialOptInDialogFrag

class this._cls1
    implements com.netflix.mediaclient.android.app.dingStatusCallback
{

    final lback this$1;

    public void onDataLoaded(int i)
    {
        Log.d("HomeActivity", "LOLOMO is loaded, report UI browse startup session ended in case this was on UI startup");
        long l;
        long l1;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = SystemClock.elapsedRealtime();
        l1 = HomeActivity.access$700(_fld0);
        getServiceManager().getClientLogging().getApplicationPerformanceMetricsLogging().endUiBrowseStartupSession(l - l1, flag, null);
        setLoadingStatusCallback(null);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/ui/home/HomeActivity$2

/* anonymous class */
    class HomeActivity._cls2
        implements ManagerStatusListener
    {

        final HomeActivity this$0;

        public void onManagerReady(ServiceManager servicemanager, int i)
        {
            Log.v("HomeActivity", "ServiceManager ready");
            HomeActivity.access$202(HomeActivity.this, servicemanager);
            showProfileToast();
            HomeActivity.access$400(HomeActivity.this, HomeActivity.access$300(HomeActivity.this));
            getPrimaryFrag().onManagerReady(servicemanager, i);
            HomeActivity.access$500(HomeActivity.this).onManagerReady(servicemanager, i);
            KidsUtils.updateKidsMenuItem(HomeActivity.this, HomeActivity.access$600(HomeActivity.this));
            setLoadingStatusCallback(new HomeActivity._cls2._cls1());
            if (HomeActivity.access$800(HomeActivity.this))
            {
                Log.d("HomeActivity", "Displaying opt-in dialog");
                servicemanager = SocialOptInDialogFrag.newInstance();
                servicemanager.setCancelable(false);
                showDialog(servicemanager);
            }
        }

        public void onManagerUnavailable(ServiceManager servicemanager, int i)
        {
            Log.w("HomeActivity", "ServiceManager unavailable");
            KidsUtils.updateKidsMenuItem(HomeActivity.this, HomeActivity.access$600(HomeActivity.this));
            HomeActivity.access$202(HomeActivity.this, null);
            getPrimaryFrag().onManagerUnavailable(servicemanager, i);
            HomeActivity.access$500(HomeActivity.this).onManagerUnavailable(servicemanager, i);
            Log.d("HomeActivity", "LOLOMO failed, report UI startup session ended in case this was on UI startup");
        }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
    }

}
