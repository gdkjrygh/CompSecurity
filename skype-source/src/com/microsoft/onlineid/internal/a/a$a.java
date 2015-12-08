// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.a;

import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.a:
//            a, d

public static class a
{

    protected final android.content.edPreferences.Editor a;

    protected a a(d d1, int i)
    {
        a.putInt(d1.a(), i);
        return this;
    }

    protected utInt a(d d1, String s)
    {
        a.putString(d1.a(), s);
        return this;
    }

    protected utString a(d d1, Set set)
    {
        a.putStringSet(d1.a(), set);
        return this;
    }

    public final boolean a()
    {
        return a.commit();
    }

    protected ommit b()
    {
        a.clear();
        return this;
    }

    protected or(android.content.edPreferences.Editor editor)
    {
        a = editor;
    }
}
