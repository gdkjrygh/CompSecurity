// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.music.spotlets.radio.model.ThumbState;

public final class ecp
{

    public final ect a;
    public final Uri b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ThumbState h;
    public final boolean i;
    public final boolean j;

    public ecp(String s, String s1, String s2, String s3, Uri uri, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4, ThumbState thumbstate, boolean flag5, boolean flag6, boolean flag7)
    {
        a = new ect(s, s1, s2, s3, flag6);
        b = (Uri)ctz.a(uri);
        c = flag;
        d = flag1;
        e = flag2;
        f = flag3;
        g = flag4;
        h = thumbstate;
        i = flag5;
        j = flag7;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ecp)obj;
            if (j != ((ecp) (obj)).j)
            {
                return false;
            }
            if (i != ((ecp) (obj)).i)
            {
                return false;
            }
            if (g != ((ecp) (obj)).g)
            {
                return false;
            }
            if (c != ((ecp) (obj)).c)
            {
                return false;
            }
            if (f != ((ecp) (obj)).f)
            {
                return false;
            }
            if (d != ((ecp) (obj)).d)
            {
                return false;
            }
            if (e != ((ecp) (obj)).e)
            {
                return false;
            }
            if (!h.equals(((ecp) (obj)).h))
            {
                return false;
            }
            if (!b.equals(((ecp) (obj)).b))
            {
                return false;
            }
            if (!a.equals(((ecp) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i2 = 1;
        int j2 = a.hashCode();
        int k2 = b.hashCode();
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int l2;
        if (c)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (d)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (e)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (g)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        l2 = h.hashCode();
        if (i)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (!j)
        {
            i2 = 0;
        }
        return (l1 + ((k1 + (j1 + (i1 + (l + (k + (j2 * 31 + k2) * 31) * 31) * 31) * 31) * 31) * 31 + l2) * 31) * 31 + i2;
    }

    public final String toString()
    {
        return (new StringBuilder("NotificationState{trackInfo=")).append(a).append(", imageUri=").append(b).append(", isPaused=").append(c).append(", isRadio=").append(d).append(", isEpisode=").append(e).append(", isPrevEnabled=").append(f).append(", isNextEnabled=").append(g).append(", radioThumbState=").append(h).append(", isAdPlaying=").append(i).append(", isVideoAd=").append(j).append('}').toString();
    }
}
