// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.widget.AdapterView;
import com.nuance.b.e.aa;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona, NinaView

class val.position
    implements Runnable
{

    final is._cls0 this$1;
    final AdapterView val$parent;
    final int val$position;

    public void run()
    {
        DominosNinaPersona.access$000(_fld0).closeHints();
        DominosNinaPersona.access$100(_fld0).n();
        String s = (String)val$parent.getItemAtPosition(val$position);
        DominosNinaPersona.access$100(_fld0).b(s);
    }

    ()
    {
        this$1 = final_;
        val$parent = adapterview;
        val$position = I.this;
        super();
    }
}
