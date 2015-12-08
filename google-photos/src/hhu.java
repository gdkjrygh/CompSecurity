// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hhu
    implements mti, omb, opv
{

    public mtj a;
    public mmr b;
    private final ar c;
    private final Set d = new HashSet();
    private final Set e = new HashSet();
    private hft f;
    private dgk g;

    hhu(ar ar1, opd opd1)
    {
        c = ar1;
        opd1.a(this);
    }

    private void a()
    {
        g.a().a(b.vW, new Object[0]).a().c();
    }

    private void b()
    {
        g.a().a(b.vV, new Object[0]).a().c();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mtj)olm1.a(mtj);
        a.a(this);
        f = (hft)olm1.a(hft);
        b = (mmr)olm1.a(mmr);
        g = (dgk)olm1.a(dgk);
    }

    public final void a(hhv hhv1)
    {
        d.add(hhv1);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (mue1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!TextUtils.equals(s, "SaveCollectionTask"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = (ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection");
        if (mue1.c())
        {
            b();
            mue1 = d.iterator();
            while (mue1.hasNext()) 
            {
                ((hhv)mue1.next()).b(s);
            }
        } else
        {
            a();
            mue1 = d.iterator();
            while (mue1.hasNext()) 
            {
                ((hhv)mue1.next()).a(s);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!TextUtils.equals(s, "SaveMediaTask"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        if (!mue1.c())
        {
            e.remove(s);
        }
        if (a.a("SaveMediaTask"))
        {
            continue; /* Loop/switch isn't completed */
        }
        f.c();
        if (!e.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        a();
        mue1 = d.iterator();
        while (mue1.hasNext()) 
        {
            ((hhv)mue1.next()).a(s);
        }
        if (true) goto _L1; else goto _L4
_L4:
        b();
        mue1 = d.iterator();
        while (mue1.hasNext()) 
        {
            ((hhv)mue1.next()).b(s);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a(Map map)
    {
        Object obj = map.values().iterator();
        int i;
        for (i = 0; ((Iterator) (obj)).hasNext(); i = ((List)((Iterator) (obj)).next()).size() + i) { }
        obj = c.getResources().getQuantityString(b.vS, i);
        f.a(((String) (obj)));
        ekq ekq1;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a.a(new hlz(b.d(), ekq1, (List)map.get(ekq1))))
        {
            ekq1 = (ekq)iterator.next();
            List list = (List)map.get(ekq1);
            e.add(list);
        }

    }

    public final void b(hhv hhv1)
    {
        d.remove(hhv1);
    }
}
