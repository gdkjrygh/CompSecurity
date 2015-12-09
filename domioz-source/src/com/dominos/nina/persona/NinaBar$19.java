// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.widget.TextView;
import com.nuance.b.e.a.e;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaVoiceBioView

class val.message
    implements Runnable
{

    final NinaBar this$0;
    final String val$message;

    public void run()
    {
        .SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[NinaBar.access$1600(NinaBar.this).ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 65
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_75;
_L4:
        TextView textview = NinaBar.access$800(NinaBar.this);
        String s;
        if (val$message == null)
        {
            s = NinaBar.access$2400(NinaBar.this);
        } else
        {
            s = val$message;
        }
        textview.setText(s);
        return;
_L2:
        NinaBar.access$2200(NinaBar.this);
          goto _L4
        NinaBar.access$2100(NinaBar.this).setVisibility(4);
        NinaBar.access$2100(NinaBar.this).blank();
        NinaBar.access$800(NinaBar.this).setVisibility(0);
          goto _L4
    }

    oView()
    {
        this$0 = final_ninabar;
        val$message = String.this;
        super();
    }
}
