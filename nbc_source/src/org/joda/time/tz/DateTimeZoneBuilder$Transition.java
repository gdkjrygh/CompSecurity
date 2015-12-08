// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;


// Referenced classes of package org.joda.time.tz:
//            DateTimeZoneBuilder

private static final class iStandardOffset
{

    private final long iMillis;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public long getMillis()
    {
        return iMillis;
    }

    public String getNameKey()
    {
        return iNameKey;
    }

    public int getSaveMillis()
    {
        return iWallOffset - iStandardOffset;
    }

    public int getStandardOffset()
    {
        return iStandardOffset;
    }

    public int getWallOffset()
    {
        return iWallOffset;
    }

    public boolean isTransitionFrom(iWallOffset iwalloffset)
    {
        while (iwalloffset == null || iMillis > iwalloffset.iMillis && (iWallOffset != iwalloffset.iWallOffset || !iNameKey.equals(iwalloffset.iNameKey))) 
        {
            return true;
        }
        return false;
    }

    (long l, String s, int i, int j)
    {
        iMillis = l;
        iNameKey = s;
        iWallOffset = i;
        iStandardOffset = j;
    }

    iStandardOffset(long l, iStandardOffset istandardoffset, int i)
    {
        iMillis = l;
        iNameKey = istandardoffset.eKey();
        iWallOffset = istandardoffset.eMillis() + i;
        iStandardOffset = i;
    }

    iStandardOffset(long l, iStandardOffset istandardoffset)
    {
        iMillis = l;
        iNameKey = istandardoffset.iNameKey;
        iWallOffset = istandardoffset.iWallOffset;
        iStandardOffset = istandardoffset.iStandardOffset;
    }
}
