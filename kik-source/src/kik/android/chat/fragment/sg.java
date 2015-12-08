// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Toast;
import com.kik.g.r;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.chat.fragment:
//            sf, ViewPictureFragment

final class sg extends r
{

    final sf a;

    sg(sf sf1)
    {
        a = sf1;
        super();
    }

    public final void a(Object obj)
    {
        k.a((Intent)obj, a.a.openButton.getContext());
    }

    public final void b(Throwable throwable)
    {
        Toast.makeText(a.a.openButton.getContext(), KikApplication.f(0x7f090266), 0).show();
    }
}
