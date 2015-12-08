// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.auditude;

import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AuditudeSettings;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.ContentTracker;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.smil.Par;
import com.auditude.ads.model.smil.Ref;
import com.auditude.ads.model.smil.Sequence;
import com.auditude.ads.reporting.ReportingHelper;

public class AuditudeTracker
    implements ContentTracker
{

    private final String LOG_TAG = (new StringBuilder()).append("[PSDK]::[AuditudeAd]::").append(com/adobe/mediacore/timeline/advertising/auditude/AuditudeTracker.getSimpleName()).toString();
    private Logger _logger;
    private final ReportingHelper auditudeAdReporter;
    private Sequence currentSequence;

    public AuditudeTracker(ReportingHelper reportinghelper)
    {
        _logger = Log.getLogger(LOG_TAG);
        auditudeAdReporter = reportinghelper;
    }

    private Ref retrieveReference(Ad ad)
    {
        ad = ad.getPrimaryAsset();
        if (ad != null)
        {
            ad = ad.getMediaResource();
            if (ad != null)
            {
                ad = ad.getMetadata();
                if (ad instanceof AuditudeSettings)
                {
                    ad = ((Ad) (((AuditudeSettings)ad).getData()));
                    if (ad instanceof Ref)
                    {
                        return (Ref)ad;
                    }
                }
            }
        }
        return null;
    }

    public void onAdBreakComplete(AdBreak adbreak)
    {
        if (currentSequence != null)
        {
            auditudeAdReporter.onSequenceEnd(currentSequence);
            currentSequence = null;
        }
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        currentSequence = null;
    }

    public void onAdClick(Ad ad)
    {
        ad = retrieveReference(ad);
        if (ad != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#onAdClick()").toString(), "Reporting AD-CLICK.");
            auditudeAdReporter.onAdClick(ad);
        }
    }

    public void onAdComplete(Ad ad)
    {
        ad = retrieveReference(ad);
        if (ad != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#onAdComplete()").toString(), "Reporting AD-COMPLETE.");
            auditudeAdReporter.onAdComplete(ad);
            if (ad.getPrimaryAsset() != null)
            {
                ad.getPrimaryAsset().Reset();
            }
        }
    }

    public void onAdError(Ad ad)
    {
        ad = retrieveReference(ad);
        if (ad != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#onAdError()").toString(), "Reporting AD-ERROR.");
            auditudeAdReporter.onAdError(ad);
        }
    }

    public void onAdProgress(Ad ad, int i)
    {
        ad = retrieveReference(ad);
        if (ad != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#onAdProgress()").toString(), (new StringBuilder()).append("Reporting AD-PROGRESS: ").append(i).append("%").toString());
            auditudeAdReporter.onAdProgress(ad, 100, i);
        }
    }

    public void onAdStart(Ad ad)
    {
        ad = retrieveReference(ad);
        if (ad != null && ad.getPar() != null && ad.getPar().getSequence() != null)
        {
            Sequence sequence = ad.getPar().getSequence();
            if (currentSequence != null)
            {
                if (sequence != currentSequence)
                {
                    auditudeAdReporter.onSequenceEnd(currentSequence);
                    auditudeAdReporter.onSequenceBegin(sequence);
                }
            } else
            {
                auditudeAdReporter.onSequenceBegin(sequence);
            }
            currentSequence = sequence;
        }
        if (ad != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#onAdStart()").toString(), "Reporting AD-START.");
            auditudeAdReporter.onAdStart(ad);
        }
    }
}
