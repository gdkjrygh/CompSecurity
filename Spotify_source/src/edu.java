// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class edu
{

    boolean a;
    com.spotify.mobile.android.provider.Metadata.Track.AdType b;
    String c;

    edu(boolean flag, com.spotify.mobile.android.provider.Metadata.Track.AdType adtype, String s)
    {
        a = flag;
        b = adtype;
        c = s;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (edu)obj;
        if (a != ((edu) (obj)).a)
        {
            return false;
        }
        if (b != ((edu) (obj)).b)
        {
            return false;
        }
        if (c == null) goto _L4; else goto _L3
_L3:
        if (c.equals(((edu) (obj)).c)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((edu) (obj)).c == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public final String toString()
    {
        return (new StringBuilder("TrackMetadata{mAdPlaying=")).append(a).append(", mAdType=").append(b).append(", mTrackUri='").append(c).append('\'').append('}').toString();
    }
}
