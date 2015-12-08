// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.ui.SwipeImageView;
import com.snapchat.android.ui.swipefilters.FilterPageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class lang.Object
    implements Runnable
{

    private SwipeImageView a;
    private HA b;
    private List c;
    private HP d;

    public final void run()
    {
        HP hp = d;
        SwipeImageView swipeimageview = a;
        HA ha = b;
        List list = c;
        ArrayList arraylist = new ArrayList(ha.b());
        Iterator iterator = ha.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Ho ho = (Ho)iterator.next();
            if (ho.b() == FilterPageType.GEOFILTER)
            {
                arraylist.add(((HF)ho).b);
            }
        } while (true);
        list.removeAll(arraylist);
        hp.a(ha, swipeimageview, HP.a(list, swipeimageview.getContext()));
    }

    >(HP hp, SwipeImageView swipeimageview, HA ha, List list)
    {
        d = hp;
        a = swipeimageview;
        b = ha;
        c = list;
        super();
    }
}
