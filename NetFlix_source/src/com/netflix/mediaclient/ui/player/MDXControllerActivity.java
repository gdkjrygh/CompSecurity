// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PostPlayFactory, PostPlay

public class MDXControllerActivity extends PlayerActivity
{
    class FinishReceiver extends BroadcastReceiver
    {

        final MDXControllerActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction() == "com.netflix.mediaclient.ui.player.MDXControllerActivity.ACTION_FINISH")
            {
                finish();
            }
        }

        FinishReceiver()
        {
            this$0 = MDXControllerActivity.this;
            super();
        }
    }


    private static final String ACTION_FINISH_ACTIVITY = "com.netflix.mediaclient.ui.player.MDXControllerActivity.ACTION_FINISH";
    static final String EXTRA_SHOW_MDX_CONTROLLER = "extra_shoe_mdx_controller";
    private FinishReceiver finishReceiver;
    private PostPlay mPostPlay;
    private View postPlay;
    private String videoId;

    public MDXControllerActivity()
    {
        finishReceiver = new FinishReceiver();
    }

    private static Intent createIntent(NetflixActivity netflixactivity)
    {
        return new Intent(netflixactivity, com/netflix/mediaclient/ui/player/MDXControllerActivity);
    }

    public static void finishMDXController(NetflixActivity netflixactivity)
    {
        netflixactivity.sendBroadcast(new Intent("com.netflix.mediaclient.ui.player.MDXControllerActivity.ACTION_FINISH"));
    }

    private void setupPostplayViews()
    {
        postPlay = findViewById(0x7f070172);
        mPostPlay = PostPlayFactory.create(this, PostPlayFactory.PostPlayType.EpisodesForMDX);
    }

    private void setupReceivers()
    {
        if (finishReceiver != null)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.netflix.mediaclient.ui.player.MDXControllerActivity.ACTION_FINISH");
            registerReceiver(finishReceiver, intentfilter);
        }
    }

    private void showEpisodesData()
    {
        if (postPlay != null)
        {
            postPlay.setVisibility(0);
            if (getIntent().hasExtra("extra_get_details_video_id"))
            {
                videoId = getIntent().getExtras().getString("extra_get_details_video_id");
                if (!TextUtils.isEmpty(videoId) && mPostPlay != null)
                {
                    mPostPlay.init(videoId);
                }
            }
        }
    }

    public static void showMDXController(NetflixActivity netflixactivity, int i, PlayContext playcontext)
    {
        showMDXController(netflixactivity, String.valueOf(i), playcontext);
    }

    public static void showMDXController(NetflixActivity netflixactivity, String s, PlayContext playcontext)
    {
        playcontext = createIntent(netflixactivity);
        playcontext.putExtra("extra_get_details_video_id", s);
        netflixactivity.startActivity(playcontext);
    }

    private void unregisterReceivers()
    {
        if (finishReceiver != null)
        {
            unregisterReceiver(finishReceiver);
        }
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final MDXControllerActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                showEpisodesData();
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                cleanupAndExit();
            }

            
            {
                this$0 = MDXControllerActivity.this;
                super();
            }
        };
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.mdxPlayback;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        setContentView(0x7f03004a);
        setupPostplayViews();
        showEpisodesData();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03004a);
        setupPostplayViews();
        AndroidUtils.logDeviceDensity(this);
        getWindow().getAttributes().buttonBrightness = 0.0F;
        LogUtils.reportPlayActionStarted(this, null, getUiScreen());
        LogUtils.pauseReporting(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        unregisterReceivers();
    }

    protected void onResume()
    {
        super.onResume();
        setupReceivers();
    }

    protected void onStart()
    {
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }

}
