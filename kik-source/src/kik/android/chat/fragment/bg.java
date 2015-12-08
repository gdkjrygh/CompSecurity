// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ListView;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            bf, KikContactsListFragment, KikAddToBlockFragment, bh, 
//            bi

final class bg extends r
{

    final bf a;

    bg(bf bf1)
    {
        a = bf1;
        super();
    }

    public final void a(Object obj)
    {
        a.b.a(null);
        a.b.c.post(new bh(this));
    }

    public final void b(Throwable throwable)
    {
        a.b.a(null);
        a.b.c.post(new bi(this, throwable));
    }
}
