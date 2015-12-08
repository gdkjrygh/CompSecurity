// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

// Referenced classes of package org.joda.time.tz:
//            DateTimeZoneBuilder

private static final class iSaveMillis
{

    final String iNameKey;
    final iSaveMillis iOfYear;
    final int iSaveMillis;

    static iSaveMillis readFrom(DataInput datainput)
        throws IOException
    {
        return new <init>(From(datainput), datainput.readUTF(), (int)DateTimeZoneBuilder.readMillis(datainput));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof From)
            {
                if (iSaveMillis != ((iSaveMillis) (obj = (iSaveMillis)obj)).iSaveMillis || !iNameKey.equals(((iNameKey) (obj)).iNameKey) || !iOfYear.ls(((ls) (obj)).iOfYear))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public String getNameKey()
    {
        return iNameKey;
    }

    public iNameKey getOfYear()
    {
        return iOfYear;
    }

    public int getSaveMillis()
    {
        return iSaveMillis;
    }

    public long next(long l, int i, int j)
    {
        return iOfYear.(l, i, j);
    }

    public long previous(long l, int i, int j)
    {
        return iOfYear.ious(l, i, j);
    }

    ious rename(String s)
    {
        return new <init>(iOfYear, s, iSaveMillis);
    }

    iSaveMillis renameAppend(String s)
    {
        return rename((new StringBuilder()).append(iNameKey).append(s).toString().intern());
    }

    public void writeTo(DataOutput dataoutput)
        throws IOException
    {
        iOfYear.eTo(dataoutput);
        dataoutput.writeUTF(iNameKey);
        DateTimeZoneBuilder.writeMillis(dataoutput, iSaveMillis);
    }

    ( , String s, int i)
    {
        iOfYear = ;
        iNameKey = s;
        iSaveMillis = i;
    }
}
