// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.widget.Toast;
import com.kik.g.r;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            NotifyNewPeoplePreference

final class au extends r
{

    final boolean a;
    final NotifyNewPeoplePreference b;

    au(NotifyNewPeoplePreference notifynewpeoplepreference, boolean flag)
    {
        b = notifynewpeoplepreference;
        a = flag;
        super();
    }

    public final void a()
    {
        b.setEnabled(true);
        NotifyNewPeoplePreference.a(b);
        b.setEnabled(true);
    }

    public final void a(Object obj)
    {
        b.setChecked(a);
        Toast.makeText(b.getContext(), b.b().getString(0x7f090235), 0).show();
    }

    public final void a(Throwable throwable)
    {
        Toast.makeText(b.getContext(), b.b().getString(0x7f090383), 0).show();
    }
}
