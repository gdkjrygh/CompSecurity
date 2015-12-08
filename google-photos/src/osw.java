// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class osw
    implements Comparable
{

    public final int a;
    public final osv b;
    public boolean c;

    public osw(osu osu, int i, osv osv)
    {
        c = false;
        a = i;
        b = osv;
    }

    public final int compareTo(Object obj)
    {
        obj = (osw)obj;
        if (a < ((osw) (obj)).a)
        {
            return -1;
        }
        return a != ((osw) (obj)).a ? 1 : 0;
    }
}
