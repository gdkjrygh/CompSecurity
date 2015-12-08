// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            lt, KikGroupMembersListFragment

final class lu
    implements Runnable
{

    final lt a;

    lu(lt lt1)
    {
        a = lt1;
        super();
    }

    public final void run()
    {
        KikGroupMembersListFragment.b(a.a);
    }
}
