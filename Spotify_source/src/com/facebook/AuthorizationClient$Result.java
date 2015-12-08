// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.text.TextUtils;
import arp;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.facebook:
//            AccessToken

public class errorCode
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final Code code;
    final String errorCode;
    final String errorMessage;
    Map loggingExtras;
    final zationRequest request;
    final AccessToken token;

    static zationRequest a(zationRequest zationrequest, AccessToken accesstoken)
    {
        class Code extends Enum
        {

            public static final Code a;
            public static final Code b;
            public static final Code c;
            private static final Code d[];
            final String loggingValue;

            public static Code valueOf(String s)
            {
                return (Code)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s);
            }

            public static Code[] values()
            {
                return (Code[])d.clone();
            }

            static 
            {
                a = new Code("SUCCESS", 0, "success");
                b = new Code("CANCEL", 1, "cancel");
                c = new Code("ERROR", 2, "error");
                d = (new Code[] {
                    a, b, c
                });
            }

            private Code(String s, int i, String s1)
            {
                super(s, i);
                loggingValue = s1;
            }
        }

        return new <init>(zationrequest, Code.a, accesstoken, null, null);
    }

    static zationRequest a(zationRequest zationrequest, String s)
    {
        return new <init>(zationrequest, Code.b, null, s, null);
    }

    static zationRequest a(zationRequest zationrequest, String s, String s1)
    {
        return a(zationrequest, s, s1, null);
    }

    static zationRequest a(zationRequest zationrequest, String s, String s1, String s2)
    {
        s = TextUtils.join(": ", arp.b(new String[] {
            s, s1
        }));
        return new <init>(zationrequest, Code.c, null, s, s2);
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
