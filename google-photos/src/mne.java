// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mne
{

    public final String a;
    public final int b;
    public final boolean c = false;

    mne(mnf mnf1)
    {
        a = mnf1.a;
        b = mnf1.b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (mne)obj;
            if (c != ((mne) (obj)).c || !c.c(a, ((mne) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a.hashCode();
        int i;
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
