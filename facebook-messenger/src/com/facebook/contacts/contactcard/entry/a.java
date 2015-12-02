// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.content.Context;
import android.widget.TextView;
import com.facebook.contacts.models.entry.AddressEntry;
import com.facebook.o;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            h

public class a extends h
{

    public a(Context context)
    {
        super(context);
    }

    protected void a(TextView textview)
    {
        textview.setText(o.contact_address_type);
    }

    protected void b(TextView textview)
    {
        textview.setText(((AddressEntry)getEntry()).getAddress());
    }
}
