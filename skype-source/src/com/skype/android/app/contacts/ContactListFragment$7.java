// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactListFragment

static final class pe
{

    static final int $SwitchMap$com$skype$PROPKEY[];
    static final int $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[];

    static 
    {
        $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType = new int[pe.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[pe.ALL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[pe.SKYPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[pe.AVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[pe.AGENTS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[pe.GROUP.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVATAR_IMAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_MOOD_TEXT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_DISPLAYNAME.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_GIVEN_DISPLAYNAME.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_FULLNAME.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PINNED_ORDER.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.USER_ISBLOCKED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.USER_BUDDYSTATUS.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_CBLSYNCSTATUS.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_STATUS.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_NROF_AUTHED_BUDDIES.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
