// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.BaseAdapter;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Iterator;
import java.util.List;

public abstract class ekz extends BaseAdapter
{

    public final dma b;
    final int c;
    final FeatureIdentifier d;
    final FeatureIdentifier e;

    public ekz(int i, dma dma1, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        ctz.a(dma1);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "itemsPerRow must be larger than 0!");
        c = i;
        b = dma1;
        d = featureidentifier;
        e = featureidentifier1;
    }

    public final int a(List list)
    {
        return ((list.size() + c) - 1) / c;
    }

    public final List a(int i, List list)
    {
        int k = i * c;
        int j = c + k;
        i = j;
        if (j > list.size())
        {
            i = list.size();
        }
        return list.subList(k, i);
    }

    public final void a(String s, String s1, List list)
    {
        ctz.a(s);
        ctz.a(s1);
        ctz.a(list);
        s = list.iterator();
        while (s.hasNext()) 
        {
            s1 = (Playable)s.next();
            boolean flag = ((Playable) (s1)).c.equals(b.a());
            if (b.c() && flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1.d = flag;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }
}
