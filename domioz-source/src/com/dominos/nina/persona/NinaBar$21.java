// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.widget.TextView;
import com.nuance.b.e.a.e;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaView, NinaVoiceBioView

class val.prompt
    implements Runnable
{

    final NinaBar this$0;
    final String val$prompt;

    public void run()
    {
        .SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[NinaBar.access$1600(NinaBar.this).ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 51
    //                   2 71;
           goto _L1 _L2 _L3
_L1:
        NinaBar.access$800(NinaBar.this).setText(val$prompt);
        return;
_L2:
        ninaView.close();
        NinaBar.access$2200(NinaBar.this);
        continue; /* Loop/switch isn't completed */
_L3:
        NinaBar.access$2100(NinaBar.this).setVisibility(4);
        NinaBar.access$2100(NinaBar.this).blank();
        if (true) goto _L1; else goto _L4
_L4:
    }

    oView()
    {
        this$0 = final_ninabar;
        val$prompt = String.this;
        super();
    }
}
