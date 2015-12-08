// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import android.widget.Toast;
import kik.a.d.aa;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikEmailPreference, KikPreference, p, o, 
//            n

final class m
    implements android.view.View.OnClickListener
{

    final aa a;
    final View b;
    final Preference c;
    final KikEmailPreference d;

    m(KikEmailPreference kikemailpreference, aa aa1, View view, Preference preference)
    {
        d = kikemailpreference;
        a = aa1;
        b = view;
        c = preference;
        super();
    }

    public final void onClick(View view)
    {
        if (a == null)
        {
            return;
        }
        if (a.b.booleanValue())
        {
            Toast.makeText(d.getContext(), 0x7f0900cf, 0).show();
            KikPreference.a(b, c);
            return;
        } else
        {
            view = new kik.android.chat.fragment.KikDialogFragment.a(d.getContext().getResources());
            view.a(0x7f0900d8).b(0x7f09036b).b(false).a(0x7f090326, new p(this)).b(0x7f0902e0, new o(this)).a(new n(this));
            d.b().a(view.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "emailPreference");
            return;
        }
    }
}
