// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


// Referenced classes of package com.adobe.ave:
//            ContainerType, VideoEngineException, PayloadType, ABRProfileInfo, 
//            CuePoint, TagData, PeriodInfo, InsertionResult

public class Timeline
{

    public int complete;
    public int firstPeriodIndex;
    public int firstSubscribedTagIndex;
    public int lastPeriodIndex;
    public int lastSubscribedTagIndex;
    private long mNativeContext;
    public ContainerType type;
    public long virtualDuration;
    public long virtualStartTime;

    private Timeline(long l)
    {
        mNativeContext = l;
        nativeCreateTimeline(l);
    }

    private Timeline(long l, int i, int j, long l1, long l2, int k, int i1, int j1, int k1)
    {
        mNativeContext = l;
        ContainerType containertype1 = ContainerType.UNDEFINED;
        ContainerType acontainertype[] = ContainerType.values();
        int j2 = acontainertype.length;
        int i2 = 0;
        do
        {
label0:
            {
                ContainerType containertype = containertype1;
                if (i2 < j2)
                {
                    containertype = acontainertype[i2];
                    if (containertype.getValue() != i)
                    {
                        break label0;
                    }
                }
                type = containertype;
                complete = j;
                virtualStartTime = l1;
                virtualDuration = l2;
                firstPeriodIndex = k;
                lastPeriodIndex = i1;
                firstSubscribedTagIndex = j1;
                lastSubscribedTagIndex = k1;
                nativeCreateTimeline(l);
                return;
            }
            i2++;
        } while (true);
    }

    private native void nativeCreateTimeline(long l);

    private native void nativeEraseByLocalTime(int i, long l, long l1, boolean flag)
        throws VideoEngineException;

    private native void nativeEraseByVirtualTime(long l, long l1)
        throws VideoEngineException;

    private native int nativeGetABRProfileCount(int i)
        throws VideoEngineException;

    private native ABRProfileInfo nativeGetABRProfileInfoAtIndex(int i, int j)
        throws VideoEngineException;

    private native CuePoint nativeGetCuePoint(int i, int j)
        throws VideoEngineException;

    private native TagData nativeGetMainManifestSubscribedTag(int i);

    private native PeriodInfo nativeGetPeriodInfo(int i)
        throws VideoEngineException;

    private native TagData nativeGetSubscribedTag(int i, int j);

    private native int nativeGetTrackCount(int i, int j)
        throws VideoEngineException;

    private native Object nativeGetTrackInfo(int i, int j, int k)
        throws VideoEngineException;

    private native InsertionResult nativeInsertByLocalTime(int i, long l, int j, int k, long l1)
        throws VideoEngineException;

    private native InsertionResult nativeInsertByVirtualTime(long l, int i, int j, long l1)
        throws VideoEngineException;

    private native void nativeLoadManifest(String s, int i, int j)
        throws VideoEngineException;

    private native void nativeReleaseManifest(int i)
        throws VideoEngineException;

    private native void nativeSetHoldAt(long l);

    public void eraseByLocalTime(int i, long l, long l1, boolean flag)
        throws VideoEngineException
    {
        nativeEraseByLocalTime(i, l, l1, flag);
    }

    public void eraseByVirtualTime(long l, long l1)
        throws VideoEngineException
    {
        nativeEraseByVirtualTime(l, l1);
    }

    public int getABRProfileCount(int i)
        throws VideoEngineException
    {
        return nativeGetABRProfileCount(i);
    }

    public ABRProfileInfo getABRProfileInfoAtIndex(int i, int j)
        throws VideoEngineException
    {
        return nativeGetABRProfileInfoAtIndex(i, j);
    }

    public CuePoint getCuePoint(int i, int j)
        throws VideoEngineException
    {
        return nativeGetCuePoint(i, j);
    }

    public TagData getMainManifestSubscribedTag(int i)
        throws VideoEngineException
    {
        return nativeGetMainManifestSubscribedTag(i);
    }

    public PeriodInfo getPeriodInfo(int i)
        throws VideoEngineException
    {
        return nativeGetPeriodInfo(i);
    }

    public TagData getSubscribedTag(int i, int j)
        throws VideoEngineException
    {
        return nativeGetSubscribedTag(i, j);
    }

    public int getTrackCount(int i, PayloadType payloadtype)
        throws VideoEngineException
    {
        return nativeGetTrackCount(i, payloadtype.getValue());
    }

    public Object getTrackInfo(int i, int j, PayloadType payloadtype)
        throws VideoEngineException
    {
        return nativeGetTrackInfo(i, j, payloadtype.getValue());
    }

    public InsertionResult insertByLocalTime(int i, long l, int j, int k, long l1)
        throws VideoEngineException
    {
        return nativeInsertByLocalTime(i, l, j, k, l1);
    }

    public InsertionResult insertByVirtualTime(long l, int i, int j, long l1)
        throws VideoEngineException
    {
        return nativeInsertByVirtualTime(l, i, j, l1);
    }

    public void loadManifest(String s, int i, ContainerType containertype)
        throws VideoEngineException
    {
        nativeLoadManifest(s, i, containertype.getValue());
    }

    public void releaseManifest(int i)
        throws VideoEngineException
    {
        nativeReleaseManifest(i);
    }

    public void setHoldAt(long l)
        throws VideoEngineException
    {
        nativeSetHoldAt(l);
    }
}
