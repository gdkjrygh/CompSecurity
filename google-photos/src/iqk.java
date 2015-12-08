// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

final class iqk
    implements android.widget.TextView.OnEditorActionListener
{

    private iqf a;

    iqk(iqf iqf1)
    {
        a = iqf1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (iqf.b(a).getButton(-1).isEnabled())
        {
            iqf.a(a);
            return true;
        } else
        {
            return false;
        }
    }
}
