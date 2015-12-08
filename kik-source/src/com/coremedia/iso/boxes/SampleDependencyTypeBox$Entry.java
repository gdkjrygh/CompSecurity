// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;


// Referenced classes of package com.coremedia.iso.boxes:
//            SampleDependencyTypeBox

public static class value
{

    private int value;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (value)obj;
            if (value != ((value) (obj)).value)
            {
                return false;
            }
        }
        return true;
    }

    public int getReserved()
    {
        return value >> 6 & 3;
    }

    public int getSampleDependsOn()
    {
        return value >> 4 & 3;
    }

    public int getSampleHasRedundancy()
    {
        return value & 3;
    }

    public int getSampleIsDependentOn()
    {
        return value >> 2 & 3;
    }

    public int hashCode()
    {
        return value;
    }

    public void setReserved(int i)
    {
        value = (i & 3) << 6 | value & 0x3f;
    }

    public void setSampleDependsOn(int i)
    {
        value = (i & 3) << 4 | value & 0xcf;
    }

    public void setSampleHasRedundancy(int i)
    {
        value = i & 3 | value & 0xfc;
    }

    public void setSampleIsDependentOn(int i)
    {
        value = (i & 3) << 2 | value & 0xf3;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{reserved=")).append(getReserved()).append(", sampleDependsOn=").append(getSampleDependsOn()).append(", sampleIsDependentOn=").append(getSampleIsDependentOn()).append(", sampleHasRedundancy=").append(getSampleHasRedundancy()).append('}').toString();
    }


    public (int i)
    {
        value = i;
    }
}
