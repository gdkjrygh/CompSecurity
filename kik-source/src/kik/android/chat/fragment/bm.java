// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Message;
import com.kik.g.i;

// Referenced classes of package kik.android.chat.fragment:
//            KikCardBrowserFragment

final class bm extends i
{

    final KikCardBrowserFragment a;

    bm(KikCardBrowserFragment kikcardbrowserfragment)
    {
        a = kikcardbrowserfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        KikCardBrowserFragment.y = (Message)obj1;
        a.a((new KikCardBrowserFragment.a()).c(a.g()));
    }
}
