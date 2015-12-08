// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.reporter;


// Referenced classes of package com.google.wallet.wobl.parser.reporter:
//            ReportLevel

public class Environment
{

    public Environment()
    {
    }

    public static ReportLevel getMinLevelForThrowing()
    {
        return null;
    }

    public static ReportLevel getMinLoggingLevel()
    {
        return ReportLevel.WARN;
    }
}
