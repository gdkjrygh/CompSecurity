// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.soundcloud.android.util.AnimUtils;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineState

public class DownloadImageView extends ImageView
{

    private final Drawable downloaded;
    private final Drawable downloading;
    private OfflineState offlineState;
    private final Drawable unavailable;

    public DownloadImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.DownloadImageView);
        downloaded = context.getDrawable(0);
        downloading = context.getDrawable(1);
        unavailable = context.getDrawable(2);
        context.recycle();
    }

    private void animateDownloadingState()
    {
        setDownloadStateResource(downloading);
        AnimUtils.runSpinClockwiseAnimationOn(this);
    }

    private void setDownloadStateResource(Drawable drawable)
    {
        clearAnimation();
        setVisibility(0);
        setImageDrawable(drawable);
    }

    private void setNoOfflineState()
    {
        clearAnimation();
        setVisibility(8);
        setImageDrawable(null);
    }

    public boolean isDownloaded()
    {
        return offlineState == OfflineState.DOWNLOADED;
    }

    public boolean isDownloading()
    {
        return offlineState == OfflineState.DOWNLOADING;
    }

    public boolean isRequested()
    {
        return offlineState == OfflineState.REQUESTED;
    }

    public boolean isUnavailable()
    {
        return offlineState == OfflineState.UNAVAILABLE;
    }

    public void setState(OfflineState offlinestate)
    {
        offlineState = offlinestate;
        switch (_cls1..SwitchMap.com.soundcloud.android.offline.OfflineState[offlinestate.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown state : ")).append(offlinestate).toString());

        case 1: // '\001'
            setNoOfflineState();
            return;

        case 2: // '\002'
            setDownloadStateResource(unavailable);
            return;

        case 3: // '\003'
            setDownloadStateResource(downloading);
            return;

        case 4: // '\004'
            animateDownloadingState();
            return;

        case 5: // '\005'
            setDownloadStateResource(downloaded);
            break;
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$offline$OfflineState[];

        static 
        {
            $SwitchMap$com$soundcloud$android$offline$OfflineState = new int[OfflineState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.NO_OFFLINE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.UNAVAILABLE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.REQUESTED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.DOWNLOADING.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.DOWNLOADED.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
