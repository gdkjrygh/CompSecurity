// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            CmdParserBase

class CmdTableEntry
{

    CmdParserBase cmdClass;
    int commandId;
    String name;

    CmdTableEntry(int i, String s, CmdParserBase cmdparserbase)
    {
        commandId = i;
        name = s;
        cmdClass = cmdparserbase;
    }
}
