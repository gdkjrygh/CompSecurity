// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.DialogInterface;
import android.widget.Toast;
import kik.a.d.aa;
import kik.a.e.f;
import kik.a.f.f.ao;

// Referenced classes of package kik.android.widget.preferences:
//            m, KikEmailPreference

final class p
    implements android.content.DialogInterface.OnClickListener
{

    final m a;

    p(m m1)
    {
        a = m1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ao ao1 = new ao(null, null, null, a.a.a, null, null, null);
        a.d.c.a(ao1);
        dialoginterface.cancel();
        Toast.makeText(a.d.getContext(), 0x7f0900d6, 0).show();
    }
}
