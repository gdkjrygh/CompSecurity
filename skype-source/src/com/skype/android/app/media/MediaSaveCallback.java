// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.content.Context;
import android.widget.Toast;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.event.EventBus;

// Referenced classes of package com.skype.android.app.media:
//            MediaLinkProfile, MediaLinkSaveError, OnMediaSaveToGalleryErrorEvent

public class MediaSaveCallback
    implements AsyncCallback
{

    private static final String VIDEO_MESSAGE_RECEIVED = "Received";
    private static final String VIDEO_MESSAGE_SENT = "Sent";
    private Analytics analytics;
    private Context context;
    EventBus eventBus;
    private boolean isMediaOutgoing;
    private MediaLinkProfile mediaLinkProfileToSave;

    public MediaSaveCallback(Context context1, Analytics analytics1, MediaLinkProfile medialinkprofile, EventBus eventbus)
    {
        context = context1;
        analytics = analytics1;
        mediaLinkProfileToSave = medialinkprofile;
        eventBus = eventbus;
    }

    public MediaSaveCallback(Context context1, Analytics analytics1, MediaLinkProfile medialinkprofile, boolean flag, EventBus eventbus)
    {
        context = context1;
        analytics = analytics1;
        mediaLinkProfileToSave = medialinkprofile;
        isMediaOutgoing = flag;
        eventBus = eventbus;
    }

    private void handleSaveMediaResult(MediaLinkSaveError medialinksaveerror)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

            static 
            {
                $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.SAVE_PROFILE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.VIDEO_PROFILE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        SkypeTelemetryEvent skypetelemetryevent;
        switch (_cls1..SwitchMap.com.skype.android.app.media.MediaLinkProfile[mediaLinkProfileToSave.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (medialinksaveerror == MediaLinkSaveError.NONE)
            {
                medialinksaveerror = context.getString(0x7f080362);
                Toast.makeText(context, medialinksaveerror, 0).show();
                analytics.c(AnalyticsEvent.bp);
                return;
            } else
            {
                eventBus.a(new OnMediaSaveToGalleryErrorEvent(medialinksaveerror, 0x7f080447, 0x7f080446, 0x7f080412));
                analytics.a(AnalyticsEvent.bq, medialinksaveerror.toString());
                return;
            }

        case 2: // '\002'
            skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.ap);
            break;
        }
        LogAttributeName logattributename;
        if (medialinksaveerror == MediaLinkSaveError.NONE)
        {
            skypetelemetryevent.put(LogAttributeName.ad, Boolean.valueOf(true));
            medialinksaveerror = context.getString(0x7f080451);
            Toast.makeText(context, medialinksaveerror, 0).show();
        } else
        {
            skypetelemetryevent.put(LogAttributeName.ad, Boolean.valueOf(false));
            eventBus.a(new OnMediaSaveToGalleryErrorEvent(medialinksaveerror, 0x7f080448, 0x7f080450, 0x7f08044f));
        }
        logattributename = LogAttributeName.ae;
        if (isMediaOutgoing)
        {
            medialinksaveerror = "Sent";
        } else
        {
            medialinksaveerror = "Received";
        }
        skypetelemetryevent.put(logattributename, medialinksaveerror);
        analytics.a(skypetelemetryevent);
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e() && asyncresult.a() != null)
        {
            handleSaveMediaResult((MediaLinkSaveError)asyncresult.a());
        }
    }
}
