// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class oeh
    implements oeg
{

    private oei a;

    oeh()
    {
        a = new oej();
    }

    public final void a(mru mru, oxz oxz1, Bundle bundle)
    {
        Object obj1 = (mry)mru;
        mru = new qzv();
        bundle = new qyw();
        int i = ((mry) (obj1)).a;
        if (i != -1)
        {
            mru.d = i;
        }
        Object obj = new ArrayList();
        for (obj1 = ((mry) (obj1)).b.a.iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Object obj2 = (msm)((Iterator) (obj1)).next();
            a.a(((msm) (obj2)), mru, bundle);
            obj2 = Integer.valueOf(((msm) (obj2)).a.a);
            if (((qzv) (mru)).a == null)
            {
                mru.a = ((Integer) (obj2));
            } else
            {
                ((List) (obj)).add(obj2);
            }
        }

        if (!((List) (obj)).isEmpty())
        {
            mru.c = new int[((List) (obj)).size()];
            for (int j = 0; j < ((List) (obj)).size(); j++)
            {
                ((qzv) (mru)).c[j] = ((Integer)((List) (obj)).get(j)).intValue();
            }

        }
        obj = new qyv();
        obj.a = mru;
        obj.b = bundle;
        oxz1.b = ((qyv) (obj));
        oxz1.a.d = 100;
    }
}
