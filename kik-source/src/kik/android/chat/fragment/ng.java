// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.View;
import com.kik.cards.util.UserDataParcelable;
import kik.a.d.aa;

// Referenced classes of package kik.android.chat.fragment:
//            KikPermissionsFragment

final class ng
    implements android.view.View.OnClickListener
{

    final aa a;
    final KikPermissionsFragment b;

    ng(KikPermissionsFragment kikpermissionsfragment, aa aa1)
    {
        b = kikpermissionsfragment;
        a = aa1;
        super();
    }

    public final void onClick(View view)
    {
        view = new UserDataParcelable(a.c, (new StringBuilder()).append(a.d).append(" ").append(a.e).toString(), a.f);
        Bundle bundle = new Bundle();
        bundle.putParcelable("kik.permissionFragment.extra.returned.userdata", view);
        b.a(bundle);
        b.J();
    }
}
