// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class hct
    implements fpx
{

    public hct()
    {
    }

    public final fpr a(byte abyte0[])
    {
        abyte0 = (hdc)mve.a(new hdc(), abyte0);
        hdg hdg1;
        switch (((hdc) (abyte0)).a)
        {
        default:
            Log.e("PhotoJobsSubsystem", "Trying to deserialize an unknown PhotoJob");
            return null;

        case 2: // '\002'
            abyte0 = ((hdc) (abyte0)).b;
            hdi hdi1 = (hdi)mve.a(new hdi(), abyte0);
            if (hdi1.d.length > 0)
            {
                abyte0 = hdi1.d;
            } else
            {
                abyte0 = hdi1.b;
            }
            return new hcx(hdi1.a, hdi1.c, abyte0);

        case 1: // '\001'
            return hcn.a(((hdc) (abyte0)).b);

        case 3: // '\003'
            abyte0 = ((hdc) (abyte0)).b;
            return new hcq(((hde)mve.a(new hde(), abyte0)).a);

        case 4: // '\004'
            abyte0 = ((hdc) (abyte0)).b;
            return new hcr(((hdd)mve.a(new hdd(), abyte0)).a);

        case 5: // '\005'
            abyte0 = ((hdc) (abyte0)).b;
            return new hcm(((hdj)mve.a(new hdj(), abyte0)).a);

        case 6: // '\006'
            abyte0 = ((hdc) (abyte0)).b;
            abyte0 = (hdh)mve.a(new hdh(), abyte0);
            return new hcv(((hdh) (abyte0)).a, ((hdh) (abyte0)).b);

        case 7: // '\007'
            abyte0 = ((hdc) (abyte0)).b;
            hdg1 = (hdg)mve.a(new hdg(), abyte0);
            break;
        }
        if (hdg1.a.booleanValue())
        {
            abyte0 = iye.a;
        } else
        {
            abyte0 = iye.b;
        }
        return new hcu(abyte0, hdg1.b, hdg1.c, hdg1.d);
    }

    public final Object a()
    {
        return "PHOTOS_JOB_SUBSYSTEM";
    }

    public final byte[] a(fpr fpr)
    {
        if (fpr instanceof hcs)
        {
            fpr = (hcs)fpr;
            hdc hdc1 = new hdc();
            hdc1.a = fpr.d();
            hdc1.b = fpr.c();
            return qlw.a(hdc1);
        } else
        {
            return null;
        }
    }
}
