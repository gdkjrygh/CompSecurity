// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gt
    implements android.view.View.OnClickListener
{

    final File a;
    final String b;
    final String c;
    final ge d;

    gt(ge ge1, File file, String s, String s1)
    {
        d = ge1;
        a = file;
        b = s;
        c = s1;
        super();
    }

    public final void onClick(View view)
    {
        if (a.exists())
        {
            a.delete();
        }
        if (ge.j(d) != null)
        {
            ge.j(d).findViewById(0x7f0d0046).setVisibility(8);
            view = (ProgressBar)ge.j(d).findViewById(0x7f0d0045);
            view.setProgress(0);
            view.setVisibility(0);
            ((TextView)ge.j(d).findViewById(0x7f0d0043)).setText(0x7f070039);
        }
        ge.a(d, b, c);
    }
}
