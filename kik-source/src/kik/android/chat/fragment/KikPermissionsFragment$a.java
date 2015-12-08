// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.util.an;

// Referenced classes of package kik.android.chat.fragment:
//            KikPermissionsFragment

public static final class  extends an
{

    static String a( )
    {
        return .g("kik.permissionFragment.extra.imageUrl");
    }

    static String b(g g)
    {
        return g.g("kik.permissionFragment.extra.name");
    }

    static String c(g g)
    {
        return g.g("kik.permissionFragment.extra.url");
    }

    static String d(g g)
    {
        return g.g("kik.permissionFragment.extra.tosUrl");
    }

    static String e(g g)
    {
        return g.g("kik.permissionFragment.extra.privacyUrl");
    }

    public final g a(String s)
    {
        a("kik.permissionFragment.extra.imageUrl", s);
        return this;
    }

    public final a b(String s)
    {
        a("kik.permissionFragment.extra.name", s);
        return this;
    }

    public final a c(String s)
    {
        a("kik.permissionFragment.extra.url", s);
        return this;
    }

    public final a d(String s)
    {
        a("kik.permissionFragment.extra.tosUrl", s);
        return this;
    }

    public final a e(String s)
    {
        a("kik.permissionFragment.extra.privacyUrl", s);
        return this;
    }

    public ()
    {
    }
}
