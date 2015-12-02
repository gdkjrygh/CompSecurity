// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.contacts.upload.ContactsUploadProgressMode;
import com.facebook.widget.c;

// Referenced classes of package com.facebook.orca.threadlist:
//            t

class aa
    implements c
{

    final t a;

    aa(t t1)
    {
        a = t1;
        super();
    }

    public void a()
    {
        t.d(a).a((new cb("click")).f("button").g("find_contacts_failed_dismiss"));
        t.e(a).a();
    }

    public void b()
    {
        t.d(a).a((new cb("click")).f("button").g("find_contacts_failed_try_again"));
        t.e(a).a(ContactsUploadProgressMode.SHOW_IN_THREAD_LIST_AND_DIVE_BAR);
    }
}
