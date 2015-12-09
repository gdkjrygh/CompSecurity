// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;


// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgentStateManager

static class ATES
{

    static final int $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[];

    static 
    {
        $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES = new int[ATES.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.INIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_ACTIVATE_PROFILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_CHANGE_PROFILE_FROM_PRIMARY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_CHANGE_PROFILE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_CREATE_DEVACC.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_DEACTIVATE_ACC.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_EMAIL_ACTIVATE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_ESN_MIGRATION.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_FETCH_PROFILE_DATA.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_SELECT_DEVACC.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_TOKEN_ACTIVATE.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.NEED_VALIDATE_PROFILE_DATA.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.PROFILE_ACTIVATED.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.WAIT_ACTIVATE_ACC.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.WAIT_SELECT_PROFILE.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$user$UserAgentStateManager$STATES[ATES.FATAL_ERROR.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
