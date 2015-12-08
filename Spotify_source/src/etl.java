// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class etl
    implements ezj
{

    public MiniPlayerDisplayRule a;
    public final List b = new LinkedList();

    public etl()
    {
        a = new MiniPlayerDisplayRule();
    }

    public final void a()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((etm)iterator.next()).b().a()) { }
    }

    public final void a(Tech tech)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((etm)iterator.next()).b().a(tech)) { }
    }

    public final void a(Tech tech, String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((etm)iterator.next()).b().a(tech, s)) { }
    }

    public final void a(EnumSet enumset)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((etm)iterator.next()).b().a(enumset)) { }
    }

    public final void b()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((etm)iterator.next()).b().b()) { }
    }
}
