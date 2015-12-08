// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractList;
import java.util.List;

public final class bda extends AbstractList
{

    private List a;

    public transient bda(bcm bcm1, baw abaw[])
    {
        bbe bbe1 = ((baz)((qss) (bcm1)).e).a();
        if (((qss) (bcm1)).e.a(bcr).isEmpty())
        {
            if (abaw.length > 0)
            {
                throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
            } else
            {
                a = new qtj(bcm1.e().c, bbe1);
                return;
            }
        } else
        {
            a = new qtl(bcm1.e().c, bbe1, abaw);
            return;
        }
    }

    public final Object get(int i)
    {
        return (qtc)a.get(i);
    }

    public final int size()
    {
        return a.size();
    }
}
