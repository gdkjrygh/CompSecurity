// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import org.json.JSONObject;

class threshold extends threshold
{

    private static final int DEFAULT_VOLUME_THRESHOLD = 35;
    private static final String JSON_KEY_VOLUME_THRESHOLD = "volumeSelectorThreshold";
    static float volumeIntensity;
    private final float factor;
    private final float safetyMax;
    private final float threshold;

    int getCurrentCell()
    {
        float f = Math.max(0.0F, volumeIntensity - threshold);
        return (int)(Math.min(safetyMax, f) * factor);
    }

    boolean isFinished()
    {
        return false;
    }

    void reset()
    {
    }

    boolean update()
    {
        return false;
    }

    (int i, JSONObject jsonobject)
    {
        super(null);
        int j = jsonobject.optInt("volumeSelectorThreshold", 35);
        if (j < 0 || 100 <= j)
        {
            throw new IllegalArgumentException((new StringBuilder("Failure parsing nina_animated_icon.json -- Volume selector threshold (")).append(j).append(") must be non-negative and less than 100").toString());
        } else
        {
            threshold = j;
            factor = (float)i / (100F - threshold);
            safetyMax = 99F - threshold;
            return;
        }
    }
}
