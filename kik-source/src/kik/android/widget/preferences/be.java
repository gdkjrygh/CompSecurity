// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;
import android.widget.Toast;
import com.kik.g.r;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            bd, PasswordPreference

final class be extends r
{

    final bd a;

    be(bd bd1)
    {
        a = bd1;
        super();
    }

    public final void a()
    {
        a.b.setEnabled(true);
    }

    public final void a(Object obj)
    {
        Toast.makeText(a.c.getContext(), a.c.b().getString(0x7f0901a3), 0).show();
    }

    public final void a(Throwable throwable)
    {
        Toast.makeText(a.c.getContext(), a.c.b().getString(0x7f0901a4), 0).show();
    }
}
