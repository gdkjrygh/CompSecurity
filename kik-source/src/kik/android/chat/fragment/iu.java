// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class iu extends i
{

    final KikCodeFragment a;

    iu(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if (KikCodeFragment.k(a) != null)
        {
            KikCodeFragment.k(a).a();
        }
        KikCodeFragment.a(a, ((String) (obj)));
    }
}
