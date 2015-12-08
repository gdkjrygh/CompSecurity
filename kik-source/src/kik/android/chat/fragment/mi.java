// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.widget.Toast;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikLoginFragment

final class mi extends r
{

    final KikLoginFragment a;

    mi(KikLoginFragment kikloginfragment)
    {
        a = kikloginfragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        KikLoginFragment.a(a, ((Bundle) (obj)));
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        KikLoginFragment.d(a).setText(KikLoginFragment.b(0x7f090063));
        KikLoginFragment.d(a).show();
    }
}
