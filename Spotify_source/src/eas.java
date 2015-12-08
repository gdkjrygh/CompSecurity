// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class eas
{

    public Set a;
    public Set b;
    public Set c;
    public Set d;
    public Set e;

    public eas()
    {
        a = new LinkedHashSet();
        b = new LinkedHashSet();
        c = new LinkedHashSet();
        d = new LinkedHashSet();
        e = new LinkedHashSet();
    }

    public final void a(eaz eaz)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((eaw)iterator.next()).a(eaz)) { }
    }

    public final void a(ezs ezs, PlayerState playerstate)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((eat)iterator.next()).a(ezs, playerstate)) { }
    }
}
