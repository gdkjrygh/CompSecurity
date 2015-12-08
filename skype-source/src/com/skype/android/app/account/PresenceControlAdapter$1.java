// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;


// Referenced classes of package com.skype.android.app.account:
//            PresenceControlAdapter

static final class 
{

    static final int $SwitchMap$com$skype$Contact$AVAILABILITY[];

    static 
    {
        $SwitchMap$com$skype$Contact$AVAILABILITY = new int[com.skype.es().length];
        try
        {
            $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.OT_DISTURB.nal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.OT_DISTURB_FROM_MOBILE.nal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
