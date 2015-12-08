// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.Intent;
import com.tinder.activities.ActivityCallToActionBrowser;
import com.tinder.d.a;
import com.tinder.managers.ManagerLiveRail;
import com.tinder.model.SparksEvent;
import com.tinder.utils.h;

// Referenced classes of package com.tinder.views:
//            RecCard, LiveRailWebView

public class this._cls0
{

    double mDuration;
    private boolean mFiredFirstQuartile;
    private boolean mFiredMidpoint;
    private boolean mFiredThirdQuartile;
    private boolean mPaused;
    final RecCard this$0;

    public String getActionButtonTitle()
    {
        return mManagerLiveRail.h;
    }

    public boolean getPaused()
    {
        return mPaused;
    }

    public String getSubtitle()
    {
        return mManagerLiveRail.g;
    }

    public String getTitle()
    {
        return mManagerLiveRail.e;
    }

    public String getVideoUrl()
    {
        return mManagerLiveRail.i;
    }

    public void invalidate()
    {
        RecCard.access$100(RecCard.this).postInvalidate();
    }

    public void launchCallToAction()
    {
        mCrmUtility.f(mManagerLiveRail.c);
        getBaseAdEvent("Ad.Select", true, true, true, true).put("method", "BUTTON").fire();
        mManagerLiveRail.a(com.tinder.managers.s._fld0);
        String s = mManagerLiveRail.f;
        if (!h.a(s))
        {
            Intent intent = new Intent(getContext(), com/tinder/activities/ActivityCallToActionBrowser);
            intent.putExtra(ActivityCallToActionBrowser.a, s);
            getContext().startActivity(intent);
        }
    }

    public void onClosed()
    {
        mManagerLiveRail.a(com.tinder.managers.s._fld0);
    }

    public void onImpression()
    {
        mManagerLiveRail.a(com.tinder.managers.s._fld0);
    }

    public void onLoadComplete()
    {
        getBaseAdEvent("Ad.Play", true, true, false, false).fire();
    }

    public void onMuted(String s)
    {
        RecCard.access$1402(RecCard.this, Boolean.parseBoolean(s));
        getBaseAdEvent("Ad.ToggleAudio", true, true, true, false).fire();
    }

    public void onPaused()
    {
        mManagerLiveRail.a(com.tinder.managers.s._fld0);
        mPaused = true;
    }

    public void onReplay()
    {
        getBaseAdEvent("Ad.Replay", true, false, false, false).fire();
    }

    public void onResumed()
    {
        getBaseAdEvent("Ad.Play", true, false, false, false).fire();
        mManagerLiveRail.a(com.tinder.managers.used);
        mPaused = false;
    }

    public void onTimeChanged(String s)
    {
        if (mDuration == 0.0D)
        {
            mDuration = mManagerLiveRail.n;
        }
        int i = (int)Double.parseDouble(s);
        if (i == (int)Math.ceil(mDuration * mDuration.mDuration()) && !mFiredFirstQuartile)
        {
            mManagerLiveRail.a(com.tinder.managers.redFirstQuartile);
            mFiredFirstQuartile = true;
            RecCard.access$1302(RecCard.this, this._fld0._mth0());
            i = 1;
        } else
        if (i == (int)Math.ceil(mDuration * mDuration.mDuration()) && !mFiredMidpoint)
        {
            mManagerLiveRail.a(com.tinder.managers.redMidpoint);
            mFiredMidpoint = true;
            RecCard.access$1302(RecCard.this, this._fld0._mth0());
            i = 1;
        } else
        if (i == (int)Math.ceil(mDuration * mDuration.mDuration()) && !mFiredThirdQuartile)
        {
            mManagerLiveRail.a(com.tinder.managers.redThirdQuartile);
            mFiredThirdQuartile = true;
            RecCard.access$1302(RecCard.this, this._fld0._mth0());
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            getBaseAdEvent("Ad.Progress", true, true, false, true).fire();
        }
    }

    public void onVideoEnded()
    {
        mManagerLiveRail.a(com.tinder.managers.s._fld0);
        getBaseAdEvent("Ad.Complete", true, false, false, false).fire();
        mFiredFirstQuartile = false;
        mFiredMidpoint = false;
        mFiredThirdQuartile = false;
        RecCard.access$1302(RecCard.this, this._fld0._mth0());
    }

    public ()
    {
        this$0 = RecCard.this;
        super();
    }
}
