// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikPickUsersFragment

final class no extends r
{

    final String a;
    final KikPickUsersFragment b;

    no(KikPickUsersFragment kikpickusersfragment, String s)
    {
        b = kikpickusersfragment;
        a = s;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (k)obj;
        b.a(a, ((k) (obj)));
    }
}
