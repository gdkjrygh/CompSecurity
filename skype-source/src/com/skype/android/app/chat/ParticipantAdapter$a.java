// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Contact;
import com.skype.android.util.ContactUtil;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantAdapter

private final class collator
    implements Comparator
{

    private Collator collator;
    final ParticipantAdapter this$0;

    public final int compare(Contact contact, Contact contact1)
    {
        contact = contactUtil.l(contact);
        contact1 = contactUtil.l(contact1);
        return collator.compare(contact, contact1);
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((Contact)obj, (Contact)obj1);
    }

    public ()
    {
        this$0 = ParticipantAdapter.this;
        super();
        collator = Collator.getInstance();
        collator.setStrength(0);
    }
}
