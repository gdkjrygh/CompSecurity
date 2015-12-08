// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


// Referenced classes of package com.netflix.mediaclient.util:
//            AndroidUtils

static class TPUT
{

    static final int $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[];

    static 
    {
        $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT = new int[TPUT.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[TPUT.STDOUT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[TPUT.STDERR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$util$AndroidUtils$OUTPUT[TPUT.BOTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
