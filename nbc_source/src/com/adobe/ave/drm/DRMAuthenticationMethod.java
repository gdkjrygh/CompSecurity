// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


public class DRMAuthenticationMethod extends Enum
{

    private static final DRMAuthenticationMethod $VALUES[];
    public static final DRMAuthenticationMethod ANONYMOUS;
    public static final DRMAuthenticationMethod UNKNOWN;
    public static final DRMAuthenticationMethod USERNAME_AND_PASSWORD;

    private DRMAuthenticationMethod(String s, int i)
    {
        super(s, i);
    }


    public static DRMAuthenticationMethod valueOf(String s)
    {
        return (DRMAuthenticationMethod)Enum.valueOf(com/adobe/ave/drm/DRMAuthenticationMethod, s);
    }

    public static DRMAuthenticationMethod[] values()
    {
        return (DRMAuthenticationMethod[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new DRMAuthenticationMethod("UNKNOWN", 0);
        ANONYMOUS = new DRMAuthenticationMethod("ANONYMOUS", 1);
        USERNAME_AND_PASSWORD = new DRMAuthenticationMethod("USERNAME_AND_PASSWORD", 2) {

            public String toString()
            {
                return "USERNAMEANDPASSWORD";
            }

        };
        $VALUES = (new DRMAuthenticationMethod[] {
            UNKNOWN, ANONYMOUS, USERNAME_AND_PASSWORD
        });
    }
}
