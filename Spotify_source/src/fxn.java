// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.graphics.SpotifyIcon;

public final class fxn
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public SpotifyIcon f;
    public boolean g;
    public int h;

    public fxn()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = SpotifyIcon.u;
        g = false;
        h = -1;
    }

    public fxn(String s, String s1, String s2, SpotifyIcon spotifyicon, boolean flag)
    {
        a = s;
        b = s1;
        c = "";
        d = "";
        e = s2;
        f = spotifyicon;
        g = flag;
        h = -1;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (fxn)obj;
            if (g != ((fxn) (obj)).g)
            {
                return false;
            }
            if (h != ((fxn) (obj)).h)
            {
                return false;
            }
            if (!e.equals(((fxn) (obj)).e))
            {
                return false;
            }
            if (f != ((fxn) (obj)).f)
            {
                return false;
            }
            if (!b.equals(((fxn) (obj)).b))
            {
                return false;
            }
            if (!c.equals(((fxn) (obj)).c))
            {
                return false;
            }
            if (!d.equals(((fxn) (obj)).d))
            {
                return false;
            }
            if (!a.equals(((fxn) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a.hashCode();
        int k = b.hashCode();
        int l = c.hashCode();
        int i1 = d.hashCode();
        int j1 = e.hashCode();
        int k1 = f.hashCode();
        int i;
        if (g)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return (i + (((((j * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + h;
    }

    public final String toString()
    {
        return (new StringBuilder("ContextMenuHeader{mTitle='")).append(a).append('\'').append(", mSubtitle='").append(b).append('\'').append(", mDescription='").append(c).append('\'').append(", mDescriptionHeader='").append(d).append('\'').append(", mHeaderImageUri='").append(e).append('\'').append(", mPlaceholderIcon=").append(f).append(", mIsIconRounded=").append(g).append(", mTitleMaxLines=").append(h).append('}').toString();
    }
}
