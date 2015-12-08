// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.widget.EditText;
import com.nuance.b.e.a.e;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaVoiceBioView

class this._cls0
    implements Runnable
{

    final NinaBar this$0;

    public void run()
    {
        switch (.SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[NinaBar.access$1600(NinaBar.this).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            NinaBar.access$2500(NinaBar.this);
            NinaBar.access$300(NinaBar.this).setText("");
            return;

        case 2: // '\002'
            NinaBar.access$2100(NinaBar.this).setVisibility(0);
            break;
        }
        NinaBar.access$2100(NinaBar.this).fadeRestore();
        NinaBar.access$2100(NinaBar.this).fadeInWaves();
    }

    oView()
    {
        this$0 = NinaBar.this;
        super();
    }
}
