// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.reporting;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.PlayerErrorEvent;
import com.auditude.ads.event.SMILEvent;
import com.auditude.ads.exception.AssetException;
import com.auditude.ads.exception.PlayerException;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.BaseElement;
import com.auditude.ads.model.Click;
import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.IOnPageAsset;
import com.auditude.ads.model.NonLinearAsset;
import com.auditude.ads.model.smil.Par;
import com.auditude.ads.model.smil.Ref;
import com.auditude.ads.model.smil.Sequence;
import com.auditude.ads.model.smil.SmilElementType;
import com.auditude.ads.model.tracking.Submission;
import com.auditude.ads.model.tracking.Submissions;
import com.auditude.ads.model.tracking.TrackingEvent;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.ObjectUtil;
import com.auditude.ads.util.TimeoutUtil;
import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.view.AdViewEvent;
import com.auditude.ads.view.IAdView;
import com.auditude.ads.view.model.IAdViewSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ReportingHelper
    implements com.auditude.ads.util.TimeoutUtil.TimeoutCompleteListener, IEventListener
{

    private static int $SWITCH_TABLE$com$auditude$ads$event$SMILEvent$SMILEventType[];
    private static int $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType[];
    private static final String EVENT_COMPLETE = "complete";
    private static final String EVENT_START = "start";
    private static final String STATE_PARAM_ADVANCE_PATTERN = "advancepattern";
    private static final String STATE_PARAM_EVENT = "event";
    private static final String STATE_PARAM_PROGRESS = "progress";
    private static final String STATE_PARAM_UNIT = "unit";
    private static final String UNIT_PERCENT = "percent";
    private APIBridge api;
    private boolean isInitialized;
    private Par par;
    private ArrayList pendingTimeouts;
    private Sequence sequence;
    private Submissions submissions;

    static int[] $SWITCH_TABLE$com$auditude$ads$event$SMILEvent$SMILEventType()
    {
        int ai[] = $SWITCH_TABLE$com$auditude$ads$event$SMILEvent$SMILEventType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.auditude.ads.event.SMILEvent.SMILEventType.values().length];
        try
        {
            ai[com.auditude.ads.event.SMILEvent.SMILEventType.PAR_BEGIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.auditude.ads.event.SMILEvent.SMILEventType.PAR_END.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.auditude.ads.event.SMILEvent.SMILEventType.SEQUENCE_BEGIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.auditude.ads.event.SMILEvent.SMILEventType.SEQUENCE_END.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$auditude$ads$event$SMILEvent$SMILEventType = ai;
        return ai;
    }

    static int[] $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType()
    {
        int ai[] = $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.auditude.ads.view.AdViewEvent.AdViewEventType.values().length];
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_CLICK.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_COMPLETE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_ERROR.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_LOAD.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_LOG.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_PAUSE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_PROGRESS.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_REPLAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_RESUME.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_SKIP.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_START.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_STOP.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_USER_CLOSE.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_VOLUME_CHANGE.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType = ai;
        return ai;
    }

    public ReportingHelper(APIBridge apibridge)
    {
        isInitialized = false;
        pendingTimeouts = new ArrayList();
        api = apibridge;
        apibridge.addEventListener("adViewEvent", this, 100);
        apibridge.addEventListener("smilEvent", this, 100);
        apibridge.addEventListener("playerError", this, 100);
    }

    private String getErrorSubmissionUrl(String s)
    {
        if (s.indexOf("http://") == 0 || s.indexOf("https://") == 0)
        {
            return "http://ad.auditude.com/adserver/e?type=playererror";
        } else
        {
            return (new StringBuilder("http://ad.")).append(s).append("/adserver/e?type=playererror").toString();
        }
    }

    private HashMap getProgressState(int i, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("progress", String.valueOf(i));
        hashmap.put("unit", s);
        return hashmap;
    }

    private HashMap getSubmissionState()
    {
        if (submissions != null)
        {
            return submissions.getState();
        } else
        {
            return null;
        }
    }

    private void logAdTrackingUrl(BaseElement baseelement, Sequence sequence1, Par par1, String s, HashMap hashmap)
    {
        logAdTrackingUrl(baseelement, sequence1, par1, s, hashmap, false);
    }

    private void logAdTrackingUrl(BaseElement baseelement, Sequence sequence1, Par par1, String s, HashMap hashmap, boolean flag)
    {
        if (baseelement != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((s = baseelement.getTrackingEventByType(s)) != null && s.getTrackingUrls() != null && s.getTrackingUrls().size() > 0)
        {
            HashMap hashmap1 = getSubmissionState();
            if (sequence1 != null)
            {
                baseelement = sequence1.getState();
            } else
            {
                baseelement = null;
            }
            if (par1 != null)
            {
                sequence1 = par1.getState();
            } else
            {
                sequence1 = null;
            }
            baseelement = ObjectUtil.merge(ObjectUtil.merge(hashmap1, ObjectUtil.merge(baseelement, sequence1)), hashmap);
            sequence1 = s.getTrackingUrls().iterator();
            while (sequence1.hasNext()) 
            {
                par1 = (TrackingUrl)sequence1.next();
                if (par1 instanceof Submission)
                {
                    par1.log(flag, baseelement);
                } else
                {
                    par1.log(flag, null);
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void logAdTrackingUrl(BaseElement baseelement, String s, HashMap hashmap)
    {
        logAdTrackingUrl(baseelement, s, hashmap, false);
    }

    private void logAdTrackingUrl(BaseElement baseelement, String s, HashMap hashmap, boolean flag)
    {
        if (baseelement != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((s = baseelement.getTrackingEventByType(s)) != null && s.getTrackingUrls() != null && s.getTrackingUrls().size() > 0)
        {
            baseelement = ObjectUtil.merge(currentPodState(), hashmap);
            s = s.getTrackingUrls().iterator();
            while (s.hasNext()) 
            {
                hashmap = (TrackingUrl)s.next();
                if (hashmap instanceof Submission)
                {
                    hashmap.log(flag, baseelement);
                } else
                {
                    hashmap.log(flag, null);
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void logSequenceProgress(Sequence sequence1, String s, boolean flag)
    {
        if (submissions != null && sequence1 != null)
        {
            Object obj2 = null;
            Object obj;
            Object obj1;
            if (submissions != null)
            {
                obj1 = submissions.getTrackingEventByType(sequence1.getSubmissionId());
            } else
            {
                obj1 = null;
            }
            obj = obj2;
            if (obj1 != null)
            {
                obj = obj2;
                if (((TrackingEvent) (obj1)).getTrackingUrls().size() > 0)
                {
                    obj = (TrackingUrl)((TrackingEvent) (obj1)).getTrackingUrls().get(0);
                    if (!(obj instanceof Submission))
                    {
                        obj = null;
                    }
                    obj = (Submission)obj;
                }
            }
            if (obj != null)
            {
                obj1 = ObjectUtil.merge(getSubmissionState(), sequence1.getState());
                ((HashMap) (obj1)).put("event", s);
                if (flag)
                {
                    sequence1 = "1";
                } else
                {
                    sequence1 = "0";
                }
                ((HashMap) (obj1)).put("advancepattern", sequence1);
                ((Submission) (obj)).log(true, ((HashMap) (obj1)));
                return;
            }
        }
    }

    private void onAdClick(AdViewEvent adviewevent)
    {
        if (adviewevent.getSource() != null && adviewevent.getSource().getAsset() != null && adviewevent.getSource().getAsset().getClick() != null)
        {
            if (adviewevent.getSource().getAsset().getClick() instanceof Click)
            {
                adviewevent = adviewevent.getSource().getAsset().getClick();
            } else
            {
                adviewevent = null;
            }
            logAdTrackingUrl((Click)adviewevent, "click", null, true);
        }
    }

    private void onAdComplete(AdViewEvent adviewevent)
    {
        if (adviewevent.getSource() != null && adviewevent.getSource().getAsset() != null)
        {
            if (adviewevent.getSource().getAsset() instanceof Asset)
            {
                adviewevent = adviewevent.getSource().getAsset();
            } else
            {
                adviewevent = null;
            }
            logAdTrackingUrl((Asset)adviewevent, "complete", getProgressState(100, "percent"));
            AuditudeUtil.setAssetURI(null);
        }
    }

    private void onAdError(AdViewEvent adviewevent)
    {
        char c = '\u0190';
        if (adviewevent.getSource() == null || adviewevent.getSource().getAsset() == null) goto _L2; else goto _L1
_L1:
        if (adviewevent.getSource().getAsset() instanceof NonLinearAsset)
        {
            c = '\u01F4';
        }
        adviewevent = (Asset)adviewevent.getSource().getAsset();
        if (adviewevent == null) goto _L2; else goto _L3
_L3:
        TrackingEvent trackingevent = adviewevent.getTrackingEventByType("vasterror");
        if (trackingevent == null || trackingevent.getTrackingUrls() == null) goto _L2; else goto _L4
_L4:
        AuditudeUtil.setAssetURI(adviewevent.getUrl());
        adviewevent = trackingevent.getTrackingUrls().iterator();
_L8:
        if (adviewevent.hasNext()) goto _L6; else goto _L5
_L5:
        AuditudeUtil.setAssetURI(null);
_L2:
        return;
_L6:
        ((TrackingUrl)adviewevent.next()).log(false, null, c);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void onAdProgress(AdViewEvent adviewevent)
    {
        Object obj;
        obj = null;
        if (adviewevent.getSource() != null)
        {
            if (adviewevent.getSource().getAsset() instanceof Asset)
            {
                obj = adviewevent.getSource().getAsset();
            }
            obj = (Asset)obj;
        } else
        {
            obj = null;
        }
        if (obj != null && adviewevent.getView() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f;
        int i = adviewevent.getView().getDuration();
        int j = adviewevent.getView().getPosition();
        if (i <= 0)
        {
            f = 0.0F;
        } else
        {
            f = (j * 100) / i;
        }
        if (f >= 25F)
        {
            break; /* Loop/switch isn't completed */
        }
        logAdTrackingUrl(((BaseElement) (obj)), "start", getProgressState(0, "percent"));
_L4:
        adviewevent = ((Asset) (obj)).getTrackingEventByType("progress");
        if (adviewevent != null)
        {
            adviewevent = adviewevent.getTrackingUrls().iterator();
            while (adviewevent.hasNext()) 
            {
                obj = (TrackingUrl)adviewevent.next();
                if (!((TrackingUrl) (obj)).isLogged() && (((TrackingUrl) (obj)).getOffsetIsPercent().booleanValue() && f >= (float)((TrackingUrl) (obj)).getOffset() || !((TrackingUrl) (obj)).getOffsetIsPercent().booleanValue() && j >= ((TrackingUrl) (obj)).getOffset()))
                {
                    ((TrackingUrl) (obj)).log(true, ObjectUtil.merge(currentPodState(), getProgressState(Math.round(f), "percent")));
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (f >= 25F && f < 50F)
        {
            logAdTrackingUrl(((BaseElement) (obj)), "firstquartile", getProgressState(25, "percent"));
        } else
        if (f >= 50F && f < 75F)
        {
            logAdTrackingUrl(((BaseElement) (obj)), "midpoint", getProgressState(50, "percent"));
        } else
        if (f >= 75F && f < 100F)
        {
            logAdTrackingUrl(((BaseElement) (obj)), "thirdquartile", getProgressState(75, "percent"));
        } else
        if (f >= 100F)
        {
            logAdTrackingUrl(((BaseElement) (obj)), "complete", getProgressState(100, "percent"));
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void onAdSkip(AdViewEvent adviewevent)
    {
        if (adviewevent.getSource() != null && adviewevent.getSource().getAsset() != null)
        {
            logAdTrackingUrl((Asset)adviewevent.getSource().getAsset(), "skip", null);
        }
    }

    private void onAdStart(AdViewEvent adviewevent)
    {
        if (adviewevent.getSource() != null)
        {
            if (adviewevent.getSource().getAsset() instanceof Asset)
            {
                adviewevent = adviewevent.getSource().getAsset();
            } else
            {
                adviewevent = null;
            }
            adviewevent = (Asset)adviewevent;
        } else
        {
            adviewevent = null;
        }
        if ((adviewevent instanceof IOnPageAsset) && adviewevent.getFormat().equals("onpage"))
        {
            return;
        } else
        {
            AuditudeUtil.setAssetURI(adviewevent.getUrl());
            logAdTrackingUrl(adviewevent, "creativeview", null);
            logAdTrackingUrl(adviewevent, "start", getProgressState(0, "percent"));
            return;
        }
    }

    private void onAdViewEvent(AdViewEvent adviewevent)
    {
        if (adviewevent == null)
        {
            return;
        }
        switch ($SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType()[adviewevent.getType().ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        case 5: // '\005'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 12: // '\f'
        case 13: // '\r'
        default:
            return;

        case 1: // '\001'
            onAdStart(adviewevent);
            return;

        case 6: // '\006'
            onAdProgress(adviewevent);
            return;

        case 4: // '\004'
            onAdComplete(adviewevent);
            return;

        case 11: // '\013'
            onAdClick(adviewevent);
            return;

        case 10: // '\n'
            onAdError(adviewevent);
            return;

        case 14: // '\016'
            onAdSkip(adviewevent);
            break;
        }
    }

    private void onErrorEvent(PlayerErrorEvent playererrorevent)
    {
        if (playererrorevent.exception != null && submissions != null)
        {
            Submission submission1 = submissions.getSubmissionById("playererror");
            Submission submission = submission1;
            if (submission1 == null)
            {
                submission = Submission.newSubmission(getErrorSubmissionUrl(AuditudeEnv.getInstance().getAdSettings().getDomain()), "playererror");
            }
            if (submission != null)
            {
                submission.log(true, playererrorevent.exception.toParams());
                return;
            }
        }
    }

    private void onParBegin(SMILEvent smilevent)
    {
        par = smilevent.getPar();
    }

    private void onParEnd(SMILEvent smilevent)
    {
        par = null;
    }

    private void onSMILEvent(SMILEvent smilevent)
    {
        switch ($SWITCH_TABLE$com$auditude$ads$event$SMILEvent$SMILEventType()[smilevent.getType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            onSequenceBegin(smilevent);
            return;

        case 2: // '\002'
            onSequenceEnd(smilevent);
            return;

        case 3: // '\003'
            onParBegin(smilevent);
            return;

        case 4: // '\004'
            onParEnd(smilevent);
            break;
        }
    }

    private void onSequenceBegin(SMILEvent smilevent)
    {
label0:
        {
            sequence = smilevent.getSequence();
            if (sequence != null)
            {
                if (sequence.getType() == SmilElementType.LINEAR)
                {
                    break label0;
                }
                smilevent = new TimeoutUtil(smilevent);
                smilevent.addTimeoutCompleteListener(this);
                pendingTimeouts.add(smilevent);
                smilevent.Begin(3000L);
            }
            return;
        }
        logSequenceProgress(sequence, "start", smilevent.getAdvancePattern());
        logAdTrackingUrl(sequence, "start", getProgressState(0, "percent"));
    }

    private void onSequenceEnd(SMILEvent smilevent)
    {
        if (smilevent.getSequence() != null)
        {
            logSequenceProgress(smilevent.getSequence(), "complete", smilevent.getAdvancePattern());
            logAdTrackingUrl(sequence, "complete", getProgressState(100, "percent"));
        }
        if (smilevent.getSequence() == sequence)
        {
            sequence = null;
        }
    }

    public final HashMap currentAdState()
    {
        HashMap hashmap1 = null;
        HashMap hashmap;
        if (sequence != null)
        {
            hashmap = sequence.getState();
        } else
        {
            hashmap = null;
        }
        if (par != null)
        {
            hashmap1 = par.getState();
        }
        return ObjectUtil.merge(hashmap, hashmap1);
    }

    public final HashMap currentPodState()
    {
        HashMap hashmap1 = null;
        HashMap hashmap2 = getSubmissionState();
        HashMap hashmap;
        if (sequence != null)
        {
            hashmap = sequence.getState();
        } else
        {
            hashmap = null;
        }
        if (par != null)
        {
            hashmap1 = par.getState();
        }
        return ObjectUtil.merge(hashmap2, ObjectUtil.merge(hashmap, hashmap1));
    }

    public final void dispose()
    {
        api.removeEventListener("adViewEvent", this);
        api.removeEventListener("smilEvent", this);
        api.removeEventListener("playerError", this);
        reset();
    }

    public final Submissions getSubmissions()
    {
        return submissions;
    }

    public final void init()
    {
        if (!isInitialized)
        {
            isInitialized = true;
        }
        reset();
    }

    public void onAdClick(Ref ref)
    {
        Object obj = ref.getPrimaryAsset();
        if (obj != null && ((Asset) (obj)).getClick() != null)
        {
            if (((Asset) (obj)).getClick() instanceof Click)
            {
                obj = ((Asset) (obj)).getClick();
            } else
            {
                obj = null;
            }
            logAdTrackingUrl((Click)obj, ref.getPar().getSequence(), ref.getPar(), "click", null, true);
        }
    }

    public void onAdComplete(Ref ref)
    {
        logAdTrackingUrl(ref.getPrimaryAsset(), ref.getPar().getSequence(), ref.getPar(), "complete", getProgressState(100, "percent"));
    }

    public void onAdError(Ref ref)
    {
        if (ref == null) goto _L2; else goto _L1
_L1:
        Object obj = ref.getPrimaryAsset();
        if (obj == null) goto _L4; else goto _L3
_L3:
        TrackingEvent trackingevent = ((Asset) (obj)).getTrackingEventByType("vasterror");
        if (trackingevent == null || trackingevent.getTrackingUrls() == null) goto _L4; else goto _L5
_L5:
        AuditudeUtil.setAssetURI(((Asset) (obj)).getUrl());
        obj = trackingevent.getTrackingUrls().iterator();
_L9:
        if (((Iterator) (obj)).hasNext()) goto _L7; else goto _L6
_L6:
        AuditudeUtil.setAssetURI(null);
_L4:
        if (submissions != null)
        {
            Submission submission = submissions.getSubmissionById("playererror");
            obj = submission;
            if (submission == null)
            {
                obj = Submission.newSubmission(getErrorSubmissionUrl(AuditudeEnv.getInstance().getAdSettings().getDomain()), "playererror");
            }
            if (obj != null)
            {
                AssetException assetexception = new AssetException(1131, "asset failed to load");
                if (ref.getAd() != null)
                {
                    assetexception.adId = ref.getAd().getID();
                }
                ((Submission) (obj)).log(true, assetexception.toParams());
            }
        }
_L2:
        return;
_L7:
        ((TrackingUrl)((Iterator) (obj)).next()).log(false, null, 400);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onAdProgress(Ref ref, int i, int j)
    {
        Asset asset = ref.getPrimaryAsset();
        if (asset != null)
        {
            float f;
            if (i <= 0)
            {
                f = 0.0F;
            } else
            {
                f = (j * 100) / i;
            }
            if (f < 25F)
            {
                logAdTrackingUrl(asset, ref.getPar().getSequence(), ref.getPar(), "start", getProgressState(0, "percent"));
                return;
            }
            if (f >= 25F && f < 50F)
            {
                logAdTrackingUrl(asset, ref.getPar().getSequence(), ref.getPar(), "firstquartile", getProgressState(25, "percent"));
                return;
            }
            if (f >= 50F && f < 75F)
            {
                logAdTrackingUrl(asset, ref.getPar().getSequence(), ref.getPar(), "midpoint", getProgressState(50, "percent"));
                return;
            }
            if (f >= 75F && f < 100F)
            {
                logAdTrackingUrl(asset, ref.getPar().getSequence(), ref.getPar(), "thirdquartile", getProgressState(75, "percent"));
                return;
            }
            if (f >= 100F)
            {
                logAdTrackingUrl(asset, ref.getPar().getSequence(), ref.getPar(), "complete", getProgressState(100, "percent"));
                return;
            }
        }
    }

    public void onAdStart(Ref ref)
    {
        Asset asset = ref.getPrimaryAsset();
        if ((asset instanceof IOnPageAsset) && asset.getFormat().equals("onpage"))
        {
            return;
        } else
        {
            logAdTrackingUrl(asset, ref.getPar().getSequence(), ref.getPar(), "creativeview", null);
            logAdTrackingUrl(asset, ref.getPar().getSequence(), ref.getPar(), "start", getProgressState(0, "percent"));
            return;
        }
    }

    public void onEvent(String s, Object obj)
    {
        if (s.equalsIgnoreCase("adViewEvent") && (obj instanceof AdViewEvent))
        {
            onAdViewEvent((AdViewEvent)obj);
        } else
        {
            if (s.equalsIgnoreCase("smilEvent") && (obj instanceof SMILEvent))
            {
                onSMILEvent((SMILEvent)obj);
                return;
            }
            if (s.equalsIgnoreCase("playerError") && (obj instanceof PlayerErrorEvent))
            {
                onErrorEvent((PlayerErrorEvent)obj);
                return;
            }
        }
    }

    public void onSequenceBegin(Sequence sequence1)
    {
label0:
        {
            if (sequence1 != null)
            {
                sequence1.resetTrackingEvents();
                if (sequence1.getType() == SmilElementType.LINEAR)
                {
                    break label0;
                }
                logSequenceProgress(sequence1, "start", true);
            }
            return;
        }
        logSequenceProgress(sequence1, "start", false);
        logAdTrackingUrl(sequence1, "start", getProgressState(0, "percent"));
    }

    public void onSequenceEnd(Sequence sequence1)
    {
        if (sequence1 != null)
        {
            boolean flag;
            if (sequence1.getType() == SmilElementType.LINEAR)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            logSequenceProgress(sequence1, "complete", flag);
            logAdTrackingUrl(sequence1, "complete", getProgressState(100, "percent"));
        }
    }

    public void onTimeoutComplete(TimeoutUtil timeoututil)
    {
        Object obj = null;
        if (timeoututil != null)
        {
            timeoututil.addTimeoutCompleteListener(null);
            pendingTimeouts.remove(timeoututil);
            if (!timeoututil.getIsCanceled() && (timeoututil.getData() instanceof SMILEvent))
            {
                Object obj1 = timeoututil.getData();
                if (obj1 instanceof SMILEvent)
                {
                    obj = obj1;
                }
                obj = (SMILEvent)obj;
                logSequenceProgress(((SMILEvent) (obj)).getSequence(), "start", ((SMILEvent) (obj)).getAdvancePattern());
            }
            timeoututil.dispose();
        }
    }

    public final void reset()
    {
        submissions = null;
        sequence = null;
        par = null;
        Iterator iterator = pendingTimeouts.iterator();
        do
        {
            TimeoutUtil timeoututil;
            do
            {
                if (!iterator.hasNext())
                {
                    pendingTimeouts.clear();
                    return;
                }
                timeoututil = (TimeoutUtil)iterator.next();
            } while (timeoututil == null);
            timeoututil.dispose();
        } while (true);
    }

    public final void setSubmissions(Submissions submissions1)
    {
        submissions = submissions1;
    }
}
