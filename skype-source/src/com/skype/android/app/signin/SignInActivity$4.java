// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            SignInActivity

static final class 
{

    static final int $SwitchMap$com$skype$SkyLib$AUTH_RESULT[];

    static 
    {
        $SwitchMap$com$skype$SkyLib$AUTH_RESULT = new int[com.skype.T.values().length];
        try
        {
            $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.T.AUTH_OK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.T.AUTH_ANOTHER_MAPPING_EXISTS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
