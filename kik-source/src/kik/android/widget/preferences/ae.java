// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.cc;

// Referenced classes of package kik.android.widget.preferences:
//            ad, KikProfilePicPreference

final class ae
    implements android.content.DialogInterface.OnClickListener
{

    final ad a;

    ae(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 25
    //                   1 104;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        dialoginterface = (ClipboardManager)a.a.b().getActivity().getSystemService("clipboard");
        aa aa1 = a.a.b.d();
        if (dialoginterface != null)
        {
            dialoginterface.setText(aa1.c);
            KikProfilePicPreference.a(a.a).setText(0x7f090352);
            KikProfilePicPreference.a(a.a).show();
            return;
        }
          goto _L1
_L3:
        cc.a(a.a.b.d(), KikProfilePicPreference.b(a.a).getContext(), a.a.d, KikProfilePicPreference.c(a.a));
        return;
    }
}
