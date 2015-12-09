// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MdxPostplayState;
import com.netflix.mediaclient.servicemgr.PostPlayVideo;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.pin.PinDialogVault;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import com.netflix.mediaclient.ui.player.MDXControllerActivity;
import com.netflix.mediaclient.util.StringUtils;
import java.util.List;

public final class MdxReceiver extends BroadcastReceiver
{
    private static class FetchVideoDetailsForMdxCallback extends LoggingManagerCallback
    {

        private final NetflixActivity mActivity;

        public void onPostPlayVideosFetched(List list, int i)
        {
            super.onPostPlayVideosFetched(list, i);
            if (mActivity != null && i == 0 && list.size() > 0)
            {
                list = ((PostPlayVideo)list.get(0)).getId();
                if (!TextUtils.isEmpty(list))
                {
                    MDXControllerActivity.showMDXController(mActivity, list, PlayContext.DFLT_MDX_CONTEXT);
                }
            }
        }

        public FetchVideoDetailsForMdxCallback(String s, NetflixActivity netflixactivity)
        {
            super(s);
            mActivity = netflixactivity;
        }
    }


    private static final String TAG = "nf_mdx";
    private final NetflixActivity mActivity;

    public MdxReceiver(NetflixActivity netflixactivity)
    {
        mActivity = netflixactivity;
        Log.v("nf_mdx", "Receiver created");
    }

    private void cancelPin()
    {
        PinVerifier.getInstance().dismissPinVerification();
    }

    private void hideMdxController(Context context)
    {
        MDXControllerActivity.finishMDXController((NetflixActivity)context);
    }

    private void showFirstEpisodeInNextSeries(MdxPostplayState mdxpostplaystate)
    {
        mdxpostplaystate = mActivity.getServiceManager().getMdx().getVideoIds();
        if (mdxpostplaystate != null && ((com.netflix.mediaclient.util.WebApiUtils.VideoIds) (mdxpostplaystate)).episodeId > 0)
        {
            mActivity.getServiceManager().fetchPostPlayVideos(String.valueOf(((com.netflix.mediaclient.util.WebApiUtils.VideoIds) (mdxpostplaystate)).episodeId), new FetchVideoDetailsForMdxCallback("nf_mdx", mActivity));
        }
    }

    private void showMdxController(Intent intent, Context context)
    {
        intent = intent.getExtras().getString("postplayState");
        if (!StringUtils.isEmpty(intent))
        {
            intent = new MdxPostplayState(intent);
            if (intent.isInCountdown())
            {
                showNextEpisodeInSeries(intent);
            } else
            if (intent.isInPrompt())
            {
                showFirstEpisodeInNextSeries(intent);
                return;
            }
        }
    }

    private void showNextEpisodeInSeries(MdxPostplayState mdxpostplaystate)
    {
        mdxpostplaystate = mActivity.getServiceManager().getMdx().getVideoIds();
        if (mdxpostplaystate != null && ((com.netflix.mediaclient.util.WebApiUtils.VideoIds) (mdxpostplaystate)).episodeId > 0)
        {
            MDXControllerActivity.showMDXController(mActivity, ((com.netflix.mediaclient.util.WebApiUtils.VideoIds) (mdxpostplaystate)).episodeId, PlayContext.DFLT_MDX_CONTEXT);
        }
    }

    private void verifyPinAndNotify(Intent intent)
    {
        intent = intent.getExtras().getString("uuid");
        intent = new PinDialogVault(com.netflix.mediaclient.ui.pin.PinDialogVault.PinInvokedFrom.MDX.getValue(), intent);
        PinVerifier.getInstance().verify(mActivity, true, intent);
    }

    public IntentFilter getFilter()
    {
        Log.v("nf_mdx", "Get filter called");
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDXUPDATE_READY");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_NOTREADY");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_TARGETLIST");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_SHOW");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_NOT_REQUIRED");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_POSTPLAY");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        return intentfilter;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("nf_mdx", 2))
        {
            Log.v("nf_mdx", (new StringBuilder()).append("MDX broadcast ").append(intent).toString());
        }
        String s;
        if (!mActivity.isFinishing())
        {
            if ((s = intent.getAction()) != null)
            {
                if (!mActivity.shouldAddMdxToMenu())
                {
                    Log.d("nf_mdx", "Ignore MDX broadcast");
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.MDXUPDATE_NOTREADY".equals(s))
                {
                    Log.d("nf_mdx", "MDX is NOT ready, invalidate action bar");
                    mActivity.invalidateOptionsMenu();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.MDXUPDATE_READY".equals(s))
                {
                    Log.d("nf_mdx", "MDX is ready, invalidate action bar");
                    mActivity.invalidateOptionsMenu();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.MDXUPDATE_TARGETLIST".equals(s))
                {
                    Log.d("nf_mdx", "MDX is ready, got target list update, invalidate action bar");
                    mActivity.invalidateOptionsMenu();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_SHOW".equals(s))
                {
                    Log.d("nf_mdx", "MDX PIN show dialog");
                    verifyPinAndNotify(intent);
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_NOT_REQUIRED".equals(s))
                {
                    Log.d("nf_mdx", "MDX cancel pin dialog - verified on other controller");
                    cancelPin();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.MDXUPDATE_POSTPLAY".equals(s))
                {
                    showMdxController(intent, context);
                    return;
                }
                if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART"))
                {
                    hideMdxController(context);
                    return;
                }
            }
        }
    }
}
