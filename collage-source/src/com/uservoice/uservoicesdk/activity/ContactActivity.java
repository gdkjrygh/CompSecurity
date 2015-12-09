// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.os.Bundle;
import com.uservoice.uservoicesdk.ui.ContactAdapter;
import com.uservoice.uservoicesdk.ui.InstantAnswersAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            InstantAnswersActivity

public class ContactActivity extends InstantAnswersActivity
{

    public ContactActivity()
    {
    }

    protected InstantAnswersAdapter createAdapter()
    {
        return new ContactAdapter(this);
    }

    protected int getDiscardDialogMessage()
    {
        return com.uservoice.uservoicesdk.R.string.uv_msg_confirm_discard_message;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(com.uservoice.uservoicesdk.R.string.uv_contact_us);
    }
}
