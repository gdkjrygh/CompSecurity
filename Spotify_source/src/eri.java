// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.connect.Tech;
import java.util.EnumSet;
import java.util.Iterator;

public final class eri
    implements ezj
{

    private final ImmutableList a;

    public transient eri(ezj aezj[])
    {
        a = ImmutableList.a(aezj);
    }

    public final void a()
    {
        for (cvh cvh = a.a(); cvh.hasNext(); ((ezj)cvh.next()).a()) { }
    }

    public final void a(Tech tech)
    {
        for (cvh cvh = a.a(); cvh.hasNext(); ((ezj)cvh.next()).a(tech)) { }
    }

    public final void a(Tech tech, String s)
    {
        for (cvh cvh = a.a(); cvh.hasNext(); ((ezj)cvh.next()).a(tech, s)) { }
    }

    public final void a(EnumSet enumset)
    {
        for (cvh cvh = a.a(); cvh.hasNext(); ((ezj)cvh.next()).a(enumset)) { }
    }

    public final void b()
    {
        for (cvh cvh = a.a(); cvh.hasNext(); ((ezj)cvh.next()).b()) { }
    }
}
