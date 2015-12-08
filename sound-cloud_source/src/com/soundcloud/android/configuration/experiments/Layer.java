// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;


public class Layer
{

    private int experimentId;
    private String experimentName;
    private String layerName;
    private int variantId;
    private String variantName;

    public Layer()
    {
    }

    public int getExperimentId()
    {
        return experimentId;
    }

    public String getExperimentName()
    {
        return experimentName;
    }

    public String getLayerName()
    {
        return layerName;
    }

    public int getVariantId()
    {
        return variantId;
    }

    public String getVariantName()
    {
        return variantName;
    }

    public void setExperimentId(int i)
    {
        experimentId = i;
    }

    public void setExperimentName(String s)
    {
        experimentName = s;
    }

    public void setLayerName(String s)
    {
        layerName = s;
    }

    public void setVariantId(int i)
    {
        variantId = i;
    }

    public void setVariantName(String s)
    {
        variantName = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append(layerName).append('\n').append(experimentName).append(':').append(experimentId).append('\n').append(variantName).append(':').append(variantId).append('\n').toString();
    }
}
