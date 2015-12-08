// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.comscore.utils.TransmissionMode;

final class ajj
    implements Runnable
{

    private ajg a;
    private ajh b;

    ajj(ajh ajh1, ajg ajg1)
    {
        b = ajh1;
        a = ajg1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        obj = b;
        obj1 = a;
        if (!((ajh) (obj)).a.N) goto _L2; else goto _L1
_L1:
        ajn.a(obj, (new StringBuilder("sendMeasurmement: ")).append(((ajg) (obj1)).a(((ajh) (obj)).a.L)).toString());
        ((ajh) (obj)).c(((ajg) (obj1)));
        if (obj1 instanceof ajb) goto _L2; else goto _L3
_L3:
        TransmissionMode transmissionmode;
        boolean flag;
        ((ajh) (obj)).b(((ajg) (obj1)));
        if (((ajh) (obj)).a.N)
        {
            ((ajg) (obj1)).a(new ajf("c12", ((ajh) (obj)).a.l(), Boolean.valueOf(false)));
            if (((ajh) (obj)).a.k() != null)
            {
                ((ajg) (obj1)).a(new ajf("ns_ak", ((ajh) (obj)).a.k(), Boolean.valueOf(false)));
            }
        }
        obj = new ajk(((ajh) (obj)).a, ((ajg) (obj1)));
        obj1 = ((ajk) (obj)).a.C;
        flag = ajv.a(((android.content.Context) (obj1)), "android.permission.ACCESS_NETWORK_STATE").booleanValue();
        transmissionmode = ((ajk) (obj)).a.J;
        ((ajk) (obj)).b.a("lastTransmission", String.valueOf(System.currentTimeMillis()));
        ajl.a[transmissionmode.ordinal()];
        JVM INSTR tableswitch 1 5: default 232
    //                   1 233
    //                   2 238
    //                   3 243
    //                   4 269
    //                   5 305;
           goto _L2 _L4 _L5 _L6 _L7 _L8
_L2:
        return;
_L4:
        ((ajk) (obj)).b();
        return;
_L5:
        ((ajk) (obj)).b();
        return;
_L6:
        if (!flag || ((ajk) (obj)).c().booleanValue())
        {
            ((ajk) (obj)).a();
            return;
        } else
        {
            ((ajk) (obj)).b();
            return;
        }
_L7:
        if (!flag || ajp.b() || ajp.b(((android.content.Context) (obj1))) || ajp.d(((android.content.Context) (obj1))))
        {
            ((ajk) (obj)).a();
            return;
        } else
        {
            ((ajk) (obj)).b();
            return;
        }
_L8:
        if (!flag || ajp.b() || ajp.b(((android.content.Context) (obj1))) || ajp.f(((android.content.Context) (obj1))))
        {
            ((ajk) (obj)).a();
            return;
        } else
        {
            ((ajk) (obj)).b();
            return;
        }
    }
}
