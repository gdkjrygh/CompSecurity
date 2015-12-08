// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.core;


public class PipelineParams
{

    public boolean applyCrop;
    public float bannerOpacity;
    public float colorStrength;
    public float cropAngle;
    public float cropBottom;
    public float cropLeft;
    public float cropRight;
    public float cropTop;
    public float easterEggAngle;
    public int easterEggFrame;
    public boolean easterEggShow;
    public float easterEggX;
    public float easterEggY;
    public float lightStrength;
    public int look;
    public float lookIntensity;
    public float marginBottom;
    public float marginLeft;
    public float marginRight;
    public float marginTop;
    public float popStrength;
    public float rotateAngle;
    public int ruleOfThirdsCount;
    public float ruleOfThirdsOpacity;
    public float straightenAngle;
    public float vignetteCenterX;
    public float vignetteCenterY;
    public float vignetteStrength;
    public float zoomCenterX;
    public float zoomCenterY;
    public float zoomScale;

    public PipelineParams()
    {
        lightStrength = 0.0F;
        colorStrength = 0.0F;
        popStrength = 0.0F;
        vignetteStrength = 0.0F;
        vignetteCenterX = 0.5F;
        vignetteCenterY = 0.5F;
        applyCrop = true;
        rotateAngle = 0.0F;
        straightenAngle = 0.0F;
        cropLeft = 0.0F;
        cropTop = 0.0F;
        cropRight = 1.0F;
        cropBottom = 1.0F;
        look = 0;
        lookIntensity = 0.5F;
        zoomScale = 1.0F;
        zoomCenterX = 0.5F;
        zoomCenterY = 0.5F;
        ruleOfThirdsOpacity = 0.0F;
        ruleOfThirdsCount = 3;
        bannerOpacity = 0.0F;
        cropAngle = 0.0F;
        marginLeft = 0.0F;
        marginTop = 0.0F;
        marginRight = 0.0F;
        marginBottom = 0.0F;
        easterEggShow = false;
        easterEggX = 0.0F;
        easterEggY = 0.0F;
        easterEggAngle = 0.0F;
        easterEggFrame = 0;
    }

    public PipelineParams(PipelineParams pipelineparams)
    {
        lightStrength = 0.0F;
        colorStrength = 0.0F;
        popStrength = 0.0F;
        vignetteStrength = 0.0F;
        vignetteCenterX = 0.5F;
        vignetteCenterY = 0.5F;
        applyCrop = true;
        rotateAngle = 0.0F;
        straightenAngle = 0.0F;
        cropLeft = 0.0F;
        cropTop = 0.0F;
        cropRight = 1.0F;
        cropBottom = 1.0F;
        look = 0;
        lookIntensity = 0.5F;
        zoomScale = 1.0F;
        zoomCenterX = 0.5F;
        zoomCenterY = 0.5F;
        ruleOfThirdsOpacity = 0.0F;
        ruleOfThirdsCount = 3;
        bannerOpacity = 0.0F;
        cropAngle = 0.0F;
        marginLeft = 0.0F;
        marginTop = 0.0F;
        marginRight = 0.0F;
        marginBottom = 0.0F;
        easterEggShow = false;
        easterEggX = 0.0F;
        easterEggY = 0.0F;
        easterEggAngle = 0.0F;
        easterEggFrame = 0;
        lightStrength = pipelineparams.lightStrength;
        colorStrength = pipelineparams.colorStrength;
        popStrength = pipelineparams.popStrength;
        vignetteStrength = pipelineparams.vignetteStrength;
        vignetteCenterX = pipelineparams.vignetteCenterX;
        vignetteCenterY = pipelineparams.vignetteCenterY;
        applyCrop = pipelineparams.applyCrop;
        rotateAngle = pipelineparams.rotateAngle;
        straightenAngle = pipelineparams.straightenAngle;
        cropLeft = pipelineparams.cropLeft;
        cropTop = pipelineparams.cropTop;
        cropRight = pipelineparams.cropRight;
        cropBottom = pipelineparams.cropBottom;
        look = pipelineparams.look;
        lookIntensity = pipelineparams.lookIntensity;
        ruleOfThirdsOpacity = pipelineparams.ruleOfThirdsOpacity;
        ruleOfThirdsCount = pipelineparams.ruleOfThirdsCount;
        bannerOpacity = pipelineparams.bannerOpacity;
        cropAngle = pipelineparams.cropAngle;
        marginLeft = pipelineparams.marginLeft;
        marginTop = pipelineparams.marginTop;
        marginRight = pipelineparams.marginRight;
        marginBottom = pipelineparams.marginBottom;
        easterEggShow = pipelineparams.easterEggShow;
        easterEggX = pipelineparams.easterEggX;
        easterEggY = pipelineparams.easterEggY;
        easterEggAngle = pipelineparams.easterEggAngle;
        easterEggFrame = pipelineparams.easterEggFrame;
        a(pipelineparams);
    }

    public final void a(PipelineParams pipelineparams)
    {
        zoomScale = pipelineparams.zoomScale;
        zoomCenterX = pipelineparams.zoomCenterX;
        zoomCenterY = pipelineparams.zoomCenterY;
    }

    public String toString()
    {
        String s = String.valueOf("PipelineParams:\n");
        String s1 = String.valueOf(String.valueOf(lightStrength));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 8 + String.valueOf(s1).length())).append(s).append("Light: ").append(s1).append("\n").toString());
        s1 = String.valueOf(String.valueOf(colorStrength));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 8 + String.valueOf(s1).length())).append(s).append("Color: ").append(s1).append("\n").toString());
        s1 = String.valueOf(String.valueOf(popStrength));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 6 + String.valueOf(s1).length())).append(s).append("Pop: ").append(s1).append("\n").toString());
        s1 = String.valueOf(String.valueOf(vignetteStrength));
        String s2 = String.valueOf(String.valueOf(vignetteCenterX));
        String s3 = String.valueOf(String.valueOf(vignetteCenterY));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append("Vignette: (").append(s1).append(", (").append(s2).append(", ").append(s3).append(")\n").toString());
        s1 = String.valueOf(String.valueOf(applyCrop));
        s2 = String.valueOf(String.valueOf(rotateAngle));
        s3 = String.valueOf(String.valueOf(straightenAngle));
        String s4 = String.valueOf(String.valueOf(cropLeft));
        String s5 = String.valueOf(String.valueOf(cropTop));
        String s6 = String.valueOf(String.valueOf(cropRight));
        String s7 = String.valueOf(String.valueOf(cropBottom));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 23 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length())).append(s).append("Crop (").append(s1).append(", (").append(s2).append(", ").append(s3).append("), (").append(s4).append(", ").append(s5).append(", ").append(s6).append(", ").append(s7).append(")\n").toString());
        s1 = String.valueOf(String.valueOf(look));
        s2 = String.valueOf(String.valueOf(lookIntensity));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append("Look: (").append(s1).append(", ").append(s2).append(")\n").toString());
        s1 = String.valueOf(String.valueOf(zoomScale));
        s2 = String.valueOf(String.valueOf(zoomCenterX));
        s3 = String.valueOf(String.valueOf(zoomCenterY));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append("Zoom: (").append(s1).append(", ").append(s2).append(", ").append(s3).append(")\n").toString());
        s1 = String.valueOf(String.valueOf(marginLeft));
        s2 = String.valueOf(String.valueOf(marginTop));
        s3 = String.valueOf(String.valueOf(marginRight));
        s4 = String.valueOf(String.valueOf(marginBottom));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append("Margins: (").append(s1).append(", ").append(s2).append(", ").append(s3).append(", ").append(s4).append(")\n").toString());
        s1 = String.valueOf(String.valueOf(ruleOfThirdsOpacity));
        s2 = String.valueOf(String.valueOf(ruleOfThirdsCount));
        s3 = String.valueOf(String.valueOf(bannerOpacity));
        s4 = String.valueOf(String.valueOf(cropAngle));
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append("Crop frame: (").append(s1).append(", ").append(s2).append(", ").append(s3).append(", ").append(s4).append(")\n").toString());
        s1 = String.valueOf(String.valueOf(easterEggShow));
        s2 = String.valueOf(String.valueOf(easterEggX));
        s3 = String.valueOf(String.valueOf(easterEggY));
        s4 = String.valueOf(String.valueOf(easterEggAngle));
        s5 = String.valueOf(String.valueOf(easterEggFrame));
        return (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(s).append("Easter Egg: (").append(s1).append(", ").append(s2).append(", ").append(s3).append(", ").append(s4).append(", ").append(s5).append(")").toString();
    }
}
