// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.support.v4.a.e;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.contacts.upload.c;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            aq

public class ap extends f
{

    private final c a;
    private final e b;
    private final BroadcastReceiver c;
    private final TextView d;
    private final ProgressBar e;

    public ap(Context context)
    {
        this(context, null, 0);
    }

    public ap(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_contact_picker_contacts_upload_progress);
        context = getInjector();
        a = (c)context.a(com/facebook/contacts/upload/c);
        b = (e)context.a(android/support/v4/a/e);
        c = new aq(this);
        d = (TextView)findViewById(i.contact_picker_progress_text);
        d.setVisibility(8);
        e = (ProgressBar)findViewById(i.contact_picker_progress_bar);
    }

    private void a(ContactsUploadState contactsuploadstate)
    {
        int j = contactsuploadstate.b();
        int l = contactsuploadstate.c();
        int i1 = contactsuploadstate.d();
        if (j <= 0)
        {
            e.setIndeterminate(true);
            d.setVisibility(8);
            return;
        } else
        {
            contactsuploadstate = getResources().getString(o.orca_picker_finding_contacts_progress, new Object[] {
                Integer.valueOf(l), Integer.valueOf(i1)
            });
            d.setText(contactsuploadstate);
            d.setVisibility(0);
            e.setIndeterminate(false);
            e.setProgress(j);
            e.setMax(i1);
            return;
        }
    }

    static void a(ap ap1, ContactsUploadState contactsuploadstate)
    {
        ap1.a(contactsuploadstate);
    }

    protected void onAttachedToWindow()
    {
        IntentFilter intentfilter = new IntentFilter("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        b.a(c, intentfilter);
        a(a.b());
    }

    protected void onDetachedFromWindow()
    {
        b.a(c);
    }
}
