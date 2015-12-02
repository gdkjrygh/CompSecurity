// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

class lang.Object
    implements android.view.OnClickListener
{

    final sc a;

    public void onClick(View view)
    {
        this;
        JVM INSTR monitorenter ;
        if (!sc.g(a) || sc.h(a)) goto _L2; else goto _L1
_L1:
        sc.i(a).setClickable(false);
        sc.a(a, false);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!sc.g(a))
        {
            sc.i(a).setVisibility(8);
            Toast.makeText(sc.j(a).getApplicationContext(), a.b_(0x7f0f026c), 0).show();
        }
        if (true) goto _L4; else goto _L3
_L3:
        view;
        throw view;
    }

    >(sc sc1)
    {
        a = sc1;
        super();
    }
}
