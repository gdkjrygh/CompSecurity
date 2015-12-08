// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;


// Referenced classes of package com.skype.android.addressbook:
//            ContactIngestionJNI, IngestionCallback

private final class ingestionCallback
{

    private final IngestionCallback ingestionCallback;
    final ContactIngestionJNI this$0;

    public final void onBatchDone(int i, int j, int k)
    {
        ingestionCallback.onBatchDone(i, j, k);
    }

    public final void onLookupDone(int i, int j, int k)
    {
        ingestionCallback.onLookupDone(i, j, k);
    }

    public _cls9(IngestionCallback ingestioncallback)
    {
        this$0 = ContactIngestionJNI.this;
        super();
        ingestionCallback = ingestioncallback;
    }
}
