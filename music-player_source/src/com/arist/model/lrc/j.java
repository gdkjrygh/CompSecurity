// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import com.arist.activity.MusicPlayActivity;
import com.arist.b.b;
import com.arist.c.a;
import com.arist.c.c;
import java.io.File;

// Referenced classes of package com.arist.model.lrc:
//            m, i

final class j
    implements android.widget.AdapterView.OnItemClickListener
{

    final i a;
    private final AlertDialog b;
    private final b c;
    private final m d;
    private final MusicPlayActivity e;

    j(i i, AlertDialog alertdialog, b b1, m m1, MusicPlayActivity musicplayactivity)
    {
        a = i;
        b = alertdialog;
        c = b1;
        d = m1;
        e = musicplayactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.dismiss();
        adapterview = (new StringBuilder(String.valueOf(a.F))).append(com.arist.c.c.d(c.e())).append(".lrc").toString();
        com.arist.c.c.a(new File(d.a(i)), new File(adapterview));
        e.a();
    }
}
