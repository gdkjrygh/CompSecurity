// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Bundle;
import android.support.v4.content.j;
import android.view.View;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.p;
import com.pandora.android.util.s;

// Referenced classes of package p.ca:
//            ak

class Object
    implements android.view.OnClickListener
{

    final ak a;

    public void onClick(View view)
    {
        Bundle bundle;
        int i;
        i = view.getId();
        bundle = new Bundle();
        i;
        JVM INSTR tableswitch 2131755590 2131755603: default 88
    //                   2131755590 98
    //                   2131755591 88
    //                   2131755592 88
    //                   2131755593 157
    //                   2131755594 164
    //                   2131755595 171
    //                   2131755596 185
    //                   2131755597 88
    //                   2131755598 178
    //                   2131755599 192
    //                   2131755600 88
    //                   2131755601 88
    //                   2131755602 88
    //                   2131755603 245;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L1 _L1 _L1 _L9
_L1:
        throw new IllegalArgumentException("Unknown View Id, unable to create a PageName");
_L2:
        view = p.u;
_L13:
        if (view != null)
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_page");
            pandoraintent.putExtra("intent_page_name", view);
            pandoraintent.putExtra("intent_show_force_screen", true);
            if (!bundle.isEmpty())
            {
                pandoraintent.putExtras(bundle);
            }
            b.a.C().a(pandoraintent);
        }
_L11:
        return;
_L3:
        view = p.t;
        continue; /* Loop/switch isn't completed */
_L4:
        view = p.v;
        continue; /* Loop/switch isn't completed */
_L5:
        view = p.w;
        continue; /* Loop/switch isn't completed */
_L7:
        view = p.z;
        continue; /* Loop/switch isn't completed */
_L6:
        view = p.s;
        continue; /* Loop/switch isn't completed */
_L8:
        if (a.a)
        {
            s.a(a.getActivity(), 0x7f080139);
            return;
        }
        if (ak.c(a) == null)
        {
            s.a(a.getActivity(), 0x7f08024a);
            return;
        }
        view = p.x;
        continue; /* Loop/switch isn't completed */
_L9:
        if (ak.a(a) == null) goto _L11; else goto _L10
_L10:
        view = p.y;
        bundle.putParcelable("intent_alarm_data", ak.a(a));
        if (true) goto _L13; else goto _L12
_L12:
    }

    ew.View(ak ak1)
    {
        a = ak1;
        super();
    }
}
