// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.content.Context;
import android.widget.TextView;
import com.facebook.contacts.models.entry.EmailEntry;
import com.facebook.o;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            h

public class g extends h
{

    public g(Context context)
    {
        super(context);
    }

    protected void a(TextView textview)
    {
        textview.setText(o.contact_email_type);
    }

    protected void b(TextView textview)
    {
        textview.setText(((EmailEntry)getEntry()).getEmail());
    }
}
