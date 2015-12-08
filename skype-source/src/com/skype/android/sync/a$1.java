// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.sync:
//            a

static final class 
{

    static final int $SwitchMap$com$skype$PROPKEY[];

    static 
    {
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_HOME.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_MOBILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_OFFICE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PSTNNUMBER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
