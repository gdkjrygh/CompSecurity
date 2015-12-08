// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInManager

public static class jsonResult
{

    private String jsonResult;
    private String userId;

    public String getJsonResult()
    {
        return jsonResult;
    }

    public String getUserId()
    {
        return userId;
    }

    public (String s, String s1)
    {
        userId = s;
        jsonResult = s1;
    }
}
