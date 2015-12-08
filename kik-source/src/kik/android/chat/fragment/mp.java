// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mp extends r
{

    final KikMultiselectContactsListFragment a;

    mp(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        KikMultiselectContactsListFragment.a(a, ((Bundle) (obj)));
    }
}
