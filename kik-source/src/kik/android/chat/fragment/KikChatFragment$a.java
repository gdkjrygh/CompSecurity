// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.d.f;
import kik.a.d.k;
import kik.a.e.l;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

public static final class  extends com.kik.ui.fragment.ent.a
{

    static String a( )
    {
        return .g("chatGroupJID");
    }

    static String b(g g1)
    {
        return g1.g("chatContactJID");
    }

    static boolean c(g g1)
    {
        return g1.f("showKeyBoard").booleanValue();
    }

    static boolean d(f f1)
    {
        return f1.f("kikchatPluginOpenedDirectly").booleanValue();
    }

    static String e(f f1)
    {
        return f1.g("sessionId");
    }

    static String f(g g1)
    {
        return g1.g("campaignId");
    }

    static boolean g(g g1)
    {
        return g1.f("returnToMissedConvos").booleanValue();
    }

    static boolean h(f f1)
    {
        return f1.b("kik.chat.close.on.block", true).booleanValue();
    }

    static int i(b b1)
    {
        return b1.b("KikChatFragment.CardIndex", -1);
    }

    public final b a()
    {
        a("returnToMissedConvos", true);
        return this;
    }

    public final a a(String s)
    {
        if (s != null)
        {
            a("chatContactJID", s);
        }
        return this;
    }

    public final a a(f f1, l l1)
    {
        if (l1 == null || f1 == null)
        {
            return this;
        }
        if (l1.a(f1.b(), false) != null)
        {
            a("chatGroupJID", f1.b());
            return this;
        } else
        {
            a("chatContactJID", f1.b());
            return this;
        }
    }

    public final a a(k k1)
    {
        if (k1 != null)
        {
            a("chatContactJID", k1.b());
        }
        return this;
    }

    public final a a(boolean flag)
    {
        a("showKeyBoard", flag);
        return this;
    }

    public final a b(String s)
    {
        a("campaignId", s);
        return this;
    }

    public final a b(boolean flag)
    {
        a("kikchatPluginOpenedDirectly", flag);
        return this;
    }

    public final boolean b()
    {
        return b("skipTalkToCover", false).booleanValue();
    }

    public final b c(String s)
    {
        a("sessionId", s);
        return this;
    }

    public final a c(boolean flag)
    {
        a("skipTalkToCover", flag);
        return this;
    }

    public final a d(boolean flag)
    {
        a("kik.chat.close.on.block", flag);
        return this;
    }

    public ()
    {
    }
}
