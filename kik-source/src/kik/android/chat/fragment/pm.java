// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikSelectUserFragment

final class pm extends r
{

    final KikSelectUserFragment a;

    pm(KikSelectUserFragment kikselectuserfragment)
    {
        a = kikselectuserfragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        KikSelectUserFragment.a(a, ((Bundle) (obj)));
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.S();
    }
}
