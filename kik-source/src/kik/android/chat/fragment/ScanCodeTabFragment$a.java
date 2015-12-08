// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

public static final class  extends com.kik.ui.fragment.ent.a
{

    private final String a = "kik.tab.code.first";
    private final String b = "kik.tab.group.jid";
    private final String c = "kik.tab.group.set";
    private final String d = "kik.tab.opened.from";
    private final String e = "kik.tab.hidden.on.fragment.install";

    public final  a(String s)
    {
        if (s != null)
        {
            a("kik.tab.group.jid", s);
            a("kik.tab.group.set", true);
        }
        return this;
    }

    public final a a(a a1)
    {
        if (a1 != null)
        {
            a("kik.tab.opened.from", a1.a());
        }
        return this;
    }

    public final a a(boolean flag)
    {
        a("kik.tab.code.first", flag);
        return this;
    }

    public final boolean a()
    {
        return b("kik.tab.code.first", false).booleanValue();
    }

    public final String b()
    {
        return g("kik.tab.opened.from");
    }

    public final String c()
    {
        return g("kik.tab.group.jid");
    }

    public final boolean d()
    {
        return f("kik.tab.group.set").booleanValue();
    }

    public final boolean e()
    {
        return b("kik.tab.hidden.on.fragment.install", false).booleanValue();
    }

    public final b f()
    {
        a("kik.tab.hidden.on.fragment.install", true);
        return this;
    }

    public ()
    {
    }
}
