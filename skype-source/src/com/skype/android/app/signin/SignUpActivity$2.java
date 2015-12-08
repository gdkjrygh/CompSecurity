// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            SignUpActivity

static final class 
{

    static final int $SwitchMap$com$skype$SkyLib$VALIDATERESULT[];

    static 
    {
        $SwitchMap$com$skype$SkyLib$VALIDATERESULT = new int[com.skype.SULT.values().length];
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.VALIDATED_OK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.CONTAINS_INVALID_CHAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.CONTAINS_INVALID_WORD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.STARTS_WITH_INVALID_CHAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.TOO_LONG.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.TOO_SHORT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.TOO_SIMPLE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.SAME_AS_USERNAME.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SULT.CONTAINS_SPACE.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
