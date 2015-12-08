// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.savedstate:
//            a, MobileRunSavedState, s, u, 
//            TrackerSyncPreferencesSavedState, c, BackgroundRequestSavedState, ServerSavedState, 
//            v, HeartRateSavedState, k, r, 
//            b, LoadSavedState, PedometerSavedState, j, 
//            UISavedState, m, l, HardcodedSynclairSavedState, 
//            i, ChinaStoreUtilsSavedState, f, n, 
//            d, w, g, o, 
//            t

public class p
{

    public p()
    {
    }

    public static void a()
    {
        for (Iterator iterator = c().iterator(); iterator.hasNext(); ((a)iterator.next()).d()) { }
        MobileRunSavedState.a();
        s.j();
    }

    public static void b()
    {
        for (Iterator iterator = c().iterator(); iterator.hasNext(); ((a)iterator.next()).c().commit()) { }
    }

    private static List c()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(u.i());
        arraylist.add(TrackerSyncPreferencesSavedState.g());
        arraylist.add(com.fitbit.savedstate.c.g());
        arraylist.add(BackgroundRequestSavedState.g());
        arraylist.add(ServerSavedState.g());
        arraylist.add(v.g());
        arraylist.add(HeartRateSavedState.g());
        arraylist.add(k.g());
        arraylist.add(r.g());
        arraylist.add(com.fitbit.savedstate.b.g());
        arraylist.add(LoadSavedState.g());
        arraylist.add(PedometerSavedState.g());
        arraylist.add(j.g());
        arraylist.add(UISavedState.g());
        arraylist.add(m.g());
        arraylist.add(l.g());
        arraylist.add(HardcodedSynclairSavedState.g());
        arraylist.add(i.g());
        arraylist.add(ChinaStoreUtilsSavedState.g());
        arraylist.add(f.g());
        arraylist.add(n.g());
        arraylist.add(d.g());
        arraylist.add(w.g());
        arraylist.add(g.g());
        arraylist.add(o.g());
        arraylist.add(t.g());
        return arraylist;
    }
}
