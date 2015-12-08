// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.android.a;
import java.util.List;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.i;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment

final class ai
    implements android.content.DialogInterface.OnClickListener
{

    final k a;
    final f b;
    final ConversationsBaseFragment c;

    ai(ConversationsBaseFragment conversationsbasefragment, k k1, f f1)
    {
        c = conversationsbasefragment;
        a = k1;
        b = f1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        j;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 147
    //                   1 153
    //                   2 159;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_159;
_L1:
        dialoginterface = "Not Set";
_L5:
        dialoginterface = c.f.b("Muted").a("Is Verified", a.i()).a("Source", "Chat List").a("Duration", dialoginterface).a("Is Group", a instanceof n);
        long l;
        if (a instanceof n)
        {
            l = ((n)a).w().size();
        } else
        {
            l = 1L;
        }
        dialoginterface.a("Participants Count", l).b();
        c.a.a(b.b(), j);
        c.b(false);
        return;
_L2:
        dialoginterface = "1 Hour";
          goto _L5
_L3:
        dialoginterface = "Til 8:00";
          goto _L5
        dialoginterface = "Forever";
          goto _L5
    }
}
