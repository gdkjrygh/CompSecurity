// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.motion;


// Referenced classes of package com.spotify.mobile.android.motion:
//            MotionProcessorObserver

public class MotionProcessor
{

    private double amplification;
    private double bestStabilityThresholdTimeout;
    private double energyThreshold;
    private double gracePeriod;
    private double intentCurveCoefficient;
    private double intentMaxBPM;
    private double intentMaxSteps;
    private double lowPassFilterTempoCoefficient;
    private double lowPassFilterTempoLongTermCoefficient;
    private double lowPassFilterTempoSlowTermCoefficient;
    private double maximumBPMChange;
    private double maximumBestStabilityThreshold;
    private double maximumTempo;
    private double minimumBestStabilityThreshold;
    private long minimumNumberStableQuarterSteps;
    private double minimumTempo;
    private long nMotionPointer;
    private double sampleRate;
    public double tempo;
    private double tempoDefault;
    private double tempoSteps;
    private int windowSize;
    private double worstStabilityThreshold;

    public MotionProcessor(double d, int i, double d1, double d2, 
            double d3, double d4, double d5, double d6, double d7, double d8, double d9, 
            double d10, double d11, double d12, double d13, double d14, long l, double d15, 
            double d16, double d17, double d18)
    {
        amplification = d;
        windowSize = i;
        sampleRate = d1;
        energyThreshold = d2;
        minimumTempo = d3;
        maximumTempo = d4;
        tempoSteps = d5;
        lowPassFilterTempoCoefficient = d6;
        lowPassFilterTempoLongTermCoefficient = d7;
        minimumBestStabilityThreshold = d8;
        worstStabilityThreshold = d9;
        tempoDefault = d10;
        bestStabilityThresholdTimeout = d11;
        maximumBestStabilityThreshold = d12;
        lowPassFilterTempoSlowTermCoefficient = d13;
        maximumBPMChange = d14;
        minimumNumberStableQuarterSteps = l;
        lowPassFilterTempoSlowTermCoefficient = d13;
        maximumBPMChange = d14;
        minimumNumberStableQuarterSteps = l;
        intentMaxBPM = d15;
        intentCurveCoefficient = d16;
        intentMaxSteps = d17;
        gracePeriod = d18;
        nMotionPointer = 0L;
    }

    public native void addObserver(MotionProcessorObserver motionprocessorobserver);

    public native void feedMotionEvent(double d, double d1, double d2);

    public native void removeObserver(MotionProcessorObserver motionprocessorobserver);

    public native void setSongTempo(double d);
}
