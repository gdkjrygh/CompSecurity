// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.text.ClipboardManager;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.cc;

// Referenced classes of package kik.android.widget.preferences:
//            UsernamePreference

final class bp
    implements android.content.DialogInterface.OnClickListener
{

    final UsernamePreference a;

    bp(UsernamePreference usernamepreference)
    {
        a = usernamepreference;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 25
    //                   1 70;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        dialoginterface = (ClipboardManager)a.b().getActivity().getSystemService("clipboard");
        aa aa1 = a.a.d();
        if (dialoginterface != null)
        {
            dialoginterface.setText(aa1.c);
            return;
        }
          goto _L1
_L3:
        cc.a(a.a.d(), UsernamePreference.a(a), a.c, a.d);
        return;
    }
}
