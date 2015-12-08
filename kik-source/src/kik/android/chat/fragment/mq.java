// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.widget.ListView;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mq extends r
{

    final KikMultiselectContactsListFragment a;

    mq(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final void a()
    {
        a.l();
        a.c.invalidateViews();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        KikMultiselectContactsListFragment.a(a, ((Bundle) (obj)));
    }
}
