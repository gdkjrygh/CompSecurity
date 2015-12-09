// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class euq extends eup
{

    final Context c;
    final Set d = new HashSet();
    final Map e = Maps.b();
    private final am f;

    public euq(Context context, am am1, Flags flags)
    {
        dmz.a(for);
        c = (Context)ctz.a(context);
        f = (am)ctz.a(am1);
        ctz.a(flags);
    }

    public final void a()
    {
        super.a();
        Integer integer;
        for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); f.a(integer.intValue()))
        {
            integer = (Integer)iterator.next();
        }

        d.clear();
    }

    public final void a(String s, euo euo)
    {
        super.a(s, euo);
        int i = s.hashCode();
        if (!e.containsKey(Integer.valueOf(i)))
        {
            e.put(Integer.valueOf(i), Boolean.valueOf(false));
            f.a(i, null, new eur(this, s));
        }
    }

    public final void a(String s, boolean flag)
    {
        for.a(c, s, flag);
    }

    public final boolean a(String s)
    {
        int i = s.hashCode();
        return e.containsKey(Integer.valueOf(i)) && ((Boolean)e.get(Integer.valueOf(i))).booleanValue();
    }

    public final boolean b(String s)
    {
        return !d.contains(s);
    }
}
