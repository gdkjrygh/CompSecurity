// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.facebook.common.network.FbDataConnectionManager;
import com.facebook.device.DeviceConditionHelper;
import com.google.android.exoplayer.chunk.FormatEvaluator;
import com.google.android.exoplayer.upstream.BandwidthMeter;

// Referenced classes of package com.facebook.video.view.exo:
//            ManualEvaluator, DashCustomEvaluator, PlaybackPreferences

public class FormatEvaluatorFactory
{

    public FormatEvaluatorFactory()
    {
    }

    public static FormatEvaluator a(com.facebook.video.abtest.VideoDashExperiment.Config config, PlaybackPreferences playbackpreferences, BandwidthMeter bandwidthmeter, boolean flag, DeviceConditionHelper deviceconditionhelper, FbDataConnectionManager fbdataconnectionmanager)
    {
        switch (_cls1.a[config.m.ordinal()])
        {
        default:
            return new ManualEvaluator(playbackpreferences);

        case 1: // '\001'
            return new DashCustomEvaluator(bandwidthmeter, flag, playbackpreferences, config, deviceconditionhelper, fbdataconnectionmanager);

        case 2: // '\002'
            return new com.google.android.exoplayer.chunk.FormatEvaluator.RandomEvaluator();
        }
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.facebook.video.abtest.VideoDashExperiment.DashAbrPolicy.values().length];
            try
            {
                a[com.facebook.video.abtest.VideoDashExperiment.DashAbrPolicy.CUSTOM_ABR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.facebook.video.abtest.VideoDashExperiment.DashAbrPolicy.RANDOM_ABR.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
