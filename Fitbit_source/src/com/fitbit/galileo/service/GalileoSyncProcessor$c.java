// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;


// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncProcessor

public static class pdateStatus
{

    public final c a;
    public final boolean b;
    public final com.fitbit.galileo.protocol.commands.ype c;
    public final com.fitbit.serverinteraction.ateStatus d;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("").append(b);
        String s;
        if (b)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append("(").append(c).append(")").toString();
        }
        return stringbuilder.append(s).toString();
    }

    private pdateStatus(pdateStatus pdatestatus, boolean flag, com.fitbit.galileo.protocol.commands.ype ype, com.fitbit.serverinteraction.ateStatus atestatus)
    {
        a = pdatestatus;
        b = flag;
        c = ype;
        d = atestatus;
    }

    pdateStatus(pdateStatus pdatestatus, boolean flag, com.fitbit.galileo.protocol.commands.ype ype, com.fitbit.serverinteraction.ateStatus atestatus, pdateStatus pdatestatus1)
    {
        this(pdatestatus, flag, ype, atestatus);
    }
}
