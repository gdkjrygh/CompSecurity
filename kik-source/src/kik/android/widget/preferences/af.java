// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.view.View;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.e.w;
import kik.a.z;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.widget.preferences:
//            KikProfilePicPreference

final class af
    implements android.view.View.OnClickListener
{

    final KikProfilePicPreference a;

    af(KikProfilePicPreference kikprofilepicpreference)
    {
        a = kikprofilepicpreference;
        super();
    }

    public final void onClick(View view)
    {
        view = a.b.d();
        if (((aa) (view)).f != null)
        {
            z z1 = z.b(a.c);
            kik.android.chat.fragment.ViewPictureFragment.a a1 = new kik.android.chat.fragment.ViewPictureFragment.a();
            a1.a(z1.a().a()).c(((aa) (view)).f).a();
            k.a(a1, a.getContext()).f();
        }
    }
}
