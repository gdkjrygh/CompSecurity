// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;

import android.view.View;
import com.facebook.analytics.cb;
import com.facebook.o;
import com.facebook.orca.sms.bo;
import com.facebook.orca.sms.bp;

// Referenced classes of package com.facebook.orca.activity:
//            AddContactsActivity

class b
    implements android.view.View.OnClickListener
{

    final AddContactsActivity a;

    b(AddContactsActivity addcontactsactivity)
    {
        a = addcontactsactivity;
        super();
    }

    public void onClick(View view)
    {
        view = AddContactsActivity.c(a).a(AddContactsActivity.b(a), a.getString(o.invite_text));
        AddContactsActivity.a(a, (new cb("click")).f("button").g("send_invite_button").b("sms_method", view.toString()));
        a.finish();
    }
}
