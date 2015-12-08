// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.kik.android.a;
import com.kik.android.c.f;
import com.kik.sdkutils.y;
import java.util.Iterator;
import java.util.List;
import kik.a.e.i;
import kik.android.widget.ImeAwareEditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, dc

final class db
    implements TextWatcher
{

    final KikChatFragment a;

    db(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        f f1;
        if (editable.length() > 0)
        {
            KikChatFragment.T(a);
            if (!KikChatFragment.U(a))
            {
                a.k.a(KikChatFragment.z(a), true);
            }
            KikChatFragment.V(a);
            a.sendButton.setEnabled(true);
        } else
        {
            if (KikChatFragment.p() == null)
            {
                a.sendButton.setEnabled(false);
            }
            if (!KikChatFragment.W(a))
            {
                a.k.a(KikChatFragment.z(a), false);
            }
        }
        f1 = a.q;
        f.a(editable);
        f1 = a.q;
        f.a(editable);
        editable = a.q.a(KikChatFragment.e(a).getContext(), editable);
        if (((com.kik.android.c.f.c) (editable)).c)
        {
            if (((com.kik.android.c.f.c) (editable)).a != null)
            {
                editable = ((com.kik.android.c.f.c) (editable)).a.iterator();
                do
                {
                    if (!editable.hasNext())
                    {
                        break;
                    }
                    com.kik.android.c.i j = (com.kik.android.c.i)editable.next();
                    if (j != null)
                    {
                        a.g.b("Smiley Typed").a("Smiley Category", j.c()).a("Smiley Identifier", j.b()).b();
                    }
                } while (true);
            }
            editable = a.q;
            f.a(KikChatFragment.e(a));
            int k = KikChatFragment.e(a).getSelectionEnd();
            if (y.b(11))
            {
                KikChatFragment.e(a).clearComposingText();
                int l = KikChatFragment.e(a).getInputType();
                KikChatFragment.e(a).setInputType(0x80000);
                KikChatFragment.e(a).setInputType(l);
                KikChatFragment.e(a).setSelection(k);
            }
        }
        kik.android.chat.fragment.KikChatFragment.y(a).post(new dc(this));
    }

    public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
    {
    }
}
