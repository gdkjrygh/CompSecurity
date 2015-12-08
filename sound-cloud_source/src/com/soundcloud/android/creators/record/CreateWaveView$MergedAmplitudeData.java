// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;


// Referenced classes of package com.soundcloud.android.creators.record:
//            CreateWaveView, RecordStream, AmplitudeData

static class 
{

    private AmplitudeData preRecData;
    public int preRecSize;
    private AmplitudeData recData;
    public int recordEndIndexWithTrim;
    public int recordStartIndexWithTrim;
    public int totalSize;
    public int writtenSize;

    public void configure(RecordStream recordstream, float af[])
    {
        preRecData = recordstream.getPreRecordAmplitudeData();
        recData = recordstream.getAmplitudeData();
        int i;
        if (preRecData == null)
        {
            i = 0;
        } else
        {
            i = preRecData.size();
        }
        preRecSize = i;
        if (recData == null)
        {
            i = 0;
        } else
        {
            i = recData.size();
        }
        writtenSize = i;
        totalSize = preRecSize + writtenSize;
        recordStartIndexWithTrim = (int)((float)preRecSize + af[0] * (float)writtenSize);
        recordEndIndexWithTrim = (int)((double)totalSize - (double)writtenSize * (1.0D - (double)af[1]));
    }

    public float get(int i)
    {
        if (i < preRecData.size())
        {
            return preRecData.get(i);
        }
        if (i - preRecData.size() < recData.size())
        {
            return recData.get(i - preRecData.size());
        } else
        {
            return 0.0F;
        }
    }

    ()
    {
    }
}
