// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.view.MenuInflater;
import android.view.View;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactListActivity

final class this._cls0
    implements android.view.actListActivity._cls1
{

    final ContactListActivity this$0;

    public final void onClick(View view)
    {
        ContactListActivity.access$000(ContactListActivity.this).clear();
        getMenuInflater().inflate(0x7f110001, ContactListActivity.access$000(ContactListActivity.this));
        onPrepareOptionsMenu(ContactListActivity.access$000(ContactListActivity.this));
        ContactListActivity.access$100(ContactListActivity.this).a(view);
        ContactListActivity.access$100(ContactListActivity.this).e();
    }

    ()
    {
        this$0 = ContactListActivity.this;
        super();
    }
}
