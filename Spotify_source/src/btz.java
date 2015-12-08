// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public final class btz
{

    public static final bua a[];
    private static bua b[];
    private static Set c;
    private static Set d;

    static Set a()
    {
        if (c == null)
        {
            c = a(a);
        }
        return c;
    }

    private static Set a(bua abua[])
    {
        HashSet hashset = new HashSet(abua.length);
        int j = abua.length;
        for (int i = 0; i < j; i++)
        {
            hashset.add(abua[i]);
        }

        return hashset;
    }

    static Set b()
    {
        if (d == null)
        {
            d = a(b);
        }
        return d;
    }

    static 
    {
        b = (new bua[] {
            bwb.a[0], bwd.a[0], bvt.a[0], bxv.a[0], bup.a[0], bxr.a[0], bvu.a[0], buv.a[0], bxu.a[0], bxs.a[0], 
            bvr.a[0], bvh.a[0], bvx.a[0], bug.a[0], bvg.a[0], bvz.a[0], bxb.a[0], buu.a[0], bwt.a[0], bwu.a[0], 
            bwq.a[0], buo.a[0], buz.a[0], bux.a[0], buy.a[0], bws.a[0], bxi.a[0], bum.a[0], bun.a[0], bvn.a[0], 
            bvd.a[0], bxl.a[0], bxl.a[1], bui.a[0], buf.a[0], bxj.a[0], bxe.a[0], bxa.a[0], bvc.a[0], bwk.a[0], 
            bwk.a[1], buw.a[0], bva.a[0], bul.a[0], bxy.a[0], but.a[0], buc.a[0], bvf.a[0], bww.a[0], bwz.a[0], 
            bvm.a[0], bwa.a[0], bxc.a[0], bwh.a[0], bvw.a[0], bvl.a[0], bxx.a[0], bur.a[0], bwg.a[0], bxm.a[0], 
            bub.a[0], bus.a[0], bvp.a[0], bwi.a[0], bxn.a[0], buk.a[0], bve.a[0], bwr.a[0], bud.a[0], bxg.a[0], 
            bwo.a[0], bxk.a[0], bvj.a[0], bwl.a[0], bxq.a[0], bxt.a[0], bxp.a[0], bxz.a[0], bvo.a[0], bxw.a[0], 
            bwf.a[0], bvq.a[0], bvi.a[0], bwe.a[0], bwn.a[0], buj.a[0], bwv.a[0], bxd.a[0], bue.a[0], bwj.a[0], 
            buq.a[0], bvv.a[0], bwm.a[0], bwy.a[0], bxf.a[0], buh.a[0], bvs.a[0], bwp.a[0], bvk.a[0], bwx.a[0], 
            bxh.a[0], bvy.a[0]
        });
        bua abua[][] = new bua[101][];
        abua[0] = bwb.a;
        abua[1] = bwd.a;
        abua[2] = bxo.a;
        abua[3] = bvt.a;
        abua[4] = bxv.a;
        abua[5] = bup.a;
        abua[6] = bxr.a;
        abua[7] = bvu.a;
        abua[8] = buv.a;
        abua[9] = bxu.a;
        abua[10] = bxs.a;
        abua[11] = bvr.a;
        abua[12] = bvh.a;
        abua[13] = bvx.a;
        abua[14] = bug.a;
        abua[15] = bvg.a;
        abua[16] = bvz.a;
        abua[17] = bxb.a;
        abua[18] = buu.a;
        abua[19] = bwt.a;
        abua[20] = bwu.a;
        abua[21] = bwq.a;
        abua[22] = buo.a;
        abua[23] = buz.a;
        abua[24] = bux.a;
        abua[25] = buy.a;
        abua[26] = bws.a;
        abua[27] = bxi.a;
        abua[28] = bum.a;
        abua[29] = bun.a;
        abua[30] = bvn.a;
        abua[31] = bvd.a;
        abua[32] = bxl.a;
        abua[33] = bui.a;
        abua[34] = buf.a;
        abua[35] = bxj.a;
        abua[36] = bxe.a;
        abua[37] = bxa.a;
        abua[38] = bvc.a;
        abua[39] = bwk.a;
        abua[40] = buw.a;
        abua[41] = bva.a;
        abua[42] = bul.a;
        abua[43] = bxy.a;
        abua[44] = but.a;
        abua[45] = buc.a;
        abua[46] = bvf.a;
        abua[47] = bww.a;
        abua[48] = bwz.a;
        abua[49] = bvm.a;
        abua[50] = bwa.a;
        abua[51] = bxc.a;
        abua[52] = bwh.a;
        abua[53] = bvw.a;
        abua[54] = bvl.a;
        abua[55] = bxx.a;
        abua[56] = bur.a;
        abua[57] = bwg.a;
        abua[58] = bxm.a;
        abua[59] = bub.a;
        abua[60] = bus.a;
        abua[61] = bvp.a;
        abua[62] = bwi.a;
        abua[63] = bxn.a;
        abua[64] = buk.a;
        abua[65] = bve.a;
        abua[66] = bwr.a;
        abua[67] = bud.a;
        abua[68] = bxg.a;
        abua[69] = bwo.a;
        abua[70] = bxk.a;
        abua[71] = bvj.a;
        abua[72] = bwl.a;
        abua[73] = bxq.a;
        abua[74] = bxt.a;
        abua[75] = bxp.a;
        abua[76] = bxz.a;
        abua[77] = bvo.a;
        abua[78] = bxw.a;
        abua[79] = bwf.a;
        abua[80] = bvq.a;
        abua[81] = bvi.a;
        abua[82] = bwe.a;
        abua[83] = bwn.a;
        abua[84] = buj.a;
        abua[85] = bwv.a;
        abua[86] = bxd.a;
        abua[87] = bue.a;
        abua[88] = bwj.a;
        abua[89] = buq.a;
        abua[90] = bvv.a;
        abua[91] = bwm.a;
        abua[92] = bwy.a;
        abua[93] = bxf.a;
        abua[94] = buh.a;
        abua[95] = bvs.a;
        abua[96] = bwp.a;
        abua[97] = bvk.a;
        abua[98] = bwx.a;
        abua[99] = bxh.a;
        abua[100] = bvy.a;
        int i = 0;
        int j = 0;
        for (; i < 101; i++)
        {
            j += abua[i].length;
        }

        bua abua1[] = new bua[j];
        i = 0;
        for (int k = 0; k < 101; k++)
        {
            bua abua2[] = abua[k];
            for (int l = 0; l < abua2.length;)
            {
                abua1[i] = abua2[l];
                l++;
                i++;
            }

        }

        a = abua1;
    }
}
