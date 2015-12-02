// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.widget.RadarProgressBar;
import com.qihoo.security.malware.widget.RadarView;
import com.qihoo.security.ui.b.b;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements com.qihoo.security.malware.widget.a
{

    final VirusScanFragmentV3 a;

    public void a()
    {
        VirusScanFragmentV3.am(a).a(VirusScanFragmentV3.am(a).getProgress(), 360F, 200, new com.qihoo.security.malware.widget.RadarProgressBar.a() {

            final VirusScanFragmentV3._cls26 a;

            public void a()
            {
                VirusScanFragmentV3.as(a.a);
                b.b(12);
                VirusScanFragmentV3.am(a.a).b();
                VirusScanFragmentV3.H(a.a).a();
                VirusScanFragmentV3.at(a.a);
            }

            public void a(float f)
            {
                VirusScanFragmentV3.aj(a.a).setText("100");
                VirusScanFragmentV3.c(a.a, 100);
            }

            
            {
                a = VirusScanFragmentV3._cls26.this;
                super();
            }
        });
    }

    public void a(float f)
    {
        VirusScanFragmentV3.aj(a).setText((new StringBuilder()).append((int)(f * 100F) / 360).append("").toString());
        VirusScanFragmentV3.c(a, (int)(f * 100F) / 360);
    }

    _cls1.a(VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
