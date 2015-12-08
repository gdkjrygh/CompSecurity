// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikComposeFragment

final class jc extends r
{

    final KikComposeFragment a;

    jc(KikComposeFragment kikcomposefragment)
    {
        a = kikcomposefragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        KikComposeFragment.a(a, ((Bundle) (obj)));
    }
}
