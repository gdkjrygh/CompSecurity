// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public final class rE
{

    private IK a;
    private rC b;
    private int c;
    private int d;

    public rE(IK ik)
    {
        this(ik, rC.a(), SnapchatApplication.get().getResources().getDisplayMetrics());
    }

    private rE(IK ik, rC rc, DisplayMetrics displaymetrics)
    {
        c = displaymetrics.widthPixels;
        d = displaymetrics.heightPixels;
        a = ik;
        b = rc;
    }

    private static float a(IK ik, int i)
    {
        return (float)i / (float)ik.d();
    }

    private static IK a(int i, SortedSet sortedset)
    {
        if (sortedset.isEmpty())
        {
            return null;
        }
        for (Iterator iterator = sortedset.iterator(); iterator.hasNext();)
        {
            IK ik = (IK)iterator.next();
            if (a(ik, i) >= 6F)
            {
                return ik;
            }
        }

        return (IK)sortedset.last();
    }

    private IK a(IK ik)
    {
        int l = ik.b();
        int i1 = ik.a();
        ik = new ry(c, d, l, i1);
        int j = (int)((float)((ry) (ik)).a * (1.0F - ((ry) (ik)).c));
        int i = j;
        if ((j & 1) == 1)
        {
            i = j + 1;
        }
        float f = ((ry) (ik)).b;
        int k = (int)((1.0F - ((ry) (ik)).d) * f);
        j = k;
        if ((k & 1) == 1)
        {
            j = k + 1;
        }
        Timber.c("TranscodingResolutionProvider", "TranscodingResolutionProvider Crop resolution %d * %d to %d %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(j), Integer.valueOf(i)
        });
        return new IK(j, i);
    }

    private SortedSet a(Set set)
    {
        TreeSet treeset = new TreeSet(new IL());
        for (set = set.iterator(); set.hasNext(); treeset.add(a((IK)set.next()))) { }
        return treeset;
    }

    private SortedSet a(SortedSet sortedset)
    {
        TreeSet treeset = new TreeSet(new IL());
        IK ik = a(a).a(0.40000000596046448D);
        sortedset = sortedset.iterator();
        do
        {
            if (!sortedset.hasNext())
            {
                break;
            }
            IK ik1 = (IK)sortedset.next();
            if (ik1.b(ik))
            {
                treeset.add(ik1);
            }
        } while (true);
        return treeset;
    }

    public final IK a(int i)
    {
        Object obj1 = b.a;
        rC.a(((Set) (obj1)));
        Object obj = new TreeSet(new IL());
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((SortedSet) (obj)).add((IK)((Iterator) (obj1)).next())) { }
        obj = a(i, a(a(((Set) (obj)))));
        if (obj == null)
        {
            return null;
        } else
        {
            Timber.a("TranscodingResolutionProvider", (new StringBuilder("Setting bitrate to ")).append(i).append(" resolution ").append(((IK) (obj)).a()).append("x").append(((IK) (obj)).b()).append(" bitrateperPixel: ").append(a(((IK) (obj)), i)).toString(), new Object[0]);
            return ((IK) (obj));
        }
    }
}
