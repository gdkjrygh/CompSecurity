// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            af, ConversationsBaseFragment

final class ag
    implements Runnable
{

    final af a;

    ag(af af1)
    {
        a = af1;
        super();
    }

    public final void run()
    {
        a.b.b(false);
        a.b.b(a.a);
    }
}
