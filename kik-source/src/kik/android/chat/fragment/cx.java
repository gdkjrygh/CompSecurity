// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.d.f;
import com.kik.g.p;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            cw

final class cx
    implements android.content.DialogInterface.OnClickListener
{

    final cw a;

    cx(cw cw1)
    {
        a = cw1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.a(Boolean.valueOf(false));
        KikApplication.i().c().a(com.kik.d.b.a.k.af, j.b(), new Object[] {
            "url", a.b
        });
    }
}
