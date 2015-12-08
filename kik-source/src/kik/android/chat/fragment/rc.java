// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            ra, SendToFragment

final class rc extends r
{

    final ra a;

    rc(ra ra1)
    {
        a = ra1;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        SendToFragment.a(a.a, ((Bundle) (obj)));
    }

    public final void a(Throwable throwable)
    {
        a.a.W();
    }
}
