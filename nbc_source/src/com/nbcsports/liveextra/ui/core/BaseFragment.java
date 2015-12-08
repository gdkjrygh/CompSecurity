// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.ads.AdManager;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.views.ContentLoadingOverlay;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class BaseFragment extends Fragment
{

    protected AdManager adManager;
    private Handler handler;
    ContentLoadingOverlay modal;
    protected AuthService pass;
    protected Picasso picasso;

    public BaseFragment()
    {
        handler = new Handler(Looper.getMainLooper());
    }

    public void hideProgress()
    {
        handler.post(new Runnable() {

            final BaseFragment this$0;

            public void run()
            {
                if (modal != null)
                {
                    modal.hide();
                }
            }

            
            {
                this$0 = BaseFragment.this;
                super();
            }
        });
    }

    public boolean isActivityDead()
    {
        return getActivity() == null || getActivity().isFinishing();
    }

    protected void setTopBanner(final Mvpd webUrl)
    {
        View view = getView();
        if (view != null)
        {
            if ((view = view.findViewById(0x7f0f01f3)) != null)
            {
                if (webUrl == null)
                {
                    view.setVisibility(8);
                    return;
                }
                ImageView imageview = (ImageView)view.findViewById(0x7f0f01f4);
                String s = pass.getMvpdLogo(webUrl);
                webUrl = pass.getMvpdUrl(webUrl);
                if (!TextUtils.isEmpty(s))
                {
                    view.setVisibility(0);
                    imageview.setVisibility(0);
                    picasso.load(s).into(imageview);
                    imageview.setOnClickListener(new android.view.View.OnClickListener() {

                        final BaseFragment this$0;
                        final String val$webUrl;

                        public void onClick(View view1)
                        {
                            if (webUrl != null)
                            {
                                NBCSystem.debugLog(webUrl, webUrl);
                                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(webUrl)));
                            }
                        }

            
            {
                this$0 = BaseFragment.this;
                webUrl = s;
                super();
            }
                    });
                    return;
                }
            }
        }
    }

    public void showProgress()
    {
        handler.post(new Runnable() {

            final BaseFragment this$0;

            public void run()
            {
                if (modal != null)
                {
                    modal.show();
                }
            }

            
            {
                this$0 = BaseFragment.this;
                super();
            }
        });
    }
}
