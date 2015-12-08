// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.d.k;
import kik.android.scan.a.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

public static final class  extends com.kik.ui.fragment.ent.a
{

    static int a( )
    {
        return .b("kik.prof.extra.actiontype", 1);
    }

    public final String a()
    {
        return b("kik.chat.origin", "kik.chat.origin.unknown");
    }

    public final b a(String s)
    {
        a("kik.chat.origin", s);
        return this;
    }

    public final a a(k k1)
    {
        if (k1 == null)
        {
            k1 = null;
        } else
        {
            k1 = k1.b();
        }
        return d(k1);
    }

    public final d a(c c1)
    {
        if (c1 != null)
        {
            a("kik.chat.info.scan.nonce", c1.c());
            a("kik.chat.info.scan.data", c1.b());
            a("kik.chat.info.scan.invite", c1.d());
            a("kik.chat.info.scan.bytes", c1.a());
        }
        return this;
    }

    public final a a(boolean flag)
    {
        a("returnToMissedConvos", flag);
        return this;
    }

    public final a b()
    {
        a("groupExtraRestrictAdd", true);
        return this;
    }

    public final a b(int i)
    {
        a("kik.prof.extra.actiontype", i);
        return this;
    }

    public final a b(String s)
    {
        a("fromConversationId", s);
        return this;
    }

    public final a b(boolean flag)
    {
        a("kik.prof.extra.finishpromise", flag);
        return this;
    }

    public final a c()
    {
        a("isFiltered", true);
        return this;
    }

    public final a c(String s)
    {
        a("sessionId", s);
        return this;
    }

    public final a c(boolean flag)
    {
        a("showKeyBoard", flag);
        return this;
    }

    public final a d(String s)
    {
        a("kik.prof.extra.jid", s);
        return this;
    }

    public final a d(boolean flag)
    {
        a("showSelectAsSendTo", flag);
        return this;
    }

    public final c d()
    {
        byte abyte0[] = h("kik.chat.info.scan.bytes");
        if (abyte0 == null)
        {
            return null;
        } else
        {
            byte abyte1[] = h("kik.chat.info.scan.invite");
            short word0 = i("kik.chat.info.scan.nonce");
            return kik.android.scan.a.c.a(abyte0, abyte1, g("kik.chat.info.scan.data"), word0);
        }
    }

    public ()
    {
    }
}
