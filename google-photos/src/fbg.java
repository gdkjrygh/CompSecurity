// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.Locale;

final class fbg
{

    private final Pair a;

    private fbg(String s, String s1)
    {
        a = Pair.create(s.toLowerCase(Locale.US), s1.toLowerCase(Locale.US));
    }

    public static fbg a(String s, String s1)
    {
        return new fbg(s, s1);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof fbg))
        {
            return false;
        } else
        {
            return ((fbg)obj).a.equals(a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
