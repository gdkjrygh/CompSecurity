// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.android.addressbook.IngestionCallback;

// Referenced classes of package com.skype.android.sync:
//            ContactsIngestManager

final class this._cls0
    implements IngestionCallback
{

    final ContactsIngestManager this$0;

    public final void onBatchDone(int i, int j, int k)
    {
        ContactsIngestManager.access$100(ContactsIngestManager.this, i, j, k);
    }

    public final void onLookupDone(int i, int j, int k)
    {
        ContactsIngestManager.access$000(ContactsIngestManager.this, i, j, k);
    }

    ()
    {
        this$0 = ContactsIngestManager.this;
        super();
    }
}
