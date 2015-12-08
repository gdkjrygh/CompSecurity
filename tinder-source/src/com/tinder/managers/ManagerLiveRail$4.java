// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;


// Referenced classes of package com.tinder.managers:
//            ManagerLiveRail

final class a
    implements Runnable
{

    final veRailEvent a;
    final ManagerLiveRail b;

    public final void run()
    {
        b.a(a);
    }

    veRailEvent(ManagerLiveRail managerliverail, veRailEvent verailevent)
    {
        b = managerliverail;
        a = verailevent;
        super();
    }
}
