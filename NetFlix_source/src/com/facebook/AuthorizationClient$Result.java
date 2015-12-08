// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessToken

static class code
    implements Serializable
{
    static final class Code extends Enum
    {

        private static final Code $VALUES[];
        public static final Code CANCEL;
        public static final Code ERROR;
        public static final Code SUCCESS;

        public static Code valueOf(String s)
        {
            return (Code)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s);
        }

        public static Code[] values()
        {
            return (Code[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new Code("SUCCESS", 0);
            CANCEL = new Code("CANCEL", 1);
            ERROR = new Code("ERROR", 2);
            $VALUES = (new Code[] {
                SUCCESS, CANCEL, ERROR
            });
        }

        private Code(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 1L;
    final Code code;
    final String errorMessage;
    final AccessToken token;

    static Code createCancelResult(String s)
    {
        return new <init>(Code.CANCEL, null, s);
    }

    static Code createErrorResult(String s, String s1)
    {
        String s2 = s;
        if (s1 != null)
        {
            s2 = (new StringBuilder()).append(s).append(": ").append(s1).toString();
        }
        return new <init>(Code.ERROR, null, s2);
    }

    static Code createTokenResult(AccessToken accesstoken)
    {
        return new <init>(Code.SUCCESS, accesstoken, null);
    }

    private Code(Code code1, AccessToken accesstoken, String s)
    {
        token = accesstoken;
        errorMessage = s;
        code = code1;
    }
}
