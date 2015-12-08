// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.android.a;
import java.util.ArrayList;
import java.util.Iterator;
import kik.a.d.k;
import kik.android.util.ck;

// Referenced classes of package kik.android.chat.fragment:
//            of, KikPromotedChatsFragment

final class og
    implements Runnable
{

    final of a;

    og(of of1)
    {
        a = of1;
        super();
    }

    public final void run()
    {
        if (a.a.k == kik.android.chat.fragment.KikSponsoredBaseFragment.a.a || !a.a.i)
        {
            a.a.d();
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = a.a.d.c(kik.android.util.ck.b.b).iterator(); iterator.hasNext(); arraylist.add(((k)iterator.next()).e())) { }
            a.a.l.b("Suggested Chat View").a("Bots", arraylist.toArray()).b();
        }
    }
}
