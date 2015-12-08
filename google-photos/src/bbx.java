// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bbx
{

    int a;

    public bbx(int i)
    {
        a = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bbx)obj;
            if (a != ((bbx) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a;
    }

    public final String toString()
    {
        String s = String.valueOf("Entry{reserved=");
        int i = a;
        int j = a;
        int k = a;
        int l = a;
        return (new StringBuilder(String.valueOf(s).length() + 107)).append(s).append(i >> 6 & 3).append(", sampleDependsOn=").append(j >> 4 & 3).append(", sampleIsDependentOn=").append(k >> 2 & 3).append(", sampleHasRedundancy=").append(l & 3).append("}").toString();
    }
}
