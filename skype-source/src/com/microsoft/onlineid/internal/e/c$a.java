// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.e;

import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.e:
//            c, d, a

public static final class a
{

    private final android.content.edPreferences.Editor a;

    public final a a(String s)
    {
        a.remove(s);
        return this;
    }

    public final emove a(String s, long l)
    {
        a.putLong(s, l);
        return this;
    }

    public final utLong a(String s, Object obj, a a1)
        throws d
    {
        if (obj != null)
        {
            try
            {
                a.putString(s, a1.a(obj));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new d(s);
            }
        }
        return this;
    }

    public final nit> a(String s, String s1)
    {
        a.putString(s, s1);
        return this;
    }

    public final utString a(String s, Set set)
    {
        a.putStringSet(s, set);
        return this;
    }

    public final void a()
    {
        a.apply();
    }

    public or(android.content.edPreferences.Editor editor)
    {
        a = editor;
    }
}
