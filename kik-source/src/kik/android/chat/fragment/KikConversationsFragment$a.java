// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

public static final class  extends com.kik.ui.fragment.ent.a
{

    static String a( )
    {
        return .g("convos.push.card.url");
    }

    static boolean b(g g)
    {
        return g.f("convos.pick.contact").booleanValue();
    }

    static String c(f f)
    {
        return f.g("convos.video.download");
    }

    static boolean d(g g)
    {
        return g.b("HASHTAG_GROUP_ERROR", false).booleanValue();
    }

    public final b a()
    {
        a("convos.pick.contact", true);
        return this;
    }

    public final a a(String s)
    {
        a("convos.push.card.url", s);
        return this;
    }

    public final a a(boolean flag)
    {
        a("HASHTAG_GROUP_ERROR", flag);
        return this;
    }

    public final a b(String s)
    {
        a("convos.video.download", s);
        return this;
    }

    public ()
    {
    }
}
