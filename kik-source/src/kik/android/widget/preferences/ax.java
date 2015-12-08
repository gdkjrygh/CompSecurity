// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget.preferences:
//            NotifyNewPeoplePreference

final class ax
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final NotifyNewPeoplePreference b;

    ax(NotifyNewPeoplePreference notifynewpeoplepreference, boolean flag)
    {
        b = notifynewpeoplepreference;
        a = flag;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = b;
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        NotifyNewPeoplePreference.a(dialoginterface, flag);
        b.c();
    }
}
