// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.reporter;


// Referenced classes of package com.google.wallet.wobl.parser.reporter:
//            Reporter, ReportLevel

static class 
{

    static final int $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[];

    static 
    {
        $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel = new int[ReportLevel.values().length];
        try
        {
            $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[ReportLevel.ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[ReportLevel.WARN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$wallet$wobl$parser$reporter$ReportLevel[ReportLevel.INFO.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
