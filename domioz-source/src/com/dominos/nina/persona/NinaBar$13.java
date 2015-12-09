// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.widget.EditText;
import com.nuance.b.e.a.e;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaAnimatedIcon, NinaVoiceBioView

class val.mode
    implements Runnable
{

    final NinaBar this$0;
    final e val$mode;

    public void run()
    {
        switch (.SwitchMap.com.nuance.nina.ui.persona.NinaPersona.NinaPersonaMode[val$mode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            NinaBar.access$100(NinaBar.this).setDictationMode(false);
            NinaBar.access$2100(NinaBar.this).setVisibility(4);
            return;

        case 2: // '\002'
            NinaBar.access$100(NinaBar.this).setDictationMode(false);
            NinaBar.access$300(NinaBar.this).setVisibility(4);
            lock();
            return;

        case 3: // '\003'
            NinaBar.access$100(NinaBar.this).setDictationMode(true);
            break;
        }
        NinaBar.access$2100(NinaBar.this).setVisibility(4);
        NinaBar.access$2200(NinaBar.this);
        lock();
    }

    oView()
    {
        this$0 = final_ninabar;
        val$mode = e.this;
        super();
    }
}
