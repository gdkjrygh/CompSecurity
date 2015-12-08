// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

final class fim
    implements android.view.View.OnClickListener
{

    private fin a;
    private fil b;

    fim(fil fil1, fin fin1)
    {
        b = fil1;
        a = fin1;
        super();
    }

    public final void onClick(View view)
    {
        ((ClipboardManager)a.q.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", b.a));
        Toast.makeText(a.q, b.ps, 1).show();
    }
}
