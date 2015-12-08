// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class hta
    implements doo
{

    private final Set a;

    hta(Context context)
    {
        HashSet hashset = new HashSet();
        hashset.add(hsb.a(hsa.a.a));
        hashset.add(context.getString(b.xx));
        hashset.add(context.getString(b.xy));
        a = Collections.unmodifiableSet(hashset);
    }

    public final boolean a(String s)
    {
        return a.contains(s);
    }
}
