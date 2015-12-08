// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            a

static final class 
{

    static final int $SwitchMap$com$skype$Message$TYPE[];

    static 
    {
        $SwitchMap$com$skype$Message$TYPE = new int[com.skype.age.TYPE.values().length];
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.age.TYPE.REQUESTED_AUTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.age.TYPE.GRANTED_AUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
