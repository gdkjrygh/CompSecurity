// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;


// Referenced classes of package com.skype.android.sync:
//            ContactsIngestManager

static final class NI.ERROR_CODE
{

    static final int $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[];

    static 
    {
        $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE = new int[com.skype.android.addressbook.R_CODE.values().length];
        try
        {
            $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[com.skype.android.addressbook.R_CODE.OK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[com.skype.android.addressbook.R_CODE.IN_PROGRESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[com.skype.android.addressbook.R_CODE.LOOKUP_NOT_RECOMMENDED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
