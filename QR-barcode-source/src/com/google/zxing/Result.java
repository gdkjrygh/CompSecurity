// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.zxing:
//            ResultPoint, ResultMetadataType, BarcodeFormat

public final class Result
{

    private final BarcodeFormat format;
    private final byte rawBytes[];
    private Map resultMetadata;
    private ResultPoint resultPoints[];
    private final String text;
    private final long timestamp;

    public Result(String s, byte abyte0[], ResultPoint aresultpoint[], BarcodeFormat barcodeformat)
    {
        this(s, abyte0, aresultpoint, barcodeformat, System.currentTimeMillis());
    }

    public Result(String s, byte abyte0[], ResultPoint aresultpoint[], BarcodeFormat barcodeformat, long l)
    {
        text = s;
        rawBytes = abyte0;
        resultPoints = aresultpoint;
        format = barcodeformat;
        resultMetadata = null;
        timestamp = l;
    }

    public void addResultPoints(ResultPoint aresultpoint[])
    {
        ResultPoint aresultpoint1[] = resultPoints;
        if (aresultpoint1 == null)
        {
            resultPoints = aresultpoint;
        } else
        if (aresultpoint != null && aresultpoint.length > 0)
        {
            ResultPoint aresultpoint2[] = new ResultPoint[aresultpoint1.length + aresultpoint.length];
            System.arraycopy(aresultpoint1, 0, aresultpoint2, 0, aresultpoint1.length);
            System.arraycopy(aresultpoint, 0, aresultpoint2, aresultpoint1.length, aresultpoint.length);
            resultPoints = aresultpoint2;
            return;
        }
    }

    public BarcodeFormat getBarcodeFormat()
    {
        return format;
    }

    public byte[] getRawBytes()
    {
        return rawBytes;
    }

    public Map getResultMetadata()
    {
        return resultMetadata;
    }

    public ResultPoint[] getResultPoints()
    {
        return resultPoints;
    }

    public String getText()
    {
        return text;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public void putAllMetadata(Map map)
    {
label0:
        {
            if (map != null)
            {
                if (resultMetadata != null)
                {
                    break label0;
                }
                resultMetadata = map;
            }
            return;
        }
        resultMetadata.putAll(map);
    }

    public void putMetadata(ResultMetadataType resultmetadatatype, Object obj)
    {
        if (resultMetadata == null)
        {
            resultMetadata = new EnumMap(com/google/zxing/ResultMetadataType);
        }
        resultMetadata.put(resultmetadatatype, obj);
    }

    public String toString()
    {
        return text;
    }
}
