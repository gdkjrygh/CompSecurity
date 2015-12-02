// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.user.i;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            h

public class l extends h
{

    private final i a;

    public l(Context context)
    {
        this(context, null);
    }

    public l(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public l(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = (i)getInjector().a(com/facebook/user/i);
    }

    protected void a(TextView textview)
    {
        ((PhoneEntry)getEntry()).getType();
        JVM INSTR tableswitch 1 2: default 32
    //                   1 49
    //                   2 42;
           goto _L1 _L2 _L3
_L1:
        int j = o.contact_phone_type_other;
_L5:
        textview.setText(j);
        return;
_L3:
        j = o.contact_phone_type_mobile;
        continue; /* Loop/switch isn't completed */
_L2:
        j = o.contact_phone_type_home;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void b(TextView textview)
    {
        PhoneEntry phoneentry = (PhoneEntry)getEntry();
        textview.setText(a.c(phoneentry.getNumber()));
    }
}
