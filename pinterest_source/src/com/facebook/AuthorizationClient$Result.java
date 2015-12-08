// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.text.TextUtils;
import com.facebook.internal.Utility;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.facebook:
//            AccessToken

class errorCode
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final Code code;
    final String errorCode;
    final String errorMessage;
    Map loggingExtras;
    final zationRequest request;
    final AccessToken token;

    static zationRequest createCancelResult(zationRequest zationrequest, String s)
    {
        class Code extends Enum
        {

            private static final Code $VALUES[];
            public static final Code CANCEL;
            public static final Code ERROR;
            public static final Code SUCCESS;
            private final String loggingValue;

            public static Code valueOf(String s1)
            {
                return (Code)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s1);
            }

            public static Code[] values()
            {
                return (Code[])$VALUES.clone();
            }

            final String getLoggingValue()
            {
                return loggingValue;
            }

            static 
            {
                SUCCESS = new Code("SUCCESS", 0, "success");
                CANCEL = new Code("CANCEL", 1, "cancel");
                ERROR = new Code("ERROR", 2, "error");
                $VALUES = (new Code[] {
                    SUCCESS, CANCEL, ERROR
                });
            }

            private Code(String s, int i, String s1)
            {
                super(s, i);
                loggingValue = s1;
            }
        }

        return new <init>(zationrequest, Code.CANCEL, null, s, null);
    }

    static zationRequest createErrorResult(zationRequest zationrequest, String s, String s1)
    {
        return createErrorResult(zationrequest, s, s1, null);
    }

    static zationRequest createErrorResult(zationRequest zationrequest, String s, String s1, String s2)
    {
        s = TextUtils.join(": ", Utility.asListNoNulls(new String[] {
            s, s1
        }));
        return new <init>(zationrequest, Code.ERROR, null, s, s2);
    }

    static zationRequest createTokenResult(zationRequest zationrequest, AccessToken accesstoken)
    {
        return new <init>(zationrequest, Code.SUCCESS, accesstoken, null, null);
    }

    private Code(zationRequest zationrequest, Code code1, AccessToken accesstoken, String s, String s1)
    {
        request = zationrequest;
        token = accesstoken;
        errorMessage = s;
        code = code1;
        errorCode = s1;
    }
}
