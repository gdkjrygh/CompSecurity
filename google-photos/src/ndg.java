// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.mtp.MtpObjectInfo;

public final class ndg
    implements Comparable
{

    public int a;
    long b;
    public int c;
    public int d;

    public ndg(MtpObjectInfo mtpobjectinfo)
    {
        a = mtpobjectinfo.getObjectHandle();
        b = mtpobjectinfo.getDateCreated();
        c = mtpobjectinfo.getFormat();
        d = mtpobjectinfo.getCompressedSize();
    }

    public final int compareTo(Object obj)
    {
        obj = (ndg)obj;
        return Long.signum(b - ((ndg) (obj)).b);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof ndg))
            {
                return false;
            }
            obj = (ndg)obj;
            if (d != ((ndg) (obj)).d)
            {
                return false;
            }
            if (b != ((ndg) (obj)).b)
            {
                return false;
            }
            if (c != ((ndg) (obj)).c)
            {
                return false;
            }
            if (a != ((ndg) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (((d + 31) * 31 + (int)(b ^ b >>> 32)) * 31 + c) * 31 + a;
    }

    public final String toString()
    {
        int i = a;
        long l = b;
        int j = c;
        int k = d;
        return (new StringBuilder(123)).append("IngestObjectInfo [mHandle=").append(i).append(", mDateCreated=").append(l).append(", mFormat=").append(j).append(", mCompressedSize=").append(k).append("]").toString();
    }
}
