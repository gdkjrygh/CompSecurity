// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.brightcove.player.captioning.preferences:
//            ListDialogPreference

final class a
    implements android.widget.Listener
{

    private ListDialogPreference a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ListDialogPreference.a(a, Integer.valueOf((int)l)))
        {
            a.setValue((int)l);
        }
        adapterview = a.getDialog();
        if (adapterview != null)
        {
            adapterview.dismiss();
        }
    }

    I(ListDialogPreference listdialogpreference)
    {
        a = listdialogpreference;
        super();
    }
}
