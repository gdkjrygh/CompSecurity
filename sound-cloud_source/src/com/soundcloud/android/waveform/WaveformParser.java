// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import com.soundcloud.android.utils.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformData

class WaveformParser
{

    private static final String HEIGHT = "height";
    private static final String SAMPLES = "samples";
    private static final String WIDTH = "width";

    public WaveformParser()
    {
    }

    public WaveformData parse(InputStream inputstream)
        throws JSONException, IOException
    {
        Object obj = new JSONObject(IOUtils.readInputStream(inputstream));
        int j = ((JSONObject) (obj)).getInt("width");
        int k = ((JSONObject) (obj)).getInt("height");
        inputstream = new int[j];
        obj = ((JSONObject) (obj)).getJSONArray("samples");
        if (obj == null || ((JSONArray) (obj)).length() == 0)
        {
            throw new IOException("no samples provided");
        }
        if (((JSONArray) (obj)).length() != j)
        {
            throw new IOException("incomplete sample data");
        }
        for (int i = 0; i < j; i++)
        {
            inputstream[i] = (int)(Math.pow(((JSONArray) (obj)).getDouble(i) / (double)k, 1.5D) * (double)k);
        }

        return new WaveformData(k, inputstream);
    }
}
