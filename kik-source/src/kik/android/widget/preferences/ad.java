// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.view.View;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikProfilePicPreference, ae

final class ad
    implements android.view.View.OnClickListener
{

    final KikProfilePicPreference a;

    ad(KikProfilePicPreference kikprofilepicpreference)
    {
        a = kikprofilepicpreference;
        super();
    }

    public final void onClick(View view)
    {
        view = a.b().getString(0x7f0902a6);
        String s = a.b().getString(0x7f0900f5);
        kik.android.chat.fragment.KikDialogFragment.a a1 = new kik.android.chat.fragment.KikDialogFragment.a(a.b().getResources());
        a1.a(a.b().getString(0x7f0902c9));
        ae ae1 = new ae(this);
        a1.a(new CharSequence[] {
            view, s
        }, ae1);
        a.b().a(a1.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "namePreference");
    }
}
