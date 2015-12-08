// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;


// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgentStateManager

static final class  extends Enum
{

    private static final FATAL_ERROR $VALUES[];
    public static final FATAL_ERROR FATAL_ERROR;
    public static final FATAL_ERROR INIT;
    public static final FATAL_ERROR NEED_ACTIVATE_PROFILE;
    public static final FATAL_ERROR NEED_CHANGE_PROFILE;
    public static final FATAL_ERROR NEED_CHANGE_PROFILE_FROM_PRIMARY;
    public static final FATAL_ERROR NEED_CREATE_DEVACC;
    public static final FATAL_ERROR NEED_DEACTIVATE_ACC;
    public static final FATAL_ERROR NEED_EMAIL_ACTIVATE;
    public static final FATAL_ERROR NEED_ESN_MIGRATION;
    public static final FATAL_ERROR NEED_FETCH_PROFILE_DATA;
    public static final FATAL_ERROR NEED_SELECT_DEVACC;
    public static final FATAL_ERROR NEED_TOKEN_ACTIVATE;
    public static final FATAL_ERROR NEED_VALIDATE_PROFILE_DATA;
    public static final FATAL_ERROR PROFILE_ACTIVATED;
    public static final FATAL_ERROR WAIT_ACTIVATE_ACC;
    public static final FATAL_ERROR WAIT_SELECT_PROFILE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/user/UserAgentStateManager$STATES, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INIT = new <init>("INIT", 0);
        NEED_CREATE_DEVACC = new <init>("NEED_CREATE_DEVACC", 1);
        NEED_SELECT_DEVACC = new <init>("NEED_SELECT_DEVACC", 2);
        NEED_ESN_MIGRATION = new <init>("NEED_ESN_MIGRATION", 3);
        NEED_DEACTIVATE_ACC = new <init>("NEED_DEACTIVATE_ACC", 4);
        WAIT_ACTIVATE_ACC = new <init>("WAIT_ACTIVATE_ACC", 5);
        NEED_EMAIL_ACTIVATE = new <init>("NEED_EMAIL_ACTIVATE", 6);
        NEED_TOKEN_ACTIVATE = new <init>("NEED_TOKEN_ACTIVATE", 7);
        NEED_ACTIVATE_PROFILE = new <init>("NEED_ACTIVATE_PROFILE", 8);
        NEED_FETCH_PROFILE_DATA = new <init>("NEED_FETCH_PROFILE_DATA", 9);
        WAIT_SELECT_PROFILE = new <init>("WAIT_SELECT_PROFILE", 10);
        NEED_CHANGE_PROFILE = new <init>("NEED_CHANGE_PROFILE", 11);
        NEED_CHANGE_PROFILE_FROM_PRIMARY = new <init>("NEED_CHANGE_PROFILE_FROM_PRIMARY", 12);
        PROFILE_ACTIVATED = new <init>("PROFILE_ACTIVATED", 13);
        NEED_VALIDATE_PROFILE_DATA = new <init>("NEED_VALIDATE_PROFILE_DATA", 14);
        FATAL_ERROR = new <init>("FATAL_ERROR", 15);
        $VALUES = (new .VALUES[] {
            INIT, NEED_CREATE_DEVACC, NEED_SELECT_DEVACC, NEED_ESN_MIGRATION, NEED_DEACTIVATE_ACC, WAIT_ACTIVATE_ACC, NEED_EMAIL_ACTIVATE, NEED_TOKEN_ACTIVATE, NEED_ACTIVATE_PROFILE, NEED_FETCH_PROFILE_DATA, 
            WAIT_SELECT_PROFILE, NEED_CHANGE_PROFILE, NEED_CHANGE_PROFILE_FROM_PRIMARY, PROFILE_ACTIVATED, NEED_VALIDATE_PROFILE_DATA, FATAL_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
