// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class mof
    implements mnz
{

    private Set a;

    mof(Set set)
    {
        a = set;
    }

    public final Object a(Object obj)
    {
        return a;
    }

    public final void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putStringSet(s, a);
    }
}
