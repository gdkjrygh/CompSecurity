// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import com.arist.activity.LrcBrowseActivity;
import com.arist.activity.MusicPlayActivity;
import com.arist.b.b;

// Referenced classes of package com.arist.model.lrc:
//            i

final class k
    implements android.view.View.OnClickListener
{

    final i a;
    private final AlertDialog b;
    private final MusicPlayActivity c;
    private final b d;

    k(i i, AlertDialog alertdialog, MusicPlayActivity musicplayactivity, b b1)
    {
        a = i;
        b = alertdialog;
        c = musicplayactivity;
        d = b1;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        view = new Intent(c, com/arist/activity/LrcBrowseActivity);
        view.putExtra("music_path", d.e());
        c.startActivityForResult(view, 1);
    }
}
