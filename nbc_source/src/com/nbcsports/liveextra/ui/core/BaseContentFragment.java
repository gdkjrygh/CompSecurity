// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import air.com.nbcuni.com.nbcsports.liveextra.MainSupportWrapperActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import butterknife.ButterKnife;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;

// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            BaseFragment

public abstract class BaseContentFragment extends BaseFragment
    implements com.nbcsports.liveextra.ui.main.core.ContentListPresenter.Listener
{

    IAccessEnablerDelegate _flddelegate;
    private Handler handler;
    View sectionLayout;
    protected Sport sport;

    public BaseContentFragment()
    {
        handler = new Handler();
        _flddelegate = new AuthDelegate() {

            final BaseContentFragment this$0;

            public void selectedProvider(Mvpd mvpd)
            {
                super.selectedProvider(mvpd);
                (new Handler(Looper.getMainLooper())).post(mvpd. new Runnable() {

                    final _cls1 this$1;
                    final Mvpd val$mvpd;

                    public void run()
                    {
                        setTopBanner(mvpd);
                    }

            
            {
                this$1 = final__pcls1;
                mvpd = Mvpd.this;
                super();
            }
                });
            }

            public void setAuthenticationStatus(int i, String s)
            {
                super.setAuthenticationStatus(i, s);
                if (i == 1)
                {
                    pass.getInstance().getSelectedProvider();
                }
            }

            
            {
                this$0 = BaseContentFragment.this;
                super();
            }
        };
    }

    protected abstract void initPresenter();

    protected abstract void inject();

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        inject();
    }

    public void onContentListLoading()
    {
        showProgress();
    }

    public void onContentListReceived(boolean flag)
    {
        hideProgress();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        sport = (Sport)getArguments().getParcelable("sport");
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        hideProgress();
        ButterKnife.unbind(this);
    }

    public void onPause()
    {
        super.onPause();
        hideProgress();
        pass.unregister(_flddelegate);
    }

    public void onResume()
    {
        super.onResume();
        initPresenter();
        pass.registerPassive(_flddelegate);
        pass.getInstance().checkAuthentication();
        while (sport == null || sectionLayout == null || !sport.getName().contains("PGA") || !MainSupportWrapperActivity.IS_DEEPLINKING_PGA) 
        {
            return;
        }
        sectionLayout.setVisibility(0);
    }
}
