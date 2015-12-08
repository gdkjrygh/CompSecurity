// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;
import android.widget.RadioButton;
import com.pandora.android.util.af;

// Referenced classes of package p.ca:
//            al

class Object
    implements android.view.OnClickListener
{

    final al a;

    public void onClick(View view)
    {
        if (!((RadioButton)view).isChecked())
        {
            return;
        }
        view.getId();
        JVM INSTR tableswitch 2131755620 2131755620: default 32
    //                   2131755620 54;
           goto _L1 _L2
_L1:
        al.b(a, 1);
_L4:
        af.a().a(a.v());
        return;
_L2:
        al.b(a, 2);
        if (true) goto _L4; else goto _L3
_L3:
    }

    ew.View(al al1)
    {
        a = al1;
        super();
    }
}
