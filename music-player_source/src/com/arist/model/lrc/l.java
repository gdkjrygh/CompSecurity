// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.arist.activity.MusicPlayActivity;
import com.arist.b.b;

// Referenced classes of package com.arist.model.lrc:
//            i

final class l
    implements android.view.View.OnClickListener
{

    final i a;
    private final AlertDialog b;
    private final b c;
    private final MusicPlayActivity d;

    l(i i, AlertDialog alertdialog, b b1, MusicPlayActivity musicplayactivity)
    {
        a = i;
        b = alertdialog;
        c = b1;
        d = musicplayactivity;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse((new StringBuilder("http://www.google.cn/search?q=")).append(c.d()).append("+ lrc").toString()));
        d.startActivity(view);
    }
}
