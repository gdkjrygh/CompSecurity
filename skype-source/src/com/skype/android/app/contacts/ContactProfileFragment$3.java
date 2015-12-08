// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import com.skype.Contact;
import com.skype.android.app.ListItemMenuDialog;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment

final class val.position
    implements android.view.ProfileFragment._cls3
{

    final ContactProfileFragment this$0;
    final int val$position;

    public final boolean onLongClick(View view)
    {
        view = ContactProfileFragment.access$100(ContactProfileFragment.this).getStrProperty(ContactUtil.e[val$position]);
        ListItemMenuDialog.create(ContactProfileFragment.this, view, val$position).show(getFragmentManager());
        return true;
    }

    ()
    {
        this$0 = final_contactprofilefragment;
        val$position = I.this;
        super();
    }
}
