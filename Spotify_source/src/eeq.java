// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eeq
{

    com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType a;
    boolean b;

    public eeq(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType statetype, boolean flag)
    {
        a = statetype;
        b = flag;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (eeq)obj;
            if (b != ((eeq) (obj)).b)
            {
                return false;
            }
            if (a != ((eeq) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b)
        {
            j = 1;
        }
        return i * 31 + j;
    }

    public final String toString()
    {
        return (new StringBuilder("BooleanAdState{mState=")).append(a).append(", mActive=").append(b).append('}').toString();
    }
}
