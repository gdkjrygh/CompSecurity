// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.database.table.SnapbryoTable;
import java.util.ArrayList;
import java.util.Collection;

public final class tG extends SnapbryoTable
{

    private static tG a;

    private tG()
    {
    }

    public static tG a()
    {
        tG;
        JVM INSTR monitorenter ;
        tG tg;
        if (a == null)
        {
            a = new tG();
        }
        tg = a;
        tG;
        JVM INSTR monitorexit ;
        return tg;
        Exception exception;
        exception;
        throw exception;
    }

    protected final Collection a(Br br)
    {
        br = Bf.a();
        return new ArrayList(br.a(((Bf) (br)).mFailedSendSnapbryos));
    }

    public final void b(Br br)
    {
        br = Bf.a();
        br.mFailedSendSnapbryos = br.a(a(null, null), new Bf.c(br, (byte)0));
    }

    public final String c()
    {
        return "FailedSendSnapbryoTable";
    }
}
