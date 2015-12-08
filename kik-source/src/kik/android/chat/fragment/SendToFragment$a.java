// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            SendToFragment

public static final class  extends com.kik.ui.fragment.ent.a
{

    static boolean a( )
    {
        return .f("SendToFragment.EXTRA_AUTOMATICALLY_OPEN_CHAT").booleanValue();
    }

    static long b(f f)
    {
        return f.j("SendToFragment.EXTRA_DEPENDENT_PROMISE");
    }

    public final j a(long l)
    {
        a("SendToFragment.EXTRA_DEPENDENT_PROMISE", l);
        return this;
    }

    public final a a(boolean flag)
    {
        a("SendToFragment.EXTRA_AUTOMATICALLY_OPEN_CHAT", flag);
        return this;
    }

    public ()
    {
    }
}
