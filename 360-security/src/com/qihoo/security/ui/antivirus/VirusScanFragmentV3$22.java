// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.os.Message;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements com.qihoo.security.malware.widget.
{

    final int a;
    final VirusScanFragmentV3 b;

    public void a()
    {
        a;
        JVM INSTR tableswitch 0 6: default 48
    //                   0 87
    //                   1 140
    //                   2 193
    //                   3 246
    //                   4 299
    //                   5 352
    //                   6 405;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (VirusScanFragmentV3.ac(b))
        {
            Message message = VirusScanFragmentV3.ar(b).ssage();
            message.what = 5;
            message.arg1 = a;
            message.sendToTarget();
        }
        return;
_L2:
        VirusScanFragmentV3 virusscanfragmentv3 = b;
        String s;
        if (VirusScanFragmentV3.ap(b))
        {
            s = VirusScanFragmentV3.ah(b).a(0x7f0c0135);
        } else
        {
            s = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
        }
        VirusScanFragmentV3.a(virusscanfragmentv3, s);
        continue; /* Loop/switch isn't completed */
_L3:
        VirusScanFragmentV3 virusscanfragmentv3_1 = b;
        String s1;
        if (VirusScanFragmentV3.ap(b))
        {
            s1 = VirusScanFragmentV3.ah(b).a(0x7f0c0136);
        } else
        {
            s1 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
        }
        VirusScanFragmentV3.a(virusscanfragmentv3_1, s1);
        continue; /* Loop/switch isn't completed */
_L4:
        VirusScanFragmentV3 virusscanfragmentv3_2 = b;
        String s2;
        if (VirusScanFragmentV3.ap(b))
        {
            s2 = VirusScanFragmentV3.ah(b).a(0x7f0c0133);
        } else
        {
            s2 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
        }
        VirusScanFragmentV3.a(virusscanfragmentv3_2, s2);
        continue; /* Loop/switch isn't completed */
_L5:
        VirusScanFragmentV3 virusscanfragmentv3_3 = b;
        String s3;
        if (VirusScanFragmentV3.ap(b))
        {
            s3 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
        } else
        {
            s3 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
        }
        VirusScanFragmentV3.a(virusscanfragmentv3_3, s3);
        continue; /* Loop/switch isn't completed */
_L6:
        VirusScanFragmentV3 virusscanfragmentv3_4 = b;
        String s4;
        if (VirusScanFragmentV3.ap(b))
        {
            s4 = VirusScanFragmentV3.ah(b).a(0x7f0c0134);
        } else
        {
            s4 = VirusScanFragmentV3.ah(b).a(0x7f0c0134);
        }
        VirusScanFragmentV3.a(virusscanfragmentv3_4, s4);
        continue; /* Loop/switch isn't completed */
_L7:
        VirusScanFragmentV3 virusscanfragmentv3_5 = b;
        String s5;
        if (VirusScanFragmentV3.ap(b))
        {
            s5 = VirusScanFragmentV3.ah(b).a(0x7f0c0134);
        } else
        {
            s5 = VirusScanFragmentV3.ah(b).a(0x7f0c0132);
        }
        VirusScanFragmentV3.a(virusscanfragmentv3_5, s5);
        continue; /* Loop/switch isn't completed */
_L8:
        VirusScanFragmentV3 virusscanfragmentv3_6 = b;
        String s6;
        if (VirusScanFragmentV3.ap(b))
        {
            s6 = VirusScanFragmentV3.ah(b).a(0x7f0c0132);
        } else
        {
            s6 = VirusScanFragmentV3.ah(b).a(0x7f0c0132);
        }
        VirusScanFragmentV3.a(virusscanfragmentv3_6, s6);
        if (true) goto _L1; else goto _L9
_L9:
    }

    public void a(float f)
    {
        VirusScanFragmentV3.aj(b).setText((new StringBuilder()).append((int)(f * 100F) / 360).append("").toString());
        VirusScanFragmentV3.c(b, (int)(f * 100F) / 360);
        if (VirusScanFragmentV3.ao(b) >= 98 && VirusScanFragmentV3.E(b) == 0L)
        {
            VirusScanFragmentV3.b(b, System.currentTimeMillis());
        }
        if (VirusScanFragmentV3.ap(b) && (float)VirusScanFragmentV3.ao(b) > VirusScanFragmentV3.aq(b)[4])
        {
            VirusScanFragmentV3.a(b, VirusScanFragmentV3.ah(b).a(0x7f0c0137));
        }
    }

    (VirusScanFragmentV3 virusscanfragmentv3, int i)
    {
        b = virusscanfragmentv3;
        a = i;
        super();
    }
}
