// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

final class kdp
{

    static final kdq a[];
    private static kdq b[];
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

    private static Set a(kdq akdq[])
    {
        HashSet hashset = new HashSet(akdq.length);
        int j = akdq.length;
        for (int i = 0; i < j; i++)
        {
            hashset.add(akdq[i]);
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
        b = (new kdq[] {
            kiz.a[0], kjc.a[0], kif.a[0], knt.a[0], kfb.a[0], knh.a[0], kii.a[0], kft.a[0], knq.a[0], knk.a[0], 
            kic.a[0], khb.a[0], kir.a[0], ked.a[0], kgy.a[0], kit.a[0], klo.a[0], kfq.a[0], kku.a[0], kkx.a[0], 
            kkl.a[0], key.a[0], kgf.a[0], kfz.a[0], kgc.a[0], kkr.a[0], kmf.a[0], kes.a[0], kev.a[0], khq.a[0], 
            kgo.a[0], kmo.a[0], kmo.a[1], keg.a[0], kea.a[0], kmi.a[0], klx.a[0], kll.a[0], kgl.a[0], kjw.a[0], 
            kjw.a[1], kfw.a[0], kgi.a[0], kep.a[0], kob.a[0], kfn.a[0], kdr.a[0], kgv.a[0], kld.a[0], kli.a[0], 
            khn.a[0], kiw.a[0], klr.a[0], kjn.a[0], kio.a[0], khk.a[0], knz.a[0], kfh.a[0], kjk.a[0], kmt.a[0], 
            koh.a[0], kfk.a[0], khw.a[0], kjr.a[0], kmw.a[0], kem.a[0], kgs.a[0], kko.a[0], kdu.a[0], kmc.a[0], 
            kkj.a[0], kml.a[0], khh.a[0], kka.a[0], kne.a[0], knn.a[0], knb.a[0], koe.a[0], kht.a[0], knw.a[0], 
            kjh.a[0], khz.a[0], khe.a[0], kjf.a[0], kkg.a[0], kej.a[0], kla.a[0], klu.a[0], kdx.a[0], kjt.a[0], 
            kfe.a[0], kil.a[0], kkd.a[0], klf.a[0], kma.a[0]
        });
        kdq akdq[][] = new kdq[94][];
        akdq[0] = kiz.a;
        akdq[1] = kjc.a;
        akdq[2] = kmz.a;
        akdq[3] = kif.a;
        akdq[4] = knt.a;
        akdq[5] = kfb.a;
        akdq[6] = knh.a;
        akdq[7] = kii.a;
        akdq[8] = kft.a;
        akdq[9] = knq.a;
        akdq[10] = knk.a;
        akdq[11] = kic.a;
        akdq[12] = khb.a;
        akdq[13] = kir.a;
        akdq[14] = ked.a;
        akdq[15] = kgy.a;
        akdq[16] = kit.a;
        akdq[17] = klo.a;
        akdq[18] = kfq.a;
        akdq[19] = kku.a;
        akdq[20] = kkx.a;
        akdq[21] = kkl.a;
        akdq[22] = key.a;
        akdq[23] = kgf.a;
        akdq[24] = kfz.a;
        akdq[25] = kgc.a;
        akdq[26] = kkr.a;
        akdq[27] = kmf.a;
        akdq[28] = kes.a;
        akdq[29] = kev.a;
        akdq[30] = khq.a;
        akdq[31] = kgo.a;
        akdq[32] = kmo.a;
        akdq[33] = keg.a;
        akdq[34] = kea.a;
        akdq[35] = kmi.a;
        akdq[36] = klx.a;
        akdq[37] = kll.a;
        akdq[38] = kgl.a;
        akdq[39] = kjw.a;
        akdq[40] = kfw.a;
        akdq[41] = kgi.a;
        akdq[42] = kep.a;
        akdq[43] = kob.a;
        akdq[44] = kfn.a;
        akdq[45] = kdr.a;
        akdq[46] = kgv.a;
        akdq[47] = kld.a;
        akdq[48] = kli.a;
        akdq[49] = khn.a;
        akdq[50] = kiw.a;
        akdq[51] = klr.a;
        akdq[52] = kjn.a;
        akdq[53] = kio.a;
        akdq[54] = khk.a;
        akdq[55] = knz.a;
        akdq[56] = kfh.a;
        akdq[57] = kjk.a;
        akdq[58] = kmt.a;
        akdq[59] = koh.a;
        akdq[60] = kfk.a;
        akdq[61] = khw.a;
        akdq[62] = kjr.a;
        akdq[63] = kmw.a;
        akdq[64] = kem.a;
        akdq[65] = kgs.a;
        akdq[66] = kko.a;
        akdq[67] = kdu.a;
        akdq[68] = kmc.a;
        akdq[69] = kkj.a;
        akdq[70] = kml.a;
        akdq[71] = khh.a;
        akdq[72] = kka.a;
        akdq[73] = kne.a;
        akdq[74] = knn.a;
        akdq[75] = knb.a;
        akdq[76] = koe.a;
        akdq[77] = kht.a;
        akdq[78] = knw.a;
        akdq[79] = kjh.a;
        akdq[80] = khz.a;
        akdq[81] = khe.a;
        akdq[82] = kjf.a;
        akdq[83] = kkg.a;
        akdq[84] = kej.a;
        akdq[85] = kla.a;
        akdq[86] = klu.a;
        akdq[87] = kdx.a;
        akdq[88] = kjt.a;
        akdq[89] = kfe.a;
        akdq[90] = kil.a;
        akdq[91] = kkd.a;
        akdq[92] = klf.a;
        akdq[93] = kma.a;
        int i = 0;
        int j = 0;
        for (; i < 94; i++)
        {
            j += akdq[i].length;
        }

        kdq akdq1[] = new kdq[j];
        j = 0;
        i = 0;
        for (; j < 94; j++)
        {
            kdq akdq2[] = akdq[j];
            for (int k = 0; k < akdq2.length;)
            {
                akdq1[i] = akdq2[k];
                k++;
                i++;
            }

        }

        a = akdq1;
    }
}
