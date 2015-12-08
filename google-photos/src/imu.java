// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;

public final class imu extends nzc
{

    private final iuj a;
    private final String b;
    private final int c;

    public imu(Context context, int i, iuj iuj1, String s, int j)
    {
        super(context, (new nyh()).a(context, i).a(), "deletestory", new pax(), new pay());
        a = iuj1;
        b = s;
        c = j;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pax)qlw;
        qlw.a = new pdu();
        qlw = ((pax) (qlw)).a;
        qlw.a = new pec();
        ((pdu) (qlw)).a.b = b;
        ((pdu) (qlw)).a.a = new pdr();
        ((pdu) (qlw)).a.a.b = Boolean.valueOf(true);
        qlw.b = new pgp();
        ((pdu) (qlw)).b.b = a.a;
        qlw.c = new pdt();
        switch (c)
        {
        default:
            int i = c;
            Log.w("DeleteStoryOperation", (new StringBuilder(37)).append("Unrecognized delete type: ").append(i).toString());
            return;

        case 0: // '\0'
            ((pdu) (qlw)).c.a = 1;
            break;
        }
    }
}
