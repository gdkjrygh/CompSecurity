// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import android.app.Activity;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.accuweather.android.utilities.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Referenced classes of package com.accuweather.android.maps:
//            MapListener

public class OverlayWebChromeClient extends WebChromeClient
{
    private class MapRunnable
        implements Runnable
    {

        private String message;
        final OverlayWebChromeClient this$0;

        public void run()
        {
            processMessage(message);
        }


/*
        static String access$102(MapRunnable maprunnable, String s)
        {
            maprunnable.message = s;
            return s;
        }

*/

        private MapRunnable()
        {
            this$0 = OverlayWebChromeClient.this;
            super();
        }

    }


    private static final String CURRENT_FRAME_KEY = "Frame";
    private static final String FRAME_LENGTH_KEY = "Length";
    private static final String MAP_LOAD_COMPLETE = "MapLoaderUpdate";
    private static final String RAD_KEY = "rad";
    private static final String TIMESTAMP_KEY = "Time";
    public static final String TOGGLE_TIME = "toggleTime";
    private Activity mActivity;
    private int mCurrentRadarFrame;
    private int mCurrentSatelliteFrame;
    private int mDefaultNumNonZeroProgressIncrements;
    private boolean mIsFirstMapLoaderUpdate;
    private boolean mIsFirstMapUpdate;
    private boolean mIsTwelveHourFormat;
    private MapListener mMapListener;
    private MapRunnable mRunnable;
    private int mTotalNonZeroProgressIncrements;

    public OverlayWebChromeClient()
    {
        mDefaultNumNonZeroProgressIncrements = 5;
        mTotalNonZeroProgressIncrements = mDefaultNumNonZeroProgressIncrements;
        mCurrentRadarFrame = 0;
        mCurrentSatelliteFrame = 0;
        mIsFirstMapUpdate = true;
        mIsFirstMapLoaderUpdate = true;
        mRunnable = new MapRunnable();
    }

    private String getFormattedTimestamp(String s)
    {
        if (!mIsTwelveHourFormat)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        String s1 = getTwelveHourFormatTimestamp(s);
        return s1;
        ParseException parseexception;
        parseexception;
        return StringUtils.padLeft(s, ' ', 5);
    }

    private String getTwelveHourFormatTimestamp(String s)
        throws ParseException
    {
        s = (new SimpleDateFormat("HH:mm")).parse(s);
        return (new SimpleDateFormat("hh:mm a")).format(s);
    }

    private void handleFrameUpdateNotification(String s, String s1)
    {
        int i = mCurrentSatelliteFrame;
        if (s1.contains("rad"))
        {
            i = mCurrentRadarFrame;
        }
        mMapListener.onFrameUpdate(getFormattedTimestamp(s), i, mTotalNonZeroProgressIncrements);
    }

    private void handleMapLoadComplete()
    {
        if (mIsFirstMapUpdate)
        {
            mIsFirstMapUpdate = false;
            mMapListener.onMapLoadComplete();
        }
    }

    private void processCurrentFrameMessage(String s)
    {
        String s1 = s.split("Frame")[1];
        if (s.contains("rad"))
        {
            mCurrentRadarFrame = Integer.parseInt(s1);
            mCurrentSatelliteFrame = 0;
            return;
        } else
        {
            mCurrentSatelliteFrame = Integer.parseInt(s1);
            mCurrentRadarFrame = 0;
            return;
        }
    }

    private void processFrameLengthMessage(String s)
    {
        mTotalNonZeroProgressIncrements = Integer.parseInt(s.split("Length")[1]) - 1;
    }

    private void processTimestampMessage(String s)
    {
        String as[] = s.split("Time");
        if (as.length == 2)
        {
            handleFrameUpdateNotification(as[1], s);
        }
    }

    private void updateUiForLastAnimationFrame(String s)
    {
        if (mIsFirstMapLoaderUpdate)
        {
            mIsFirstMapLoaderUpdate = false;
            s = s.substring("toggleTime".length());
            mMapListener.onFrameUpdate(getFormattedTimestamp(s), mTotalNonZeroProgressIncrements, mTotalNonZeroProgressIncrements);
        }
    }

    public int getCurrentRadarFrame()
    {
        return mCurrentRadarFrame;
    }

    public int getCurrentSatelliteFrame()
    {
        return mCurrentSatelliteFrame;
    }

    public int getTotalNonZeroProgressIncrements()
    {
        return mTotalNonZeroProgressIncrements;
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        jsresult.confirm();
        mRunnable.message = s1;
        mActivity.runOnUiThread(mRunnable);
        return true;
    }

    public final void processMessage(String s)
    {
        if (s.contains("MapLoaderUpdate"))
        {
            handleMapLoadComplete();
        } else
        {
            if (s.startsWith("toggleTime"))
            {
                updateUiForLastAnimationFrame(s);
                return;
            }
            if (s.contains("Length"))
            {
                processFrameLengthMessage(s);
                return;
            }
            if (s.contains("Frame"))
            {
                processCurrentFrameMessage(s);
                return;
            }
            if (s.contains("Time"))
            {
                processTimestampMessage(s);
                return;
            }
        }
    }

    public void setActivity(Activity activity)
    {
        mActivity = activity;
    }

    public void setMapListener(MapListener maplistener)
    {
        mMapListener = maplistener;
    }

    public void setTwelveHourFormat(boolean flag)
    {
        mIsTwelveHourFormat = flag;
    }
}
