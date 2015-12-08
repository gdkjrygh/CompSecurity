// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            gn, KikChatInfoFragment

final class go
    implements Runnable
{

    final gn a;

    go(gn gn1)
    {
        a = gn1;
        super();
    }

    public final void run()
    {
        a.b.b(true);
    }
}
