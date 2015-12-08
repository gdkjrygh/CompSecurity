// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            SystemMediaRouteProvider

static class publishRoutes extends SystemMediaRouteProvider
{
    final class DefaultRouteController extends MediaRouteProvider.RouteController
    {

        final SystemMediaRouteProvider.LegacyImpl this$0;

        public void onSetVolume(int i)
        {
            mAudioManager.setStreamVolume(3, i, 0);
            publishRoutes();
        }

        public void onUpdateVolume(int i)
        {
            int j = mAudioManager.getStreamVolume(3);
            if (Math.min(mAudioManager.getStreamMaxVolume(3), Math.max(0, j + i)) != j)
            {
                mAudioManager.setStreamVolume(3, j, 0);
            }
            publishRoutes();
        }

        DefaultRouteController()
        {
            this$0 = SystemMediaRouteProvider.LegacyImpl.this;
            super();
        }
    }

    final class VolumeChangeReceiver extends BroadcastReceiver
    {

        public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
        public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
        public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
        final SystemMediaRouteProvider.LegacyImpl this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)
            {
                int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                if (i >= 0 && i != mLastReportedVolume)
                {
                    publishRoutes();
                }
            }
        }

        VolumeChangeReceiver()
        {
            this$0 = SystemMediaRouteProvider.LegacyImpl.this;
            super();
        }
    }


    private static final ArrayList CONTROL_FILTERS;
    private static final int PLAYBACK_STREAM = 3;
    private final AudioManager mAudioManager;
    private int mLastReportedVolume;
    private final VolumeChangeReceiver mVolumeChangeReceiver = new VolumeChangeReceiver();

    private void publishRoutes()
    {
        Object obj = getContext().getResources();
        int i = mAudioManager.getStreamMaxVolume(3);
        mLastReportedVolume = mAudioManager.getStreamVolume(3);
        obj = (new mAudioManager("DEFAULT_ROUTE", ((Resources) (obj)).getString(android.support.v7.mediarouter.Manager))).rolFilters(CONTROL_FILTERS).backStream(3).backType(0).meHandling(1).meMax(i).me(mLastReportedVolume).mLastReportedVolume();
        setDescriptor((new ()).addRoute(((MediaRouteDescriptor) (obj))).build());
    }

    public .build onCreateRouteController(String s)
    {
        if (s.equals("DEFAULT_ROUTE"))
        {
            return new DefaultRouteController();
        } else
        {
            return null;
        }
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        CONTROL_FILTERS = new ArrayList();
        CONTROL_FILTERS.add(intentfilter);
    }




    public VolumeChangeReceiver.this._cls0(Context context)
    {
        super(context);
        mLastReportedVolume = -1;
        mAudioManager = (AudioManager)context.getSystemService("audio");
        context.registerReceiver(mVolumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        publishRoutes();
    }
}
