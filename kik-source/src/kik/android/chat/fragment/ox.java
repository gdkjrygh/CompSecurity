// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class ox extends r
{

    final KikRegistrationFragment a;

    ox(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        KikRegistrationFragment.a(a, ((Bundle) (obj)));
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        KikRegistrationFragment.l(a);
    }
}
